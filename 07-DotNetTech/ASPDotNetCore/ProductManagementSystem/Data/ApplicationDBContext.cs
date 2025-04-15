using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Design;
using MySql.EntityFrameworkCore.Extensions;
using ProductManagementSystem.Models;
namespace ProductManagementSystem.Data
{
    public class ApplicationDBContext : DbContext
    {
        // Constructor
        public ApplicationDBContext(DbContextOptions<ApplicationDBContext> options) : base(options)
        { }

        // Below line will create a table name 'products' in your MySQL database.
        public DbSet<Product> products { get; set; }
    }

    public class MySqlEntityFrameworkDesignTimeServices : IDesignTimeServices
    {
        public void ConfigureDesignTimeServices(IServiceCollection services)
        {
            services.AddEntityFrameworkMySQL();

            new EntityFrameworkDesignServicesBuilder(services).TryAddCoreServices();
        }
    }
}

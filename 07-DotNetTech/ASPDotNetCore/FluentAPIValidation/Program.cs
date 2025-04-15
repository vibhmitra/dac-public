using FluentAPIValidation.Models;
using FluentValidation.AspNetCore;
using FluentValidation;

namespace FluentAPIValidation
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);

            // Add services to the container.
            builder.Services.AddControllersWithViews();


            builder.Services.AddFluentValidationAutoValidation();
            //Enables integration between FluentValidation and ASP.NET client-side validation.
            builder.Services.AddFluentValidationClientsideAdapters();
            //Registering Model and Validator to show the error message on client-side
            builder.Services.AddTransient<IValidator<RegistrationModel>, RegistrationValidator>();



            var app = builder.Build();

            // Configure the HTTP request pipeline.
            if (!app.Environment.IsDevelopment())
            {
                app.UseExceptionHandler("/Home/Error");
            }
            app.UseStaticFiles();

            app.UseRouting();

            app.UseAuthorization();

            app.MapControllerRoute(
                name: "default",
                pattern: "{controller=Home}/{action=Index}/{id?}");

            app.Run();
        }
    }
}

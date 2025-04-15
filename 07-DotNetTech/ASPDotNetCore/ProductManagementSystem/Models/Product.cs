using System.ComponentModel.DataAnnotations;

namespace ProductManagementSystem.Models
{
    public class Product
    {
        [Key]   // making it a key
        public int ProductId { get; set; }     /// IF you add Id as suffix it will automatically becaome primary key

        [Required(ErrorMessage = "Bruh! Product Name Ain't Right! Daymn!")]  // to make this compulsory
        public string? ProductName { get; set; }

        [Required(ErrorMessage = "Bruh! Product Price Ain't Right! Daymn!")] // Custom Error Message for Validatio
        public double? Price { get; set; }

        public int Quantity { get; set; }
    }
}

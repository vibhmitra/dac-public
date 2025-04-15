using PropertyClassLibrary;

namespace PropertyInCS
{
    /// <summary>
    ///     Some Thing About Property in C#, Kinda like Getter / Setter of Java. :/
    ///     (See PropertyClassLibrary.cs)
    /// </summary>
    internal class Program
    {
        static void Main(string[] args)
        {
            Employee aurora = new Employee(501, "Aurora Aksnes", "me@decca.com");
            aurora.CountryName = "Norway";
            //aurora.FullAddress = "New Address yeah!"  <-- This is Invalid as FullAddress is now a readOnly accessor.

            // see Here we are accessing all fields via the 
            // accessor.
            Console.WriteLine($"ID : {aurora.Id}");
            Console.WriteLine($"Employee Name : {aurora.EmpName}");
            Console.WriteLine($"Company Name : {aurora.CompanyName}");
            Console.WriteLine($"Country Name : {aurora.CountryName}");
            Console.WriteLine($"Full Address : {aurora.FullAddress}");

            Employee magnus = new Employee(502, "Magnus Åserud Skylstad", "Magnus@decca.com");
            magnus.CountryName = "USA";

            Console.WriteLine($"ID : {magnus.Id}");
            Console.WriteLine($"Employee Name : {magnus.EmpName}");
            Console.WriteLine($"Company Name : {magnus.CompanyName}");
            Console.WriteLine($"Country Name : {magnus.CountryName}");
            Console.WriteLine($"Full Address : {magnus.FullAddress}");

            Console.ReadKey();
        }
    }
}

using GeometryNamespace.Shapes; // file scoped Namespaces
using gn = GeometryNamespace;   // creating aliases for namespaces
internal class Program
{
    static void Main(string[] args)
    {
        // Creating objects
        Circle myCircle = new Circle();
        string circleColor = myCircle.getCircleColor();
        Console.WriteLine(circleColor); // Prints "Red Colored Circle!"

        Square mySquare = new Square();
        string squareColor = mySquare.getSquareColor();
        Console.WriteLine(squareColor); // Prints "Blue Colored Square!"

        // accessing geometry namespace via alias
        gn.Geometry myGN = new gn.Geometry();
        Console.WriteLine(myGN.getGeometryInfo());
        Console.ReadKey();
    }
}
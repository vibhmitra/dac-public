namespace GeometryNamespace
{
    // Nested Namespace
    namespace Shapes
    {
        class Circle
        {
            public Circle()
            {
                Console.WriteLine("Circle in From Geometry > Shape namespaces!");
            }

            public string getCircleColor()
            {
                return ("Red Colored Circle!");
            }
        }

        class Square
        {
            public Square()
            {
                Console.WriteLine("Square in From Geometry > Shape namespaces!");
            }

            public string getSquareColor()
            {
                return ("Blue Colored Square!");
            }
        }

    }

    // Class for Geometry Namespace
    internal class Geometry
    {
        public Geometry()
        {
        }

        public string getGeometryInfo()
        {
            return ("Geometry Shapes : Circle and Square");
        }
    }
}

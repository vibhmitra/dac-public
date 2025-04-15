namespace InterfaceInCS
{
    public class Square : IShape
    {
        private double _sideUnits;

        public Square(double side)
        {
            _sideUnits = side;
        }

        public double Area => Math.Round((_sideUnits * _sideUnits), 2);  // initializing property of interface
        public void Draw() => Console.WriteLine($"Area of ⬛ : {this.Area} Square Unit(s)");
    }
}

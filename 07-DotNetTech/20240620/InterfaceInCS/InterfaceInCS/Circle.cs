namespace InterfaceInCS
{
    public class Circle : IShape
    {
        private double _radius;
        public Circle(double radius) { this._radius = radius; }
        public double Area => Math.Round((Math.PI * _radius * _radius), 2);

        public void Draw() => Console.WriteLine($"Area of ⭕ : {this.Area} Square Unit(s)");
    }
}

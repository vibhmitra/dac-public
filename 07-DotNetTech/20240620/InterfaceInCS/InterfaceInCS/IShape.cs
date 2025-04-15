namespace InterfaceInCS
{
    /**
    * By Defaul All the stuffs in interface is Public and Abstract 
    * */
    public interface IShape
    {
        const int _shapeTypes = 2;
        double Area { get; } // Property without a body
        void Draw(); // Method without a body
    }

}

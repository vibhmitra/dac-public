namespace DestructorInCS
{
    /// <summary>
    /// DB is a data base class used for connecting the MySQL Database 😀, 
    /// If you using Visual Studio Hover on Class it will show summary
    /// as tooltip.
    /// </summary>

    internal class DB : IDisposable
    {
        // constructor
        public DB()
        {
            Console.WriteLine("Data Base Connected. 👍");
        }

        /*// destructor
        ~DB()
        {
            Console.WriteLine("Data Base Connection Closed. 😚🔒");
        }*/

        public void DbConnection()
        {
            Console.WriteLine("Data Base Connection Successful!. 👍");
        }


        public void Dispose()
        {
            Console.WriteLine("Data Base Connection Closed. 😚🔒");
        }
    }
}

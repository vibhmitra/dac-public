namespace ParamatrizedThreadStartDemo;

class Number
{
    public static void PrintNumbers(object? target)
    {
        int number = 0;
        if (int.TryParse(target.ToString(), out number))
        {
            for (int i = 0; i < number; i++)
            {
                Console.Write($"{i.ToString()} ");
            }
        }
    }
}

internal class ParameterizedThreadStartDemo
{
    static void Main(string[] args)
    {
        Console.Write("Enter Target Number > ");
        object? target = Console.ReadLine();

        // Create Instance for ParameterizedThreadStart delegate
        ParameterizedThreadStart paramatrizedThreadStart = new ParameterizedThreadStart(Number.PrintNumbers);

        Thread thread = new Thread(paramatrizedThreadStart);
        thread.Start(target);

        Console.ReadKey();
    }
}

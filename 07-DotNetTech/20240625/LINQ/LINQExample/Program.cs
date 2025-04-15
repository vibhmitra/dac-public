namespace LINQExample
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] arr = { 1, 2, 3, 4, 6, 9, 10 };
            /*            int? min = null;
                        foreach (var item in arr)
                        {

                            if (!min.HasValue || item < min)
                            {
                               min = item;
                            }
                        }
                        Console.WriteLine(min);*/
            foreach (int item in arr)
            {
                Console.Write(item + " ");
            }
            Console.WriteLine();

            int minNum = arr.Min();
            Console.WriteLine("Minimum Number : " + minNum);

            // Using Where Query
            int minEvenNum = arr.Where(n => n % 2 == 0).Min();
            int maxEvenNum = arr.Where(n => n % 2 == 0).Max();
            int sumOfEvenNum = arr.Where(n => n % 2 == 0).Sum();
            int countOfEven = arr.Where(n => n % 2 == 0).Count();
            Console.WriteLine("Minimum Even Number :" + minEvenNum);
            Console.WriteLine("Maximum Even Number :" + maxEvenNum);
            Console.WriteLine("Sum Of All Even Number :" + sumOfEvenNum);
            Console.WriteLine("Count of Even Number : " + countOfEven);

            string[] words = { "India", "London", "America" };
            // Printing String Array
            Console.WriteLine(string.Join(", ", words));

            int shortestWord = words.Min(x => x.Length);
            int longestWord = words.Max(x => x.Length);
            Console.WriteLine("Lenght of Shortest Word : " + shortestWord);
            Console.WriteLine("Length of Longest Word : " + longestWord);

            Console.ReadKey();
        }
    }
}

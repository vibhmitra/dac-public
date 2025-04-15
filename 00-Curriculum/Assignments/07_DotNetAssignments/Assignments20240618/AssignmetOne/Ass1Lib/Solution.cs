namespace Ass1Lib
{
    public class Solutions
    {
        // Problem 1
        public void swapWithThird()
        {
            Console.WriteLine("Swap (With Third Variable): ");

            int a = 1, b = 2;
            Console.WriteLine("Before Swap: ");
            Console.WriteLine($"Value of a : {a}\nValue of b : {b}");

            // swap logic
            int temp = a;
            a = b;
            b = temp;

            Console.WriteLine("After Swap: ");
            Console.WriteLine($"Value of a : {a}\nValue of b : {b}");
        }

        // Problem 2
        public void swapWithOutThird()
        {
            Console.WriteLine("Swap (Without Third Variable): ");

            int a = 1, b = 2;
            Console.WriteLine("Before Swap: ");
            Console.WriteLine($"Value of a : {a}\nValue of b : {b}");

            // swap logic
            a = a + b;
            b = a - b;
            a = a - b;

            Console.WriteLine("After Swap: ");
            Console.WriteLine($"Value of a : {a}\nValue of b : {b}");
        }

        // Problem 3 
        public void getVolumeOfCone()
        {
            // Get Inputs
            Console.WriteLine("Get Volume of Cone 🔺 > ");
            Console.Write("Enter Radius 👉: ");
            double radius = Convert.ToDouble(Console.ReadLine());
            Console.Write("Enter Height 👉: ");
            double height = Convert.ToDouble(Console.ReadLine());

            // calculate
            double volume = (1.0 / 3.0) * Math.PI * radius * radius * height;

            // show
            Console.WriteLine($"The Volume of Cone is {Math.Round(volume, 2)} Sq. Units");

            return;
        }

        // Problem 4
        public void getSurfaceAreaOfCuboid()
        {

        }

        // Problem 5
        public void getPeriOfRec()
        {

        }

        // Problem 6 
        public void arithmeticOps()
        {
            // i/p
            Console.Write("Enter First Number: ");
            int firstNumber = Convert.ToInt32(Console.ReadLine());
            Console.Write("Enter Second Number: ");
            int secondNumber = Convert.ToInt32(Console.ReadLine());

            // o/p
            Console.WriteLine("Basic Arithmatic Ops: > ");
            Console.WriteLine($"Addition (+)\t\t: {firstNumber + secondNumber}");
            Console.WriteLine($"Sumbtration (-)\t\t: {firstNumber - secondNumber}");
            Console.WriteLine($"Multiplication (*) \t: {firstNumber * secondNumber}");
            Console.WriteLine($"Division (*)\t\t: {firstNumber / secondNumber}");

            return;
        }

        // Problem 7
        public void getlargestOfThree()
        {
            Console.WriteLine("Enter Three Numbers: ");
            int numOne = Convert.ToInt32(Console.ReadLine());
            int numTwo = Convert.ToInt32(Console.ReadLine());
            int numThr = Convert.ToInt32(Console.ReadLine());

            int bigNumber = numOne > numTwo ? (numOne > numThr ? numOne : numThr) : numTwo;
            Console.WriteLine($"Largest Number Amount {numOne}, {numTwo}, and {numThr} is {bigNumber}");
            return;
        }

        // Problem 8
        public void calMarks()
        {
            // get roll number
            Console.Write("Enter Roll Number: ");
            int rollNumber = Convert.ToInt32(Console.ReadLine());

            // get students name
            Console.Write("Enter Students Name: ");
            string? studentName = Console.ReadLine();

            // get marks
            Console.Write("Enter Marks of Subject 1: ");
            int subOne = Convert.ToInt32(Console.ReadLine());
            Console.Write("Enter Marks of Subject 2: ");
            int subTwo = Convert.ToInt32(Console.ReadLine());
            Console.Write("Enter Marks of Subject 3: ");
            int subThree = Convert.ToInt32(Console.ReadLine());

            // calculate
            double averagePercentage = Math.Round((((subOne + subTwo + subThree) / 300.0) * 100), 2);

            // show :)
            Console.WriteLine($"{studentName} #{rollNumber} has scored {averagePercentage} % Marks. 😀");
            return;
        }


        // RUNNER
        public void run()
        {
            do
            {
                Console.Clear();
                Console.Write(
                "Assignment One Menu 👨‍🍳\n" +
                "1 - Swap Using Third Variable.\n" +
                "2 - Swap Without Third Variable.\n" +
                "3 - Get Volume of Cone.\n" +
                "4 - \n" +
                "5 - \n" +
                "6 - Arithmetic Ops.\n" +
                "7 - Get Largest of Three Number.\n" +
                "8 - Marks Calculator.\n" +
                "0 - Exit. 👋\n\n" +
                "> Enter Your Choice 👉 "
            );
                int choice = Convert.ToInt32(Console.ReadLine());

                switch (choice)
                {
                    case 0:
                        Console.WriteLine("Exiting! 👋 See Ya!");
                        return;
                    case 1: swapWithThird(); break;
                    case 2: swapWithOutThird(); break;
                    case 3: getVolumeOfCone(); break;
                    case 4: break;
                    case 5: break;
                    case 6: arithmeticOps(); break;
                    case 7: getlargestOfThree(); break;
                    case 8: calMarks(); break;
                    default:
                        Console.WriteLine("Wrong Choice! Here Get Some Burgers!🍔🍔");
                        break;
                }
                Console.WriteLine("\nPress Enter To Continue 🏃‍♀️");
                Console.ReadKey();
            } while (true);
        }

    }
}

namespace ConsoleApp4
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Random random = new Random();
            bool playAgain = true;
            String player;
            String computer;
            String answer;

            while (playAgain)
            {
                player = "";
                computer = "";
                while (player != "ROCK" && player != "PAPER" && player != "SCISSORS")
                {
                    Console.Write("Enter ROCK, PAPER or SCISSORS: ");
                    player = Console.ReadLine();
                    player = player.ToUpper();
                }

                switch (random.Next(1, 4))
                {
                    case 1:
                        computer = "ROCK";
                        break;
                    case 2:
                        computer = "PAPER";
                        break;
                    case 3:
                        computer = "SCISSORS";
                        break;
                }

                Console.WriteLine("Player : " + player);
                Console.WriteLine("Computer : " + computer);

                switch (player)
                {
                    case "ROCK":
                        if (computer == "ROCK")
                        {
                            Console.WriteLine("It's a draw!");
                        }
                        else if (computer == "PAPER")
                        {
                            Console.WriteLine("You Loose!");
                        }
                        else
                        {
                            Console.WriteLine("You Win!");
                        }
                        break;
                    case "PAPER":
                        if (computer == "ROCK")
                        {
                            Console.WriteLine("You Win!");
                        }
                        else if (computer == "PAPER")
                        {
                            Console.WriteLine("It's a draw!");
                        }
                        else
                        {
                            Console.WriteLine("You Loose!");
                        }
                        break;
                    case "SCISSORS":
                        if (computer == "ROCK")
                        {
                            Console.WriteLine("You Loose!");
                        }
                        else if (computer == "PAPER")
                        {
                            Console.WriteLine("You Win!");
                        }
                        else
                        {
                            Console.WriteLine("It's a draw!");
                        }
                        break;
                }
                Console.Write("Would you like to play again? (Y/N): ");
                answer = Console.ReadLine().ToUpper();

                if (answer == "N")
                {
                    playAgain = false;
                }
            }
            Console.WriteLine("Goodbye!");
            Console.ReadKey();
        }
    }
}

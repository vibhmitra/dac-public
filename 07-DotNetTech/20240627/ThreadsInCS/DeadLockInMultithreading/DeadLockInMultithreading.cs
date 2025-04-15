using System.Text;

namespace DeadLockInMultithreading
{
    public class Account
    {
        double _balance;
        int _id;
        public Account(int id, double balance)
        {
            _id = id;
            _balance = balance;
        }

        public int Id
        { get { return _id; } }

        public void Withdraw(double amount)
        {
            _balance -= amount;
        }

        public void Deposit(double amount)
        {
            _balance += amount;
        }

    } // Account Class Ends Here I guess

    public class AccountManager
    {
        Account _fromAccount;
        Account _toAccount;
        double _amountToTransfer;

        public AccountManager(Account fromAccount, Account toAccount, double amountToTransfer)
        {
            _fromAccount = fromAccount;
            _toAccount = toAccount;
            double _amountToTransfer = amountToTransfer;
        }

        public void Transfer()
        {
            Console.WriteLine($"{Thread.CurrentThread.Name} Trying to Acquire Lock On {_fromAccount.Id.ToString()} 🔑");
            lock (_fromAccount)
            {
                Console.WriteLine($"{Thread.CurrentThread.Name} Acquired Lock On {_fromAccount.Id.ToString()} 🔓");
                Console.WriteLine($"{Thread.CurrentThread.Name} Suspend for 1 Second ⏸️");
                Thread.Sleep(1000);
                Console.WriteLine($"{Thread.CurrentThread.Name} Back in Action to Aquire Lock On {_fromAccount.Id.ToString()} 🔒");
                lock (_toAccount)
                {
                    _fromAccount.Withdraw(_amountToTransfer);
                    _toAccount.Deposit(_amountToTransfer);
                }
            }
        }
    }

    internal class DeadLockInMultithreading
    {
        static void Main(string[] args)
        {
            Console.OutputEncoding = UTF8Encoding.UTF8;
            Console.WriteLine("Main Thread Started 🏃‍");

            Account accountA = new Account(101, 10000.89);
            Account accountB = new Account(103, 5000.90);

            /// The Manager A is Transferring Money form A->B 
            AccountManager accountManagerA = new AccountManager(accountA, accountB, 4000.90);
            Thread t1 = new Thread(accountManagerA.Transfer);
            t1.Name = "Thread #1";

            /// The Manager B is Transferring Money form B->A
            AccountManager accountManagerB = new AccountManager(accountB, accountA, 4000.90);
            Thread t2 = new Thread(accountManagerB.Transfer);
            t2.Name = "Thread #2";

            t1.Start();
            t2.Start();

            t1.Join();
            t2.Join();

            Console.WriteLine("Main Thread Ends Here! Yeay! 😃");
            Console.ReadKey();

        }
    }
}

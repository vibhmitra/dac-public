namespace StudentClassLibrary
{
    public class Result
    {
        double marks;

        public Result(double marks)
        {
            this.marks = marks;
        }

        public string getResult()
        {
            if (marks > 40)
            {
                return ("You're Passed! Yeah! :)");
            }
            else
            {
                return ("Unfortunatly, You're Failed! Don't Be Sad Try Your Best In Re-Exam. Good Luck! :)");
            }
        }
    }
}

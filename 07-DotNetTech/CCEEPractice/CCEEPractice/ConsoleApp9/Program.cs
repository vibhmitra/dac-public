// See https://aka.ms/new-console-template for more information
Console.WriteLine("Hello, World!");


 // Delegate Function one
 PrintDelegate ConsolePrint = (string text) =>
 {
     Console.WriteLine($"Log to the console! 🖥 -> {text}");
 };

// Delegate Function two
PrintDelegate FilePrint = (string text) =>
{
    File.AppendAllText("./logs.txt", $"Log to the File! 🖥 -> {text}\n");
};


// By using Delegate we are able to pass function as a parameter
void ConnectToDatabase(PrintDelegate log) 
{
    // DB Insert running
    log("DB insertion is running! @");

    // Done
    log("Record got inserted.");
}

ConnectToDatabase(FilePrint);
ConnectToDatabase(ConsolePrint);

delegate void PrintDelegate(string text); // declaration




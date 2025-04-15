var builder = WebApplication.CreateBuilder(args); // this will build and compile

/* the services you want add them before the Build Method */
builder.Services.AddControllers(); // add all the controllers as Service

var app = builder.Build();  // st


app.UseRouting();
app.MapControllers();   // Now all output will come from controller

//app.MapGet("/", () => "Hello 🍕!");

app.Run(); // This is the core part | responsible for running Server

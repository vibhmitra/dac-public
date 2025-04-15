var builder = WebApplication.CreateBuilder(args);
builder.Services.AddControllers();
var app = builder.Build();
app.UseRouting();
app.MapControllers();   // Now all output will come from controller


//app.MapGet("/", () => "Hello World!");

app.Run();

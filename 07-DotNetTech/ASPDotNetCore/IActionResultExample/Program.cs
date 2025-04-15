var builder = WebApplication.CreateBuilder(args);
builder.Services.AddControllers();
var app = builder.Build();

app.UseStaticFiles(); // when using external CSS, JS, or other stuffs
app.UseRouting();
app.MapControllers();

app.Run();
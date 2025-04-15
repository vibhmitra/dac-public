var builder = WebApplication.CreateBuilder(args);
builder.Services.AddMvc();
var app = builder.Build();

//app.MapGet("/", () => "Hello World!");
app.MapControllerRoute(
    name: "default",
    pattern: "{controller = Home}/{action = Index}/{id?}"      // ? this id parameter is optional
    );
app.Run();

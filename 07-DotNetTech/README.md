## 👉 Tasks + Notes 📝

20240618-Basic
  - [X] ConsoleApp
  - [X] PrintShape
  - [X] Strings In C#
  - [X] Variable In C#

20240618-Classes
  - [X] LearnClasses
  - [X] LearnNamespaces
  - [X] StudentClassLibrary

20240619-Fields
  - [X] Fields In C#
  - [X] StaticAndCosnt
  - [X] TypeConversion
  - [X] PropertyInC# (Backing Fields: the get/set return valid thing ), Expression : the fat arrow thing + readonly shit, Auto Implemented[⚠] : the get; set; thing, Required[⚠])

20240620
  - [X] IndexersIn C# : To Access instances like an array. 👆
  - [X] InheritanceInC#: Use `':'` to Inherit and Always pass Arguments required by the base class.
  - [X] AbstractionC# : `abstract` keyword, only methods decleration, child will implement its ABSTRACT method and it is MUST. use `override` while implementing Parent methods.
  - [X] Interface C#
  - [X] Nullable Types
  - [X] Partial Class

20240621
- [X] DestructorInCS (Notes ❌)
- [X] ExtensionMethods ( Notes❌)
- [X] DynamicTypedVariable ( Notes❌)

20240624
 - [X] Patter Matching
 - [X] Generics (Notes ❌) - This is How we make Methods and Class that can take any 'Type' and can Return Any 'Type'.
 - [X] Delegates - A reference that can invoke multiple methods without calling it directly (lamest definition, ikr)
	* Single / MultiCast
 	* Anonymous Methods
  	* Lambda Expressions
   	* System Defined Delegates
   		* Func Delegate - a genrics, has multi IN and single OUT
   	 	* PredicateDelegate - a generic, has multi IN, bool OUT
   	  	* Action Delegate - a generic, has multi IN, void OUT
   	  	* Event Delegate - Publishers, Subscribers, Accessor

20240625
 - [X] CollectionsInC# (List, Disctionary, Enumrable) (Notes ❌)
 - [X] Events Delegates
 - [X] LINQ - to get data 

20240626
 - [X] LINQExamples
 - [X] Exception Handling

20240627
 - [X] Threads, DeadLock_In_Multithreading ❌❌ No Notes!
 - [X] Task
 - [X] File Handling - File R/W using AllText, AllLines and Stream. 📁📂

20240628
 - [X] FirstWebApp
 - [X] ControllersExample
 - [X] IActionResultExample
 - [X] ViewsExample
 - [X] ViewDataExample
 - [X] ViewBagExample

20240629
 - [X] RazorViewEngine
 - [X] Layouts (using razor view, layout) - PizzaStore Layout 🍕
 	* Partial View 

20240701 
 - [X] ModelBinding
 - [X] ASP MVC CRUD Application using Entityframework 🎈🎈🎈
 	* MVC
  	* DB Connections
   	* Styling
   	* Validations
   	* CRUD Operation  
 
20240702 
 - [X] Fluent Validation
 - [ ] WebAPI + Swagger
---
#### Basic (2024-07-24)
* **History**
	- Some folks at Microsoft Developed SMC C
	- They later called it - **Dot Net Framework**, But It wasn't crossplatform 😩.
	- The Framework was exclusively runs on Windows Platform only.
	- Then one day, they got idea 💡 from Java and made **Dot Net Core**
	- This new fella is able to run cross-platform. ✝
* **Execution Model**
	```mermaid 
		flowchart TD
		A[C# Code] --> B[C# Compiler] --> IL
		C[VB.Net Code] --> D[VB.Net Compiler] --> IL
		E[Any Other .NET App ] --> F[Its Compiler] --> IL
		IL["
		MSIL
		Microsoft Intermediate Language Code
		this is kinda like Java ByteCode + ITS CROSS PLATFORM"]
		--> CLR["CLR (Common Language Runtime)"]

		CLR --> NT["Native Machine Code (.exe, .dll, etc.)"]

		NT --> FINAL["Execution"] 
	```

	- CLR is Just-in-Time compiler.
	- Converts IL Code -> Machine Code.

* **C# Program / Architechture Stuffs**
	- Application contains a lot of Classes.
	- Collection of related classes is called - `namespace` in C#.
	- Collection of `namespace` is called - `ASSEMBLY (DLL or EXE)`.
	- And Finally collection of `ASSEMBLIES` make a complete application. dah! 👍


#### 2024-06-20
* **Indexers[ ]**
	- Indexers are used to make instances indexable. Kinda like an array.  
	- Indexer Overloading is Possible.
* **Inheritance:** 
	- Use **'  :  '** to Inherit and Always pass Arguments required by the base class.
	- `class <child> : <parent> { // code }` 👈 this is how we inherit in C#
	- Kinda like we do in C++.
*  **Base Keyword**
	- Calling class members from child's methods
	- ***Method Hiding***
		- Method Hiding is performed by re-implementing the parent class methods and adding `new` in front of it.
		- Still you can call the hidden method inside body of `new` method using `base.<method_name>`. 🙆‍♀️
* **Abstract Class**
	- Only Method definition NO Body
	- We can't create instances of this class.
	- Child Must Implements its ABSTRACT method.
	- use `abstract` keyword before parent
	- add `override` before to the function you going to implement abstract method of Parent class. (aka ***Method Overriding***)
	```C#
	abstract class <parent> 
	{
		public abstract void <meth>();	// only definition
	}
	...
	// inside child class
	public override <meth>()
	{
		// implementation
	}
	...
	```
	- **Sealed Class :** 
		- Kinda like Java `final` keyword.
		- We use it so that no other class can inherit this that anymore.
 * **Interface**
	 * A set of functionalities that a class or struct **must** implement. 
	 * It's like a blueprint + <u>ALL ELEMENTS INSIDE ARE PUBLIC</u>.
	 * Can contain methods, properties, events, and indexers.
	 * Naming convention is C# is: always starts with capital letter 'I'. for example - 
	 ```C#
	public interface ISchool
	{ 		
			// Properties
			// abstract methods
			// Normal Methods Decleration, etc.
	}
	 ```
	 
	 * Can not be instantiated.
	 * The implementing class/struct must provide a full Implementation for all the methods and properties declared in the interface.
 * **Partial Class**
	* A Partial Class is Broken into several files.
	* Name of each class must be same tho.
	* Namespace must be same.
	* `partial` Keyword is used to make a class Partial. 🤷‍♀️
	* Access modifier must be `public`
	* All Partial Classes can see each others Public stuffs.
	* Partial Class method's are <mark>`private`</mark> by Default.
		* Implementation is Optional
		* Must be void.
* **Nullable Type**
	* A **nullable reference type** is noted using the same syntax as [nullable value types](https://learn.microsoft.com/en-us/dotnet/csharp/language-reference/builtin-types/nullable-value-types): a `?` is appended to the type of the variable.
	```C#
	...
	string? name;
	...
	```
	* The null-coalescing operator `??` returns the value of its left-hand operand if it isn't `null`
 * **Pattern Matching**
	* technique to test an expression to determine if it has certain characteristics
	* For Example -
		In Inheritance: 
		✅  Parent Can Store Childs Object
		❌ Child Can't Store Parents Object
		(Confused? Mee too! I have no idea why I am even making notes 💢)

---
* **Delegates (Think of it as an elected representative 🚨)**
	* Represents references to methods with a particular parameter list and return type.
	* When you instantiate a delegate, you can associate its instance with any method with a compatible signature and return type.
	* Call (invoke) method through the delegate instance.
	* Used to pass methods as arguments to other methods.
	* Can be chained together; for example, multiple methods can be called on a single event.
	* This is how we declare that it 👇
	```C# 
	public delegate int PerformCalculation(int x, int y);
	```
	* How to Use it?
		*  **👉 #1 :**  Declare Delegate for Target Method ➕ The Target Methods
		*  **👉 #2 :** Instantiating the Delegates <mark>**Pass Target Methods As Argument Here <sup>(plus do not use parenthesis after method name 🤣)</sup>**</mark>
		*  **👉 #3 :** Use / Call
	* **TYPES:**
		* ***Single Cast  Delegates***\
			💃 The Return type of delegate should be same as target method.\
			💃 Parameter must be same as Method it is targeting.
		* ***Multi-Cast Delegates***\
			👯‍♀️ It can Accept Multiple `delegate` to be chained by creating object of Delegate it self and then adding all other instance to it.\
			👯‍♀️ The return type a `delegate` take will always be of the type of last method it get passed.\
			👯‍♀️ We can declare delegates outside the class too.
	* Use `Invoke()` method to Invoke delegates.
   	* **Anonymous method in C# / `Delegate` operator**
		* Is a method without having a name.
	    * Can be defined using the delegate Event Keywords
	    * Can be assigned to a variable of delegate type.
			```C#
			// Declare 
			public delegate string msgDelegate(string name);
			...
			 // annonymous method declaration
			msgDelegate md = delegate (string name) method
			{
			    return ($"Hello, {name}! 😊😊");
			};
			...
			// Call
			md.Invoke("Vibhanshu");
			```			
	* **Lambda Expression:** 
		* `=>` this is known as Lambda / Goes to operator.
		* These are used to actually shorten the Methods which uses a basic or single line statements.
		* Syntax (single statement) : `(input-parameters) => expression`
		* Syntax (multi statement): `(input-parameters) => { <sequence-of-statements> }`
		* for Example 👇
			```C#
			// the long one
			public void sayHello(string name)
			{
				Console.WriteLine($"ello, {name}! 💛");
				return;
			}
			// for single statement
			public void sayHello() => Console.WriteLine("ello! 💛");

			// with return type and parameter
			public void sayHello(string name) => Console.WriteLine($"ello, {name}! 💛");

			// More Shorter
			public string sayHello(string name) => $"ello, {name}! 💛";
			```
	* **Func Delegate**
		* Built in generics type Delegate, to avoid making manual delegates.
		* Takes one <ins>*input*</ins> parameter and one <ins>*Out*</ins> parameter
  		* <mark>Returns one Parameter of type of Last Input it gets</mark> 
		* <mark>0 <= Input Parameter <=16</mark>
			```C#
			    //  <in   in   out> delegateName = args to pass =>  return value   
			    Func<int, int, int> funcDelegate = (x, y) => (x + y);
			```
   	* **Predicate Delegate**
		* Generic Delegate, Kinda same as `Func` delegate.
		* Use to validate if input parameter meets the require or specific conditions or not.
		* <mark>Returns bool results</mark>
			```C#
			// Sytanx (🤔)
			Predicate<int> predicateDelegate = (age) => { return (age > 18); };
			```
   	* **Action Delegate**
		* Also a Generic Type
		* <mark>Doesn't return a value (Void)</mark>
		* Can have 0 - 16 IN Parameters.
			```C#
			public delegate void SayHi(string name);
			static void ConsolePrint(string name)
			{
			    Console.WriteLine($"Hi! {name} :)");
			}
			
			static void Main(string[] args)
			{           
			    SayHi sayHi= ConsolePrint;
			    sayHi("Nook");
			}
			// Output
			Hi! Nook :)
			```
___
2024-06-25
* Collections Notes - List, Array, Dictionary, Enumerable, Enumerator MISSING ❌❌
* **Events:**
	* Events represent something happening in your program (button click, data change).
	* They are declared using the `event` keyword followed by a delegate type.
	* Classes can subscribe (register) methods to be notified of the event.
	* **Connection:**
		- The delegate type defines which methods can be called when the event occurs.
		- When the event is triggered, the delegate calls all subscribed methods.
	* **Benefits:**
		- **Loose Coupling:** Code doesn't need to know about each other's details, just the delegate signature.
		-   **Maintainability:** Easier to add/remove event handlers without modifying the event source.
		-   **Scalability:** Multiple components can respond to the same event efficiently.
		```C#
		public class Button
		{
		  public delegate void ClickedEventHandler(object sender, EventArgs e); // Delegate type
		  public event ClickedEventHandler Clicked; // Event declaration

		  public void OnClick()
		  {
		    Clicked?.Invoke(this, EventArgs.Empty); // Invoke subscribed methods
		  }
		}

		public class Form
		{
		  private Button button;

		  public Form()
		  {
		    button = new Button();
		    button.Clicked += Button_Clicked; // Subscribe to Clicked event
		  }

		  private void Button_Clicked(object sender, EventArgs e)
		  {
		    // Handle button click here
		  }
		}
		```
	* Something more:
		- Publisher 👉 Creates Event + Raise It
		- Subscriber 👉 Got Targets In It
		- Accessor 👉 Can + or - Events

* **LINQ (Language Integrated Query)**
	*  A set of technologies that allows to write queries directly in your C# code.
	* Think of it as a way to **filter, transform, and order** data collections in a clean and readable way.
	* **Basic LINQ Operations:** 
		- **Where:** Filters data based on a condition.
		-   **Select:** Transforms data into a new format.
		-   **OrderBy:** Orders data based on a key.
		-   **Skip/Take:** Limits the number of returned elements.
	* 2024-06-26
		- `LINQ` Query is broadly divided into 2 categories based on the behavior of query execution:
		- **Deferred** or Lazy Operator: The Query Operators use **`deferred execution`**.\
		    Example: select, where, Take, Skip, etc.
		- **Immediate** or Greedy Operators: It is immediate execution.
		- LINQ Query is run by `foreach` loop internally.
   	
* **Exception Handling**
	* try...catch Block:
		```C#
		try
		{
		  // Code that might throw an exception
		}
		catch (Exception ex)
		{
		  // Handle the exception
		  Console.WriteLine("An exception occurred: " + ex.Message);
		}
		```
	* Use specific `catch` blocks to handle different exception types appropriately.
	* The `finally` block is useful for resource management.
	* Throw exceptions to indicate error conditions in your code.
	* **Types:**
		* System Defined
			* Format Exception
			* DivideByZero
			* IndexOutOfRangeException
			* NullReferenceException
			* InvalidOperationException
			* ArgumentNullException
		* Custom Exception
---
#### 2024-06-28
## ASP .NET Core
### Overview
* Use to build Cross-platform Apps
* Open Source
* Built-In Dependency Injection
* C# Code -> ILCode (To see the Code Use a Utility Tool Provided By Microsoft - 'ILDSM'
* ASP .NET Core MVC provides features to build web APIs and web apps:
* **Model-View-Controller Pattern**
	1) Model: 📚🧠
		* Contains Business Logic
		* Deals with databases
	2) View: 🌳🌴🌵
		* UI & Layouts of App
		* Controller can Get Data from Model and Populates in the View.
	3) Controller: 🔧🎮
		* Handles user interaction, work with the model, and ultimately select a view to render.
		* Handles Routing
		* Shouldn't be overly complicated

**Notes**
* Both the view and the controller depend on the model.  
* Model depends on neither the view nor the controller. 
*  Separation allows the model to be built and tested independent of the visual presentation.
* MVC Framework provides library to implement MVC Architecture.
* Some Popular Language and their Frameworks:
	|Programming languages | Frameworks |
	|---|---|
	| Java | Spring Boot |
	| JavaScript (Node.js)| Express, NextJS, NestJS  |
	| Python | django, Flask |
	| C# | ASP .NET MVC, ASP .NET Core MVC |
	| Ruby | Ruby on Rails, Rails |
	| PHP | Cake PHP |
	
* **Execution Flow of ASP .NET Core Web App:**
	* User -> Browser
	 * Browser -> Controller
	* Controller -> Models (as needed)
	* Models retrieve/manipulate data (instructed by Controller)
	* Controller prepares data for View
	* Controller -> View
	* View builds HTML response (using received data)

* Basic ASP .NET Core project, the files:
	* ***`Program.cs`:*** Main entry point. 🏃‍♂️
	 * ***`Startup.cs`:*** Config + Middleware. 👨‍🎤
	* ***`Controllers`*** (Class files .cs extension) - folder 🎮
	* ***`Models`*** (Class files .cs extension) - folder 📚
	* ***`Views`*** (.cshtml extension): UI using Razor syntax. 🌳🌴🌵
	* *Optional Files:*
		* `appsettings.json`: Config like *<ins>connection strings and environment variables, Credentials</ins>*.  🔧
		* `wwwroot` folder: Static files live here. 🌐
	* **Inbuilt-Server**
		* Kestrel Server
		* IIS Express Server
		* We can add other server in `launchSettings.json` file
	* The main entry for a ASP NET App is from Program.cs
		* The Program.cs file has some steps that it follows to build any app
			```C#
			var builder = WebApplication.CreateBuilder(args); //👈 this will build and compile
							👇👇👇👇👇👇👇👇
			/* the services you want add them before the Build Method */
			builder.Services.AddControllers(); // add all the controllers as Service
							👆👆👆👆👆👆👆👆
			var app = builder.Build();  // storing the build to app var
			app.UseRouting();	
			app.MapControllers();   // Now all output will come from controller
			app.Run(); // This is the core part | responsible for running Server
			```
	* **ActionResult**
		* Action result is class that contains various methods.
		* It has one nice interface called - `IActionResult`
		* `IActionResult` has various methods in it -
			* Like: `Content, File, Json` etc.
#### 2024-06-29
* **Starting From Scratch**
	1. Create a simple - ASP .NET Core Empty Project
		* Do use top level statement to avoid the `main` method.
	2. Modify `Program.cs`
		*	Create builder
		*	Add MVC service to builder
		*	Build it to App
		* Make use of Static Files
		* Use Routing
		* Map Controllers
		* Run The App
			```C#
			Program.cs
			var builder = WebApplication.CreateBuilder(args);
			builder.Services.AddMvc();
			var app = builder.Build();
			app.UseStaticFiles();
			app.UseRouting();
			app.MapControllers();
			app.Run();
			```
	3. Add `Controllers` folder + Add A Default `HomeController.cs`,
		* This file will contain all method that will be basically return type of `IActionMethods` by default.
		* Methods can also accept Parameter from the URL itself, kinda like GET request. (query would be something like this -> `http://localhost:8080?BookId=90`
		*  ASP Has already defined function inside it.
	4. Add Routing to Controllers: `[Route("/")]`
		* You can specify two routes to only one method. (one will be treated as Default and Other will act as substitute). 
	5. Adding Folder for Static Files: Add `wwwroot` folder and Add Client-Side Libraries (optional)
	6. Adding Views
		* Add View Folder -> Right-Click on the Controller's method -> Add View
		* Here you will now get two choices:
			* Manually Create `<methodname>.cshtml` file for that particular method (view will be created by the name of the Controller inside `View -> <Controller Name>`
			* Use Razor View (Automatic Way)
				* Razor View Empty -> This option will just create View For that method. (It may ask you to name Your View)
				* Razor View Layout Provides to use templating. First Create a Folder called `Shared` Inside the `Views` Folder.
				* Add New View With Razor Layout, This will create a file called -> `_Layout.cshtm`, Now this file will act as a master view + you have to mention it in every View .cshtml file which Layout it wants to use.

* **ViewBag, ViewData**
	* Use ViewData when:
			- You need type safety for the data being passed.
			- You want to access the data using a specific key.
			 - The data is specific to the current view or action.
	* Use ViewBag when:
			- You need a quick and convenient way to pass simple data.
			- The data might not be known at compile time (e.g., dynamically generated values).
			 - You don't need type safety for the data.
* **Layout:** 
	* Here's how to create a `_ViewStart.cshtml` file in ASP .NET MVC:

		**1. Right-click on the `Views` folder in your project.**

		**2. Select "Add" -> "New Item...".**

		**3. In the "Add New Item" dialog:**

	-   Choose "Razor View Start" from the template list (if available).
	-   If the "Razor View Start" template isn't available, select "HTML (CSHTML)" and name it `_ViewStart.cshtml` OR Just Choose Razor Components.

### Model Binding { MISSING }


#### 2024-07-01
## Building a Basic CRUD App in ASP.NET Core
### Entity Framework (notes)
- ADO. NET Enitity FW
- Interacts with DB via a Simple *Connection String*
- EF uses ADO. NET internally, ADO. NET Entity FW is easy version of it.
- We use LINQ to Query Databases

* **Advantage**
	- Better OOP
	- Less code

* **Basic Concept**
	- Model Class: a table -> model, columns -> property
	- DbSet: DbSet -> model, a DbSet is a collection of Objects of model class
	- DbConext: DataSet in ADO .NET, Is a Collection of DbSet's

* HTML Helpers
	* **Types**
		- Simple (ViewData, ViewBag, TempData)
		- Strongly Typed (Model Binding) - uses Model and Razor Annotation

### Entity Framework First Approach

* **Step 1:** Create ASP -> NET MVC Application w/ MVC name.
* **Step 2:** Create one Model Class named `Product.cs` inside the `Models` Folder.
* **Step 3:** Install these Pakages from NuGet Package Manager-
	* `Microsoft.EntityFrameworkCore`
	* `Microsoft.EntityFrameworkCore.Tools`
	* `Microsoft.EntityFrameworkCore.SqlServer` (optional)
	* `Microsoft.VisualStudio.Web.CodeGenerators.Mvc`
	* `Microsoft.VisualStudio.Web.CodeGenerators.Design`
	* `MySql.Data.EntityFramework`
* **Step 4:** All Secret Info will be in `appsettings.json`
	* This file will contain: **Database Connection strings** : Like Database Credentials, name and other stuffs.
(The Connection Strings are provided by DB Vendor in many cases.)
		```javascript
		// appsetings.json
		{
		  "Logging": {
			"LogLevel": {
			  "Default": "Information",
			  "Microsoft.AspNetCore": "Warning"
			}
		  },
		  "AllowedHosts": "*",
		  "ConnectionStrings": {
			"DefaultConnection": "server=localhost;user=root;password=root;database=entity_product"
		  }
		}
		```

* **Step 5:** Create a database named `entity_product` via MySQL Workbench
* **Step 6:** Create a `Data` folder in your working project.
	* Inside `Data` folder -> Add a class `ApplicationDBContext`
	* Write this code inside the class `ApplicationDBContext`:
		```C#
		using Microsoft.EntityFrameworkCore;
		using Microsoft.EntityFrameworkCore.Design;
		using MySql.EntityFrameworkCore.Extensions;
		using ProductManagementSystem.Models;
		namespace ProductManagementSystem.Data
		{
		    public class ApplicationDBContext : DbContext
		    {
		        // Constructor
		        public ApplicationDBContext(DbContextOptions<ApplicationDBContext> options) : base(options)
		        { }

		        // Below line will create a table name 'products' in your MySQL database.
		        public DbSet<Product> products { get; set; }
		    }
		    
		    public class MySqlEntityFrameworkDesignTimeServices : IDesignTimeServices
		    {
		        public void ConfigureDesignTimeServices(IServiceCollection services)
		        {
		            services.AddEntityFrameworkMySQL();
		            new EntityFrameworkDesignServicesBuilder(services).TryAddCoreServices();
		        }
		    }
		}

		```
* **Step 7:** Add Required Services to `Program.cs`
	```C#
	// Indicating Db Context 
	builder.Services.AddDbContext<ApplicationDBContext>
	    (options => options.UseMySQL(builder.Configuration.GetConnectionString("DefaultConnection")));
	```
	***Note:** Add above services before `app.Build();`*
	
	Add Routing, Statics, and other stuffs
	```C#
	...
	app.UseStaticFiles();
	app.UseRouting();
	app.UseAuthorization();
	app.MapControllerRoute(
	    name: "default",
	    pattern: "{controller=Product}/{action=Index}/{id?}");
	...
	```
* **Step 9:** Add Migration and Update Database
	* Once DB is running, Open NuGetPackage manager and run the following command -
		* `Add-Migration <SavePointName>`\
			 e.g. `Add-Migration InitialCreate`
		* `Update-Database`\
		This will create a Database + Table defined in `ApplicationDBContext` file.
* **Step 10:** Start Adding Functionality and Views Now. 🏃‍♂️


## Reference + Bookmarks 🔖
* https://learn.microsoft.com/en-us/dotnet/csharp/
* https://dotnettutorials.net/

# Advance Java (Web Based Programming) ☕
contains workspaces / programms and other stuff.
## My Setup

### Servlets
Software: 
1. JDK-22
2. Eclipse IDE (EE)
3. Apache Tomcat 9 Server
4. MySQL Database
5. Spring Tool Suite 4, Hibernate

This project uses Maven as Build Tool. It has like two main files: 
* pom.xml - this file contains all the maven dependencies, compiler info etc.
* Web.xml - this file contains the Servlet info and URL mapping of those servlets.

---
#### 2024-05-31 22:42
### Spring Application Framework
Why do we need it?
Let say we have classes for making a laptop, 
a) class called `Laptop` .
b) `samsungHardDrive` is an interface of class `HardDrive`

    class Laptop {
	    HardDrive hddObj = new samsungHardDrive();
    }
**The Problem: Tight Coupling and Hardcoding**

When you directly create an instance of a dependent object (like `HardDrive`) inside another class (like `Laptop`), you create tight coupling. This means a change in the dependent object (e.g., switching from Samsung to Toshiba) requires modifying the `Laptop` class code. This is inflexible and makes testing difficult.

**The Solution: Dependency Injection and Loose Coupling**

Dependency injection (DI) is a design pattern that decouples classes from their dependencies. Instead of creating dependencies themselves, classes receive them as arguments or through setter methods. This allows for:

- **Flexibility:** You can easily swap out implementations of the dependency (e.g., different hard drive brands) without changing the `Laptop` class.
- **Testability:** You can inject mock objects for dependencies during unit tests, isolating the `Laptop` class for testing.

**Spring and Dependency Injection**

The Spring framework provides a container that manages object creation and dependency injection. Here's how it works:

1. **Configuration:** You define your beans (objects) and their dependencies in an XML file or using annotations.
2. **Object Creation:** The Spring container creates bean instances (like `Laptop`) and injects the required dependencies (like `HardDrive`) based on the configuration.
3. **Usage:** Your classes receive the injected dependencies through constructor arguments or setter methods.

**Benefits of Spring's Approach:**

- **Simple Configuration:** You manage dependencies in a centralized location (XML or annotations) for easier maintenance.
- **Loose Coupling:** Classes are not tied to specific implementations, promoting flexibility.
- **Testability:** You can easily inject mock dependencies for unit testing.

**Key Annotations:**

- `@Component`: Marks a class as a Spring bean (object to be managed).
- `@Autowired`: Instructs Spring to inject a dependency into a bean.

**In Summary:**

Dependency injection in Spring helps you create loosely coupled, flexible, and testable applications by managing object creation and dependency injection through configuration. This approach improves code maintainability and makes testing more efficient.

    /* Laptop Class */
    class Laptop {
	    @Autowired
	    HardDrive obj;
    }
    
    /* samsungHardDrive Class */
    @Component
    class samsungHardDrive implements HardDrive() {
	    ...
	    ...
	    ...
    }

---
#### 2024-05-31
## Aspect Oriented Programming (AOP)

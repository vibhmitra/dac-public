package in.cdac.abstractclass;

abstract class Person {				// it is not mandatory if class is declared abstract to have abstract methods in it. |||| 
	private String name;
	private int id;
	
	public Person(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public void showPerson() {
		System.out.println("Name : " + name);
		System.out.println("Id : " + id);
	}
}
public class Employee extends Person{

	public Employee(String name, int id) {
		super(name, id);
	}

	public static void main(String[] args) {
		
		Employee employee= new Employee("LOl", 899);
		employee.showPerson();
		
		Person person = new Employee("Hello", 101);
		person.showPerson();
	}

}

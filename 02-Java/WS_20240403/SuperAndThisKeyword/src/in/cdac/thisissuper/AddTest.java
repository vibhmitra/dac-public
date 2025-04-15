package in.cdac.thisissuper;

public class AddTest {

	int num;
	
	AddTest(int num) {
		this.num = num;
	}
	
	public void display() {
		System.out.println("The Value of num : " + this.num);
	}
	
	AddTest increment() {			// class type method
		num++;
		return (this);
	}
	public static void main(String[] args) {
		AddTest at = new AddTest(100);
		at.increment().increment();			// Here we are able to call multiple times cuz increment() method is of class type.
		at.display();

	}

}

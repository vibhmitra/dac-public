package in.cdac.abstractclass;



abstract class Identity {				// fully abstract class : all entities are declared abstract
	abstract void getName(String name);
	abstract void getGender(String gender);
	abstract void getAddress(String address);
}

public class MainIdentity  extends Identity {

	public static void main(String[] args) {
		Identity id = new MainIdentity();
		id.getName("Vibh");
		id.getGender("M");
		id.getAddress("Allahabad");

	}

	@Override
	void getName(String name) {
		System.out.println("Name : " + name);
	}

	@Override
	void getGender(String gender) {
		System.out.println("Gender : " + gender);
	}

	@Override
	void getAddress(String address) {
		System.out.println("Address : " + address);
	}
}

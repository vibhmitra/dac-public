package in.cdac.abstractclass;

class VehicleTypes {
	interface Vehicle {
		public int NoOfWheels();
	}
}

class Bus implements VehicleTypes.Vehicle {

	@Override
	public int NoOfWheels() {
		
		return 10;
	}	
}

class Truck implements VehicleTypes.Vehicle {

	@Override
	public int NoOfWheels() {
		
		return 14;
	}	
}

class Car implements VehicleTypes.Vehicle {

	@Override
	public int NoOfWheels() {
		
		return 4;
	}	
}

public class InterfaceTest {
	public static void main(String[] args) {
		Bus bus = new Bus();
		System.out.println(bus.NoOfWheels());
		Truck truck = new Truck();
		System.out.println(truck.NoOfWheels());
		
		VehicleTypes.Vehicle v;
		v = new Bus();
		System.out.println(v.NoOfWheels());
		v = truck;
		System.out.println(v.NoOfWheels());
		
		truck = (Truck) v;		// casting
		System.out.println(truck.NoOfWheels());
	}
}

package in.cdac.ObjectIPStream;

import java.io.Serializable;

public class Employee implements Serializable {

	String empName, dateOfJoining, empLocation;
	int empID;
	float empSalary;
	static float empAge; 					// static  cannot be serialize | Var Cannot be stored Object 
	transient String nickName;				// this cannot too
	transient Customer cutomer = new Customer();	// If you don't want to serialize any data members of class then declare it transient// this will also NOT go on file as object as it is declared transient
}

class Customer {
	
}


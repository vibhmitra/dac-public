package in.cdac;
//import java.util.Scanner;
public class Array {
        
	public static void main(String[] args) {
	
/*
		
		// Primitive type array
		int[] a1, b1;
		int[] a2[], b2;
		int[] [] a3, b3;
//		int[] a, []b;	// this is invalid
		
		int[] a=new int['a'];	// this is valid
		byte b=10;
		a[2]=b;  // valid
		
		
// 		max allowed array size in java is 2147483647
//		int[] p = new int [2147483647];
		
		int[] x= {1,2,4,6}; // valid
		
		
//		int[] x;		=== invalid
//		x = new int[3];	
//		x = {2,4,23};	=== compile time error.
		
		short s=3;
		a[6] = s;
		
//		a[4]=4l  compile E
		
//		Object type array, child class can also store.
		Object[] f=new Object[10];
		f[0]=new Integer(10);
		f[1]=new Object();
		f[2]=new String("john");
		
		System.out.println(f[0]);
		System.out.println(f[1]);
		System.out.println(f[2]);
		
// 		Class type array
		Number[] n= new Number[10];
		n[0] = new Integer(3);
		n[1] = new Double(4.5);
//		n[2] = new String("ddd"); CE as string is class
		
		System.out.println(n[0]);
		System.out.println(n[1]);
	
// 		Interface type array
		Runnable[] r=new Runnable[10];
		r[0] = new Thread();
//		r[1] = new String["Mike"];	// string is class
		System.out.println(r[0]);
		
		int[] ao = {2,5,3};
		char[] ch = {'a', 'b', 'c'};
		
		int[] aa=ao;
//		int[] ca = ch;  // invalid assignment, promotion 
 */
// 		Array Variable assignment
		
		String[] str = new String[]{"aa","hh","jj"};
		Object[] obb = str;
		System.out.println(obb[2]);
	}

}

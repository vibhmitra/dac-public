package in.cdac.string;

public class StringExample {

	public static void main(String[] args) {
		String s = "Hello";
		s.concat("world");
		System.out.println(s);		/// this shows that String is immutable

		String s1 = "Wow";
		String s2 = "Wow";
		
		String str1 = new String("Pow");
		String str2 = new String("pow");
		
		System.out.println(s1.equals(s2)); // compares two strings
		System.out.println(str1.equals(str2));	// false
		System.out.println(str1.equalsIgnoreCase(str2));	// true
		
		String ss1 = new String("Mow");
		String ss2 = new String("Mow");
		
		System.out.println(s1 == s2);	// this will check if s1 and s2 both points to same value in memory
		System.out.println(ss1 == ss2);	//  this will check if ss1 and ss2 both points to same value in memory which obviously not in this case , stored at same memory
		
		String su1 = "Mellow";
		String su2 = "Mellow";
		String su3 = "Tellow";
		String su4 = null;
		
		System.out.println(su1.compareTo(su2));
		System.out.println(su1.compareTo(su3));
		
		String su5 = su2.concat(su3);
		System.out.println(su5);
		
		su2 = su3.concat(su1);
		System.out.println(su2);

		StringBuilder sb = new StringBuilder();
		sb.append("New Delhi");
		System.out.println(sb);
		sb.append(" is ");
		System.out.println(sb);
		
		
	}

}

package in.cdac.string;

public class StringBuildExample {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb);
		
		
		System.out.println("len : " + sb.length());
		System.out.println("cap : " + sb.capacity());
		
		sb.append("A");
		sb.append("AB");
		sb.append("ABC");
		sb.append(2024);	// appending an integer
		
		System.out.println("len : " + sb.length());
		System.out.println("cap : " + sb.capacity());

		
		StringBuilder sb1 = new StringBuilder("Hello"); 
		sb1.append(" Mello");
		System.out.println(sb == sb1);
		
		StringBuilder sb2 = sb1.append(sb);
		System.out.println(sb2);
		
		System.out.println("Char at position 3 : " + sb1.charAt(3));
		sb2.setCharAt(0,'L');
		System.out.println(sb2);
		
		
		StringBuilder sb4 = new StringBuilder("Hello");
		sb4.insert(4, " :) ");
		System.out.println(sb4);
		
		sb4.delete(0, 4);
		System.out.println(sb4);
		
		sb4.deleteCharAt(4);
		System.out.println(sb4);
		
		sb4.replace(2, 3, "P");
		System.out.println(sb4);
		
		sb1.reverse();
		System.out.println(sb1);
		
	}

}

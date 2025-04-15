package in.cdac;
import java.util.Arrays;
public class StringArray {

	public static void main(String[] args) {
//		Command Line Arguments
//		String[] str = {"aa", "bb", "cc"};
//		args = str;
//		for (String i : args) {
//			System.out.println(i);
//		}
		
		String[] str1 = new String[] {"aa", "bb", "cc"};
		System.out.println(Arrays.toString(str1));
		
		String[] str2 = new String[3];
		str2[2] = "abc";
		
		System.out.println(Arrays.toString(str2));	// Printing arrays using Arrays util and method toString()
	}

}

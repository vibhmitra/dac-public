package in.cdac.exceptionhandle;

import java.io.*;

public class LogicalImplementation {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n1, n2, n3;
		
		
		try {
			n1 = Integer.parseInt(br.readLine());
			n2 = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			
			System.out.println("Second Number Cannot Be Zero");
		}
		catch (IOException e) {
			
			System.out.println("Second Number Cannot Be Zero");
		}

//		if (n2 == 0) {
//			System.out.println("Second Number Cannot Be Zero");
//		}
//		else {
//			n3 = n1 / n2;
//			System.out.println(n3);
//		}
		
	}

}

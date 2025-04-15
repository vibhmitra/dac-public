package in.cdac.PrintWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		String path = "D:\\Delhi\\FileWriterData.txt";
		FileWriter fw = new FileWriter(path, true);
		PrintWriter pw = new PrintWriter(fw);
		
		pw.println(100);
		pw.println("Hello");
		pw.flush();
		pw.close();
		
	}

}

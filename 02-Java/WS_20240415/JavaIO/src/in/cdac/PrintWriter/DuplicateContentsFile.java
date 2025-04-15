package in.cdac.PrintWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DuplicateContentsFile {

	public static void main(String[] args) throws IOException {
		BufferedReader brI = new BufferedReader(new FileReader("G:\\Delhi\\Duplicate\\input.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("G:\\Delhi\\Duplicate\\output.txt"));
		
		String t;
		String lineData = brI.readLine();
		while (lineData != null) {
			System.out.println(lineData);
			t = lineData;
			lineData = brI.readLine();
			if (t != lineData) {
				pw.println(lineData);
				System.out.println(";;"+lineData);
			}
		}
	}

}

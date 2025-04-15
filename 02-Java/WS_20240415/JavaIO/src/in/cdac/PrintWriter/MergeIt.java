package in.cdac.PrintWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeIt {

	public static void main(String[] args) throws IOException {
		// Kinda Like OPENING A FILE
		FileReader frA = new FileReader("G:\\Delhi\\a.txt");
		FileReader frB = new FileReader("G:\\Delhi\\b.txt");
		
		// To Read Streams From File
		BufferedReader brA = new BufferedReader(frA);
		BufferedReader brB = new BufferedReader(frB);
		
		// To Write Streams into File
		FileWriter fwAB = new FileWriter("G:\\Delhi\\ab.txt");
		PrintWriter pwAB = new PrintWriter(fwAB);
		
		
		String lineDataA = brA.readLine();
		String lineDataB = brB.readLine();
		
		while(lineDataA != null || lineDataB != null) {
			if (lineDataA != null) { pwAB.println(lineDataA); }
			if (lineDataB != null) { pwAB.println(lineDataB); }
			lineDataA = brA.readLine();
			lineDataB = brB.readLine();
		}
		
		pwAB.flush();
		brA.close();
		brB.close();
		pwAB.close();
	}

}

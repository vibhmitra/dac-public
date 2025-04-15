package in.cdac.BufferedWriterJAV;

import java.io.*;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D:\\Delhi\\FileWriterData.txt", true);
		
		BufferedWriter bfw = new BufferedWriter(fw);
		bfw.write((int)100);
		bfw.newLine();
		char chArray[] = {'W', 'O', 'W'};
		bfw.write(chArray);
		bfw.newLine();
		bfw.write("Something!!");
		bfw.newLine();
		bfw.write("Nothing!!");
		bfw.newLine();
		bfw.write(":)");
		bfw.newLine();
		bfw.flush();
		bfw.close();
		
		BufferedWriter dbfw = new BufferedWriter(new BufferedWriter(new FileWriter("D:\\Delhi\\FileWriterData.txt", true)));		// two level buffering | IS VALID
		dbfw.write("Date Added By Two Level Buffering :/");
		
		// Reading Contents of File Using BufferedReader
		
		FileReader fr = new FileReader("D:\\Delhi\\FileWriterData.txt");
		BufferedReader bfr = new BufferedReader(fr);
		
		String lineData = bfr.readLine();
		while(lineData != null) {
			System.out.println(lineData);
			lineData = bfr.readLine();
		}
	}

}

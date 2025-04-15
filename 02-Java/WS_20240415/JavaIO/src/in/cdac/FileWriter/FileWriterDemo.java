package in.cdac.FileWriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		
		// writing data to the file
		FileWriter fw = new FileWriter("D:\\Delhi\\FileWriterData.txt", false);
		
		fw.write(100); // adding a single char to the file
		fw.write('\n');
		fw.write("Hello World!");
		fw.write('\n');
		char[] charArray = {'T', 'H' , 'I', 'S'};
		fw.write(charArray);
		
		System.out.println("Data Writen Successfully....");
		fw.flush();
		fw.close();
		
		
		// reading data from file
		System.out.println("\n::Reading Using FileReader Class");
		FileReader fr = new FileReader("D:\\Delhi\\FileWriterData.txt");
		
		int data = fr.read();
		while(data != -1) {
			System.out.print((char)data);	// casting back to char because fr.read() is throwing integers
			data = fr.read();
		}
		
		// reading file using File class | use for reading small amt of data
		System.out.println("\n\n::Reading Using File Class");
		File file = new File("D:\\Delhi\\FileWriterData.txt");
		FileReader fr2 = new FileReader(file);
		System.out.println("File Length > " + file.length());
		
		char[] charArray2 = new char[(int) file.length()];	
		fr2.read(charArray2);
		for (char c : charArray2) { System.out.print(c); }
	}

}

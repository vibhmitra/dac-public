package in.cdac.WriterClass;

import java.io.*;

public class WriterMainEx1 {

	public static void main(String[] args) {

		Writer w;
		try {
			w = new FileWriter("D:\\Delhi\\FileWriterData.txt", true);
			String fileData = "\nMango is Mango";
			w.write(fileData);
			w.close();
			
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}

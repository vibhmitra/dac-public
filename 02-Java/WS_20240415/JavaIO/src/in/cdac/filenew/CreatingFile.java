package in.cdac.filenew;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CreatingFile {

	public static void main(String[] args) {
		String rootPath = "G:\\CDAC\\Curriculum\\2-Practice\\Java\\Workspace\\JavaIO\\data\\";
		String packageDir = "FileNew\\";
		String fullPath = rootPath + packageDir;
		
		
		// (1) using createNewFile() method
		File file = new File(fullPath + "myfileType1.txt");
		boolean isFile;
		try {
			isFile = file.createNewFile();			
			if (isFile)
				System.out.println("File Created @ : " + file.getCanonicalPath());	// it returns file path in String form.
			else
				System.out.println("File Already Exist @ : " + file.getCanonicalPath());
		} catch (IOException e) {
			
			e.printStackTrace();	//
		}
		
		
		
		// (2) using FileOutputStream class
		try {
			Scanner sc = new Scanner(System.in);
			FileOutputStream fos = new FileOutputStream(fullPath + "myfileType2.txt", true);	// create instance for FileOutputStream
			System.out.print("Enter Data : ");
			String name = sc.nextLine();
			byte[] b = name.getBytes();	// converting string into bytes using getBytes()
			fos.write(b);				// writing data in bytes to the file 
			fos.close();
			System.out.println("Data Saved Successfully!");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		// (3) using
		Path path = Paths.get(fullPath + "myFile3.txt");	// creating Path instance
		try {
			Path myFilePath = Files.createFile(path);
			System.out.println("File Created Successfull @ " + myFilePath);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}

package in.cdac.JavaIOFile;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		
		String rootPath = "G:\\CDAC\\Curriculum\\2-Practice\\Java\\Workspace\\JavaIO\\data\\";
		String packageDir = "FileDemo\\";
		String fullPath = rootPath + packageDir;
		
		// creating file
		File f = new File(fullPath + "FileDemo.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		
		
		// creating directory
		File d = new File(fullPath + "FileDirType1"); // Constructor 1
		System.out.println(d.exists());
		d.mkdir();
		System.out.println(d.exists());
		
		
		File d1 = new File(fullPath + "FileDirType2");
		d1.mkdir();
		File f1 = new File(d1, "FileType2.txt"); // constructor 2
		f1.createNewFile();
		
		File d3 = new File(fullPath + "FileDirType3");
		d3.mkdir();
		File f2 = new File(fullPath + "FileDirType3", "FileType3.txt"); // Constructor 3
		f2.createNewFile();
	}
}



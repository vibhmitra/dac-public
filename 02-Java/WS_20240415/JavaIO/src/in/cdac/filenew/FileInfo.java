package in.cdac.filenew;

import java.io.File;
import java.io.IOException;

public class FileInfo {

	public static void main(String[] args) throws IOException {
		String rootPath = "G:\\CDAC\\Curriculum\\2-Practice\\Java\\Workspace\\JavaIO\\data\\";
		String packageDir = "FileInfo\\";
		String fullPath = rootPath + packageDir;
		
		
		
		File file = new File(fullPath + "myFile.txt");
		System.out.println("File Exist ? " + file.exists());
		System.out.println("File ? " + file.isFile());
		System.out.println("Directory ? " + file.isDirectory());
		System.out.println("File Name : " + file.getName());
		System.out.println("Length of File : " + file.length());
		System.out.println("getPath() Path : " + file.getPath());
		System.out.println("Absolute Path : " + file.getAbsolutePath());
		System.out.println("Canonical Path : " + file.getCanonicalPath());
		System.out.println("Parent Path : " + file.getParent());
		System.out.println("Can Read ? : " + file.canRead());
		System.out.println("Can Write ? : " + file.canWrite());
	
		System.out.println("Last Modified : " + new java.util.Date(file.lastModified()));
	}

}

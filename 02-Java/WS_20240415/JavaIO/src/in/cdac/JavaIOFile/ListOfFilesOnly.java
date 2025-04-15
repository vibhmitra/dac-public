package in.cdac.JavaIOFile;

import java.io.File;

public class ListOfFilesOnly {

	public static void main(String[] args) {
		String rootPath = "G:\\CDAC\\Curriculum\\2-Practice\\Java\\Workspace\\JavaIO\\data\\";
		String packageDir = "ListOfFilesOnly\\";
		String fullPath = rootPath + packageDir;
		
		
		int fileCount = 0;
		int dirCount = 0;
		
		// Making a File object to get the full list of contents inside MyDirectory Folder
		File mainDirectory = new File(fullPath + "MyDirectory");
		
		// Iterating through the list
		for(String content : mainDirectory.list()) {
			File fileItem = new File(mainDirectory, content);
			if (fileItem.isDirectory()) {
				dirCount++;
				System.out.println(content + " : (dir)");
			}
			
			if (fileItem.isFile()) {
				fileCount++;
				System.out.println(content + " : (file)");
			}
		}
		
		System.out.println("File Count > " + fileCount);
		System.out.println("Dir Count > " + dirCount);
	}
}

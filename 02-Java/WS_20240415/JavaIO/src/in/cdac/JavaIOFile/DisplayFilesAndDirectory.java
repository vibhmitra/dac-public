package in.cdac.JavaIOFile;

import java.io.*;


public class DisplayFilesAndDirectory {

	public static void main(String[] args) {
		String rootPath = "G:\\CDAC\\Curriculum\\2-Practice\\Java\\Workspace\\JavaIO\\data\\";
		String packageDir = "DisplayFilesAndDirectory\\";
		String fullPath = rootPath + packageDir;
		
		int contentCount = 0;

		File f = new File(fullPath);
		String[] contentList = f.list();
		for (String content : contentList) {
			contentCount++;
			System.out.println(content);
		}
		
		System.out.println("Contents Count : " + contentCount);
		
	}

}

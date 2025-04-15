package in.cdac.FileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FileReaderExample {

	public static List readFile(String fileName) {
		
		List lineData = Collections.emptyList();
		try {
			// Read all data of the files line by line
			lineData = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		return (lineData);
	}
	
	
	public static String readFileContents(String fileName) throws Exception {
		String fileContents = "";
		fileContents = new String(Files.readAllBytes(Paths.get(fileName)));
		return (fileContents);
	}
	
	
	public static void main(String[] args) throws Exception {
		String rootPath = "G:\\CDAC\\Curriculum\\2-Practice\\Java\\Workspace\\JavaIO\\data\\";
		String packageDir = "FileReaderExample\\";
		String filePath = rootPath + packageDir;
		
		List list = readFile(filePath + "filereader.txt");
		
		// reading with iterator
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
//		System.out.println("\n");
//		/// reading with readFileContents() method with String class
//		String contents = readFileContents(filePath);
//		System.out.println(contents);
		
		
		// Reading (Using BufferedReader Class)
		FileReader fr = new FileReader(filePath + "filereader.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String lineData;
		while ((lineData = br.readLine()) != null) {
			System.out.println(lineData);
		}
		fr.close();
		br.close();
		
	}

}

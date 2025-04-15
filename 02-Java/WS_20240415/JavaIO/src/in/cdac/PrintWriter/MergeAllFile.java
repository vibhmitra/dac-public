package in.cdac.PrintWriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeAllFile {

	public static void main(String[] args) throws IOException {
		File inputDir = new File("G:\\Delhi\\MergeAll");		// files | where data is at.
		
		FileWriter fw = new FileWriter("G:\\Delhi\\MergeAll\\Merged\\mergedData.txt");	// file | on which data should be copied to.
		PrintWriter pw = new PrintWriter(fw);
		
		
		for (String fileName : inputDir.list()) {
			File dirItem = new File(inputDir.getPath(), fileName);		// checking individual items in folder @ mainDir
			
			if (dirItem.isFile()) {
				
				FileReader fr = new FileReader(dirItem);	// probing file
				BufferedReader br = new BufferedReader(fr);	// probing data inside file
				
				System.out.println("\nWriting Data of file : " + fileName);
				
				String lineData = br.readLine();		// reading first line | Initializing cursor at Line one
				while (lineData != null) {
					System.out.print(lineData);
					pw.println(lineData);				
					lineData = br.readLine();			// This will keep taking next line every time we call readLine() method
				}
			}	
		}
		pw.close();
	}

}

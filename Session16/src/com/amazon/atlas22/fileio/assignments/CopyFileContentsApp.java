package com.amazon.atlas22.fileio.assignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyFileContentsApp {

	static void copyContents(File sourceFile, File destinitionFile) {
		
		// Copy the contents of sourceFile into the destinitionFile
		// Condition: Do Not Copy Single Line Comments or Multi Line Comments
		
		try {
			
			if(sourceFile.exists()) {
				
				// FileWriter will also create a file, if it does not exist
				
				FileReader reader = new FileReader(sourceFile);
				BufferedReader buffer = new BufferedReader(reader);
				
				FileWriter writer = new FileWriter(destinitionFile, true);
				
				String line = "";
				boolean multiLineFlag = false;

				while((line = buffer.readLine()) != null) {
					
					// Skipping a Single Line Comment
					if(line.trim().startsWith("//")) {
						continue;
					}
					
					if(line.contains("/*")) {
						multiLineFlag = true;
						continue;
					}
					
					if(line.contains("*/")) {
						multiLineFlag = false;
						continue;
					}
					if(multiLineFlag) {
						continue;
					}
					
					writer.write(line+"\n");
				}
				
				buffer.close();
				reader.close();
				writer.close();
				
				System.out.println("COPY OPERATION FINISHED");
				
			}else {
				System.out.println("Sorry !! We cannot Copy the Contents...");
			}
			
			
		} catch (Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}
		
	}
	
	public static void main(String[] args) {
		
		// File1 Exists
		File file1 = new File("/Users/ishant/Downloads/AmazonAtlas22/Session16/src/com/amazon/atlas22/fileio/FileDemo.java");
		
		// File2 Does Not Exists
		File file2 = new File("/Users/ishant/Downloads/AmazonAtlas22/Session16/src/com/amazon/atlas22/fileio/FileAPIDemo.java");

		copyContents(file1, file2);
		
	}

}

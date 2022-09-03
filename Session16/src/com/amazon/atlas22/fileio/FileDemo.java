package com.amazon.atlas22.fileio;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 	
 	1. Work with Files
 	2. Java 8 Features
 	
*/

public class FileDemo {

	public static void main(String[] args) {
		
		// File IO APIs will throw Checked Exceptions. Hence it is better to code them in try catch block by default :)
		try {
			
			// API -> Application Programming Interfaces
			//		  Its a Program, which we can use to solve our problem. Can be Internal or External
			
			//File file = new File("/Users/ishant/Downloads/student.txt");
			File file = new File("/Users/ishant/Downloads/AmazonAtlas22/Session16/src/student.txt");
			File folder = new File("/Users/ishant/Downloads");
			
			if(file.isFile()) {
				System.out.println(file.getName()+" is a File...");
			}
			
			int counter = 0;
			
			if(folder.isDirectory()) {
				System.out.println(folder.getName()+" is a Directory/Folder");
				
				String[] names = folder.list();
				for(String name : names) {
					if(name.endsWith(".jpg") || name.endsWith(".png")) {
						System.out.println(name);
						counter++;
					}
				}
				
				System.out.println("Total Images Found: "+counter);
				
			}
			
			if(file.exists()) {
				System.out.println(file.getName()+" exists...");
				System.out.println(file.getPath());
				
				SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy HH:mm:ss");
				Date date = new Date(file.lastModified());
				String dateTimeStamp = formatter.format(date);
				System.out.println("Last Modified: "+dateTimeStamp);
				
				System.out.println(file.getTotalSpace());
				System.out.println("File Properties: READ: "+file.canRead()+" WRITE: "+file.canWrite()+" EXECUTE: "+file.canExecute());
				
			}else {
				System.err.println(file.getName()+" does not exist..");
			}
			
			/*
			File myFile = new File("/Users/ishant/Downloads/AmazonAtlas22/Session16/src/mystudents.txt");
			File yourFile = new File("/Users/ishant/Downloads/AmazonAtlas22/Session16/src/yourstudents.txt");
			
			if(!myFile.exists()) {
			 	// Create a New File
				myFile.createNewFile();
				System.out.println("File Created: "+myFile.getName());
			}
			
			if(myFile.exists()) {
				// Rename the File
				myFile.renameTo(yourFile);
				System.out.println("File "+myFile.getName()+" Renamed To: "+yourFile.getName());
			}
			
			if(yourFile.exists()) {
				// Delete the File from the System
				yourFile.delete();
				System.out.println(yourFile.getName()+" Deleted...");
			}
			*/
		} catch (Exception e) {
			System.err.println("Something Went Wrong: "+e);
			e.printStackTrace();
		}

	}

}

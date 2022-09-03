package com.amazon.atlas22.fileio;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


public class FileAPIDemo {

	public static void main(String[] args) {
		
		try {
			
			
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
			
		} catch (Exception e) {
			System.err.println("Something Went Wrong: "+e);
			e.printStackTrace();
		}

	}

}

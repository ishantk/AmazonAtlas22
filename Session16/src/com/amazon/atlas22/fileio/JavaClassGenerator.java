package com.amazon.atlas22.fileio;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class JavaClassGenerator {

	public static void main(String[] args) {
		
		try {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the Class Name: ");
			String className = scanner.nextLine();
			scanner.close();
			
			File file = new File("/Users/ishant/Downloads/AmazonAtlas22/Session16/src/com/amazon/atlas22/fileio/"+className+".java");
			
			String javaFileContent = "package com.amazon.atlas22.fileio;\n\n"
					+ "public class "+className+"{\n"
					+ "\tpublic static void main(String[] args) {\n"
					+ "\t\tSystem.out.println(\"Hello World..\");\n"
					+ "\t}\n"
					+ "}";
			
			FileWriter writer = new FileWriter(file);
			writer.write(javaFileContent);
			writer.close();
			
			System.out.println("Java Class "+className+" Generated...");
			
		} catch (Exception e) {
			System.out.println("Something Went Wrong..."+e);
		}

	}

}

package com.simplilearn.filehandling;
// Importing Required Packages for Files
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//Creating The ClassName
public class FileHandling {
//Created Method For Write the Data Into File
	static void createFileUsingFileClass() throws IOException
	{
		File file=new File("E:\\Harsha\\testfile3.txt");
		
		//Create the file
		if(file.createNewFile())
			System.out.println("File is created");
		else
			System.out.println("File already Exist");
		
		//Write data to file
		
		FileWriter writer=new FileWriter(file);
		writer.write("\nWelcome to File Handling");
		writer.close();
	}
	
	
	//Reading Data Into File
	public static List<String> readFile(String fileName)
	{
		List<String> list= Collections.emptyList();
		try {
			list=Files.readAllLines(Paths.get(fileName),StandardCharsets.UTF_8);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	//Appending The Data Into Existing File
	static void createFileUsingNIO() throws IOException{
		String data="Message";
		System.out.println();
		List<String> lines=Arrays.asList("\t\nThis is my first line","this is my second line");
		Files.write(Paths.get("E:\\Harsha\\testfile3.txt"), 
				lines, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		System.out.println("\nMessage Appended Successfully!!");
	}
	
	
	// Main Method
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);


	     while (true) {
	         System.out.println("Main Menu:");
	         System.out.println("1. Creating And Writing Data into a File");
	         System.out.println("2. Reading Data From File");
	         System.out.println("3. Appending Data into File");
	         System.out.println("4. Deleting File");
	         System.out.println("Enter your choice: ");
	         int i = s.nextInt();
	         //Using Switch Case To Iterate 
	         switch (i) {
	         
             case 1:
             //Write File
            	 try {
         			createFileUsingFileClass();
         			
         		}
         		catch(IOException e)
         		{
         			System.out.println(e);
         		}
            	 

                break;
                
             case 2:
            	//Read File
                List<String> result =readFile("E:\\Harsha\\testfile3.txt");
         		
         		Iterator<String> it=result.iterator();
         		while(it.hasNext())
         		{
         			System.out.println(it.next());
         		}
                 break;
             case 3:
            	 //Append File
            	 try {
            		 createFileUsingNIO();
          			
          		}
          		catch(IOException e)
          		{
          			System.out.println(e);
          		}
                 break;
             case 4:
            	 //Delete File
            	 try {
         			Files.deleteIfExists(Paths.get("E:\\Harsha\\testfile3.txt"));
         			
         		} catch (NoSuchFileException e) {
         			System.out.println(e);
         		}
         		catch (DirectoryNotEmptyException e) {
         			System.out.println("Directory is not Empty");
         		}
         		catch (IOException e) {
         			System.out.println("IOException "+e);
         		}
         		System.out.println("Deletion successfull");
             break;
             

             default:
                 System.out.println("Wrong Choice.");

         }
	         System.out.println("Go again?Enter y ");
	         String goAgain = s.next();
	         if (!goAgain.equals("y")) {
            break;
         } 
	         
	         
		
	     }
	}
}

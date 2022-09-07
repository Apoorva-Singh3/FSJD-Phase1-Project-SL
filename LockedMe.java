package simplilearnFinalProject;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class LockedMe
{
	static final String projectFilesPath="C:\\Users\\a\\JAVA-Session\\Testfolder";
	public static void displayMenu()
	{
		System.out.println("***************************************************************************************");
		System.out.println("\t\t\t\tWelcome to LockedMe.com");
		System.out.println("\t\t\t\tDeveloped by: Apoorva Singh");
		System.out.println("***************************************************************************************");
		System.out.println("\t\t\t\t1.Display all files");
		System.out.println("\t\t\t\t2.Add a new file");
		System.out.println("\t\t\t\t3.Delete a file");
		System.out.println("\t\t\t\t4.Search a file");
		System.out.println("\t\t\t\t5.Exit");
	}
	

	public static void getAllFiles()
	{
		File folder = new File(projectFilesPath);
		File[] listofFiles = folder.listFiles();
		
		if(listofFiles.length>0)
		{
			System.out.println("List of Files is displayed below : \n");
			for(var l:listofFiles)
			{
				System.out.println(l.getName());
			}
		}
		else
		{
			System.out.println("The folder is empty");
		}
	}
	
	
	public static void createFiles() 
	{
		try
		{
			Scanner obj = new Scanner(System.in);
			String fileName;
			System.out.println("Enter the file name: ");
			fileName = obj.nextLine();
			
			int linesCount;
			System.out.println("Enter how many lines in the file: ");
			linesCount = Integer.parseInt(obj.nextLine());
			
			FileWriter fw = new FileWriter(projectFilesPath+"\\"+fileName);
			for(int i=1; i<=linesCount; i++)
			{
				System.out.println("Enter the file line:");
				fw.write(obj.nextLine()+"\n");
			}
			System.out.println("File created successfully");
			fw.close();
			
		}
		catch(Exception e)
		{
			
		}
	}
	
	public static void deleteFiles()
	{
		Scanner obj = new Scanner(System.in);
		String fileName;
		System.out.println("Enter the file name: ");
		fileName = obj.nextLine();
		File f = new File(projectFilesPath+"\\"+fileName);
		if(f.exists())
		{
			f.delete();
			System.out.println("File deleted successfully");
		}
		else
		{
			System.out.println("File does not exist");
		}
	}
	
	public static void searchFiles()
	{
		Scanner obj = new Scanner(System.in);
		String fileName;
		System.out.println("Enter the file name: ");
		fileName = obj.nextLine();
		File f = new File(projectFilesPath+"\\"+fileName);
		if(f.exists())
		{
			f.equals(fileName);
			System.out.println("The file exists");
		}
		else
		{
			System.out.println("File does not exist");
		}
	}
	
	public static void exit()
	{
		System.out.println("Thank you for visiting LockedMe.com");
	}

}

package FileHandlingSystem;
import java.util.*;
public class File_Structure 
{
   private Set<String> FileCollection;
   
   public File_Structure()
   {
	   
	   
   }
   
   public void initializeFiles()
   {
	   FileCollection=new TreeSet<>();
	   FileCollection.add("File1.xls");
	   FileCollection.add("Abc.txt");
	   FileCollection.add("Abbc.txt");
	   
	   
   }
   
   public void addFile(String fName)
   {
	   
	   if(FileCollection.add(fName))
	   {
		   System.out.println("Your file "+fName+" was added successfully!");
	   }
	   else
	   {
		   System.out.println("Your file "+fName+" already exists. Please try again\n");
		   
	   }
	   
   }
   
   public void deleteFile(String fName)
   {
	   if(FileCollection.remove(fName))
	   {
		   System.out.println("Your file "+fName+" was deleted successfully!");
	   }
	   else
	   {
		   System.out.println("Your file "+fName+" does not exist. Please try again\n");
	   }
	   
   }
   
   public void searchFile(String fName)
   {
	   if(FileCollection.contains(fName))
	   {
		   System.out.println("File "+fName+" was found in the directory");
		   
	   }
	   else
	   {
		   System.out.println("File "+fName+" does not exist. Please try again\n");
	   }
   }
   
   public void printFileNames()
   {
	   System.out.println("\n\n");
	   for(String f : FileCollection)
	   {
		   System.out.println(f);
	   }
   }
}

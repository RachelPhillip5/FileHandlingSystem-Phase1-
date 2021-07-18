package FileHandlingSystem;
import java.io.*; 
public class FileMainClass 
{
    private static File_Structure fs;
    static int inp;
    
    public static void main(String[] args)
    {
    	fs=new File_Structure();
    	BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
    	fs.initializeFiles();
    	int inp=0;
    	while(true)
    	{
    	   printMenu1();
    	   try 
    	  {
			inp=Integer.parseInt(read.readLine());
		  } 
    	   catch (IOException e)
    	  {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
    	   	  
    	  switch(inp)
    	  {
    	      case 1: fs.printFileNames();
    	      break;
    	      case 2: printMenu2();
			  break;
    	      case 3: exitAppplication();
    	      break;
			  default: System.out.println("Invalid Choice. Please try again");
    	  }
    	  
    	}
    	
    	
    	
    	
    }
    
    
    public static void userInputMenu2()
    {
    	int inp2=0;
    	BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
    	try 
    	{
			inp2=Integer.parseInt(read.readLine());
		} 
    	catch (NumberFormatException | IOException e1) 
    	{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	switch(inp2)
    	{
    	    case 1: System.out.println("Enter the name of the file");
    	    try 
    	    {
				fs.addFile(read.readLine());
				printMenu2();
			} 
    	    catch (IOException e) 
    	    {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	    break;
    	    
    	    case 2: System.out.println("Enter the name of the file");
    	    try
    	    {
				fs.deleteFile(read.readLine());
				printMenu2();
			} 
    	    catch (IOException e) 
    	    {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	    break;
    	    
    	    case 3: System.out.println("Enter the name of the file");
    	    try
    	    {
				fs.searchFile(read.readLine());
				printMenu2();
			} 
    	    catch (IOException e)
    	    {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	    break;
    	    
    	    case 4: return;
    	    
    	    case 5: exitAppplication();
    	    break;
    	    
    	    case 6: System.out.println("Invalid Choice entered. Please try again.");
    	    printMenu2();
    	}
    }
    
    public static void exitAppplication()
    {
    	
    	System.out.println("Thank you!");
    	System.exit(0);
    }
    
    public static void printMenu1()
    {
    	System.out.println("************************************");
    	System.out.println("FILE HANDLING SYSTEM");
    	System.out.println("\nDeveloper:Rachel Phillip\n");
    	System.out.println("************************************");
    	System.out.println("Please enter the option to perform the corresponding actions:");
    	System.out.println("1. Print Files int the current directory in Ascending Order.");
    	System.out.println("2. Display other Options.");
    	System.out.println("3. Close Application.");
    	System.out.println("************************************\n\n");
    	
    }
    
    public static void printMenu2()
    {
    	
    	System.out.println("\n\n************************************");
    	System.out.println("Please enter the option to perform the corresponding actions:");
    	System.out.println("1. Add a File to the Current Directory.");
    	System.out.println("2. Delete a File from the Current Directory.");
    	System.out.println("3. Search a File from the Current Directory.");
    	System.out.println("4. Go Back to Main Page.");
    	System.out.println("5. Close Application.");
    	System.out.println("************************************\n\n");
    	userInputMenu2();
    	
    }
    
    
    

 }


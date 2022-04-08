package Lockers_comapany_project;

import java.util.Scanner;

public class OptionsChoosing {
	
	public static void Options() {
		System.out.println("********************************************************************************************************************");        
		String opt = "\n OPTIONS (Please Enter valid options!!!!):\n"+
	     "1.Display all the files present in Directory \n"+
		 "2.Menu for file operations\n"+
	     "3.Exit\n"+
		 "\nENTER YOUR OPERATION HERE: ";
		System.out.print(opt);
	}
	
	public static void fileHandlingOperations()
	{
		System.out.println("********************************************************************************************************************");     
		String opt2= "\n File Handling Operations (Please Enter valid options!!!!):\n"+
	                  "1.Add a file to the existing directory list\n"+
				      "2.Delete file from the Exisiting Directory\n"+
	                  "3.Search file from the Directory\n"+
	                  "4.Navigate back to Previous Context\n"+
	                  "5.Exit\n"
	                  +"\nENTER YOUR OPERATION HERE: ";
		System.out.println(opt2);
				}
	public static void chooseOption() {
		Scanner sc = new Scanner(System.in);
	boolean running=true;
	do {
			Options();        
			int choice = sc.nextInt();
			switch(choice){
				case 1:FileOperations.DisplayFiles("Lockers_files");
				break;
				case 2:OptionsChoosing.fileMenuOptions();
				break;
				case 3: System.out.println("Exited Successfully");
				sc.close();
				System.exit(0);
				break;
				default:System.out.println("!!! PLEASE ENTER A VALID OPTION !!! \n");
				break;
			}
	
	}
	while(running == true);
	}
	
	public static void fileMenuOptions() {
		boolean running = true;
		Scanner sc1 = new Scanner(System.in);
		
		do {
			fileHandlingOperations();
			FileOperations.CreatingDir("Lockers_files");
			int choice = sc1.nextInt();
			switch(choice) {
			case 1: System.out.println("Enter the file name to add in the Lockers_files directory");
			        String addfile = sc1.next();
			        FileOperations.Creatingfile(addfile, sc1);
			        break;
			case 2: System.out.println("Enter file to be deleted");
			        String filetoDelete= sc1.next();
			        FileOperations.DeletingFile(filetoDelete,sc1);
			        break;
			case 3: System.out.println("Enter file you are searching for\n");
			        String filetoSearch = sc1.next();
			        FileOperations.SearchingFile(filetoSearch, sc1);
			        break;
			case 4: OptionsChoosing.chooseOption();
				    break;
			case 5: System.out.println("Exited Successfully");
			        sc1.close();
		         	System.exit(0);
		        	break;
			default:System.out.println("!!! PLEASE ENTER A VALID OPTION !!!\n");
			        break;
			}
			
		}
		while(running=true);
	}
	
	

}

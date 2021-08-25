package Com;
import java.io.IOException;
import java.util.Scanner;


public class InputChoise {
	public void userChoise() throws IOException{
		boolean count = true;
		System.out.println("Welcome to Company Locker!!!");
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Enter Your Choise:"
				+'\n'+"Opton:1 for list of file:"
				+'\n'+"Opton:2 for Do file operations:"
				+'\n'+"Opton:3 Exit:");
		try {
		int inputNumber = sc.nextInt();
		switch(inputNumber) {
		case 1:
			ListFile lf = new ListFile();
			lf.listFileName();
			break;
		case 3:
			count = false;
			System.out.println("Thankyou for Visiting Company Locker!!!:");
			break;
			
			
		default :
			 System.out.println("Please Enter Correct option!!:");
			 break;
	
		case 2:
			boolean value = true;
			while(value) {
			System.out.println("Enter Choise to Do some operation:"
					+'\n'+ "1: Add File"
					+'\n'+ "2: Delete File"
					+'\n'+ "3: Search File"
					+'\n'+ "4: Go to main Content");
		int inputChoise = sc.nextInt();
		switch(inputChoise) {
		case 1:
			FileOperations fo = new FileOperations();
     		fo.createFile();
			break;
		case 2:
			DeleteFile df = new DeleteFile();
			df.deleteOperation();
			break;
		case 3:
			SearchFile sf = new SearchFile();
			sf.searchFileIn();
			break;
		case 4:
			 value = false;
			break;	
		default:
			System.out.println("Select write choise");
			break;
			
			}
		}
	   }
		}catch (Exception e){
		      System.out.println("Your selection can only be an integer! Please try Again!!");
		      userChoise();
		 }
		}while(count);	
	}

}

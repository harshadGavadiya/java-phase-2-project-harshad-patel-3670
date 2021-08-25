package Com;
import java.util.Scanner;
import java.io.File;


public class DeleteFile {
	public void deleteOperation() {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter File name for Delete!:");
		String deleteFile = sc.next(); 
	try  
	{   
		String path = "C:\\Users\\Acer\\eclipse-workspace\\JavaPhase-2\\LockerFile\\"+deleteFile+".txt";
		File f= new File(path);   
//		f.delete();
//		System.out.println("done");
	if(f.delete())                      
		{  
		System.out.println(deleteFile+".txt :" + " deleted Sucessfully!!");     
		}  
		else  
		{  
		System.out.println("File not Found!");  
		}  
		}  
		catch(Exception e)  
		{  
		e.printStackTrace();  
		}  
		
			
	}

}

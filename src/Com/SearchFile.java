package Com;
import java.util.*;
import java.io.File;

public class SearchFile {
	public void searchFileIn() {
		String path = "C:\\Users\\Acer\\eclipse-workspace\\JavaPhase-2\\LockerFile";
		File searchPath = new File(path);
		String[] SearchList = searchPath.list();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Search File Name:");
		String searchFile = sc.next()+".txt";
		boolean count = true;
		try {
			for(String i:SearchList) {
				if(searchFile.equals(i)) {
			      System.out.println("File is Available:"+i);
			      count = false;
				}
			}
			if(count) {
				System.out.println("File is Not Available:");
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}

package Com;
import java.io.*;
import java.util.*;

public class FileOperations {
	public void createFile() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter File Name:");
		String filename = sc.nextLine();
		FileOutputStream fos = new FileOutputStream("LockerFile/"+filename+".txt");
		fos.close();
		System.out.println("successfully Add!!");
	}
	

}

package Com;

import java.io.File;

public class ListFile {
  public void listFileName() {
	  String path = "C:\\Users\\Acer\\eclipse-workspace\\JavaPhase-2\\LockerFile";
		File directoryPath = new File(path);
		String[] fileContainer = directoryPath.list();
		System.out.println("Directory File contain file list is:");
		for(String s:fileContainer) {
			System.out.println(s);
		}
  }
}

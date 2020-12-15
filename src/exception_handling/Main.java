package exception_handling;

import java.awt.FileDialog;
import java.awt.Frame;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		//Excel file should open is in the file folder (Salary.xs)
		FileDialog fd = new FileDialog((Frame)null, "Select A Text File To Read", FileDialog.LOAD);
	    fd.setVisible(true);
	    String file = fd.getDirectory() + fd.getFile();
	    System.out.println("Location :" + fd.getDirectory() + file);
		
	    FileManagement fm = new FileManagement();
	    
	    try {
			fm.readFile(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
	    {
			fd.dispose();
	    }
		

	}

}

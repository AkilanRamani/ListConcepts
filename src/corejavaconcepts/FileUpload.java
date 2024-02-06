package corejavaconcepts;

import java.io.File;

public class FileUpload {

	public static void main(String[] args) {
		 File uploadFile = new File("C:\\Users\\akilan-18633\\eclipse-workspace\\saucelabdemo\\src\\test\\resources\\abc.txt");
        System.out.print(uploadFile.getAbsolutePath());
       
	}

}

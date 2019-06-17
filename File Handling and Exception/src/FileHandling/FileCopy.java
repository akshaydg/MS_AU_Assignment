package FileHandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class FileCopy {
	
	public static void copyFile(File src, File dest) {
		try {
			Files.copy(src.toPath(), dest.toPath());
			System.out.println("Files copied successfully!!!");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the source file path");
		String srcFile=input.nextLine();
		System.out.println("Enter the destination file path");
		String dest=input.nextLine();
		
		File src =new File(srcFile);
		String destPath=dest+"\\"+src.getName();
		copyFile(src,new File(destPath));
		
	}

}

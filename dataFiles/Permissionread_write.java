package dataFiles;
//Write a Java program to check if a file or directory has read and write permission
import java.io.File;

public class Permissionread_write {

	public static void main(String[] args) {
		File myfile = new File("C:\\Users\\Abhis\\eclipse-workspace\\PriyankaJava\\src\\DataFiles\\demo.txt. ");
		if(myfile.canWrite()) {
			System.out.println(myfile.getAbsolutePath()+"File can Write ");
		}else {
			System.out.println(myfile.getAbsolutePath()+"File cannot Write ");
		}
		if(myfile.canRead()) {
			System.out.println(myfile.getAbsolutePath()+"File can read ");
		}else {
			System.out.println(myfile.getAbsolutePath()+"File cannot read ");
		}

	}

}

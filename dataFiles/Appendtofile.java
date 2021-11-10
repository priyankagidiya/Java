package dataFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


//Write a Java program to append text to an existing file
public class Appendtofile {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Abhis\\eclipse-workspace\\PriyankaJava\\src\\DataFiles\\demowrite.txt. ");
		FileWriter fw = new FileWriter(file,true);
		BufferedWriter bw = new BufferedWriter(fw);
		fw.append("I can append in file");
		bw.close();
		System.out.println();
		

	}

}

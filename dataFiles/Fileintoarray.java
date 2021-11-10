package dataFiles;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Write a Java program to store text file content line by line into an array.


public class Fileintoarray {

	public static void main(String[] args) throws IOException {
		
		
		
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Abhis\\eclipse-workspace\\PriyankaJava\\src\\DataFiles\\demo.txt. "));
			List<String> lis = new ArrayList<String>();
			
			String line = br.readLine();
			while(line!=null) {
				lis.add(line);
				line = br.readLine();
				
			}
			System.out.println(Arrays.toString(lis.toArray()));
			br.close();


	
	}
		
	}



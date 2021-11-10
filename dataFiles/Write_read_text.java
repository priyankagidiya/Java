package dataFiles;
//wjp to write & read a plain text file.


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Write_read_text {

	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("C:\\Users\\Abhis\\eclipse-workspace\\PriyankaJava\\src\\DataFiles\\demo.txt. ");
		Properties p = new Properties();
		p.load(file);
	
		Set set = p.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
			
			Properties p1 = new Properties();
			p1.setProperty("Name","Abc");
			p1.setProperty("Id1", "2222");
			p1.setProperty("Class", "Batch2");
			p1.setProperty("Message","Good Evening");
			p1.store(new FileWriter("C:\\Users\\Abhis\\eclipse-workspace\\PriyankaJava\\src\\DataFiles\\demoWrite.txt. "), "Writing a File");
			
			
		}
	}

}

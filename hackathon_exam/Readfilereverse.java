package hackathon_exam;

import java.io.BufferedReader;
import java.io.BufferedWriter;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


/*Read a file content and write it to a new file in reverse order.
(reverse line 1-10 to line 10-1) */

public class Readfilereverse {

	public static void main(String[] args) throws IOException {
		
		 try {
		      BufferedReader input = new BufferedReader(new FileReader("C:\\Users\\Abhis\\Documents\\Priyanka Java\\Read.txt"));
		      ArrayList list = new ArrayList();
		      String line;
		      while ((line = input.readLine()) != null) {
		        list.add(line);
		      }
		      input.close();

		      Collections.reverse(list);

		      PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\Abhis\\Documents\\Priyanka Java\\Write.txt")));
		      for (Iterator i = list.iterator(); i.hasNext();) {
		        output.println((String) i.next());
		      }
		      output.close();
		    } catch (IOException e) {
		      System.err.println(e);
		    }

}
}

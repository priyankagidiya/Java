package assignments1;
/*WJP to remove duplicate characters from String a. String s = “Hello”
 *  output: “Helo”
 */
import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		 System.out.println("Enter the String: ");
        String input = s.nextLine();
       
       StringBuilder sb = new StringBuilder();
       for(int i = 0; i < input.length();i++) {
    	   char ch = input.charAt(i);
    	   int idx = input.indexOf(ch,i+1);
    	   if(idx==-1) {
    		   sb.append(ch);
    	   }
       }
       System.out.println("After removing duplicate: "+sb);
       s.close();
	}

}

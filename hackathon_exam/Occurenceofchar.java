package hackathon_exam;
import java.util.Scanner;
//WJP to display number of occurrence of all character.
public class Occurenceofchar {

	public static void main(String[] args) {
		String st ;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String: ");
		st = s.nextLine();
			getOccuringChar(st);
	        s.close();
	}

	private static void getOccuringChar(String st) {
		int [] count = new int[256];
		int len = st.length();
		int i=0;
		int temp=0;
		for( i =0;i<len;i++) 
			count[st.charAt(i)]++;
		 char ch[] = new char[st.length()];
	        for ( i = 0; i < len; i++) {
	            ch[i] = st.charAt(i);
	            int find = 0;
	            for (int j = 0; j <= i; j++) {
	 
	                // If any matches found
	                if (st.charAt(i) == ch[j])
	                    find++;
	            }
	 
	            if (find == 1)
	                System.out.println(
	                    "Occurrence of "
	                    + st.charAt(i)
	                    + " is " + count[st.charAt(i)]);
	        }}}
		



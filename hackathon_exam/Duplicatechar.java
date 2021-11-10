package hackathon_exam;

import java.util.Scanner;

// WJP to display duplicate character in string.
public class Duplicatechar {

	public static void main(String[] args) {
		String st;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		st = sc.nextLine();
		//st.replaceAll("\\s","");
		char[] ch = st.toCharArray();
		System.out.println("Duplicate characters are: ");
		for(int i=0;i<st.length();i++) {
			for(int j=i+1;j<st.length();j++) {
				if(ch[i]==ch[j]) {
					System.out.print(ch[j]+" ");
					break;
				}
				
			}
		}
		sc.close();

	}

}

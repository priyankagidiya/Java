package hackathon_exam;

import java.util.Scanner;

/*Given a string print the reverse of the words string.
(Input: Java Code Output: Code Java) */
public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Original string : ");
 
        String originalStr = sc.nextLine();
        sc.close();
 
        String words[] = originalStr.split("\\s");
        String reversedString = "";
 
        //Reverse each word's position
        for (int i = 0; i < words.length; i++) { 
            if (i == words.length - 1) 
                reversedString = words[i] + reversedString; 
            else
                reversedString = " " + words[i] + reversedString; 
        } 
 
        // Displaying the string after reverse
        System.out.print("Reversed string : " + reversedString);

	}

}

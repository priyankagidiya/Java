package assignments;
import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		System.out.print("Enter a string:" );
		String os = r.nextLine();//os=originalstring
		r.close();
		String words[]=os.split("\\s");
		String rs = " ";// rs=reversedstring
		for(int i=0;i<words.length;i++)
		{
			String word = words[i];
			String reverseword = "";
			for(int j=word.length()-1;j>=0;j--) {
				reverseword=reverseword + word.charAt(j);
			}
			rs = rs + reverseword +" ";
		}
		//displaying the string after reverse
		System.out.print("Reversed String is: "+rs);
	}

}

package assignments1;
/*WJP to Check the given word is present in a given string 
 * String = "this is me doing qa automation testing" Word="qa"
 */
public class PresentString {

	public static void main(String[] args) {
		String s = "I am doing qa testing";
		System.out.println(s);
		String word = "qa";
		boolean result = s.contains(word);
		if(result) {
			System.out.println(word + " is present in the given string");
			
		}else {
			System.out.println(word + " is not present in the given string");
		}

	}

}

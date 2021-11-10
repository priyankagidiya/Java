package assignments1;
/*WJP to replace each substring of a given string that matches the
 *  given regular expression with the given replacement String:
 *  "Dog chases cat, Cat chases rat". Note: Replace 'cat' with 'rat'
 */
public class ReplaceString {

	public static void main(String[] args) {
		String phrase = "Dog chases cat, Cat chases rat";
		System.out.println(phrase);
		String result = phrase.replace("cat", "rat");
	
		System.out.println(result);

	}

}

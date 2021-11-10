package assignments1;
/*WJP to check if a String contains only digits. a. String a = “12378” 
 * output = true b. String b = “abc123” output = false
 */

public class InputDigits {

	public static void main(String[] args) {
		String a = "123456";

		System.out.println("123456 contains only digits : " + InputDigitsWithRange(a));
		System.out.println("abc123 contains only digits : " + InputDigitsWithRange("abc123"));
		

	}

	private static boolean InputDigitsWithRange(String a) {
		for(int i = 0;i<a.length();i++) {
			int digit = (int) a.charAt(i);
			if(!(digit >=49 && digit<=57))//ASCII value of char (0-9)
				{
				return false;
			}
		}
		return true;
	}

}

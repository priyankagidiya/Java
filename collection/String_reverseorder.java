package collection;
//Wjp to store 4 string element and print it in reverse order(don’t use for and while).
import java.util.Stack;

public class String_reverseorder {

	public static void main(String[] args) {
		Stack<String> s1 = new Stack<String>();
		
		s1.push("Abc");
		s1.push("Def");
		s1.push("Ghi");
		s1.push("Xyz");
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		

	}

}

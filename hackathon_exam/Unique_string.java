package hackathon_exam;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

// Given a string print the unique words of the string. 
public class Unique_string {

	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		input.close();
		TreeMap<String, Integer> list = new TreeMap<String, Integer>();
		for(String str : s.split(" "))
		{
			if(list.containsKey(str))
			{
				list.put(str, list.get(str)+1);
			}
			else
			{
				list.put(str, 1);
			}
		}
		for(Map.Entry e: list.entrySet())
		{
			if((int)e.getValue() == 1)
				System.out.println(e.getKey());
		}
		input.close();
		

	}

}

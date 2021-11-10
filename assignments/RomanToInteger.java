package assignments;
import java.util.Scanner;

public class RomanToInteger {
	public int checkRoman(int totalInteger, int lastRomanLetter, int lastInteger) {
		if(lastRomanLetter > totalInteger) {
			return lastInteger - totalInteger;
		}else {
			return lastInteger + totalInteger;
		}
	}
	public void romanToInteger(String romanNumber) {
		int integer = 0;
		int lastNumber = 0;
		String romanNumeral = romanNumber.toUpperCase();
		for(int x = romanNumeral.length()-1;x>=0;x--)
		{
			char convertToInteger = romanNumeral.charAt(x);
			switch (convertToInteger) {
			case 'M':
				integer = checkRoman(1000, lastNumber,integer);
				lastNumber = 1000;
				break;
			case 'D':
				integer = checkRoman(500, lastNumber,integer);
				lastNumber = 500;
				break;
			case 'C':
				integer = checkRoman(100, lastNumber,integer);
				lastNumber = 100;
				break;
			case 'L':
				integer = checkRoman(50, lastNumber,integer);
				lastNumber = 50;
				break;
			case 'X':
				integer = checkRoman(10, lastNumber,integer);
				lastNumber = 10;
				break;	
			case 'V':
				integer = checkRoman(5, lastNumber,integer);
				lastNumber = 5;
				break;	
			case 'I':
				integer = checkRoman(1, lastNumber,integer);
				lastNumber = 1;
				break;		
			}
		}
		System.out.println(romanNumeral + " is equal to " +integer);
	}
	public void CallRoman() {
		Scanner getRoman = new Scanner(System.in);
		String Roman = getRoman.next();
		switch (Roman) {
		default:
			romanToInteger(Roman);
			CallRoman();
		case "End":
			break;
		}
		getRoman.close();
	}

	public static void main(String[] args) {
		RomanToInteger r2d = new RomanToInteger();
		System.out.println("Enter Roman number you want to convert:");
		r2d.CallRoman();

	}

}

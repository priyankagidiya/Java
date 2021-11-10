package assignments;
import java.util.Scanner;

public class NumberToWord {

	public static void main(String[] args) {
		int num = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter an Integer number: " );
		try {
		num = s.nextInt();
		if(num == 0) {
			System.out.println("Empty String:");
		}else {
			System.out.println("Number in words:" + numberToWords(num));
		}
		}catch(Exception e) {
			System.out.println("Please enter a valid number:");
		}
		s.close();
	}
		private static String numberToWords(int num) {
			String words = " ";
			String unitsArray[]= {"Zero","One","Two","Three","Four","Five","Six",
					"Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen",
					"Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
			String tensArray[] = {"Zero","Ten","Twenty","Thirty","Fourty","Fifty",
					"Sixty","Seventy","Eighty","Ninty"};
			if(num == 0) {
				return "Zero";
			}
			if(num < 0) {
				String numberstr = " " +num;
				numberstr = numberstr.substring(1);
				return "minus" +numberToWords(Integer.parseInt(numberstr));		
			
		}
			if((num/1000000) > 0) {
				words += numberToWords(num/1000000) + "Million";
				num %=1000000;
			}
			if((num/1000) > 0) {
				words += numberToWords(num/1000) + "Thousand";
				num %=1000;
			}
			if((num/100) > 0) {
				words += numberToWords(num/100) + "Hundred";
				num %=100;
			}
			if(num > 0) {
				if(num<20) {
					words += unitsArray[num];
				}else {
					words +=tensArray[num/10];
					if((num %10)>0) {
						words +="_" +unitsArray[num % 10];
					}
				}
			}
			return words;

	}

}

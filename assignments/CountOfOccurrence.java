package assignments;
import java.util.Scanner;
public class CountOfOccurrence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num[] = new int[100];
		int count[] = new int[100];
		int i = 0,temp = 0;
		int n;
		System.out.println("Enter how many numbers you want to input: ");
		n =input.nextInt();
		System.out.println("Enter the Integer between 1 to 100: ");
		
		for(i=0;i<n;i++) {
			num[i]=input.nextInt();
			}
		
		for(i =0;i<num.length;i++) {
			temp = num[i];
			count[temp]++;
		}
for(i=1;i<count.length;i++) {
	if(count[i]>0 && count[i]==1) {
		System.out.printf("%d occurs %d time \n", i,count[i]);
	}
	else if(count[i]>=2) {
		System.out.printf("%d occurs %d times\n", i,count[i]);
	}
}
input.close();

	}

}

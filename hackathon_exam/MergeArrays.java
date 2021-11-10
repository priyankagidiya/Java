package hackathon_exam;
/*WJP to merge two sorted array.(Do not use third array) array1[10] = 1,2,4,6,9,10 
 * array2[4] = 3, 5,7,8 , After merge : array1[10] = 1,2,3,4,5,6,7,8,9,10 */
 
 
import java.util.Arrays;
import java.util.Scanner;

public class MergeArrays {

	public static void main(String[] args) 
	{
		int[] a1 = new int[10];
		int[] a2 = new int[4];
		
		int i;
				
		Scanner sa = new Scanner(System.in);
		System.out.println("Enter 6 integer value: ");
		for( i = 0;i<6;i++) {
			a1[i] = sa.nextInt();
			}
		//System.out.println("Entered array is: "+ Arrays.toString(a1));
		System.out.println("Enter 4 integer value: ");
		for(i = 0;i<4;i++) {
			a2[i]=sa.nextInt();
		}
		//System.out.println("Entered 2nd array is: "+Arrays.toString(a2));
		a1[6] = a2[0];
		a1[7] = a2[1];
		a1[8] = a2[2];
		a1[9] = a2[3];
		Arrays.sort(a1);
		System.out.println("After merging: "+Arrays.toString(a1));
		sa.close();
				
			}
}

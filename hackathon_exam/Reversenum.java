package hackathon_exam;
import java.util.Scanner;
/*write an algorithm to reverse first 3 numbers, then next 3 numbers,
 *  then next 3 numbers, the number will be based on var k. 
 *  Array = [3,2,4,7,0,3,1,5,8, 4] k=3 OutPut = [4,2,3,3,0,7,8,5,1,4] */
 
public class Reversenum {

	public static void main(String[] args) {
		int[] arr=new int[10];
		int i;
		int k = 3;
		int n = arr.length;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter upto 10 input: ");
		for(i=0;i<arr.length;i++) {
			
			arr[i]=s.nextInt();
			}
		//System.out.println("Entered input is: "+Arrays.toString(arr));
		reverse(arr, n, k);
		System.out.println("After reversed: ");
	     
	        for ( i = 0; i < n; i++)
	            System.out.print(arr[i] + " ");
	        s.close();

}
	private static void reverse(int[] arr, int n, int k) {
		for (int i = 0; i < n; i += k)
        {
            int left = i;   // to handle case when k is not multiple of n
            int right = Math.min(i + k - 1, n - 1);
            int temp;
              // reverse the sub-array [left, right]
            while (left < right)
            {
                temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left+=1;
                right-=1;
            }}}
	}


package assignments;

import java.util.Scanner;

public class Ascending {

	public static void main(String[] args) {
		int n,i,j,temp;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter number of elements you want in array:" );
		n=s.nextInt();
		
		int a[]= new int[n];
		System.out.print("Enter all the elements:");
		for(i=0;i<n;i++)
		{  
			a[i]=s.nextInt();
			s.close();
		}
		
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		System.out.print("Ascending order:" );
		for(i=0;i<n-1;i++) {
			System.out.print(a[i]+ ",");
		}
				System.out.print(a[n-1]);
				

	}

}

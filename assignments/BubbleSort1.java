package assignments;

import java.util.Scanner;

public class BubbleSort1 
{
	static void bubblesort(int arr[],int n)
	{
		int i,j,temp;
		boolean swapped;
		for( i =0;i<n-1;i++)
		{
			swapped = false;
			for( j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
					
				}		
			}
			if(swapped==false)
				break;
		}
	}
	
	 static void printArray(int arr[],int size)
	{
		 for(int i=0;i<size;i++)
			 System.out.print(arr[i]+ " ");
		 System.out.println();

	}

	public static void main(String[] args) 
	{
		int[] array = new int[10];
		int n =array.length;
		int k;
		
		Scanner num = new Scanner(System.in);
		System.out.println("Enter how many numbers, upto 10, you want to sort: " );
		n=num.nextInt();
	
		/* Abhishek code start */
		if (array.length >= 10) 
			{
				System.out.println("You can only sort upto 10 numbers");
				System.exit(0);
			}
		/* Abhishek code end */
		
		System.out.println("Enter number of elements:");
		for( k=0;k<n;k++) 
			array[k]=num.nextInt();
		
	
		bubblesort(array,n);
		System.out.println("Sorted array");
		printArray(array,n);
				
		num.close();
		}
}

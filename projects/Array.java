package projects;

public class Array {

	public static void main(String[] args) {
	   int array[] = new int[9];
	   for (int count=0;count<9;count++) {
		   array[count]=count+1;
	  /* }
	   for (int count=0;count<9;count++) {*/
		   System.out.println("array["+count+"] = "+array[count]);
	   }
	   System.out.println("Length of Array = " +array.length);
	 

}
	
}

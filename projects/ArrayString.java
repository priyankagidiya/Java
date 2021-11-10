package projects;

public class ArrayString {

	public static void main(String[] args) {
		String[]names = {"Abhi","Pri","Aashka","Ahana","Ahan"};
		boolean found =false;
		int index =0;
		String n = "Abhi";
		for(int i=0;i<names.length;i++) {
			if(n.equals(names[i])) {
				index = i;
				found = true;
				break;
			}
		}
		if(found)
			System.out.println(n+ " found at index " +index);
		else
			System.out.println(n+ "not found in the Array");

	}

}

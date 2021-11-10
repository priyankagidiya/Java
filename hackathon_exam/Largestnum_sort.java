package hackathon_exam;
/*A circus is designing a tower routine consisting of people standing
 *  atop one another’s shoulders. For practical and aesthetic reasons,
 *   each person must be both shorter and lighter than the person below 
 *   him or her. Given the heights and weights of each person in the circus, 
 *   write a method to compute the largest possible number of people in such
 *    a tower. EXAMPLE: Input (ht, wt): (65, 100) (70, 150) (56, 90) (75, 190)
 *     (60, 95) (68, 110) Output: The longest tower is length 6 and includes 
 *     from top to bottom: (56, 90) (60,95) (65,100) (68,110) (70,150) (75,190)*/
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Largestnum_sort {

	public static void main(String[] args) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		map.put(65, 100);
		map.put(70, 150);
		map.put(56, 90);
		map.put(75, 190);
		map.put(60, 95);
		map.put(68, 110);
	for(Entry<Integer, Integer> e:map.entrySet()) {
			
		System.out.println(" Height = " +e.getKey() +" " +" Weight = "+e.getValue());
		}
	
	System.out.println("Length of the tower is :  "+map.size());
	
	System.out.println("After from top to bottom: ");
	System.out.println();
		TreeMap<Integer,Integer> sortmap = new TreeMap<Integer,Integer>(map);
		sortmap.putAll(map);
		for(Entry<Integer, Integer> e:sortmap.entrySet()) {
			
			
	System.out.println(" Height = " +e.getKey() +" " +" Weight = "+e.getValue());
			}
		

	}

}

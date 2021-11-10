package collection1;
// Wjp to store 5<key value> pair.print the contents like key = "" &
//Value = "" .
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Key_value {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(234,"All");
		map.put(444, "Paul");
		map.put(321, "Doll");
		map.put(678, "Zee");
		map.put(989, "Abi");
		for(Entry<Integer, String> e:map.entrySet()) {
			
		
		System.out.println("Key = " +e.getKey() +" " +" Value = "+e.getValue());
		}

	}

}

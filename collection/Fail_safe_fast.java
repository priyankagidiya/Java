package collection;
/*What are the differences of fail-safe and fail-fast iterators. Give example.
 
Fail-safe iterators use a copy of collection to traverse over the element.They don't throw any 
exceptions if a collection is structurally modified while iterating over it.
Iterator returned by ConcurrentHashMap,copyonwriteArraylist is a fail-safe iterator.

Fail-fast iterators require more memory as they cloned the collection. They immediately throw 
concurrentModificationException if there is structural modification of collection.
The iterators returned by the ArrayList, HashSet, HashMap etc are all Fail-Fast in nature.

Structural modification means adding,removing any element from collection.
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Fail_safe_fast {

	public static void main(String[] args) {
		  //Fail-safe iterators example
	    CopyOnWriteArrayList<Integer> cw = new CopyOnWriteArrayList<Integer> ();
	    cw.add(10);
	    cw.add(15);
	    cw.add(20);
	    cw.add(20);
	    Iterator<Integer> itr = cw.iterator();
	    while(itr.hasNext()){
	    	System.out.println(itr.next());
	    	cw.add(30);
	    }
	//Fail-fast iterators Example
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		 
        //Adding elements to list
 
        al.add(145);
 
        al.add(684);
 
        al.add(871);
 
        al.add(654);
 
        al.add(345);
 
        //Getting an Iterator from list
 
        Iterator<Integer> it = al.iterator();
 
        while (it.hasNext())
        {
            
        	System.out.println(it.next());
 
            al.add(857);      //This will throw ConcurrentModificationException
        }
      
    }
    
        
    }



	



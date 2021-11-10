package collection;
//Difference between peek and poll methods in linkedlist class
/* The poll() method in Java is used to retrieve or fetch and remove the first element of the
   Queue or the element present at the head of the Queue.
    The peek() method only retrieved the element at the head but the poll() also removes
     the element along with the retrieval.*/
import java.util.LinkedList;

public class Peek_poll {

	public static void main(String[] args) {
		LinkedList<Integer>l1 = new LinkedList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(5);
		System.out.println(l1.peek());
		System.out.println(l1.poll());


	}

}

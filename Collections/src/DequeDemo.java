import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
	
	public static void main(String[] args) {
		Deque<String> deq = new LinkedList<String>();
		
		deq.addFirst("Apple");
		deq.offer("Mango");
		deq.offer("Grapes");
		deq.offerLast("Bannana");
		
		System.out.println(deq.peekLast());
		
		while(!deq.isEmpty())
			System.out.println(deq.poll());
 	}
}

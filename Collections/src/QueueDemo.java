import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.add("Motarol");
		queue.offer("Apple");
		queue.offer("Samsung");
		
		System.out.println(queue.peek());
		
		while(!queue.isEmpty())
			System.out.println(queue.poll());
	
	}
}

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionDemo {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Google");
		list.add("Oracle");
		list.add(2, "Microsoft");
		list.add("IBM");
		
		System.out.println("-- Traversing over ArrayList using for..loop");
		for(int i =0; i< list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		
		System.out.println("-- Traversing over ArrayList using Iterator");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("-- Traversing over ArrayList using for-each..loop");
	    for(String s : list)
	    	System.out.println(s);
	    
	    
	    // Linked List
	    
	    LinkedList<String> link = new LinkedList<String>();
	    link.add("Apache");
	    link.addFirst("Oracle");
	    link.addLast("Eclipse");
	    
	    list.addAll(link);  // Merge Linkedllist into ArrayList
	    
	    System.out.println("-- Traversing over ArrayList using for..loop");
	    for(String s: list)
	    	System.out.println(s);
	    
	    // Convert ArrayList into HashSet
	    
	    HashSet<String> set = new HashSet<String>(list);
	    System.out.println("-- Traversing over ArrayList using for..loop");
	    for(String s : set)
	    	System.out.println(s);
	    
	    TreeSet<String> tree = new TreeSet<String>(set);
	    System.out.println("-- Traversing over ArrayList using for..loop");
	    for(String s : tree)
	    	System.out.println(s);
	    
	}

}

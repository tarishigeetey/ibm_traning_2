
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Apple");
		lhs.add("Mango");
		
		for(String s : lhs)
			System.out.println(s);
		
 LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		
		map.put("jack", "jill");
		map.put("scott", "tiger");
		map.put("polo", "lilli");
		map.put("jack", "rose");
		
		for(String key: map.keySet())
			System.out.println(key + ":" + map.get(key));
	}

}

import java.util.HashMap;

public class MapDemo {
	
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("jack", "jill");
		map.put("scott", "tiger");
		map.put("polo", "lilli");
		map.put("jack", "rose");
		
//		System.out.println(map.get("scott"));
//		System.out.println(map.get("polo"));
//		System.out.println(map.get("jack"));
		
		for(String key: map.keySet())
			System.out.println(key + ":" + map.get(key));
		
		
	}

}

package Java_collections;
import java.util.*;

public class Hashmap_LHashMap {

	public static void main(String[] args) {
		
		// *** HashMap start ****
//		Map <Integer,String> map = new HashMap<>();
//		
//		map.put(5, "Kenya");
//		map.put(2, "Harish");
//		map.put(4, "RamSetu");
//		map.put(8, "Krish");
//		map.put(1, "Bhola");
//		map.put(15, "Jainam");
//		map.put(0, "Aradhya");
//		
//		
//		System.out.println(map);
//		
//		System.out.println(map.keySet());
//		
//		System.out.println(map.values());
//
////		map.compute(2, (key,val)->"Russel petter");
//		
//		System.out.println(map);	
//		System.out.println(map.get(1));
//		
//		for(Integer num:map.keySet()) {
//			System.out.println(map.get(num));
//		}
		// *** HashMap end ****
		
		
		//***** LinkedHashMap Start**********
		
		LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
//		// Preserve the insertion order
//		
		map.put(5, "Kenya");
		map.put(2, "Harish");
		map.put(4, "RamSetu");
		map.put(8, "Krish");
		map.put(1, "Bhola");
		map.put(15, "Jainam");
		map.put(0, "Aradhya");
		String putIfAbsent = map.putIfAbsent(1, "Narshima");
		System.out.println(putIfAbsent);
		
		System.out.println(map);
		System.out.println(map.entrySet());
//		
//		System.out.println(map.hashCode());
		
		//TreeMap starting
//		TreeMap<String,String> map = new TreeMap<>();
//		
//		map.put("aea", "Rahul");
//		map.put("abda", "Sakira");
//		map.put("abfa", "Pushpa");
//		
//		System.out.println(map);
//		
//		System.out.println(map.lastEntry());
//		
//		System.out.println(map.ceilingKey("abe"));
//		
//		System.out.println(map.floorKey("afg"));
//		
//		// Removes and returns a key-value mapping associated withthe least key in this map, or null if the map is empty
////		System.out.println(map.pollFirstEntry());
//		
//		// Returns a view of the portion of this map whose keys range from fromKey to toKey. If fromKey and toKey are equal, the returned map is empty unless fromInclusive and toInclusive are both true
//		System.out.println(map.subMap("abda", false, "aea", true));
//		
//		System.out.println(map.tailMap("aea", false));
//		
//		System.out.println(map.higherKey("abdb"));
	}

}

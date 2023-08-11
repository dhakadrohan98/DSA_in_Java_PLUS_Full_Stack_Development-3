package Java_collections;
import java.util.*;

public class Tree_Set {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		
		set.add(50);
		set.add(40);
		set.add(60);
		set.add(30);
		set.add(70);
		
		System.out.println(set);
		
		// Returns a view of the portion of this set whose elements are strictly less than toElement
		SortedSet sets = set.headSet(50, false);
		System.out.println(sets);
		
		// Returns a view of the portion of this set whose elements are greater than (or equal to, if inclusive is true) fromElement
		SortedSet sets1 = set.tailSet(50, true);
		System.out.println(sets1);
		
		System.out.println(set.pollFirst());
		System.out.println(set);
		
		// TreeSet code for string
		
//		TreeSet<String> ts = new TreeSet<>();
//		
//		ts.add("Ratul");
//		ts.add("Zakhir khan");
//		ts.add("anand");
//		ts.add("Bhuvan");
//		ts.add("Yash");
//		ts.add("Satyendra");
//		
//		System.out.println(ts);
		
		
		

	}

}

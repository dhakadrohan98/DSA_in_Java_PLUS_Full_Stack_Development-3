package Java_collections;
import java.util.*;

public class set {

	public static void main(String[] args) {
		//HashSet methods
		
		HashSet<Integer> set = new HashSet<>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		System.out.println(set.add(40));
		set.add(50);
		
//		System.out.println(set);
//		// Adding Duplicate Elements
		System.out.println(set.add(30));
		
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		// LinkedHashSet methods
		
//		LinkedHashSet<String> lhs = new LinkedHashSet<>();
//		
//		lhs.add("Ratul");
//		lhs.add("Anand");
//		lhs.add("Bhuvan");
//		lhs.add("Yash");
//		lhs.add("satyendra");
//		
//		System.out.println(lhs);
//		
//		System.out.println(lhs.add("Ratul"));
		
		//Remaining methods for LHS are same as of that HashSet.
		
		
		
	}

}

package Java_collections;
import java.util.*;

public class arrlist {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		arr.add(60);
		arr.add(70);
		arr.add(80);
		arr.add(90);
		
		System.out.println(arr);
		
		ArrayList<Integer> arr1 = new ArrayList();
		arr1.add(91);
		arr1.add(92);
		arr1.add(93);
		System.out.println(arr1);
		
		arr.addAll(arr1);
		
		System.out.println(arr);
		System.out.println(arr.size());
		
		//subList method
		System.out.println(arr.subList(2, 7));
		boolean contains = arr.contains(92);
		System.out.println(contains);
		
		//Remove Method
//		arr.removeAll(arr1);
//		System.out.println(arr);
		
		// Retain method
		arr.retainAll(arr1);
		System.out.println(arr);
		
		//System.out.println(arr.remove(1));
		//System.out.println(arr.get(10));

	}

}

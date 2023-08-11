package Java_collections;
import java.util.*;

public class linkedlist {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(1);
		list.add(2);
		list.add(6);
		list.add(3);
		
		//Inserts the specified element at the specified position in this list.Shifts the element currently at that position (if any) and anysubsequent elements to the right (adds one to their indices).
		list.add(2, 3);
		
		System.out.println(list);
		
		LinkedList<Integer> list1 = (LinkedList<Integer>) list.clone();	
		
		// System.out.println(list1);
		
		list.addFirst(45);
		list.addLast(55);
		
//		System.out.println(list.getFirst());
//		System.out.print(list.getLast());
		
//		System.out.println(list);
//		System.out.println(list.removeFirstOccurrence(3));
		System.out.println(list);
		
		System.out.println(list.poll());
		System.out.println(list.pollLast());
		System.out.println(list);
		
		
		
	}

}

package Java_collections;
import java.util.*;

public class vectorClass {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector();
		
//		Current capacity of vector = 10; 
		System.out.println(vector.capacity());
		
		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		vector.add(50);
		
		System.out.println(vector);
		
//		vector.ensureCapacity(25);
//		System.out.println(vector.capacity());
		
		ListIterator<Integer> list = vector.listIterator();
		
		//Iterate the list in forward direction
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
		
		System.out.println();
		
		//Iterate the list in backward direction
		while(list.hasPrevious())
		{
			System.out.println(list.previous());
		}

	}

}

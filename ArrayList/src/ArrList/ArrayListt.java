package ArrList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayListt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        ArrayList<Integer> list = new ArrayList<Integer>();	
		
		System.out.println(list);
		
		list.add(10);
		list.add(20); 
		list.add(30);
		list.add(40);
		System.out.println(list);
		System.out.println("list size: "+list.size());
		list.set(2,300);
		System.out.println(list.contains(301));
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		//		for(Integer item:list) {
//			System.out.println(item);
//		}
    }
}

package ArrList;
import java.util.ArrayList;

public class ArrayListt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println(list);
		
		list.add(10);
		list.add(20);
		System.out.println(list);
		System.out.println(list.size());
		
		for(Integer item:list) {
			System.out.println(item);
		}
    }
}

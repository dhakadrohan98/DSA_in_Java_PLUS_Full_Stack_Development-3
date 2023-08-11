package maang;
import java.util.*;

public class NestedArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ArrayList<Integer>> orders = new ArrayList<>();
		
		ArrayList<Integer> arr1 = new ArrayList<>();
		arr1.add(1);
		arr1.add(2);
		
		ArrayList<Integer> arr2 = new ArrayList<>();
		arr2.add(11);
		arr2.add(22);
		arr2.add(33);
		
		orders.add(arr1);
		orders.add(arr2);
		
		for(int i=0; i<orders.size(); i++)
		{
			for(int j=0; j<orders.get(i).size(); j++) {
				System.out.println(orders.get(i).get(j));
			}
		}
		
		System.out.println(orders);
	}
}

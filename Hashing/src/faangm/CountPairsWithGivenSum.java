package faangm;
import java.util.*;

public class CountPairsWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,3,5,7,4,2,4,8,5};
		Map<Integer,Integer> map = new HashMap<> ();
		int k = 12;
		int count=0;
		
		//main Logic
		for(int i=0; i<arr.length; i++) {
			int b = arr[i];
			int a = k - b;
			if(!map.containsKey(a)) {
				if(map.containsKey(b)) {
					int val = map.get(b);
					map.put(b, val+1);
				}
				else {
					map.put(b, 1);
				}
			}
			else {
				count = count + map.get(a);
				if(map.containsKey(b)) {
					int val = map.get(b);
					map.put(b, val+1);
				}
				else {
					map.put(b, 1);
				}
			}
		}
		System.out.println(map);
		System.out.println(count);
	}

}

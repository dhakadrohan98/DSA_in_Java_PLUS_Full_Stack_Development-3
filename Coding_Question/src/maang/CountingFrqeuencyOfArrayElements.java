package maang;
import java.util.*;
import java.io.*;

public class CountingFrqeuencyOfArrayElements {
	
	public static void main(String[] args) {
		int[] arr = new int[]{11, 4, 11, 7, 3, 7, 10, 13, 4, 8, 12, 11, 10, 14, 12};
	HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
	
	for(int i=0; i<arr.length; i++) {
		if(hmap.containsKey(arr[i])) {
			int value = hmap.get(arr[i]);
			hmap.put(arr[i], value+1);
		}
		else {
			hmap.put(arr[i], 1);
		}
	}
	
	for(Integer key:hmap.keySet()) {
		System.out.println(key+": "+hmap.get(key));
	}
	System.out.println(hmap.entrySet());
   }
}
 
package faangm;
import java.util.*;

public class TwoDArrayWithConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,4,1,2,3,1};
		Map<Integer,Integer> hmap = new HashMap<>();
		List <List<Integer>> res = new ArrayList<>();
		int count=0;
		boolean flag=false;
		
		for(int i=0; i<nums.length; i++) {
			hmap.put(nums[i], hmap.getOrDefault(nums[i], 0)+1);
		}
	
//		//main Logic
		while(flag==false) {
			
			List<Integer> arr1 = new ArrayList<>();
			for(int temp: hmap.keySet()) {
				int val = hmap.get(temp);
				if(hmap.get(temp) > 0) {
					arr1.add(temp);
					hmap.put(temp, val-1);
				}
//				
			}
			
			for(int val:hmap.values()) {
				if(val!=0) {
					flag=false;
				}
				else {
					flag=true;
					count=1;
				}
			}
			res.add(arr1);
		}
			
		System.out.println(count);
		System.out.println(hmap.size());
		System.out.println("hi");
		System.out.println(res);
	}

}

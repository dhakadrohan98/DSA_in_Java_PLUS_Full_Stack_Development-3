package faangm;
import java.util.*;

public class SubarraysWithSumK1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10, 2, -2, -20, 10};
		int k = -10;
		int temp=0;
		int count=0;
		Map<Integer,Integer> map=new HashMap<>(); //<temp,count>
		int[] prefix = new int[nums.length];
		
		for(int i=0; i<nums.length; i++) {
			temp += nums[i];
			prefix[i] = temp;
			
		}
		
		for(int i=0; i<nums.length; i++) {
			temp += nums[i];
			if(map.containsKey(temp)) {
				map.put(temp, map.get(temp)+1);
			}
			else {
				map.put(temp,1);
			}
			
		}
		System.out.println(map);
		
		for(int i=0; i<nums.length; i++) {
			int rem = prefix[i] - k;
			
			if(map.containsKey(rem)) {
				count += map.get(rem);
			}
		}
		System.out.println(count);
		

	}

}

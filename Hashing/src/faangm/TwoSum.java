package faangm;
import java.util.*;

public class TwoSum {

	public static void main(String[] args) {
		//Best Approach
		// TC: O(N) && SC:O(N)
		int[] nums = {3,2,3}; 
		int target = 6;
		Map<Integer,Integer> map = new HashMap<>();
		int[] result = new int[2];
		
		int a=0;
		int b=0;
		
		for(int i=0; i<nums.length; i++) {
			b = target - nums[i];
			if(!map.containsKey(b)) {
				map.put(nums[i], i);
			}
			else {
				result[0] = map.get(b);
				result[1] = i;
			}
		}
		
		for(int k=0; k<result.length; k++) { 
			System.out.print(result[k] + " "); 
			}
	}
}

/*
 * Brute Force Approach using HashMap
 * TC:O(n^2)
 * 
 * 
 * int[] nums = {3,2,3}; int target = 6; int count = 0;
 * 
 * int[] result = new int[2]; Map<Integer,Integer> map = new HashMap<>();
 * 
 * for(int i=0; i<nums.length;i++) { map.put(nums[i],i); }
 * System.out.println(map);
 * 
 * for(int j=0; j<nums.length; j++) { int remain = target-nums[j]; for(int key:
 * map.keySet()) { if(key==remain && (map.get(key)!=j) ) { result[0] = j;
 * result[1] = map.get(key); count++; break; } } if(count==1) { break; } }
 * 
 * for(int k=0; k<result.length; k++) { System.out.print(result[k] + " "); }
 */
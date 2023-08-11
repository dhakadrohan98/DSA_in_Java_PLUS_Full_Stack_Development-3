package faangm;
import java.util.*;

public class LongestSubArrayWithSumK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= new int[]{10, 5, 2, 7, 1, 9};
		int k = 15;
		Map<Integer,Integer> hmap = new HashMap<>();
		int sum=0, maxi=0;
		
		for(int i=0; i<nums.length; i++) {
			sum += nums[i];
			
			if(sum == k) {
				maxi = Math.max(maxi, i+1);
			}
			
			if(hmap.containsKey(sum-k)) {
				maxi = Math.max(maxi, i-hmap.get(sum-k));
			}
			
			if(!hmap.containsKey(sum)) {
				hmap.put(sum, i);
			}
		}
		System.out.println(maxi);
	}

}

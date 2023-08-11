package faangm;
import java.util.*;

public class CountNumberOfPairsWithAbsoluteDifferenceK {

	public static void main(String[] args) {
		int[] nums = {1,2,2,1};
		int k=1;
		
		Map<Integer,Integer> hm = new HashMap<>();
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i]+k)) {
            	res+=hm.get(nums[i]+k);
            }
            if(hm.containsKey(nums[i]-k)) { 
            	res+=hm.get(nums[i]-k);
            }
            
            if(hm.containsKey(nums[i])) {
            	hm.put(nums[i], hm.get(nums[i])+1);
            }
            else {
            	hm.put(nums[i], 1);
            }
        }
        System.out.println(hm);
        System.out.println(res);
   
		
//		Map<Integer,Integer> hmap = new HashMap<>();
//		int count=0;
//		for(int i=0; i<nums.length; i++) {
//			int sec1 = nums[i]+k;
//            int sec2 = nums[i]-k;
//			if(hmap.containsKey(sec1) || hmap.containsKey(sec2)) {
//				count++;
//                hmap.put(nums[i], 1);
//			}
//			else {
//				hmap.put(nums[i], 1);
//			}
//		}
//		System.out.println(count);

	}

}

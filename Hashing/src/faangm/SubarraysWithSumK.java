package faangm;
import java.util.*;
public class SubarraysWithSumK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10, 5, 2, 7, 1, 9};
		int k = 15;
		int prefixSum=0;
	       Map<Integer,Integer> hmap=new HashMap<>();
	    //   hmap.put(0,1);
	       int count=0;
	       int longest = 0;
	       for(int i=0;i<nums.length;i++){
	           prefixSum=prefixSum+nums[i];
	           
	           if(prefixSum==k) {
	               count++;
//	               longest = Math.max(longest, count);
	           }
	           if(hmap.containsKey(prefixSum-k)){
	               count=count+hmap.get(prefixSum-k);
//	        	   int val = hmap.get(prefixSum-k);
//	               longest = Math.max(longest, val);
	               if(hmap.containsKey(prefixSum)){
	                    int value=hmap.get(prefixSum);
	                    hmap.put(prefixSum,value+1);
	               }
	               else{
	                   hmap.put(prefixSum,1);
	               }
	           }
	           else{
	              if(hmap.containsKey(prefixSum)){
	                    int value=hmap.get(prefixSum);
	                    hmap.put(prefixSum,value+1);
	               }
	               else{
	                   hmap.put(prefixSum,1);
	               }
	           }
	       }	       
	       System.out.println(count);	
	 }

}

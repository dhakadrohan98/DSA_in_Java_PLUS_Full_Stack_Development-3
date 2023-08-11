package faangm;

import java.util.*;

public class prefixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,4,3,1,6,5,7,3,2};
		int[] prefixSum = new int[nums.length+1];
		Map<Integer,Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of queries:");
		int query = sc.nextInt();
		
		for(int i=0,j=1; i<nums.length && j<prefixSum.length; i++,j++) {
			prefixSum[j] = prefixSum[j-1] + nums[i]; 
		}
//		for(int i=0; i<prefixSum.length; i++) {
//			System.out.print(prefixSum[i]+" ");
//		}
		
		for(int i=0; i<prefixSum.length; i++) {
			map.put(i,prefixSum[i]);
		}
		System.out.println(map);
		
		System.out.println("Enter value of l and r for "+ query +" queries one by one:");
		//Run query one by one.
		for(int q=1; q<=query; q++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			
			int sum = map.get(r) - map.get(l-1);
			System.out.println("Sum for "+q+" query: "+sum);
		}

	}

}

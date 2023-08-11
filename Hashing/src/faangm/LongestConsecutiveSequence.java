package faangm;
import java.util.*;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,3,7,2,5,8,4,6,0,1};
		int longest=0;
		int length=0;
		Map<Integer,Integer> map = new HashMap<>();
		Set<Integer> set = new LinkedHashSet<>();
		
		Arrays.sort(nums);
		for(int num:nums) {
			set.add(num);
		}
		System.out.println(set);
		
		if(nums.length==0) {
			System.out.println(longest);
		}
		else {
//			Arrays.sort(nums);	
//			
//			for(int i=0; i<nums.length; i++) {
//				System.out.print(nums[i]+", ");
//			}
			
			for(int a:set) {
				if(map.containsKey(a-1) && !map.containsKey(a)) {
					map.put(a, 1);
					length++;
				}
				else {
					map.clear();
					System.out.println(map);
					if(longest < length) {
						longest = length;
					}
					map.put(a, 1);
					length=1;
				}
			}
		}
		if(longest < length) {
			longest = length;
		}
//		System.out.println(length);
		System.out.println(longest);

	}

}

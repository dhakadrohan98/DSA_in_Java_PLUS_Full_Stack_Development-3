package faangm;
import java.util.*;

public class LongestConsecutiveSequenceOptimized {

	public static void main(String[] args) {
		int[] nums = {5,6,2,15,3,1,4,12,10,9,8,11,16};
		Map<Integer,Boolean> present=new HashMap<>();
		Map<Integer,Boolean> checked=new HashMap<>();
		int longestSequence = 0;
		
		for(int num:nums) {
			present.put(num, true);
		}
		System.out.println(present);
		
		for(int a:nums) {
			if(!checked.containsKey(a) && !present.containsKey(a-1)) {
				int currentChain = 0;
				int start = a;
				
				while(present.containsKey(start)) {
					currentChain++;
					checked.put(start, true);
					start++;
				}
				longestSequence = Math.max(currentChain, longestSequence);
				System.out.println("currentChain: "+currentChain);
			}
		}
		System.out.println("longestSequence: "+longestSequence);
		
	}
}

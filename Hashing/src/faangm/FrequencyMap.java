package faangm;
import java.util.*;

public class FrequencyMap {

	public static void main(String[] args) {
		
		int[] nums = {8,3,5,2,3,1,6,5,7,4,3,1,4};
		Map<Integer,Integer> map = new HashMap<>();
		int count=0;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<nums.length; i++) {
			
			if(map.containsKey(nums[i])) {
				int val = map.get(nums[i]);
				map.put(nums[i], val+1);
			}
			else {
				map.put(nums[i],1);
			}
		}
		System.out.println(map);
		
		System.out.println("Enter your queries: ");
		int query = sc.nextInt();
		
//		// int query = new Scanner(System.in).nextInt();

		for(int key:map.keySet())  {
			if(query==key) {
				System.out.println(map.get(key));
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println("Entered Value Does not exist");
		}
		
		// N is total number of element in array.
		// TC: O(N+Q)
		// SC: O(N) but it will store unique element for which freq value of 1 or more than exists.

	}
}

package coding.array;

import java.util.LinkedList;
import java.util.Queue;

public class MoveLeadingZeroes {

	public static void moveZeroes(int[] nums) {
		Queue<Integer> ll = new LinkedList<>();
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i] != 0) {
				ll.offer(nums[i]);
			}
		}
		
		for(int j=0; j<nums.length; j++) {
			if(!ll.isEmpty()) {
				nums[j] = ll.poll();
			}
			else {
				nums[j]=0;
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {0,1,0,3,12};
		System.out.println("Inital arrays");
		for(int temp: arr) {
			System.out.println(temp);
		}
		moveZeroes(arr);
		System.out.println("Arrays after shifting all zeroes at the end:");
		for(int temp: arr) {
			System.out.println(temp);
		}

	}

}

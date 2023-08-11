package maang;

public class NoOfZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{1,2,0,2,0,1,0,1,0};
		int j=0;
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i] != 0) {
				int temp = nums[j];
				nums[j]=nums[i];
				nums[i] = temp;
				j++;
			}
		}
		
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+", ");
		}

	}

}

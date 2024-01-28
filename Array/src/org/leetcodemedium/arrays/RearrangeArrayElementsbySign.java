package org.leetcodemedium.arrays;

public class RearrangeArrayElementsbySign {
	
	//Brute force approach
	public static int[] rearrangeArray(int[] nums) {
		
		if(nums.length == 2) {
			if(nums[0] < 0) {
				int temp = nums[0];
				nums[0] = nums[1];
				nums[1] = temp;
			}
		}
		else {
			int len = nums.length;
			System.out.println(len);
	        int[] positive = new int[len/2];
	        int[] negative = new int[len/2];
	        int j=0, k=0;
	      //Positive Integers array
	        for(int i=0; i<len; i++) {
	            if(nums[i] > 0 && j < (len/2)) {
	                
	                positive[j] = nums[i];
	                j++;
	            }
	        }
	        
	      //Negative Integers array
	        for(int i=0; i<len; i++) {
	            if(nums[i] < 0 && k < (len/2)) {
	                
	                negative[k] = nums[i];
	                k++;
	            }
	        }
	       
	        System.out.println("Positive");
	        for(int temp: positive) {
	        	System.out.print(temp + " ");
	        }
	        System.out.println();
	        System.out.println("Negative");
	        for(int temp: negative) {
	        	System.out.print(temp + " ");
	        }
	        System.out.println();
	        //main logic
	        int l=0;
	        j=0;
	        k=0;
	        
	        while(l < len && (j < len/2 || k < len/2) ) {
	        	 if(l==17) {
		            	System.out.println("l=17 && j="+ j + "&& k="+ k);
		         }
	        	System.out.println("Value of l: " + l);
	            if(l%2 == 0) {
	                nums[l] = positive[j];
	                System.out.println("Value of j: " + j);
	                l++;
	                j++;
	            }
	            else {
	            	System.out.println("Value of k: " + k);
	                nums[l] = negative[k];
	                l++;
	                k++;
	                
	            }
	        }
		}
		
		for(int temp: nums) {
			System.out.print(temp + " ");
		}
        return nums;
    }
	
	public static void main(String[] args) {
		int[] nums = {28,-41,22,-8,-37,46,35,-9,18,-6,19,-26,-37,-10,-9,15,14,31};
		int[] rearrangeArray = rearrangeArray(nums);

	}

}

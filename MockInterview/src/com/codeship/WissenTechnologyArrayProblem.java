package com.codeship;
import java.util.*;

class WissenTechnologyArrayProblem
{
	public static void main(String[] args) {
		int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int splitSize = 3;
		
		/* expected Output 
		[0, 1, 2]
		[3, 4, 5]
		[6, 7, 8]
		[9]
		*/
	
		List<int[]> list = splitArray(original, splitSize);
		System.out.println(list);
//		for(int[] temp: list) {
//			for(int i=0; i<temp.length; i++) {
//				System.out.println(temp[i]);
//			}
//		}
 		list.forEach(splitArray -> System.out.println(Arrays.toString(splitArray)));
	}
	
	public static List<int[]> splitArray(int[] array, int splitSize) {
	    
	    int limit = array.length; //limit-10;
	    int[] temp;
	    int iteration = 0;
	    List<int[]> result = new ArrayList<>();
	    int globalCount=0;// 10/3=3;
	    
	    if(limit%splitSize >=  1) {
	        iteration = (limit/splitSize)+1; // (10/3=3)
	    }
	    else {
	        iteration = (limit/splitSize);
	    }
	    
	    
	    for(int i = 0; i < iteration ; i++) {
	        temp = new int[splitSize];
		        for(int j=0; j<splitSize; j++) {
		            if(globalCount < array.length) {
//		            	System.out.println(array[globalCount]);
	    	            temp[j] = array[globalCount];
	    	            globalCount++;
		            }
		        }
		        result.add(temp);
	   }
	   return result;
	   
	}
}

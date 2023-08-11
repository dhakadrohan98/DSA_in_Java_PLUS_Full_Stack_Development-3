package faangm;
import java.util.*;

public class LargestSubarrayWith0Sum {

	public static void main(String[] args) {
		int[] arr = {-1,1,-1,1};
		int[] prefixSum = new int[arr.length];
		Map<Integer,Integer> prefixSumIndex = new HashMap<>(); //<prefixSum[i],index(first occurence)>
		int tempSum=0, sum=0, largest=0;

		//Build prefixSum array.
		for(int i=0; i<arr.length; i++) {
			tempSum += arr[i];
			prefixSum[i] = tempSum;
		}
		
		
		prefixSumIndex.put(0,-1); // put sum=0 at index=-1 in prefixSumIndex map.
		for(int i=0; i<prefixSum.length; i++) {
			sum = prefixSum[i];
			
			if(prefixSumIndex.containsKey(sum)) {
				int diff = i - prefixSumIndex.get(sum);
				largest = Math.max(largest, diff);
			}
			else {
				prefixSumIndex.put(sum, i);
			}
		}
		System.out.println(largest);

	}

}

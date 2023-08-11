package faangm;
import java.util.*;

public class FrequencyArray {

	public static void main(String[] args) {
		int[] arr = {8,3,5,2,3,1,6,5,7,4,3,1,4};
		int[] freq = new int[arr.length+1];
		int count=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your queries: ");
		int query = sc.nextInt();
		
		//Making frequency table
//		Arrays.fill(freq, 0);
		
		for(int i=0; i<arr.length; i++) {
			int temp = arr[i];
			freq[temp]++;
		}
		
		for(int i=0; i<arr.length; i++) {
			if(query==arr[i]) {
				System.out.println(freq[query]);
				count++;
				break;
			}
		}
		
		if(count==0) {
			System.out.println("Does not exist");
		}
		
//		printing freq array values
		for(int j=0; j<freq.length; j++) {
			System.out.println(j+": "+freq[j]+" ");
		}

	}
	// N is no. of element in array.
	// TC: O(N+Q)
	// SC: O(N)

}

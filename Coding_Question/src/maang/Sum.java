package maang;
import java.util.*;

public class Sum {
	
	public static int sum(List<Integer> arr,int i,int j) {
	int sum=0;
	
	for(int k=i; k<=j; k++) {
		sum += arr.get(k);
	}
	return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList<>();
		int leftSum=0;
	    int rightSum=0;
		
		arr.add(2);
		arr.add(0);
		arr.add(0);
		arr.add(0);

		int count=0;
		
		for(int i=1; i<arr.size()-1; i++) {
			leftSum = sum(arr, 0, i-1);
			System.out.println("leftSum: "+leftSum);
			
			System.out.println("************************");
			
			rightSum = sum(arr, i+1, arr.size()-1);
			System.out.println("rightSum: "+rightSum);
			System.out.println("End");
			
			if(leftSum==rightSum) {
				count++;
				break;
			}
		}
		
		if(count==1)
			System.out.println("YES");
		else
			System.out.println("NO");
		
	}
}

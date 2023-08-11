package maang;

public class RotateArray {
	
	public static void reverse(char[] a, int i, int j) {
		int li = i;
		int ri = j;
		
		while(li<ri) {
			char temp = a[li];
			a[li] = a[ri];
			a[ri] = temp;
			
			li++;
			ri--;
		}
	}
	
	public static void rotate(char[] a,int k) {
		k = k % a.length;
		
		if(k < 0) {
			k = k + a.length;
		}
		System.out.println(a);
		//part1
		reverse(a, 0 , a.length-k-1);
		System.out.print("Part 1: ");
		System.out.println(a);
		
		//part2
		reverse(a, a.length-k, a.length-1);
		System.out.print("Part 2: ");
		System.out.println(a);
		
		//all
		reverse(a, 0, a.length-1);
		System.out.print("All: ");
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = new char[]{'a','b','c','d','e','f','g','h'};
		int k = 3;
		rotate(arr,k);
	}
	
}

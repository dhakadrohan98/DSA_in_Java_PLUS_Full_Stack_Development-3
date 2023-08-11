package maang;
import java.util.*;
public class Test {

	public static void main(String[] args) {
			  int a[] = new int[9];
			  Scanner sc = new Scanner(System.in);
			  
			  System.out.println("Enter 9 int numbers for array a:");
			  for(int i=0; i<a.length; i++) {
			  int temp = sc.nextInt();
			  a[i] = temp;
			 }  
			 int b[] = new int[a.length];
			 for(int i=0; i<b.length; i++) {
			     int x = a[i];
			     b[x] = b[x] + 1;
			    }
			 System.out.println("Printing frequency of array a");
			 
			 System.out.println("b[1]:"+b[1] +" "+ "b[3]:"+b[3]+ " " + "b[4]:"+b[4] );

	}

}

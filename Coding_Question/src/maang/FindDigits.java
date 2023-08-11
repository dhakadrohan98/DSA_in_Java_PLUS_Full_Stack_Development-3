package maang;

public class FindDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1012;
		int tempNum = n;
	    int result=0;
	    
	    while(tempNum!=0) {
	        int rem = tempNum%10;
	        
	        if(rem!=0 && (n%rem) == 0) {
	            result++;
	        }
	        tempNum = tempNum/10;
	    }
	    System.out.print(result);

	}

}

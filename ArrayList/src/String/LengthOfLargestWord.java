package String;

import java.util.Scanner;

public class LengthOfLargestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		System.out.println(lengthOfLargestWord(s));

	}
	
    public static int lengthOfLargestWord(String s) {
        
        if(s.length() <= 1)
            return s.length();
        
        int count = 0;
        int curr_count;
        int start = 0;
        int end = s.length() - 1;
        
        while(start <= end)
        {
            curr_count = 0;
            while(start <= end && !Character.isLetter(s.charAt(start)))
            {
                start++;
            }
            
            while(start <= end && Character.isLetter(s.charAt(start)))
            {
                curr_count++;
                start++;
            }
            
            if(count < curr_count)
                count = curr_count;
        }
        
        return count;
    }

}

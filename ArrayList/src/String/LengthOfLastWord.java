package String;
import java.util.*;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		System.out.println(lengthOfLastWord(s));

	}
	
    public static int lengthOfLastWord(String s) {
        
    	int count;
    	int morecount = 0;
    	if(s.length() <= 1)
            return s.length();
        
        System.out.println(s.length());
        
        int start = 0;
        int end = s.length() - 1;
        
        while(start <= end)
        {
            count = 0;
            while(start <= end && !Character.isLetter(s.charAt(start)))
            {
                start++;
            }
            
            while(start <= end && Character.isLetter(s.charAt(start)))
            {
                count++;
                start++;
            }
            
            morecount = count;
            
            /*if(count < curr_count)
                count = curr_count;*/
        }
        
        return morecount;
    }

}

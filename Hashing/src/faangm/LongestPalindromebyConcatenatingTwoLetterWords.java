package faangm;
import java.util.*;

public class LongestPalindromebyConcatenatingTwoLetterWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"ab","ty","yt","lc","cl","ab"};
		int length=0;
		boolean flag=false;
		
		Map<String,Integer> map = new HashMap<>();
		
		for(int i=0; i<words.length; i++) {
			//store occurrence of strings in a map
			map.put(words[i],map.getOrDefault(words[i],0)+1);
		}
		
		for(int i=0; i<words.length; i++) {
			
			// 2 cases
			char ch1 = words[i].charAt(0);
			char ch2 = words[i].charAt(1);
			
			// 1st -> words[i][0] != words[i][1]
			if(ch1 != ch2) {
				String rev = "";
				rev+=ch2;
				rev+=ch1;
				
				if(map.containsKey(words[i]) && map.containsKey(rev)) {
					int count = Math.min(map.get(rev), map.get(words[i]));
					
					length += (count*4);
					
					//removing
					map.put(words[i], 0);
					map.put(rev, 0);
				}
			}
			
			else if(ch1 == ch2) {
				int count = map.get(words[i]);
				
				if(count%2==0) { //even
					length += (count*2);
				}
				else { //odd
					if(flag == false) {
						length += (count*2);
						
						flag = true;
					}
					else {
						length += (count-1)*2;
					}
				}
				map.put(words[i], 0);
			}
		}
		
		System.out.println(length);
	}

}

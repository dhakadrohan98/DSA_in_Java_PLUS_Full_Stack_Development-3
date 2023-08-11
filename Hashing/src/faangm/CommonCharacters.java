package faangm;
import java.util.*;

public class CommonCharacters {

	public static void main(String[] args) {
		String[] words = {"ookloo","ookkl","ooollk","oolka"}; 
		
		Map<Character,Integer> minFreqOverAll = new HashMap<>();
		
		//Filling a to z with 1000(max) value
		for(char ch='a'; ch<='z'; ch++) {
			minFreqOverAll.put(ch, 1000);
		}
		
		//Frequency map for current word.
		for(String word: words) {
			Map<Character,Integer> freq = new HashMap<>();
			
			for(int i=0; i<word.length(); i++) {
				char ch = word.charAt(i);
	
				if(freq.containsKey(ch)) {
					freq.put(ch, freq.get(ch)+1);
				}
				else if(!freq.containsKey(ch)) {
					freq.put(ch, 1);
				}
			}
			
			for(char ch='a'; ch<='z'; ch++) {
				if(!freq.containsKey(ch)) {
					freq.put(ch, 0);
				}
			}
			System.out.println(freq);
			
			//making minFreqOverAll in below for loop-> 26 times will run
			for(char temp='a'; temp<='z'; temp++) {
				int minFreq = Math.min(minFreqOverAll.get(temp), freq.get(temp));
				minFreqOverAll.put(temp, minFreq);
			}
		}
		
		List<String> ans = new ArrayList<>();
		for(char ch='a'; ch<='z'; ch++) {
			if(minFreqOverAll.get(ch)>=1) {
				
				while(minFreqOverAll.get(ch)>0) {
					String tempStr = String.valueOf(ch);
					ans.add(tempStr);
					minFreqOverAll.put(ch,minFreqOverAll.get(ch)-1);
				}
			}
		}
		System.out.println(ans);

	}
}

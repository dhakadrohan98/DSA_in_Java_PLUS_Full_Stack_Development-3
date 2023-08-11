package faangm;
import java.util.*;

public class AnagramMethod {

	public static void main(String[] args) {
		String str1 = "silent";
		String str2 = "listem";
		Map<Character,Integer> hmap = new HashMap<>();
		boolean flag=false;
		
		for(int i=0; i<str1.length(); i++) {
			char ch = str1.charAt(i);
			
			if(hmap.containsKey(ch)) {
				hmap.put(ch, hmap.get(ch)+1);
			}
			else {
				hmap.put(ch,1);
			}
		}
		System.out.println(hmap);
		
		for(int i=0; i<str2.length(); i++) {
			char ch = str2.charAt(i);
			
			if(!hmap.containsKey(ch)) {
				flag = true;
			}
			else {
				hmap.put(ch, hmap.get(ch)-1);
			
				if(hmap.get(ch) != 0) {
					flag=true;
				}	
			}
		}
		System.out.println(hmap);
		
		if(flag) {
			System.out.println("Not anagram");
		}
		else {
			System.out.println("Anagram strings");
		}

	}

}

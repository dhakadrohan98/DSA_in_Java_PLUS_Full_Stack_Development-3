package org.string.leetcode.mediumProblems;

public class SumofBeautyofAllSubstrings {

	public int beautySum(String s) {
        int len = s.length();
        int ans = 0;
        
        for(int i=0; i<len; i++) {
            int[] freq = new int[26];
            
            for(int j=i; j<len; j++) {
                int index = s.charAt(j)-'a';
                freq[index] += 1;
                
                int min = getMin(freq);
                int max = getMax(freq);
                int beauty = max - min;
                ans += beauty;
            }
        }
        return ans;
    }
    
    public static int getMax(int[] freq) {
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<26; i++) {
            if(freq[i] != 0) {
                max = Math.max(max, freq[i]);
            }
        }
        return max;
    }
    
    public static int getMin(int[] freq) {
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<26; i++) {
            if(freq[i] != 0) {
                min = Math.min(min, freq[i]);
            }
        }
        return min;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

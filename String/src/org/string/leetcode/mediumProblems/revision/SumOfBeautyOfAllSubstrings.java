package org.string.leetcode.mediumProblems.revision;

public class SumOfBeautyOfAllSubstrings {
	
	//TC: O(n*n*26*26)
    //SC: O(1)
    private int maxFreq(int[] freq) {
        int max = 0;
        for(int i = 0; i < freq.length; i++) {
            max = Math.max(max, freq[i]);
        }
        return max;
    }

    private int minFreq(int[] freq) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < freq.length; i++) {
            //0 value at any index of freq array can not be considered as a min value because 0 means
            //character itself it not present in the substring 
            if(freq[i] != 0) {
                min = Math.min(min, freq[i]);   
            }
        }
        return min;
    }

    public int beautySum(String s) {
    int n = s.length();
    int sum = 0;

    for (int i = 0; i < n; i++) {
        int[] freq = new int[26]; //0
        for (int j = i; j < n; j++) {
            // Directly use s.charAt(j) instead of substring()
            char ch = s.charAt(j);
            freq[ch - 'a']++;
            int beauty = maxFreq(freq) - minFreq(freq);
            sum += beauty;
        }
    }
    return sum;
  }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package org.string.leetcode.mediumProblems.revision;

public class ReverseWordsInAString {
	
	 //TC: O(n)
    //SC: O(n)
    public String reverseWords(String s) {
        s = s.trim();
        String[] arr = s.split(" ");
        int n = arr.length;
        StringBuilder ans = new StringBuilder();
        for(int i = n-1; i >= 0; i--) {
            String str = arr[i];
            //extra space as a string encountered, skip the process & move to the prev character
            if(str.length() == 0) {
                continue;
            }
            ans.append(str);
            if(i != 0) {
                ans.append(" ");
            }
        }
        return ans.toString();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

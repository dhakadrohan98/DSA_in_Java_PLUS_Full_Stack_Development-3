package org.string.leetcode.mediumProblems.revision;

public class RotateString {
	
	//TC: O(n)
    //SC: O(n)
	public boolean rotateString(String s, String goal) {
        //edge case
        if(s.length() != goal.length()) {
            return false;
        }
        s = s + s;
        if(s.contains(goal)) {
            return true;
        }
        return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

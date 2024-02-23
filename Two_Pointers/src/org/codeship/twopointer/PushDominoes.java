package org.codeship.twopointer;

public class PushDominoes {

	public String pushDominoes(String dominoes) {
        int n = dominoes.length();
        //Filling left arr with the index value from dominoes['L'] 
        int[] left = new int[n];
        int nearestLeftIndex = -1;
        for(int i = n-1; i >= 0; i--) {
            char c = dominoes.charAt(i);
            
            if(c == 'L') {
                nearestLeftIndex = i;
            }
            else if(c == 'R') {
                nearestLeftIndex = -1;
            }
            left[i] = nearestLeftIndex;
        }
        
         //Filling right arr with the index value from dominoes['R'] 
        int[] right = new int[n];
        int nearestRightIndex = -1;
        for(int i = 0; i < n; i++) {
            char c = dominoes.charAt(i);
            
            if(c == 'R') {
                nearestRightIndex = i;
            }
            else if(c == 'L') {
                nearestRightIndex = -1;
            }
            right[i] = nearestRightIndex;
        }
        
        char[] ans = new char[n];
        
        for(int i=0; i<n; i++) {
            
            if(dominoes.charAt(i) == '.') {
                int nearestLeft = left[i];
                int nearestRight = right[i];
                
                int leftDiff = nearestLeft == -1 ? Integer.MAX_VALUE : Math.abs(nearestLeft - i);
                int rightDiff = nearestRight == -1 ? Integer.MAX_VALUE : Math.abs(nearestRight - i);
                
                if(leftDiff == rightDiff) {
                    ans[i] = '.';
                }
                else if(leftDiff < rightDiff) {
                    ans[i] = 'L';
                }
                else if(leftDiff > rightDiff) {
                    ans[i] = 'R';
                }
            }
            else {
                ans[i] = dominoes.charAt(i);
            }
        }
        return new String(ans);    
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

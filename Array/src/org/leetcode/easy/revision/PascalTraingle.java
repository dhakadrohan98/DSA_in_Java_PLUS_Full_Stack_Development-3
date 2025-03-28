package org.leetcode.easy.revision;

import java.util.*;
public class PascalTraingle {
	
	//TC: can not be predicted due to increasing order of cols in each row
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        list.add(firstRow);
        firstRow.add(1);
        for(int i = 1; i < numRows; i++) {
            List<Integer> currRow = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    currRow.add(1);
                } else {
                    //if below condition is valid
                    if(i-1 >= 0 && j-1 >= 0) {
                        int sum = list.get(i-1).get(j) + list.get(i-1).get(j-1);
                        currRow.add(sum);
                    }
                }
            }
            list.add(currRow);
        }
        return list;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

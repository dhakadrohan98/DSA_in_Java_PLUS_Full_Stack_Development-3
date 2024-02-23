package org.gfg.jobAThon;

import java.util.ArrayList;

public class Q1 {

	public static ArrayList<Integer> playOfGlasses(int c1,int w1,int c2,int w2,int c3,int w3)
    {
		 ArrayList<Integer> result = new ArrayList<>();

	        for (int i = 1; i <= 100000; i++) {
	            // Pour from glass a to b
	            int pourAB = Math.min(w1, c2 - w2);
	            w1 -= pourAB;
	            w2 += pourAB;

	            // Pour from glass b to c
	            int pourBC = Math.min(w2, c3 - w3);
	            w2 -= pourBC;
	            w3 += pourBC;

	            // Pour from glass c to a
	            int pourCA = Math.min(w3, c1 - w1);
	            w3 -= pourCA;
	            w1 += pourCA;
	        }

	        result.add(w1);
	        result.add(w2);
	        result.add(w3);
	        return result;
	    
    }
	
    
	public static void main(String[] args) {
        int c1 = 10, w1 = 3;
        int c2 = 11, w2 = 4;
        int c3 = 12, w3 = 5;

        ArrayList<Integer> result = playOfGlasses(c1, w1, c2, w2, c3, w3);
        System.out.println(result);
    }

}

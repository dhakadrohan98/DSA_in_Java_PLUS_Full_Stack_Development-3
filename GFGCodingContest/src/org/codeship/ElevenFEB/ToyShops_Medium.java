package org.codeship.ElevenFEB;

import java.util.*;

public class ToyShops_Medium {

public static int minimumDifference(int N, int M, int[][] toys) {
        
        //list of array containing (prices,shop)
        List<int[]> list = new ArrayList<>();
        // (1,0), (2,0), (3,0), (3,1), (4,1), (5,1), (4,2), (5,2), (6,2)
        for(int i=0; i<N; i++) {
            for(int y: toys[i]) {
                list.add(new int[]{y, i});
            }
        }
        // sort the list on the basis of price
        // (1,0), (2,0), (3,0), (3,1), (4,1), (4,2), (5,1), (5,2), (6,2)
        Collections.sort(list, 
                new Comparator<int[]>() {
                public int compare(int[] x, int[] y) {
                    return x[0] - y[0];
                }
            });
        //Store (shop, noOfToys) into map
        Map<Integer, Integer> hm = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        int high = 0, low = 0;
        
        //Sliding window
        //    L                                  H
        // | (1,0), (2,0), (3,0), (3,1), (4,1), (4,2), | (5,1), (5,2), (6,2)
        
        /*
            1 -> 3
            2 -> 2
            3->  1
        */
        while(high < list.size()) {
            
            int shopNo = list.get(high)[1];
            hm.put(shopNo, hm.getOrDefault(shopNo, 0) + 1);
            
            while(hm.size() == N) {
                int highPrice = list.get(high)[0];
                int lowPrice = list.get(low)[0];
                ans = Math.min(ans, highPrice - lowPrice);
                int lowShopNO = list.get(low)[1];
                hm.put(lowShopNO, hm.get(lowShopNO) - 1);
                
                //If noOfToys into lowShopNO becomes 0 then removing lowShopNO key.
                if(hm.get(lowShopNO) == 0) {
                    hm.remove(lowShopNO);    
                }
                low++;
            }
            high++;
        }
        
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package faangm;
import java.util.*;

public class SubarraysWithGivenXor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {4, 2, 2, 6, 4};
		int B = 6;
		Map<Integer,Integer> hmap=new HashMap<>();
        int prefixXor=0;
        int count=0;
       
        for(int i=0;i<A.length;i++){
            prefixXor=prefixXor^A[i];
            
            if(prefixXor==B) {
            	count++;
            }
            System.out.println("prefixXor: "+prefixXor);
            System.out.println("prefixXor^B: "+ (prefixXor^B));
            if(hmap.containsKey(prefixXor^B)){	
                count=count+hmap.get(prefixXor^B);
                if(hmap.containsKey(prefixXor)){
                    int value=hmap.get(prefixXor);
                    hmap.put(prefixXor,value+1);
                }
                else{
                    hmap.put(prefixXor,1);
                }
            }
            else{
                if(hmap.containsKey(prefixXor)){
                    int value=hmap.get(prefixXor);
                    hmap.put(prefixXor,value+1);
                }
                else{
                    hmap.put(prefixXor,1);
                }     
            }
        }
        System.out.println(count);	
        
	}
}

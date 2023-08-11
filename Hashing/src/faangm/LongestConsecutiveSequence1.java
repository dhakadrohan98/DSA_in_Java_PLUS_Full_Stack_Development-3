package faangm;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class LongestConsecutiveSequence1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter size of array:");
		int n=scn.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<n;i++){
			nums[i]=scn.nextInt();
		}
		Map<Integer,Boolean> hmap=new HashMap<>();
        for(int num:nums){
            hmap.put(num,true);
        }
        int longestSequence=0;
        Map<Integer,Integer> checkMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hmap.get(nums[i])) continue;
            int num=nums[i];
            int flag=0;
            while(hmap.containsKey(num)){
                if(checkMap.containsKey(num)){
                    checkMap.put(nums[i],checkMap.get(num));
                    flag=-1;
                    break;
                }
                hmap.put(num,false);
                num--;
            }
            if(flag==0)checkMap.put(nums[i],num+1);
            int sequenceLength=nums[i]+1-checkMap.get(nums[i]);
            longestSequence=Math.max(longestSequence,sequenceLength);
        }
        System.out.println(longestSequence);
	}
}
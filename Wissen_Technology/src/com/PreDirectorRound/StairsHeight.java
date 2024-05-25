package com.PreDirectorRound;

public class StairsHeight {
	//anti intuitive problem
	public static int calculateHeight(int blocks) {
		
		int stairs = 1;
		int height = 0;
		
		while(blocks > 0) {
			blocks = blocks-stairs;
			if(blocks < 0) {
				System.out.println("Negative difference: "+blocks);
				break;
			}
			stairs++;
			height++;
		}
		return height;
	}
	public static void main(String[] args) {
		int blocks = 28;
		int calculateHeight = calculateHeight(blocks);
		System.out.println("Height: "+calculateHeight);
	}

}


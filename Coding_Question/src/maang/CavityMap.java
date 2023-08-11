package maang;
import java.util.*;


public class CavityMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> grid = new ArrayList<String>();
		
		grid.add("1112");
		grid.add("1912");
		grid.add("1892");
		grid.add("1234");
		
		for(int i=1; i<grid.size()-1; i++) {
			String prev = grid.get(i-1);
			String curr = grid.get(i);
			String next = grid.get(i+1);
			
			for(int j=1; j < curr.length()-1; j++) {
				
				//converting char into int with the help of Character.getNumericValue(c) method
				int up = Character.getNumericValue(prev.charAt(j));
				int left = Character.getNumericValue(curr.charAt(j-1));
				int mid = Character.getNumericValue(curr.charAt(j));
				int right = Character.getNumericValue(curr.charAt(j+1));
				int down = Character.getNumericValue(next.charAt(j));
				
				if(mid>up && mid>left && mid>right && mid>down) {
					char ch = 'X';
					curr = curr.substring(0, j) + ch+ curr.substring(j + 1);
					grid.set(i, curr);
				}
			}
		}
		System.out.println(grid);
	}
}

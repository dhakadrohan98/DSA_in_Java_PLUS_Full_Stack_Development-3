package String;

public class convertStringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5897;
		String s = "", sn = "";
		s += num;
		int i = s.length()-1;
		
		while(i >= 0)
		{
			int val = s.charAt(i) - '0';
			sn = sn + val;
			i--;
		}
		
		int rev = Integer.valueOf(sn);
		System.out.println(rev);

	}

}

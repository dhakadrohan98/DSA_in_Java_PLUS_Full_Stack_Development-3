package maang;
import java.time.LocalTime;

public class ReplaceACharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "12:25";
		String s2 = "12:24";
//		char ch = 'X';
//		s = s.substring(0,2)+ch+s.substring(3);
//		System.out.println(s);
		LocalTime t1 = LocalTime.parse(s1) ;
		LocalTime t2 = LocalTime.parse(s2) ;
		
		System.out.println(t1.getHour());
	}

}

package maang;

public class Event {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] event1 = new String[2];
		event1[0] = "15:19";
		event1[1] = "17:56";
		
		String[] event2 = new String[2];
		event2[0] = "14:11";
		event2[1] = "20:02";
		
		int count=0;
		
		String temp1 = event1[0];
			// The string split() method breaks a given string around matches of the given regular expression.dAfter splitting against the given regular expression, this method returns a string array. 
		String[] hr = temp1.split(":");
		int hr1 = Integer.valueOf(hr[0]);
		
		
		String temp2 = event1[1];
		// The string split() method breaks a given string around matches of the given regular expression.dAfter splitting against the given regular expression, this method returns a string array. 
		String[] hr0 = temp2.split(":");
		int hr11 = Integer.valueOf(hr0[0]);
		
		for(int j=0; j<event2.length; j++) {
			String temp3 = event2[j];
			String[] hr4 =  temp3.split(":");
			int hr2 = Integer.valueOf(hr4[0]);

			if(hr1<=hr2 && hr11>=hr2) {
				count++;
				System.out.println(true);
			}
		if(count==0) {
			System.out.println(false);
		}
    }
  }
}

package org.codeship.ElevenFEB;

public class FindBotsOnGeeklandster_Medium {

	 public int[] findBots(String usernames[], int n){
	        
	        int[] result = detectBots(usernames);
	        return result;
	    }
	    
	    public static int[] detectBots(String[] usernames) {
	        int[] result = new int[usernames.length];
	        
	        for(int i=0; i<usernames.length; i++) {
	            result[i] = isBot(usernames[i]) ? 1 : 0;
	        }
	        return result;
	    }
	    
	    public static boolean isBot(String username) {
	        int[] count = new int[26];
	        for(int i=0; i < username.length(); i+=2) {
	            count[username.charAt(i) - 'a']++;
	        }
	        
	        int dist = 0;
	        for(int c: count) {
	            if(c > 0) {
	                dist++;
	            }
	        }
	        return isPrime(dist);
	    }
	    
	    public static boolean isPrime(int n) {
	        if(n <= 1) {
	            return false;
	        }
	        
	        if(n==2 || n==3) {
	            return true;
	        }
	        
	        if(n%2 == 0 || n%3 == 0) {
	            return false;
	        }
	        
	        for(int i=5; i*i <= n; i+=6) {
	            if(n%i == 0 || n%(i+2)==0 ) {
	                return false;
	            }
	        }
	        return true;
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

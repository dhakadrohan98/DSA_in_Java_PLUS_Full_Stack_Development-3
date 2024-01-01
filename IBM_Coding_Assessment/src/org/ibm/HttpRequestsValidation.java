package org.ibm;

import java.util.*;

public class HttpRequestsValidation {
	
	public static List<String> getResponses(List<String> valid_auth_tokens, List<List<String>> requests) {
		
		List<String> finalResult = new ArrayList<>();
		String[] str = new String[requests.size()];
		int sizeOfLists = 0;
		String[] two;
		String[] three = {""};
		String REGEX = "[a-z0-9]+$";
		
		for(List<String> temp: requests) {
			
			sizeOfLists = temp.size();
			
			for(int i=0; i<temp.size(); i++) {
				String temp1 = temp.get(i);
				two = temp1.split(",");
				String type = two[0];
				String url = two[1];
				if(type.equals("GET")) {
					String token = url.substring(26, 38);
					String name = url.substring(44,url.length());
					
					if(valid_auth_tokens.contains(token)) {
						System.out.println("VALID,"+"name,"+name);
						finalResult.add("VALID,"+"name,"+name);
					}
					else {
						System.out.println("INVALID");
						finalResult.add("INVALID");
					}
				} 
				else if(type.equals("POST") && url.length() > 48) {
					String auth_token = url.substring(26, 38);
					if(valid_auth_tokens.contains(auth_token)) {
						String csrf_token = url.substring(44,53);
						if(csrf_token.matches(REGEX) && csrf_token.length()>=8) {
							String name = url.substring(59,url.length());
							System.out.println("VALID,"+"name,"+name);
							finalResult.add("VALID,"+"name,"+name);
						}
						else {
							System.out.println("INVALID");
							finalResult.add("INVALID");
						}
						
					} else {
						System.out.println("INVALID");
						finalResult.add("INVALID");
					}
					
				}
				else {
					System.out.println("INVALID");
					finalResult.add("INVALID");
				}
				
			}
		}
		
		return finalResult;
	}

	public static void main(String[] args) {
		String TEST_STRING = "ak2sh32dy";
		String REGEX = "[a-z0-9]+$";
//		boolean regexResult = TEST_STRING.matches(REGEX);
		
		List<String> authToken = new ArrayList<>();
		//Adding auth token
		authToken.add("ah37j2ha483u");
		authToken.add("safh34ywb0p5");
		authToken.add("ba34wyi8t902");
		System.out.println("AuthToken: ");
		System.out.println(authToken);
		System.out.println();
		
		String[][] strArr = new String[4][2];
		//insert first request as GET
		strArr[0][0] = "GET";
		strArr[0][1] = "https://example.com?token=347sd6yk8iu2&name=alex";
		//insert second request as GET
		strArr[1][0] = "GET";
		strArr[1][1] = "https://example.com?token=safh34ywb0p5&name=sam";
		//insert third request as POST
		strArr[2][0] = "POST";
		strArr[2][1] = "https://example.com?token=safh34ywb0p5&name=alex";
		//insert third request as POST
		strArr[3][0] = "POST";
		strArr[3][1] = "https://example.com?token=safh34ywb0p5&"+"csrf=ak2sh32dy&"+"name=chris";
		//
		
		List<String> normal1 = new ArrayList<>();
		normal1.add("GET,"+"https://example.com?token=347sd6yk8iu2&name=alex");
		List<String> normal2 = new ArrayList<>();
		normal2.add("GET,"+"https://example.com?token=safh34ywb0p5&name=sam");
		List<String> normal3 = new ArrayList<>();
		normal3.add("POST,"+"https://example.com?token=safh34ywb0p5&name=alex");
		List<String> normal4 = new ArrayList<>();
		normal4.add("POST,"+"https://example.com?token=safh34ywb0p5&"+"csrf=ak2sh32dy&"+"name=chris");
		
		List<List<String>> requests = new ArrayList<>();
		//Adding requests
		requests.add(normal1);
		requests.add(normal2);
		requests.add(normal3);
		requests.add(normal4);
		System.out.println("Requests: ");
		System.out.println(requests);
		System.out.println();
		
		List<String> result = new ArrayList<String>();
		result = getResponses(authToken, requests);
		System.out.println();
		System.out.println("Result: ");
		System.out.println(result);
		

	}

}

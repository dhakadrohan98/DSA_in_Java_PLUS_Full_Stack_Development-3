package String;

 class stringbuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb);
		System.out.println(sb.length());	
		
		sb.append("gef");
		System.out.println(sb);
		
		sb.insert(2,"xs");
		System.out.println(sb);
		
		System.out.println(sb.charAt(3));
		
		// Update the char at particular index
		sb.setCharAt(4,'p');
		System.out.println(sb);
		
		sb.insert(sb.length(), "END");
		System.out.println(sb);
		
		sb.deleteCharAt(2);
		System.out.println(sb);
	}

}

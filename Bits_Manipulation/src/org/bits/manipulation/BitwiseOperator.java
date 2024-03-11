package org.bits.manipulation;

public class BitwiseOperator {

	public static void main(String[] args) {
		// AND : &
		System.out.println(23 & 17);
		System.out.println(8 & 4);
		System.out.println(23 & 27);

		// OR : |
		System.out.println("OR : | " + (23 | 27));

		// Exclusive OR : ^
		System.out.println("Exclusive OR : ^ " + (21 ^ 23));

		// one's complement: ~
		System.out.println("1's complement: ~ " + (~2));
		
		//left shift operator : <<(number)
		//left shit by 1
		System.out.println("left shift operator : <<(number) 23 * 2^1 - " + (23 << 1));
		
		//left shit by 2
		System.out.println("left shift operator : <<(number) 23 * 2^2 - " + (23 << 2));
		
		//left shit by 3
		System.out.println("left shift operator : <<(number) 23 * 2^3 - " + (23 << 3));
	}

}

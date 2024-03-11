package org.bits.manipulation;

public class BitCountForSetBit {

	public static void main(String[] args) {
		int intValue = 5;
		long longValue = 123456789012345L;

		int popCountInt = Integer.bitCount(intValue);
		long popCountLong = Long.bitCount(longValue);

		System.out.println("Popcount of " + intValue + ": " + popCountInt);
		System.out.println("Popcount of " + longValue + ": " + popCountLong);
	}

}

package org.stream.api;

public class StringBalance {

    public static void main(String[] args) {
        // Test cases
        System.out.println(balanceString("10", "10"));     // Output: 0
        System.out.println(balanceString("01", "11"));     // Output: 2
        System.out.println(balanceString("111001", "010110")); // Output: 6
    }

    static int balanceString(String s1, String s2) {
        int countOnesS1 = 0;
        int countOnesS2 = 0;
        int countZerosS1 = 0;
        int countZerosS2 = 0;

        for (char c : s1.toCharArray()) {
            if (c == '1') {
                countOnesS1++;
            } else {
                countZerosS1++;
            }
        }

        for (char c : s2.toCharArray()) {
            if (c == '1') {
                countOnesS2++;
            } else {
                countZerosS2++;
            }
        }

        int operations = 0;
        int diffOnes = Math.abs(countOnesS1 - countOnesS2);
        int diffZeros = Math.abs(countZerosS1 - countZerosS2);

        operations += Math.min(diffOnes, diffZeros);

        return operations;
    }
}


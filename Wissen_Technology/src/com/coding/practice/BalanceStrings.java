package com.coding.practice;

public class BalanceStrings {

    public static void main(String[] args) {
        // Test cases
        System.out.println(balanceString("10", "10"));     // Output: 0
        System.out.println(balanceString("01", "11"));     // Output: 2
        System.out.println(balanceString("111001", "010110")); // Output: 6
    }

    static int balanceString(String s1, String s2) {
        int count1 = 0, count0 = 0;

        // Count the number of 1's and 0's in both strings
        for (char c : s1.toCharArray()) {
            if (c == '1') {
                count1++;
            } else {
                count0++;
            }
        }

        for (char c : s2.toCharArray()) {
            if (c == '1') {
                count1++;
            } else {
                count0++;
            }
        }

        if (count1 == count0) {
            // No operations needed if the counts are already equal
            return 0;
        }

        int operations = 0;
        int diff = Math.abs(count1 - count0);

        // Determine which string to modify and perform the operations
        if (count1 > count0) {
            for (int i = s1.length() - 1; i >= 0; i--) {
                if (s1.charAt(i) == '1') {
                    operations++;
                    diff--;
                }

                if (diff == 0) {
                    break;
                }
            }
        } else {
            for (int i = s2.length() - 1; i >= 0; i--) {
                if (s2.charAt(i) == '0') {
                    operations++;
                    diff--;
                }

                if (diff == 0) {
                    break;
                }
            }
        }

        return operations;
    }
}


package String;

import java.util.*;

public class StringMultiply {

  // ~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~
  public static String multiplication(String num1, String num2) {
    // write your code here
    long i = Long.valueOf(num1);
    long j = Long.valueOf(num2);

    long res = i * j;

    String str = String.valueOf(res);

    return str;
  }

  //~~~~~~~~~~~~Input Management~~~~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    String str1 = scn.nextLine();
    String str2 = scn.nextLine();

    String res = multiplication(str1, str2);
    System.out.println(res);
  }
}

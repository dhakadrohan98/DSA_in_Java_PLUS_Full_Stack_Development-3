package String;

import java.util.*;

public class ReverseVowels {
  // ~~~~~~~~~~~~~~User Section~~~~~~~~~~~~
  public static String reverseVowels(String s) {
    // write your code here
    int i = 0;
    int j = s.length()-1;
    StringBuilder sb = new StringBuilder(s);

    while(i <= j)
    {
      char ch1 = sb.charAt(i);
      char ch2 = sb.charAt(j);

      if((ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u') && (ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u'))
      {
        sb.setCharAt(i,ch2);
        sb.setCharAt(j,ch1);
      }

      else if(ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u')
      {
        j--;
      }

      else if(ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u')
      {
        i++;
      }
    }

    System.out.println(sb);
    return sb.toString();

  }

  // ~~~~~~~~~~~~Input Management~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();

    String res = reverseVowels(str);
    System.out.println(res);
  }
}
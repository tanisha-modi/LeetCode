//  https://leetcode.com/problems/longest-common-prefix/
// not correct answer

import java.lang.StringBuilder;
// import java.util.*;

public class Q3_LongestCommonPrefix {
    public static void main(String[] args) {
        String[] array = { "flkonwer", "flkonnhe", "flkonnhoe", "flsksswnnohw", "flkonnhth", "flkonnhi",
                "flkonnhds" };
        System.out.println(commonPrefix(array));

    }

    static String printspace(int num) {
        StringBuilder num1 = new StringBuilder();
        while (num > 0) {
            num1 = num1.append("");
        }
        String num2 = num1.toString();
        return num2;
    }

    static String commonPrefix(String[] array) {
        StringBuilder ans = new StringBuilder();
        // String ans1 = "";
        StringBuilder last = new StringBuilder();
        int count = 0;

        for (int i = 0; i < array.length - 2; i++) {
            ans.delete(0, ans.length());
            for (int j = 0; j < array[i].length() && j < array[i + 1].length(); j++) {

                if (array[i].charAt(j) == array[i + 1].charAt(j)) {
                    ans = ans.append(array[i].charAt(j));
                    // System.out.println("ok");
                } else {
                    break;
                }
            }
            // System.out.println(ans);

            if (i == 0) {
                last = new StringBuilder(ans.toString());
                System.out.println(last);
                System.out.println(last.length());

            } else {
                System.out.println(last);
                for (int k = 0; k < last.length() - 1; k++) {
                    if (last.charAt(k) == ans.charAt(k)) {
                        count++;
                    }
                }
                System.out.println(count);
                if (count > 0 && count < ans.length()) {
                    // last = last.replace(0, count, ans.substring(0, count));
                    int num = last.length() - count;
                    System.out.println(num);
                    last = last.replace(count, last.length(), printspace(num));
                    System.out.println(last);
                    System.out.println("yus");
                }
                count = 0;
            }

        }

        String answ = last.toString();
        return answ;
    }
}

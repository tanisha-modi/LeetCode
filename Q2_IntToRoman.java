// https://leetcode.com/problems/integer-to-roman/

import java.lang.StringBuilder;
public class Q2_IntToRoman {

    public static void main(String[] args) {
        int num = 1999;    
        System.out.println(intToRoman(num));
    }

    // static void lessThan1000(int num, StringBuilder ans){
    //     if(num/100 == 9){
    //         ans = ans.append("CM");
    //         num =  num - 900;
    //         lessThan100(num, ans);
    //         return;
    //     }
    //     else{
    //         if(500 > num){
    //             lessThan500(num, ans);
    //             return;
    //         }
    //         ans = ans.append("D");
    //         num = num - 500;
    //         lessThan500(num, ans);
    //     }
    //     }

    // static void lessThan500(int num, StringBuilder ans){
    //         if(100 > num){
    //             lessThan100(num, ans);
    //             return;
    //         }
    //         int n1 = num/100;
    //         while(n1 > 0 && n1 < 4){
    //             ans.append("C");
    //             num = num - 100;
    //             n1--;
    //         }
    //         if(num/400 == 4){
    //             ans.append("CD");
    //             num = num - 400;
    //         }
    //         lessThan100(num, ans);
    // }

    // static void lessThan100(int num, StringBuilder ans){
    //             if(num/10 == 9){
    //                 ans = ans.append("XC");
    //                 num =  num - 90;
    //                 lessThan10(num, ans);
    //                 return;
    //             }
    //             else{
    //                 if(50 > num){
    //                 lessThan50(num, ans);
    //                 return;
    //                 }
    //             ans = ans.append("L");
    //             num = num - 50;
    //             lessThan50(num, ans);
    //         }
    // }

    // static void lessThan50(int num, StringBuilder ans){
    //         if(10 > num){
    //             lessThan10(num, ans);
    //             return;
    //         }
    //         if(num/10 == 4){
    //             ans.append("XL");
    //             num = num - 40;
    //             lessThan10(num, ans);
    //             return;
    //         }
    //         int n2 = num/10;
    //         while(n2 > 0 && n2 < 40){
    //             ans.append("X");
    //             num = num - 10;
    //             n2--;
    //         }
    //         lessThan10(num, ans);
    // }

    // static void lessThan10(int num, StringBuilder ans){
    //             if(num == 9){
    //                 ans = ans.append("IX");
    //                 num = num - 9;
    //             }else{
    //                 if(5 > num){
    //                 lessThan5(num, ans);
    //                 return;
    //                 }
    //                 ans = ans.append("V");
    //                 num = num -5;
    //                 lessThan5(num, ans);
    //             }
    // }
                
    // static void lessThan5(int numb, StringBuilder ans){
    //     if( numb == 4){
    //     ans = ans.append("IV");
    //     numb = numb -4;
    //     return;
    //     }
    //     while(numb > 0){
    //         ans.append("I");
    //         numb = numb - 1;
    //     }
    // }

    // static StringBuilder intToRoman(int num) {
    //     StringBuilder ans = new StringBuilder();
         
    //     if(4000 > num){
    //         if(3000> num){
    //             if(2000 > num){
    //                 if (1000 > num ) {
    //                     lessThan1000(num, ans);
    //                     return ans;
    //                 }
    //                 ans = ans.append("M");
    //                 num = num - 1000;
    //                 lessThan1000(num, ans); 
    //                 return ans;
    //             }
    //             ans = ans.append("MM");
    //             num = num - 2000;
    //             lessThan1000(num, ans); 
    //             return ans;
    //         }
    //         ans = ans.append("MMM");
    //             num = num - 3000;
    //             lessThan1000(num, ans); 
    //             return ans;

    //     }
    //     return ans;
    // }



    static StringBuilder intToRoman(int num){
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        StringBuilder ans = new StringBuilder();
        
        for (int i = 0; i < roman.length; i++) {
              while (num >= values[i] ) {
                  ans = ans.append(roman[i]);
                  num = num - values[i];   
                }
            }
        return ans;
    }

}

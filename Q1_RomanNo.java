//   https://leetcode.com/problems/roman-to-integer/

// Character	Roman Numeral
// I	         1
// V	         5
// X	         10
// L	         50
// C	         100
// D	         500
// M	         1000

class Q1_RomanNo{
     public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(convert(s));
     }

     static int value(char letter){
         
        if(letter == 'i' || letter == 'I') 
            return 1;
        else if (letter == 'v' || letter == 'V') 
            return 5;
        else if (letter == 'x' || letter == 'X') 
            return 10;
        else if (letter == 'l' || letter == 'L') 
            return 50;
        else if (letter == 'c' || letter == 'C') 
            return 100;
        else if (letter == 'd' || letter == 'D') 
            return 500;
        else if (letter == 'm' || letter == 'M') 
            return 1000;
        else
            return -1;
     }

     static int convert( String roman){

         int total = 0;

         for (int i = 0; i < roman.length(); i++) {    // roman.length() // this function gives length of the string "roman"
    
            int l1 = value(roman.charAt(i));
            
            if( i+1 < roman.length()){
                int l2 = value(roman.charAt(i +1));
                if (l1 >= l2) {
                    total += l1;
                }
                else{
                    total -= l1;
                }
            }
            else{
                total += l1;
            }

         }

         return total;
     }
}
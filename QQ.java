
import java.util.Scanner;
class QQ {
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
       // write ur code here
      int n = scn.nextInt();

      for (int i = 0; i < n; i++) {
        int t = scn.nextInt();

        int temp = 0;
        if (t > 1) {
          int p = t/2;
          for (int j = 2; j <= p; j++) {
            if(t%j == 0){
               temp = 1;
               System.out.println("not prime");
               break;
            }
          }
          if (temp == 0 || t == 2){
            System.out.println("prime");
          }
           
        } else {
          System.out.println("not prime");
        }
      }
   }
  }


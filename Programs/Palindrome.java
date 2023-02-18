package Programs;

import java.util.Scanner;
 class Solution2
 {
     public boolean isPalindrome(int x) {
         int temp_num=x;

         int new_num=0;

         while(x>0)
         {
             int r=x%10;
             x/=10;
             new_num=new_num*10+r;
         }

         return temp_num == new_num;
     }
 }

public class Palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.print("Enter Num to be checked:");
        int num=s.nextInt();

        Solution2 S=new Solution2();

        System.out.println(S.isPalindrome(num));
    }
}

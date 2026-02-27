import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
         sc.close();
        
        boolean isPalindrome = true;
        int len = A.length();
        for (int i = 0; i < len / 2; i++) {
            if (A.charAt(i) != A.charAt(len - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        
        System.out.println(isPalindrome ? "Yes" : "No");
    }
}





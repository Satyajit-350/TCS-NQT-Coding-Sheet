package string.pallindrome;

import java.util.Scanner;

public class is_pallindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        boolean ans = isPallindrome(str);

        if(ans){
            System.out.println("The given string is pallindrome");
        }else{
            System.out.println("The given string is not pallindrome");
        }
        
    }

    private static boolean isPallindrome(String str) {

        /**
         * Two pointer approach
         * Time Complexity: O(n)
         */

        if(str.length()==0||str.length()==1){
            return true;
        }
        char[] arr = str.toCharArray();
        int i = 0;
        int j = arr.length-1;
        while(i<=j){
            if(arr[i]!=arr[j]){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
    
}

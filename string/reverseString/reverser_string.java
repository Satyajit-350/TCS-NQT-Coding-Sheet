package string.reverseString;

import java.util.*;

public class reverser_string {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String ans = reverseString(str);

        System.out.println("After reversing: "+ ans);
    }

    private static String reverseString(String str) {

        /**
         * using two pointer approach
         * Time Compexity: O(n)
         */
        char[] arr = str.toCharArray();
        int i=0;
        int j=arr.length-1;

        while(i<j){
            //swap
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        // return new String(arr);
        

        /**
         * using StringBuilder
         * Time compexity: O(n)
         */
        StringBuilder sBuilder = new StringBuilder(str);
        sBuilder.reverse();

        return sBuilder.toString();
    }
}

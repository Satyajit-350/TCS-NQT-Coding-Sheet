package string.findASCII;

import java.util.Scanner;

public class find_ASCII {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        
        /**
         * normal approach
         * Time compexity: O(1)
         */
        int ans = ch;
        System.out.println("ASCII value of "+ch+" is : "+ans);
    }
    
}

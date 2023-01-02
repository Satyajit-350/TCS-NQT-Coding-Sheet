package string.firstAndLastCapitalize;

import java.util.Scanner;

public class capialize_first_and_last_character {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String ans = capitalize(str);
        System.out.println("After capitalizing: "+ans);
    }

    private static String capitalize(String str) {

        /**
         * using StringBuilder
         * Time complexity: O(n)
         */

        if(str==null){
            return str;
        }

        StringBuilder sBuilder = new StringBuilder(str);

        for(int i=0; i<str.length(); i++){
            if(i==0||i==str.length()-1){
                sBuilder.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }else if(str.charAt(i)==' '){
                sBuilder.setCharAt(i-1, Character.toUpperCase(str.charAt(i-1)));
                sBuilder.setCharAt(i+1, Character.toUpperCase(str.charAt(i+1)));
            }
        }

        return sBuilder.toString();
    }
}

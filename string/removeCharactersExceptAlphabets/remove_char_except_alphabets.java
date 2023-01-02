package string.removeCharactersExceptAlphabets;

import java.util.Scanner;

public class remove_char_except_alphabets {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String ans = removeCharactersExceptAlphabets(str);

        System.out.println("After removing: "+ ans);
    }

    private static String removeCharactersExceptAlphabets(String str) {

        /**
         * single loop approach
         * Time complexity: O(n)
         */

        if(str==null){
            return str;
        }
        //you can also use StringBuilder
        String ans = "";
        StringBuilder sBuilder = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if((ch>=65&&ch<=90)||(ch>=97&&ch<=122)){
                ans += ch;
                sBuilder.append(ch);
            }
        }
        return sBuilder.toString();
    }
}

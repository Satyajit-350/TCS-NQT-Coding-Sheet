package string.removeVowels;

import java.util.Scanner;

public class remove_volwels {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String s = removeVowels(str);
        System.out.println("After removing vowels : "+ s);
    }

    private static String removeVowels(String str) {

        /**
         * Single loop approach
         * Time Complexity: O(n)
         */

        if(str.length()==0){
            return str;
        }
        String ans = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'){
                ans += ch;
            }
        }
        return ans;
    }
}

package string.removeSpaces;

import java.util.Scanner;

public class remove_spaces {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String ans = removeSpaces(str);

        System.out.println("After removing spaces: "+ ans);
    }

    private static String removeSpaces(String str) {

        /**
         * using replace function 
         * Time compexity: O(n)
         */

        if(str==null){
            return str;
        }
        str.trim();
        String ans = str.replaceAll(" ", "");
        return ans;
    }
}

package string.removeBrackets;
import java.util.*;

public class remove_brackets {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        /**
         * using replace function
         * Time compexity: O(n) 
         */

        str = str.replace(")", "");
        str = str.replace("(", "");

        System.out.println(str);
    }
}

package string.countVowelsConsonant;

import java.util.*;

public class count_vowels_consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        countVowelsConsonants(str);
    }

    private static void countVowelsConsonants(String str) {

        /**
         * Single loop approach
         * Time complexity: O(n)
         */

        str.toLowerCase();
        int volwelsCount = 0;
        int consonantCount = 0;
        int spaceCount = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                volwelsCount++;
            }else if(ch>='a'&&ch<='z'){
                consonantCount++;
            }else if(ch==' '){
                spaceCount++;
            }
        }
        System.out.println("Vowels="+volwelsCount+" "+"Consonant="+consonantCount+" "+"Space="+ spaceCount);
    }
}

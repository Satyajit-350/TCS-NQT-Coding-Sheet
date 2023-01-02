package string.sumOfNumbers;

import java.util.*;

public class sum_of_numbers {

    /**
     * Multiple consecutive digits are considered one number 
     * ex. 12abc#12    -> sum is = 12+12=24 
     * */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int ans = sumOfNumbers(str);

        System.out.println("Sum of numbers: "+ ans);
    }

    private static int sumOfNumbers(String str) {

        /**
         * Single loop approach
         * Time complexity: O(n)
         */

        int sum = 0;
        String temp = "0";
        for(int i=0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                temp += str.charAt(i);
            }else{
                sum += Integer.parseInt(temp);
                temp = "0";
            }
        }
        return sum+Integer.parseInt(temp);
    }
    
}

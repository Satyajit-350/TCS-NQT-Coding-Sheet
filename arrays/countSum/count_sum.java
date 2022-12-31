package arrays.countSum;

import java.util.*;
import java.util.stream.IntStream;

public class count_sum {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = findSum(arr,n);
        System.out.println("Sum of all the numbers in the array is: "+ ans);

    }

    private static int findSum(int[] arr, int n) {

        /**
         * common approach
         * Time Complexity: O(n)
         */

        //base case
        if(n==1){return arr[0];}

        int sum = 0;

        for(int e: arr){
            sum += e;
        }


        /**
         * using inbuilt funtion
         * Time Compexity: O(n)
         */
        sum = IntStream.of(arr).sum();

        return sum;
    }
    
}

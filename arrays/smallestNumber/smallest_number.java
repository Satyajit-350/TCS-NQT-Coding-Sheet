package arrays.smallestNumber;

import java.util.*;

public class smallest_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = findSmallest(arr,n);
        System.out.println("Smallest number in the array is: "+ ans);
    }
    //function to find the samllest number 
    private static int findSmallest(int[] arr, int n) {
        /**
         * iterative method
         * Time complexity: O(n)
         */
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;

        /**
         * using sorting techinque
         * Time Complexity: O(nlogn)
         */
        // Arrays.sort(arr);
        // return arr[0];
    }
    
}

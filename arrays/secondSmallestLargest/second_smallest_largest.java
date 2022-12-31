package arrays.secondSmallestLargest;

import java.util.*;

public class second_smallest_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        findSecondSmallestLargest(arr,n);
    }

    private static void findSecondSmallestLargest(int[] arr, int n) {

        /**
         * Brute force
         * apprach when array dones't contain any duplicate
         * Time Complelxity: O(nlogn)
         */
        Arrays.sort(arr);
        System.out.println("Largest number: "+ arr[n-2]);
        System.out.println("Smallest number: "+ arr[1]);

        /**
         * apprach when array contains any duplicate
         * Time Complexity: O(n)
         */

         int min = Integer.MAX_VALUE, sec_min = Integer.MAX_VALUE;
         int max = Integer.MIN_VALUE, sec_max = Integer.MIN_VALUE;
         for(int i=0; i<n; i++){
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
         }

         for(int i=0; i<n; i++){
            if(arr[i]<sec_min && arr[i]!=min){
                sec_min = arr[i];
            }
            if(arr[i]>sec_max && arr[i]!=max){
                sec_max = arr[i];
            }
         }
         System.out.println("Second largest: "+ sec_max);
         System.out.println("Second smallest: "+ sec_min);

    }
}

package arrays.rearrangeInIncreasingDec;

import java.util.*;

public class rearrange_inc_dec {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        rearrangeInIncreasingAndDecreasing(arr,n);
    
    }

    private static void rearrangeInIncreasingAndDecreasing(int[] arr, int n) {

        /**
         * best approach
         * Time Complexity: O(nlogn)+O(n/2) -> one for sorting and another one for reversing
         */

        Arrays.sort(arr);
        int lb = 0;
        int ub = n-1;
        int mid = lb+(ub-lb)/2;

        reverse(arr,mid+1,ub);

        for(int e: arr){
            System.out.print(e+" ");
        }
       
    }

    private static void reverse(int[] arr, int lb, int ub) {

        while(lb<ub){
            int temp = arr[lb];
            arr[lb] = arr[ub];
            arr[ub] = temp;

            lb++;
            ub--;
        }

    }
    
}

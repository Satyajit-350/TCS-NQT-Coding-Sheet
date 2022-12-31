package sorting;

import java.util.*;

public class insertion_sort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        insertionSort(arr,n);
        for(int e: arr){
            System.out.print(e+" ");
        }
    }

    private static void insertionSort(int[] arr, int n) {

        /**
         * Time Complexity: O(n^2)
         */

        for(int i=1; i<=n-1; i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0&&arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }

    }
}

package sorting;

import java.util.*;

public class bubble_sort {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr,n);
        for(int e: arr){
            System.out.print(e+" ");
        }
    }

    private static void bubbleSort(int[] arr, int n) {

        /**
         * Time Complexity: O(n^2)
         */

        for(int i=1; i<=n-1; i++){
            for(int j=0; j<=n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

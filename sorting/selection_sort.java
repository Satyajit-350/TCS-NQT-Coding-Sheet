package sorting;

import java.util.*;

public class selection_sort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        selectionSort(arr,n);
        for(int e: arr){
            System.out.print(e+" ");
        }
    }

    private static void selectionSort(int[] arr, int n) {
        /**
         * Time Complexity: O(n^2)
         * 
         */
        for(int i=1; i<=n-1; i++){
            int minPos = minimum(arr,i-1,n-1);
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i-1];
            arr[i-1] = temp;
        }
    }

    private static int minimum(int[] arr, int lb, int ub) {
        int min = arr[lb];
        int pos = lb;
        for(int i=lb+1; i<=ub; i++){
            if(arr[i]<min){
                min = arr[i];
                pos = i;
            }
        }
        return pos;
    }
    
}

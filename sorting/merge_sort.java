package sorting;

import java.util.*;

public class merge_sort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        mergeSort(arr,0,n-1);
        for(int e: arr){
            System.out.print(e+" ");
        }
    }

    private static void mergeSort(int[] arr, int lb,int ub) {

        /**
         * Time Complexity: O(nlogn)
         */

        //base case 
        if(lb<ub){
            int mid = lb+(ub-lb)/2;
            mergeSort(arr, lb, mid);
            mergeSort(arr, mid+1, ub);
            merge(arr,mid,lb,ub);
        }
        
    }

    private static void merge(int[] arr, int mid, int lb, int ub) {
        int n1 = mid-lb+1;
        int n2 = ub-mid;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for(int i=0; i<n1; i++){
            L[i] = arr[lb+i];
        }
        for(int j=0; j<n2; j++){
            R[j] = arr[mid+j+1];
        }
        int i=0;
        int j=0;
        int k=lb;

        while(i<n1&&j<n2){
            if(L[i]<R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
}

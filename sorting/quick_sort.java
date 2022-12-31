package sorting;

import java.util.*;

public class quick_sort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        quickSort(arr,0,n-1);
        for(int e: arr){
            System.out.print(e+" ");
        }
    }

    private static void quickSort(int[] arr, int lb,int ub) {
        if(lb<ub){
            int pivot = partion(arr,lb,ub);
            quickSort(arr, lb, pivot-1);
            quickSort(arr, pivot+1, ub);
        }
    }

    private static int partion(int[] arr, int lb, int ub) {
        int i = lb; 
        int j = ub;
        int pivot = arr[lb];
        while(i<j){
            while(arr[i]<=pivot&&i<j){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,j,lb);
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}

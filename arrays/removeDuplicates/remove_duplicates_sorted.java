package arrays.removeDuplicates;

import java.util.*;

public class remove_duplicates_sorted {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        /*
         * using extra space either using set or arraylist
         * Time Complexity: O(n)
         */
        ArrayList<Integer> ans = removeDuplicates(arr,n);
        for(int e: ans){
            System.out.print(e+" ");
        }
        System.out.println();
        /**
         * without using extra sapce using two pointer method
         * Time complexity: O(n)
         */
        int size = removeDuplicates2(arr, n);
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static int removeDuplicates2(int[] arr, int n) {
        int i = 0;
        for(int j=1; j<n; j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }

    private static ArrayList<Integer> removeDuplicates(int[] arr, int n) {
        ArrayList<Integer> aList = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(!aList.contains(arr[i])){
                aList.add(arr[i]);
            }
        }
        return aList;
    }

    
}

package arrays.checkSubSetOrNot;

import java.util.*;

public class check_subset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int arr1[] = new int[m];
        for(int i=0; i<m; i++){
            arr1[i] = sc.nextInt();
        }
        boolean ans = searchElement(arr,arr1,n,m);
        if(ans){
            System.out.println("Array1 is a subset of Array2");
        }else{
            System.out.println("Array1 is not a subset of Array2");
        }
    }

    private static boolean searchElement(int[] arr1, int[] arr2, int n, int m) {
        /**
         * one approach is by converting two arrays into hashSet and apply the contailsAll() function
         */
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int e: arr1){
            set1.add(e);
        }
        for(int e: arr2){
            set2.add(e);
        }
        return set2.containsAll(set1);

        /**
         * another approach is by using map 
         */
    }
}

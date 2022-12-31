package arrays.median;

import java.util.*;

public class median_of_arrray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        double ans = findMedian(arr,n);
        System.out.println("Median of the array is: "+ ans);
    }

    private static double findMedian(int[] arr, int n) {
       /**
        * for finding median we have to sort the array
        * Time complexity: O(nlogn)
        */
        Arrays.sort(arr);
        //even case
        if(n%2==0){
            //as it is 0 based indexing therefore -1 taken
            return (double)(arr[(n/2+1)-1]+arr[(n/2)-1])/2;
        }else{
            //even case
            return (double)arr[(n/2)-1];
        }
    }
    
}

package arrays.reverseArray;
import java.util.*;

public class reverse_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        reverseArray(arr,n);
    }

    private static void reverseArray(int[] arr, int n) {

        /**
         * using two pointers
         * Time Complexity: O(n)
         */
        int i = 0;
        int j = n-1;
        while(i<j){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }

        for(int k=0; k<n; k++){
            System.out.print(arr[k]+" ");
        }

    }
    
}

package arrays.rotateBy_K_Element;

import java.util.*;

public class rotate_by_k_ele {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotate_by_given_element(arr,n,k);
    }

    private static void rotate_by_given_element(int[] arr, int n, int k) {

        int lb = 0;
        int ub = n-1;
        k = k%n;

        if(n%2==0){
            reverse(arr,lb,ub);
            reverse(arr,lb, k-1);
            reverse(arr,k,ub);
        }else{
            reverse(arr,lb,ub);
            reverse(arr,lb, k);
            reverse(arr,k+1,ub);
        }
        
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

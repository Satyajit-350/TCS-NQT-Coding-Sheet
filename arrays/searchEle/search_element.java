package arrays.searchEle;
import java.util.*;

public class search_element {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int ans = searchElement(arr,n,key);
        System.out.println("The searched element is present at index: "+ans);
    }

    private static int searchElement(int[] arr, int n, int key) {
        /**
         * we iterate each element and return the search element
         * Time complexity : O(n)
         */
        for(int i=0; i<n; i++){
            if(arr[i]==key){
                return i;
            }
        }
        
         /**
          * More optimized way is binary search
          * Make sure you sort the array before applying binary search
          * Time complexity: O(logn)
          */

          Arrays.sort(arr);
          int lb = 0; 
          int  ub = n-1;
          while(lb<=ub){
            int mid = lb+(ub-lb)/2;
            if(key==arr[mid]){
                return mid;
            }else{
                if(key<arr[mid]){
                    ub = mid-1;
                }else{
                    lb = mid+1;
                }
            }
          }

          return -1;

    }
}

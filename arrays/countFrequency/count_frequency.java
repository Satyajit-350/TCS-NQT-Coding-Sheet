package arrays.countFrequency;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class count_frequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        countFrequency(arr,n);
    }

    private static void countFrequency(int[] arr, int n) {

        /**
         * using map
         * Time complexity: O(n)
         */

        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            System.out.println(e.getKey()+"  "+e.getValue());
        }
    }
    
}

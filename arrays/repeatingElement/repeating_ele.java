package arrays.repeatingElement;

import java.util.*;

public class repeating_ele {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        findRepeatingElements(arr,n);

    }

    private static void findRepeatingElements(int[] arr, int n) {
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int e: arr){
            if(map.containsKey(e)){
                map.put(e, map.get(e)+1);
            }else{
                map.put(e, 1);
            }
        }
        //for repating elements
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(e.getValue()>1){
                System.out.print(e.getKey()+" ");
            }
        }
        //for non repating elements
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(e.getValue()==1){
                System.out.print(e.getKey()+" ");
            }
        }
    }
    
}

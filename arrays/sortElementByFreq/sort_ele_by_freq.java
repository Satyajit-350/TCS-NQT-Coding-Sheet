package arrays.sortElementByFreq;

import java.util.*;

public class sort_ele_by_freq {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> res = sortElemetsByFrequency(arr,n);
        for(int e: res){
            System.out.print(e+" ");
        }
    }

    private static ArrayList<Integer> sortElemetsByFrequency(int[] arr, int n) {

        ArrayList<Integer> ans = new ArrayList<>();

        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }

        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            int key = e.getKey();
            for(int i=0; i<e.getValue(); i++){
                ans.add(key);
            }
        }
        return ans;
    }
}

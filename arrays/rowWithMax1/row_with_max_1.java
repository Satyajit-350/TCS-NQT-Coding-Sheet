package arrays.rowWithMax1;

import java.io.*;

public class row_with_max_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputLine;
        inputLine = br.readLine().trim().split(" ");
        int n = Integer.parseInt(inputLine[0]);
        int m = Integer.parseInt(inputLine[1]);
        int[][] arr = new int[n][m];
        inputLine = br.readLine().trim().split(" ");
    
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(inputLine[i * m + j]);
            }
        }
        int ans = rowWithMax1s(arr, n, m);
        System.out.println(ans);
    }

    private static int rowWithMax1s(int[][] arr, int n, int m) {
        /**
         * brute force solution
         * Time Complexity: O(n*m)
         */
        int max = 0;
        int ans = -1;
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<m; j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
            if(count>max){
                ans = i;
                max = count;
            }
        }
        return ans;
    }
}

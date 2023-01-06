package arrays.searchIn2DMatrix;

import java.util.*;

public class search_in_2d_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int mat[][] = new int[n][m];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
                mat[i][j] = sc.nextInt();
        }
        
        int x = sc.nextInt();
        
        System.out.println(matSearch(mat, n, m, x));
    }

    /* https://practice.geeksforgeeks.org/problems/search-in-a-matrix17201720/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=search-in-a-matrix */
    /*https://leetcode.com/problems/search-a-2d-matrix-ii/submissions/683456842/ */

    private static int matSearch(int[][] mat, int N, int M, int X) {

        /**
         * Brute force 
         * Time Comlexity : O(n*m)
         */
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(mat[i][j]==X){
                    return 1;
                }
            }
        }
        
        /**
         * optimal solution
         * Time Complexity: O(nlog(n*m))
         */
        int i = 0;
        int j = M-1;
        
        while(i<N&&j>=0){
            if(mat[i][j]==X){
                return 1;
            }
            if(mat[i][j]>X){
                //go leftwards
                j--;
            }else{
                //go downwards
                i++;
            }
        }
        
        /**
         * more optimal solution using binary search
         * Time Complexity: O(log(n*m))
         * 
         * but condtion is there this method is applied when last elemnentof the row is less than the 1st element of the next row
         * 
         * https://leetcode.com/problems/search-a-2d-matrix/description/
         * 
         */
        
        int lb = 0;
        int ub = (N*M) - 1;
        while(lb<=ub){
            int mid = lb + (ub-lb)/2;
            //find the mid index
            //row
            int x = mid/M;
            //col
            int y = mid%M;
            if(mat[x][y]==X){
                return 1;
            }
            if(mat[x][y]>X){
                ub = mid-1;
            }else{
                lb = mid+1;
            }
        }
        
        return 0;
    }
}

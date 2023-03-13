
import java.util.Arrays;
//https://www.youtube.com/watch?v=K_d8kSbr2mc&ab_channel=ProgrammersZone
//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
//time complexity O(i*(m+n))
//space complexity O(m*n)
import java.util.*;
public class Oddval_matrix {
    public static void main(String[] args) {
        int m = 2,n=3;
        int [][]indices = {{0,1},{1,1}};
        int [][]ans = new int[m][n];
        //this is updating the ans matrix for row that is given for value of row indices
        for(int i=0;i<indices.length;i++){
            for(int j=0;j<n;j++){
                ans[indices[i][0]][j]++;
            }
            // columns indices increment accordingly
            for(int j=0;j<m;j++){
                ans[j][indices[i][1]]++;
            }
        }
        int count = 0;
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                if(ans[i][j]%2!=0)
                    count++;
            }
        }
        System.out.println(count);
    }
}
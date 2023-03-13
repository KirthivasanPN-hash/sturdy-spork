import java.util.*;
public class Transpose_mat {
    public static int[][] transpose(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] res =new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[i][j]=matrix[j][i];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(matrix);
        
    }
}

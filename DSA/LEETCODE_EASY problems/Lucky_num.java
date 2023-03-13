import java.util.*;
public class Lucky_num {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int minInd=0;
            int min = 99999999;
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                    minInd = j;

                }
            }
                boolean flag  = true;
                for(int j=0;j<matrix.length;j++){
                    if(matrix[i][minInd]<matrix[j][minInd]){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    arr.add(matrix[i][minInd]);
                }
            }
            return arr;
        }
        public static void main(String[] args) {
           int [][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
           System.out.println(matrix);
        }
}

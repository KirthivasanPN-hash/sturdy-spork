
import java.util.Arrays;

public class Flipping_image {
    public static void main(String[] args) {
        int [][]arr = {{1,1,0},{1,0,1},{0,0,0}};

        for(int i=0;i< arr.length;i++) {
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
               int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]==1)
                    arr[i][j]=0;
                else arr[i][j]=1;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }

}



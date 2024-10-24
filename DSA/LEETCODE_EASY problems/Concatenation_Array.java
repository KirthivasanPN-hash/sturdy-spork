
    
//https://leetcode.com/problems/concatenation-of-array/
//silly mistake assign variables from
import java.util.Arrays;

public class Concatenation_Array {
    public static void main(String[] args) {
        int []nums = {1,2,1};
        int n = nums.length;
        int tot = 2*n;
        int []arr = new int[tot];
        for(int i=0;i<n;i++){
            arr[i] = nums[i];
            arr[i+n]  = nums[i];
        }
        System.out.println(Arrays.toString(arr));
    }

}


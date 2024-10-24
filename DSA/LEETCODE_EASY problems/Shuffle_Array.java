import java.util.Arrays;

public class Shuffle_Array {
    public static void main(String[] args) {
        int []nums = {2,5,1,3,4,7};
        int n = 3;
        int ans[] = new int[2*n];
        int count = 0;
        for(int i=0;i<n;i++){
            ans[count] = nums[i];
            ans[count+1] = nums[n+i];
            count+=2;
        }
        System.out.println(Arrays.toString(ans));
    }

}


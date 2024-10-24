import java.util.Arrays;

import javax.lang.model.util.ElementScanner14;

public class two_sum_sorted {
    public static void main(String[] args) {
        int numbers[] = {2,7,11,15};
        int target = 9;
        int p1 = 0;
        int p2 = numbers.length-1;
    //    int sum = 0;
        int ans[] = new int[2];
        while(p1<p2){
            int sum = numbers[p1]+numbers[p2];
            if(sum==target){
                ans[0] = p1+1;
                ans[1] = p2+1;
                break;
            }
            else if(sum>target){
            p2--;
            }
            else{
                p1++;
            }
            
        }
        System.out.println(Arrays.toString(ans));
    }
}

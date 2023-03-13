import java.util.*;
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class SmallerNumbers {
    public static void main(String[] args) {
        
    
    int []nums = {8,1,2,2,3};
    int ans[] = new int[nums.length];
    int i,j;
    int count = 0;
    for(i=0;i<nums.length;i++){
        
        for(j=0;j<nums.length;j++){
            
        if(nums[i]>nums[j]){
            count++;
        }
    }
    ans[i] = count;
    count=0;
}
    System.out.println(Arrays.toString(ans));
}
}
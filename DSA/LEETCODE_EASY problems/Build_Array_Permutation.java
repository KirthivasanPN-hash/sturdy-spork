//https://leetcode.com/problems/build-array-from-permutation/
//Easy approach answer given in question itself

import java.util.Arrays;

public class Build_Array_Permutation {
    public static void main(String[] args) {
        int []nums = {0,2,1,5,3,4};
        int []arr = new int[nums.length];
        for(int i=0;i<arr.length;i++){
            arr[i] = nums[nums[i]];
        }
        System.out.println(Arrays.toString(arr));
        }

        }
    

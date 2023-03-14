package LEETCODE_ARRAYZ_MED;
import java.util.*;

public class First_lastpos {
    public static void main(String[] args) {
        int []nums = {5,7,7,8,8,10};
        int[] ans = { -1, -1 };
        int target = 8;
        boolean FindFirst = true;
        int s = search(nums, target,true);
        int e = search(nums, target, false);
        ans[0] = s;
        ans[1] = e;
        System.out.println(Arrays.toString(ans));
        //return ans;

    }

    public static int search (int []nums, int target, boolean FindFirst) {
        int s = 0;
        int e = nums.length - 1;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] < target)
                s = mid + 1;
            else if (nums[mid] > target)
                e = mid - 1;
            else {
                ans = mid;
                if (FindFirst == true)
                    e = mid - 1;
                else
                    s = mid + 1;
            }

        }
        return ans;
      
    }
}
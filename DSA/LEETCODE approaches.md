Arrays easy LEETCODE

1. 

2. Concatenation of Array

code:

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int ans[] = new int[2*n];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}




3. Running Sum of 1d Array

Code: 

class Solution {

    public int[] runningSum(int[] nums) {

        for(int i=1;i<nums.length;i++){

            nums[i]+=nums[i-1];

        }        

        return nums;

    }

}


4. Richest Customer Wealth

Code:

class Solution {
    public int maximumWealth(int[][] accounts) {
       // int row_wealth  = accounts.length;
       // int col_wealth = accounts[0].length;
        int max=0,sum;
        for(int i=0;i<accounts.length;i++){
            sum=0;
            for(int j=0;j<accounts[0].length;j++){
                sum+=accounts[i][j];
            }
                if(sum>max)
                max = sum;
            }
        
        return max;
    }
}

5. Shuffle the array

code:

}class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[2*n];
        int count = 0;
        for(int i=0;i<n;i++){
            ans[count] = nums[i];
            ans[count+1] = nums[n+i];
            count+=2;
        }
        return ans;
    }
}

6. Kids With the Greatest Number of Candies

code:

 class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int c : candies) max = Math.max(c, max);
        List<Boolean> output = new ArrayList(candies.length);
        for(int c : candies) output.add(c + extraCandies >= max);
        return output;
    }
}

7. Number of good pairs

code:

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j])
                {
                    count++;
                }
            }
        }
        return count;
    }
}

8. How many numbers are small than the current number

code:

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
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
    return ans;
}
}


9. Create a target array 

code:

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        
        for(int i = 0; i < index.length; i++){
            int ind = index[i];
            
            if(ind < i){
                int j = i;
                while(j > ind){
                    target[j] = target[j - 1]; 
                    target[j - 1] = nums[i];
                    j--;
                }
            }
            else{
                 target[i] = nums[ind];
            }
            
        }
        return target;
    }
}


10. Check if a sentence is pangram

code:

class Solution {
    public boolean checkIfPangram(String sentence) {
        
        for (int i = 0; i < 26; ++i) {
            char currChar = (char)('a' + i);
            if (sentence.indexOf(currChar) == -1)
                return false;
        }
        return true;
    }
}

11. Count Item Matching a Rule

code:

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int res = 0;
        
        for(int i = 0 ;i<items.size();i++){
            if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) res++;
            if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) res++;
            if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) res++;
        }
        
        return res;
        
    }
}

12. didnt understand


13. Flipping an Image

code:

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        for(int i=0;i<image.length;i++){
           reverse(image[i]);
           invert(image[i]);
        }
        // Either can use the for loop to invert the array individually or can use in single for loop
        // for(int i=0;i<image.length;i++){
        //    invert(image[i]);
        // }
        return image;
        
    }
    
    static void reverse(int []image){
        int s=0;
        int e=image.length-1;
        
        while(s<e){
            int temp=image[s];
            image[s] = image[e];
            image[e] = temp;
            s++;
            e--;
        }
    }
    
    static void invert(int []arr){
           for(int i=0;i<arr.length;i++){
               if(arr[i]==0){
                   arr[i]=1;
               }
               else{
                   arr[i]=0;
               }
           }
    }
}

14. should check 

15. Matrix Diagonal Sum

code:

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
		int n=mat.length;
        for(int i=0;i<n;i++){
            sum+=mat[i][i]+mat[i][n-i-1];
        }
        if(mat.length%2 != 0){
            sum-=mat[n/2][n/2];// if matrix is odd the middle number added two times,so we deduct the middle number
        }
        return sum;
    }
}

16. https://leetcode.com/problems/find-numbers-with-even-number-of-digits/ 
 

(my approach) 
 class Solution {
    public int findNumbers(int[] nums) {
        int count=0,sum;
        for(int i=0;i<nums.length;i++){
            sum=0;
            int n = 0;
            while(nums[i]!=0){
             sum = nums[i]+sum;
            n = nums[i]/10;
            if(sum%2==0){
                count++;
            }
            }
        }
        return count;
    }
}

(solution)
class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((int)((Math.log10(nums[i])) + 1) % 2 == 0) result++;
        }
        return result;
    }
}

17. Transpose Matrix 
class Solution {
    public int[][] transpose(int[][] matrix) {
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
}


## Diff Approach
  StringBuilder builder = new StringBuilder();
  for (int num : intArrs) {
   builder.append(num);
  }
  int number = Integer.parseInt(builder.toString());



18.  Add to Array form List problem
public List<Integer> addToArrayForm(int[] num, int K) {
    List<Integer> res = new LinkedList<>();
    for (int i = num.length - 1; i >= 0; --i) {
        res.add(0, (num[i] + K) % 10);
        K = (num[i] + K) / 10;
    }
    while (K > 0) {
        res.add(0, K % 10);
        K /= 10;
    }
    return res;
}

19. Maximum population 2d array (2d array prob)

20. Determine Whether Matrix Can Be Obtained By Rotation (2d array prob)

21. Two sum problem
 
## Brute force code

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}

## Optimized code
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numToIndex.containsKey(target - nums[i])) {
                return new int[] {numToIndex.get(target - nums[i]), i};
            }
            numToIndex.put(nums[i], i);
        }
        return new int[] {};
    }
}


Medium 

Sort Colors

class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length-1;

        while(mid <= high){
            if(nums[mid] == 0 ){
                //swap with left
                swap(nums,low, mid );
                low++;
                mid++;
            }else if(nums[mid] == 2){
                swap(nums, mid, high);
                high--;
            }else{
                mid++;
            }
        }
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
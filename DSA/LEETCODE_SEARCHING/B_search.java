public class B_search {
        public static void main(String[] args) {
            int[] arr = {11, 100, 123, 456, 789, 15678, 4567123};
            int target = 789;
            int ans = search(arr, target);
            System.out.println(ans);
    
        }
    
        static int search(int[] arr, int target) {
            int start = 0, mid;
            int end = arr.length - 1;
            boolean isAsc = arr[start] < arr[end];
    
            while (start <= end) {
                mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    return mid;
                }
                if (isAsc == true) {
                    if (target < arr[mid])
                        end = mid - 1;
                    else {
                        start = mid + 1;
                    }
                } else {
                    if (target > arr[mid])
                        end = mid - 1;
                    else {
                        start = mid + 1;
                    }
                }
    
            }
            return -1;
        }
    }
    

    class Solution {
        public char nextGreatestLetter(char[] letters, char target) {
            
            int ans[] = new int[letter.length];
            for(int j=0;j<ans.length;j++){
                ans[j] = (int)(letters.charAt[j]-'0');
            }
            int i =0;
            int l = ans.length-1;
            while(i<l){
                mid = i+(l-i)/2;
                if[mid==target]
                return mid;
                else if(mid<target)
                i = mid+1;
                else
                l = mid-1;
            }
            return -1;
        }
    }
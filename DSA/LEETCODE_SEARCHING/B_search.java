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
    


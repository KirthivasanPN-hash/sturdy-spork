
    public class linear_Search {
        public static void main(String[] args) {
            int []nums = {6,78,90,123,45};
            int target = 321;
            int ans = search(nums, target);
            System.out.println(ans);
    
        }
        static int search(int []arr,int target){
            if(arr.length==0)
                return -1;
    
            for(int index=0; index< arr.length;index++){ //enhanced for loop also can be done
                if(arr[index]==target)
                    return index;
            }
            return 0;
        }
    }


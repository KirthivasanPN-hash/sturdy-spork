''''
know: (spoting indices)
def find_indices(lst, value):
    return list(filter(lambda i: lst[i] == value, range(len(lst))))

my_list = [1, 2, 3, 2, 4, 2]
indices = find_indices(my_list, 2)
print(indices)

my_array = np.array([1, 2, 3, 2, 4, 2])
indices = np.where(my_array == 2)[0]
print(indices)
'''

### this code fails sorting and checking
class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        nums.sort()
        
        left, right = 0, len(nums)-1
        sum = 0
        
        while left<right:
            
            sum = nums[left]+nums[right]

            if sum == target:
                return [left, right]
            elif sum<target:
                left+=1
            else:
                right-=1
            
        return 0
    

TC: O(n^2)

for i in range(len(nums)):
    for j in range(i+1, len(nums)):
        if (i!=j and nums[i]+nums[j]== target):
            return [i,j]
return []




TC:  O(n)

def twoSum(self, nums: List[int], target: int) -> List[int]:
    hash_sum = {}

    for i, num in enumerate(nums): # enumerate
        if target - num in hash_sum:
            return [i, hash_sum[target - num]]
        hash_sum[num] = i

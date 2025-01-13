

'''
1. What is efficient approach hashmap use that takes O(n)
2.  Approach 2: using set O(n)
3. Using sorting
'''


def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        res = {}

        for num in nums:
            res[num] = res.get(num, 0)+1 # storing in hashmap

        for n in nums:
            if res[n] > 1: # check the count
                return True
            else:
                return False




def containsDuplicate(self, nums):
     return len(nums) != len(set(nums)) # set operation


def has_duplicates(nums):
    nums.sort()
    for i in range(1, len(nums)):
        if nums[i] == nums[i-1]:
            return True
    return False


def has_duplicates(nums):
    nums.sort()
    left, right = 0, 1
    while right < len(nums):
        if nums[left] == nums[right]:
            return True
        left += 1
        right += 1
    return False


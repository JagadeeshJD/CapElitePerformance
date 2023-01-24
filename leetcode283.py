#283.Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
#Note that you must do this in-place without making a copy of the array.

#solution

class Solution(object):
    def moveZeroes(self, nums):
        for i in nums:
            if(i==0):
                nums.remove(i)
                nums.append(0)
        return nums

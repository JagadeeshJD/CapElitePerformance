#189.Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

class Solution:
    def rotate(self, nums: List[int], k: int) -> None:

        for x in range(k): nums.insert(0, nums[-1]), nums.pop(-1)

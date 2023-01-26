//976.Given an integer array nums, return the largest perimeter of a triangle with a non-zero area, formed from three of these lengths. 
//If it is impossible to form any triangle of a non-zero area, return 0.

//rule to be triangle is that sum of any two sides should be greater than the 3rd side.

class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int perimeter=0;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]+nums[i+1]>nums[i+2] && nums[i]+nums[i+1]+nums[i+2]>perimeter){
                 perimeter=nums[i]+nums[i+1]+nums[i+2];
            }
        }
        return perimeter;
    }
}

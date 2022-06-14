// https://leetcode.com/problems/number-of-ways-to-split-array/

// Using Prefix Sum

class Solution {
    public int waysToSplitArray(int[] nums) {
        long leftSum = 0;
        long rightSum = 0;
        for(int i:nums){
            rightSum+=i;
        }
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            rightSum-=nums[i];
            leftSum+=nums[i];
            if(leftSum >= rightSum){
                count++;
            }
            
        }
        return count;
    }
}

// https://leetcode.com/problems/132-pattern/

class Solution {
    public boolean find132pattern(int[] nums) { 
         int stackIdx = nums.length;
         int num = Integer.MIN_VALUE;
         for(int idx = nums.length-1;idx>=0;idx--){
             if(nums[idx]<num) return true;
              while(stackIdx<nums.length&&nums[idx]>nums[stackIdx]){
                 num = nums[stackIdx];
                 stackIdx++;
             }
             stackIdx--;
             nums[stackIdx] = nums[idx];
         }
        return false;
    }
}

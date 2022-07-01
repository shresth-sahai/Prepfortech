// https://leetcode.com/problems/running-sum-of-1d-array/

Method  - 1 :
class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
        }
        return nums;
    }
}


Method - 2 : 
class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
            ans[i]=total;
        }
        return ans;
    }
}

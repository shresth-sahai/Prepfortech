// https://leetcode.com/problems/minimum-size-subarray-sum/


class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int start = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++) {
            sum = sum + nums[i];
            
            while(sum >= target) {
                if((i - start+1) < min) min = (i-start+1);
                sum = sum - nums[start];
                start++;
                
            }
        }

        if(min == Integer.MAX_VALUE) return 0;
        return min;
    }
}

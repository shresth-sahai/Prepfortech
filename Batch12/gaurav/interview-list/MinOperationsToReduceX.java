// https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/


class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        if(nums[0] > x && nums[n-1] > x) return -1;
        int targetSum = Arrays.stream(nums).sum() - x;
        
        int start = 0;
        int sum = 0;
        int end = 0;
        int max = Integer.MIN_VALUE;
        while(end < n) {
            sum += nums[end];
            
            while(sum >= targetSum && start<=end) {
                int windowSize = end-start+1;
                if(sum == targetSum && max < windowSize) max = windowSize;
                sum -= nums[start];
                start++;
            }

            int windowSize = end-start+1;
            if(sum == targetSum && max < windowSize) max = windowSize;
            end++;
        }
        if(max == Integer.MIN_VALUE) return -1;
        return n-max;
    }
}

// https://leetcode.com/problems/maximum-sum-of-two-non-overlapping-subarrays/


class Solution {
    public int maxOfFirstSecond(int[] nums, int firstLen, int secondLen) {
        int[] pmaxfirst = new int[nums.length];
        int[] smaxsecond = new int[nums.length];
        
        int sum = 0;
        for(int i=0; i<nums.length; i++) {
            if(i < firstLen) {
                sum +=  nums[i];
                pmaxfirst[i] = sum;
            } else {
                sum = sum + nums[i] - nums[i-firstLen];
	            pmaxfirst[i] = Math.max(sum, pmaxfirst[i-1]);
            }
        }

        int ssum = 0;
        for( int i = nums.length-1; i>=0; i--) {
            if( i >= nums.length - secondLen ) {
                ssum = ssum + nums[i];
                smaxsecond[i] = ssum;
            } else {
                ssum = ssum + nums[i] - nums[i+secondLen];
                smaxsecond[i] = Math.max(ssum, smaxsecond[i+1]);
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i=firstLen-1; i<pmaxfirst.length-1; i++) {
            int currentSum = pmaxfirst[i] + smaxsecond[i+1];
            if(currentSum > max) max = currentSum;
        }

        return max;
   }
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        return Math.max( maxOfFirstSecond(nums, firstLen, secondLen), maxOfFirstSecond(nums, secondLen, firstLen) );
    }
}


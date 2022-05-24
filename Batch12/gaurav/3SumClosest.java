// https://leetcode.com/problems/3sum-closest/


class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++) {
            int low = i+1;
            int high = nums.length-1;
            if(i >0 && nums[i] == nums[i-1]) continue;
            
            while(low < high) {
                int currentSum = nums[i] + nums[low] + nums[high];
                int currentMin = Math.abs(target - currentSum); // -103

                if(currentSum == target) return currentSum;

                if(currentMin < min) {
                    min = currentMin; //-102
                    sum = currentSum; // 2
                }

                int innerSum = nums[low] + nums[high];
                int complementTarget = target - nums[i];
                if(innerSum > complementTarget) {
                    high--;
                } else {
                    low++;
                }
            }
        }

        return sum;
    }
}

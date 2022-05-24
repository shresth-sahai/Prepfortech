// https://leetcode.com/problems/subarray-sum-equals-k/


class Solution {
    
    
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        
        int currentSum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            currentSum = currentSum + nums[i];
            System.out.println(currentSum);
            if(currentSum == k) {
                count++;
            };
            int earlierSum = currentSum-k;
            if(hm.get(earlierSum) != null) {
                count = count + hm.get(earlierSum);
            }
            
            hm.put(currentSum, hm.getOrDefault(currentSum, 0)+1);
            
        }

        return count;
    }
}

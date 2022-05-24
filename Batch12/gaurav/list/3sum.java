// https://leetcode.com/problems/3sum/

class Solution {
    
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> s = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++) {
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int low = i+1;
            int high = nums.length-1;
            while(low < high) {
                int complementSum = (nums[low] + nums[high]) * -1;
                if(complementSum == nums[i]) {
                    List<Integer> currentRes = Arrays.asList(nums[i], nums[low], nums[high]);
                    Collections.sort(currentRes);
                    s.add(currentRes);
                    low++;
                    high--;
                } else if (Math.abs(complementSum) < Math.abs(nums[i])) {
                    low++;    
                } else {
                    high--;
                }
            }
        }

        for(List<Integer> e : s) {
            list.add(e);
        }
        
        return list;
    }
}

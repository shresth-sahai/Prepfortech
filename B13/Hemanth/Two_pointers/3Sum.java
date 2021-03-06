//  https://leetcode.com/problems/3sum/

// Sort the array, Iterate through the list and apply two pointers

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0){
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]) j++;  // to remove duplicate lists
                    while(j<k && nums[k]==nums[k+1]) k--;
                }
                else if(sum>0){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return ans;
    }
}

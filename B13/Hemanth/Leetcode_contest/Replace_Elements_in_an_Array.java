// https://leetcode.com/problems/replace-elements-in-an-array/

// Uisng HashMaps

class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) map.put(nums[i],i);
        for(var i:operations){
            nums[map.get(i[0])]= i[1];            
            map.put(i[1],map.get(i[0]));      
        }
        return nums;
    }
}

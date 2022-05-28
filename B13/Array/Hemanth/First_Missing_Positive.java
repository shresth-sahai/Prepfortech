// https://binarysearch.com/problems/First-Missing-Positive

import java.util.*;

class Solution {
    public int solve(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], nums[i]);
        }
        int i;
        for (i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                return i;
            }
        }
        return i;
    }
}

// TC : O(n)
// SC : o(n)

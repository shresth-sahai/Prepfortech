// https://leetcode.com/problems/single-number/

// Method -1 : Using HashMaps

public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Integer i:nums){
        if(map.get(i)==1){
            return i;
        }
        }
        return 0;
    }

// TC : O(n)
// SC : O(n)

// Method -2 : Using XOR

public int singleNumber(int[] nums) {
        int ans = nums[0];
        for(int i=1;i<nums.length;i++){
            ans ^= nums[i];
        }
        return ans;
    }

// TC : O(N)
// SC : O(1)

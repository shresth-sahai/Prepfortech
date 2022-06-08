// https://leetcode.com/problems/next-greater-element-i/

Method -1 :

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        int flag=0,max=0;
        for(int i=0;i<nums1.length;i++){
            flag = 0;
            max = 0;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    flag=1;
                }
                else if(flag==1 && nums2[j]> nums1[i]){
                    max = nums2[j];
                    break;
                }
            }
            result[i] = max!=0 ? max:-1;
        }
        return result;
    }
}

// TC : O(n^2)
// SC : O(n)

Method - 2 : Using Stack

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int num:nums2){
            while(!st.isEmpty() && num > st.peek()){
                map.put(st.pop(),num);
            }
            st.push(num);
        }
        int i=0;
        int[] ans = new int[nums1.length];
        for(int num:nums1){
            ans[i++]=map.getOrDefault(num,-1);
        }
        return ans;
    }
}

//Brute Force

class Solution {
    public int[] sortedSquares(int[] nums) {
        int j=0;
        for(int i:nums){
            nums[j]=i*i;
            j++;
        }
        Arrays.sort(nums);
        return nums;
    }
}

//TC : O(n^2)
//SP :O(1)


// Two Pointers
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] b = new int[nums.length];
        int l=0,h=nums.length-1,k=nums.length-1;
        while(l<=h){
            if(Math.abs(nums[l])>Math.abs(nums[h])){
                b[k]=nums[l]*nums[l];
                k--;
                l++;
            }else{
                b[k]=nums[h]*nums[h];
                k--;
                h--;
            }
        }
        return b;
    }
}

//Time Complexity : O(n)
//Space Complexity : O(n)

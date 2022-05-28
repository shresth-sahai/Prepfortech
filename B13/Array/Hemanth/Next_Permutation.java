//Intuition :
//1. Finding first decreasing element from right to left.
//2. Finding number just larger than the number found in previous step.
//3. Swap those numbers.
//4. Reverse all the elements from the index found in the first step. 

class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length<=1 || nums==null){
            return;
        }
        int i = nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        
        if(i>=0){
            int j = nums.length-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length-1);
    }
    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
    public void reverse(int[] nums,int i,int j){
        while(i<j){
            swap(nums,i++,j--);
        }
    }
}

//Time Complexity : O(n)
//Space Complexity : O(n)

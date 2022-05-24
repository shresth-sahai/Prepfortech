// https://leetcode.com/problems/find-peak-element/submissions/
class Solution {

    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        
        while( start <= end ) {
            int mid = (start  + end ) / 2;
            
            System.out.println(mid);
            if( (mid == 0 || nums[mid - 1] < nums[mid]) && (mid == n-1 || nums[mid+1] < nums[mid])) {
                return mid;
            }

            if(nums[mid] < nums[mid+1]) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        
        return -1;
    }  
}

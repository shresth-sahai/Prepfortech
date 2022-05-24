// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/


// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

class Solution {
    private static int findFirst(int[] arr1, int target, int start) {
        if (start > arr1.length - 1) return -1;
        if (arr1[start] == target) return start;
        return findFirst(arr1, target, ++start);
    }

    private static int findLast(int[] arr1, int target, int end) {
        if (end < 0) return -1;
        if (arr1[end] == target) return end;
        return findLast(arr1, target, --end);
    }
    
    public int[] searchRange(int[] nums, int target) {
        return new int[]{
                findFirst(nums, target, 0),
                findLast(nums, target, nums.length - 1)
        };
    }
}

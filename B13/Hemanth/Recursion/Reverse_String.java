// https://leetcode.com/problems/reverse-string/

class Solution {
    public void rev(char[] s,int left, int right){
        if(left>=right) return;
        char temp = s[left];
        s[left]=s[right];
        s[right]=temp;
        left++;
        right--;
        rev(s,left,right);
    }
    
    public void reverseString(char[] s) {
        rev(s,0,s.length-1);
    }
}

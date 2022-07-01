// https://leetcode.com/problems/palindrome-number/

class Solution {
    public int isPal(int x,int result){
        if(x==0){
            return result;
        }
        result = result*10+x%10;
        return isPal(x/10,result);
    }
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int ans = isPal(x,0);
        if(ans==x){
            return true;
        }
        return false;
    }
}

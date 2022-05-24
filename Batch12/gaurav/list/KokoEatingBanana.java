// https://leetcode.com/problems/koko-eating-bananas/

class Solution {

    public boolean isValidSpeed(int speed, int[] piles, int hr) {
        int hrs = 0;
        for(int i=0; i<piles.length; i++) {
            hrs += (piles[i]+speed-1)/speed;
        }    
        
        return hrs <= hr;
    }
    
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = Integer.MAX_VALUE-1;
        
        while(start < end) {
            int mid = (start+end) / 2;
            boolean isValid = isValidSpeed(mid, piles, h);
            if(isValid) {
                end = mid;
            }else {
                start = mid+1;
            }
        }
        
        return end;
    }
}

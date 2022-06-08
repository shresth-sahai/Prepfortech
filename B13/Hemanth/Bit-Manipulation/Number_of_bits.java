// https://binarysearch.com/problems/Number-of-Bits

import java.util.*;

class Solution {
    public int solve(int n) {
        int count=0;
        while(n>0){
            count += (n&1);
            n>>=1;
            
        }
        return count;
    }
}

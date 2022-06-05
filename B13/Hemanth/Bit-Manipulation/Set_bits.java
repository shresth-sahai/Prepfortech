// https://binarysearch.com/problems/Set-Bits

import java.util.*;

class Solution {
    public int solve(int n) {
        int count = 0;
        for(int i=1;i<=n;i++){
            count+=Integer.bitCount(i);
        }
        return count;
    }
}

import java.util.*;

class Solution {
    public int solve(int n) {
        int count = 0;
        for(int i=1;i<=n;i++){
            count+=cool(i);
        }
        return count;
    }
    public int cool(int num){
        int count1 = 0;
        while(num>0){
            count1+=(num&1);
            num>>=1;
        }
        return count1;
    }
}

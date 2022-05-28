//https://binarysearch.com/problems/Anagram-Checks

Method - 1 : 

1. Convert strings into character arrays.
2. Sort the character arrays.
3. Compare the character arrays.
  
import java.util.*;

class Solution {
    public boolean solve(String s0, String s1) {
        char[] arr1 = s0.toCharArray();
        char[] arr2 = s1.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean flag = true;
        if(arr1.length!=arr2.length){
            return false;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                flag = false;
            }
        }
        return flag;
    }
}

// Time Complexity : O(n logn)
// Space Coplexity : O(n)

// Method - 2: Using HashMaps

import java.util.*;

class Solution {
    public boolean solve(String s0, String s1) {
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();

        for(Character ch : s0.toCharArray()){
            if(map1.containsKey(ch)){
                map1.put(ch, map1.get(ch)+1);
            }else{
                map1.put(ch,1);
            }
        }

        for(Character ch : s1.toCharArray()){
            if(map2.containsKey(ch)){
                map2.put(ch, map2.get(ch)+1);
            }else{
                map2.put(ch,1);
            }
        }
        if(map1.equals(map2)){
            return true;
        }
        return false;
    }
}

// Time Complexity : O(n);
// Space Complexity : O(n);

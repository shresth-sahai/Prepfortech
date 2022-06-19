//https://binarysearch.com/problems/Noisy-Palindrome


import java.util.*;

class Solution {
    public boolean solve(String s) {
        String ans="";
        for(char ch:s.toCharArray()){
            if(Character.isLowerCase(ch)){
                ans+=ch;
            }
        }
        return palin(ans);
    }

    public boolean palin(String str){
        for(int i=0;i<str.length();i++){
            char a = str.charAt(i);
            char b = str.charAt(str.length()-i-1);
            if(a!=b){
                return false;
            }
        }
        return true;
    }
}


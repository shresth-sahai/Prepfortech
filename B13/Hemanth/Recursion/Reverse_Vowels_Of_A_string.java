// https://leetcode.com/problems/reverse-vowels-of-a-string/

class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        char[] str = s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while(left<right){
            while(left<right && !vowels.contains(str[left]+"")){
                left++;
            }
            while(left<right && !vowels.contains(str[right]+"")){
                right--;
            }
            char temp = str[left];
            str[left]=str[right];
            str[right]=temp;
            left++;
            right--;
            
        }
        return String.valueOf(str);
    }
}

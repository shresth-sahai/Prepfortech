// https://leetcode.com/problems/percentage-of-letter-in-string/

// Method - 1 :

class Solution {
    public int percentageLetter(String s, char letter) {
        int count = 0;
        for(Character ch:s.toCharArray()){
            if(ch == letter){
                count++;
            }
        }
        int ans = count*100/s.length();
        return ans;
    }
}

// Method - 2 : Using HashMaps

class Solution {
    public int percentageLetter(String s, char letter) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(Character ch : s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        return map.getOrDefault(letter,0)*100/s.length();
    }
}

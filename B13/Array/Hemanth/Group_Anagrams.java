// https://leetcode.com/problems/group-anagrams/

// Use HashMaps -  sort the strings and store the equal string in a List 

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<String,List<String>>();
        for(String st:strs){
            char[] ch = st.toCharArray();
            Arrays.sort(ch);
            String keyStr = String.valueOf(ch);
            if(!map.containsKey(keyStr)){
                map.put(keyStr,new ArrayList<>());
            }
            map.get(keyStr).add(st);
        }
        return new ArrayList<>(map.values());
    }
}

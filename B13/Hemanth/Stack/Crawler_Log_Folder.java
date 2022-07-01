// https://leetcode.com/problems/crawler-log-folder/

class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st = new Stack<>();
        for(String str:logs){
            if(!st.isEmpty() && str.equals("../")){
                st.pop();
            }
            else if(str.equals("./")){
                continue;
            }else if(!str.equals("../")){
                st.push(str);
            }
        }
        return st.size();
    }
}

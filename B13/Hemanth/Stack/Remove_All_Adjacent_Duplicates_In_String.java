// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/


// Stack, StringBuilder, Reverse

class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        char[] ch = s.toCharArray();
        st.push(ch[0]);
        for(int i=1;i<s.length();i++){
            if(!st.empty() && st.peek()==ch[i]){
                st.pop();
            }else{
                st.push(ch[i]);
            }
        }
        StringBuilder str=new StringBuilder("");
        while(!st.isEmpty()){
            str.append(st.peek());
            st.pop();
        }
        return str.reverse().toString();
    }
}

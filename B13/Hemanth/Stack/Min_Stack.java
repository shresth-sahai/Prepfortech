// https://leetcode.com/problems/min-stack/

class MinStack {
    
    Stack<Integer> st = new Stack<>();
    
    public MinStack() {
        
    }
    
    public void push(int val) {
        st.push(val);
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i:st){
            if(i<min){
                min=i;
            }
        }
        return min;
    }
}

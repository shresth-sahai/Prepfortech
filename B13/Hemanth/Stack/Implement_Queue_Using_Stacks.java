// https://leetcode.com/problems/implement-queue-using-stacks/

//Using 2 Stacks 

class MyQueue {
    
    Stack<Integer> s1 = new Stack();
    Stack<Integer> s2 = new Stack();
 
    public void push(int x) {
      while (!s2.isEmpty())
        s1.push(s2.pop());
      s1.push(x);
    }
    public void pop() {
      while (!s1.isEmpty())
        s2.push(s1.pop());
      s2.pop();
    }

    public int peek() {
      while (!s1.isEmpty())
        s2.push(s1.pop());  
      return s2.peek();
    }
  
    public boolean empty() {
      return s1.isEmpty() && s2.isEmpty();
    }

  }

//Using Single Stack

class MyQueue {
    Stack<Integer> st = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        st.add(0,x);
    }
    
    public int pop() {
        return st.pop();
    }
    
    public int peek() {
        return st.peek();
    }
    
    public boolean empty() {
        return st.isEmpty();
    }
}

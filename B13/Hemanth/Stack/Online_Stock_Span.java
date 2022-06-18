// https://leetcode.com/problems/online-stock-span/


//Method - 1
class StockSpanner {
    Stack<int[]> st = new Stack<>();
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int count=0;
        while(!st.isEmpty() && price>=st.peek()[0]){
            count+=st.pop()[1];
        }
        count++;
        st.push(new int[]{price,count});
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */

// Method - 2:
class StockSpanner {
    List<Integer> list = new ArrayList<>();
    Stack<Integer> st = new Stack<>();
    int index=-1;
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        index++;
        list.add(price);
        int result=1;
        while(!st.isEmpty() && price >= list.get(st.peek())){
            st.pop();
        }
        if(st.isEmpty()){
            result = index + 1;
            
        }else{
            result = index - st.peek();
        }
        st.push(index);
        return result;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */

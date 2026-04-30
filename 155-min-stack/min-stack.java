class MinStack {
    Stack<Integer> stk;
     Stack<Integer> Minstk; 

    public MinStack() {
        stk = new Stack<>();
        Minstk = new Stack<>(); 

        
    }
    
    public void push(int val) {
        if(Minstk.isEmpty() || val <= Minstk.peek()) 
               Minstk.push(val);
        stk.push(val); 
        
    }
    
    public void pop() {
        if(!Minstk.isEmpty() && stk.peek().equals(Minstk.peek())) 
            Minstk.pop(); 
        stk.pop(); 
        
    }
    
    public int top() {
        return stk.peek(); 
    }
    
    public int getMin() {
        return Minstk.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
public class MinStack {

    Stack<Integer> s1;
    Stack<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        s1=new Stack<Integer>();
        minStack=new Stack<Integer>();
       
    }
    
   
    
    public void push(int x) {
        s1.push(x);
        if(minStack.isEmpty() || x<=minStack.peek())
            minStack.push(x);
    }
    
    public void pop() {
        int x=s1.pop();
        if(minStack.peek()==x)
            minStack.pop();
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
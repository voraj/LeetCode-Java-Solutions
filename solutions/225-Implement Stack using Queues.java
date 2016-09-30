class MyStack {
    // Push element x onto stack.
    
    Queue q1=new LinkedList<Integer>();
    Queue q2=new LinkedList<Integer>();
    
    Queue arr[]=new Queue[]{q1,q2};
    int active=0;
    int top;
    
    public void push(int x) {
        arr[active].add(x);
        top=x;
    }

    // Removes the element on top of the stack.
    public void pop() {
        while(arr[active].size()>1){
            top=(int)arr[active].remove();
            arr[1-active].add(top);
        }
        arr[active].remove();
        active=1-active;
    }

    // Get the top element.
    public int top() {
        return top;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return arr[active].isEmpty();
    }
}
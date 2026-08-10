class MinStack {

    Stack<Integer> minStack;

    Stack<Integer> stack;
    
    public MinStack() {
        minStack = new Stack<>();
        stack = new Stack<>();
        
    }

    public void push(int val) {
        
        stack.push(val);
        
        if(minStack.isEmpty())
        {
             minStack.push(val);
        }
        else if(minStack.peek() >= val)
        {
            minStack.push(val);
        }
    }

    public void pop() {
        
        if(minStack.peek().equals(stack.peek()))
        {
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

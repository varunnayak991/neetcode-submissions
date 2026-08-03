class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {

            if(minStack.empty())
            {
                minStack.push(val);
            }
            else
            {
                int currentMin = minStack.peek();

                if( val <= currentMin )
                {
                    minStack.push(val);
                }
            }
            stack.push(val);
    }

    public void pop() {
        int currentMin = minStack.peek();
        int popValue = stack.pop();

        if(currentMin == popValue)
        {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

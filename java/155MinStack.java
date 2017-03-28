/*
155. Min Stack

Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
Example:
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.
*/

public class MinStack {

    List<Integer> stack;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new ArrayList<Integer>();
    }
    
    public void push(int x) {
        stack.add(x);
    }
    
    public void pop() {
        System.out.println(stack.get(stack.size()-1));
        stack.remove(stack.size()-1);
    }
    
    public int top() {
        return stack.get(stack.size()-1);
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < stack.size(); i++){
            if(stack.get(i) < min){
                min = stack.get(i);
            }
        }
        
        return min;
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
import java.util.Stack;

class MyQueue {
    //You need to declare the variable of class first
    //Only then you can think of assigning and initializing them in constructor 
    //LeetCode 232 Implement Queue using stacks

    public Stack<Integer> stack1;
    public Stack<Integer>stack2;

    public MyQueue() {
        stack1=new Stack<>();
        stack2=new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        //This is diffrent
        //Empty stack 1 into stack 2
        while(!stack1.isEmpty()){
            int x=stack1.pop();
            stack2.push(x);
        }
        int ans=stack2.pop();
        while(!stack2.isEmpty()){
            int x=stack2.pop();
            stack1.push(x);
        }
        return ans;
    }

    public int peek() {
        while(!stack1.isEmpty()){
            int x=stack1.pop();
            stack2.push(x);
        }
        int ans=stack2.peek();
        while(!stack2.isEmpty()){
            int x=stack2.pop();
            stack1.push(x);
        }
        return ans;
    }
//For pop efficient you can make push function like adding all elements of stack1 in stack2 then adding element then putting back all elements
//Then in pop function pop from top which is first element always

    public boolean empty() {
        return stack1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
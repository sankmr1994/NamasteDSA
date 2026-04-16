package _07_stacks_and_queues;

public class _01_implement_stack_using_queues {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.queue);
        System.out.println(myStack.top());
        System.out.println(myStack.pop());
        System.out.println(myStack.empty());
    }
}

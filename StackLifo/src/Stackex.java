public class Stackex {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public Stackex(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack overflow!");
        } else {
            stackArray[++top] = value;
            System.out.println(value + " push into the stack.");
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow!");
            return -1;
        } else {
            int value = stackArray[top--];
            System.out.println(value + " pop from the stack.");
            return value;
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        Stackex stack = new Stackex(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(5); 
        System.out.println("Stack size: " + stack.size());

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("empty stack:" + stack.isEmpty());
    }
}
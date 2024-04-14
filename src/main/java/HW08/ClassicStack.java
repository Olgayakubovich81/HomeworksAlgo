package HW08;

public class ClassicStack {
    private final int[] arr;
    private int top;
    private final int capacity;

    public ClassicStack(int size) {
        this.arr = new int[size];
        this.capacity = size;
        this.top = -1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack OverFlow");
        } else {
            // Inserting element at the top of the stack
            System.out.println("Inserting " + x);
            arr[++top] = x;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            // Removing element from the top of the stack
            return arr[top--];
        }
    }

    public int getSize() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return arr[top];
        }
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

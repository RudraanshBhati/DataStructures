public class StackImplementation<T> {
    private T[] stackArray;
    private int top;
    private int capacity;

    public StackImplementation(int size) {
        stackArray = (T[]) new Object[size];
        capacity = size;
        top = -1;
    }

    public void push(T item) {
        if (isFull()) {
            System.out.println("Overflow");
        }
        stackArray[++top] = item;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Underflow");
        }
        return stackArray[top--];
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Underflow");
        }
        return stackArray[top];
    }


    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

}
public class Stack_linkedlist {
    private Node top;

    public Stack_linkedlist() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Node newNode = new Node(data, null);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        int data = top.data;
        top = top.next;
        return data;


    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        while (temp!= null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
}
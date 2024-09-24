public class CircularQueueImpli {
    private int[] queue;
    private int front, rear;
    private int capacity;

    public CircularQueueImpli(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = - 1;
        rear = -1;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is Full");
        } else if (front == -1) {
            front = 0;
            rear = 0;
            queue[rear] = data;
        } else {
            rear = (rear + 1) % capacity;
            queue[rear] = data;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int data = queue[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        return data;
    }

    public boolean isEmpty() {
        return front == -1;
    }


    public boolean isFull() {
        return (rear + 1) % capacity == front;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return queue[front];
    }


    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        }
        else {

            System.out.print("Queue: ");
            for (int i = front; i != rear; i = (i + 1) % capacity) {
                System.out.print(queue[i] + " ");
            }
            System.out.print(queue[rear] + "\n");
        }
    }
}
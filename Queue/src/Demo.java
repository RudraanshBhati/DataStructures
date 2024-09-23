public class Demo {
    public static void main(String[] args) {
        QueueImplementation q = new QueueImplementation(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        q.display();

        System.out.println("Dequeued element: " + q.dequeue());
        q.display();

        System.out.println("Front element is: " + q.peek());

        q.enqueue(50);
        q.enqueue(60);
        q.display();

        q.enqueue(70);
    }
}
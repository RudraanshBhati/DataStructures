public class Demo {
    public static void main(String[] args) {
        CircularQueueImpli q = new CircularQueueImpli(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        System.out.println("Removed element - " + q.dequeue());
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70);
        q.enqueue(80);
        q.dequeue();
        q.enqueue(80);
        q.display();

    }
}

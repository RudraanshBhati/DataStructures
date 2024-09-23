public class InsertionAtBeg {
    public static void main(String[] args) {
        Node a = new Node(11, null, null);
        Node b = new Node(12, null, null);
        Node c = new Node(13, null, null);
        Node head = a;
        a.next = b;
        b.next = c;
        b.prev = a;
        c.prev = b;

        head = insertAtBeg(head);

        Node temp = head;
        while (temp != null) {

            System.out.print(temp.data + " ==> ");
            temp = temp.next;

        }

    }
    public static Node insertAtBeg (Node head)
    {
        Node newNode = new Node(14, head, null);
        head.prev = newNode;
        head = newNode;
        return head;
    }
}
public class DeletionAtTheEnd {
    public static void main(String[] args) {
        Node a = new Node(11, null, null);
        Node b = new Node(12, null, null);
        Node c = new Node(13, null, null);

        a.next = b;
        b.next = c;
        b.prev = a;
        c.prev = b;
        c.next = null;

        Node head = a;

        head =  deletionAtEnd(head);

        Node temp = head;
        while (temp != null) {

            System.out.print(temp.data + " ==> ");
            temp = temp.next;

        }
    }
    public static Node deletionAtEnd(Node head)
    {
        Node temp = head;
        while(temp.next.next != null)
        {
            temp = temp.next;
        }
        temp.next.prev=null;
        temp.next=null;

        return head;
    }

}
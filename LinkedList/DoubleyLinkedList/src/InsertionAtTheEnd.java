public class InsertionAtTheEnd {
    public static void main(String[] args) {
        Node a = new Node(11, null, null);
        Node b = new Node(12, null, null);
        Node c = new Node(13, null, null);
        Node head = a;
        a.next = b;
        b.next = c;
        b.prev = a;
        c.prev = b;
        c.next=null;

        head = insertAtEnd(head);

        Node temp = head;
        while (temp != null) {

            System.out.print(temp.data + " ==> ");
            temp = temp.next;

        }
    }

    public static Node insertAtEnd(Node head)
    {

        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = new Node(15,null,temp);


        return head;
    }
}
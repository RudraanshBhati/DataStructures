public class DeleteAtBeg {
    public static void main(String[] args) {
        CircularNode a = new CircularNode(1);
        CircularNode b = new CircularNode(2);
        CircularNode c = new CircularNode(3);

        a.next = b;
        b.next = c;
        c.next = a;
        CircularNode head = a;
        CircularNode tail = c;



        head = deleteAtBeg(head , tail);

        CircularNode temp = head;

        do
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
        while(temp!=head);
    }

    public static CircularNode deleteAtBeg(CircularNode head, CircularNode tail)
    {
        head = head.next;
        tail.next = head;
        return head;
    }

}



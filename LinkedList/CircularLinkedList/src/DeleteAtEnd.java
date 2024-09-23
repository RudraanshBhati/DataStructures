public class DeleteAtEnd {
    public static void main(String[] args) {
        CircularNode a = new CircularNode(1);
        CircularNode b = new CircularNode(2);
        CircularNode c = new CircularNode(3);
        CircularNode d = new CircularNode(4);


        a.next = b;
        b.next = c;
        c.next = d;
        d.next = a;
        CircularNode head = a;
        CircularNode tail = d;



        tail = deleteAtEnd(head,tail);

        CircularNode temp = head;

        do
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
        while(temp!=head);

    }

    public static CircularNode deleteAtEnd(CircularNode head, CircularNode tail)
    {
        CircularNode temp =  head;
        while(temp.next.next != head)
        {
            temp = temp.next;
        }

        temp.next = head;
        tail = temp;
        temp = null;
        return tail;
    }
}

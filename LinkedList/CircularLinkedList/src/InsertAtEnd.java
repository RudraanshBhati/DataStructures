public class InsertAtEnd {
    public static void main(String[] args) {
        CircularNode a = new CircularNode(1);
        CircularNode b = new CircularNode(2);
        CircularNode c = new CircularNode(3);

        a.next = b;
        b.next = c;
        c.next = a;
        CircularNode head = a;
        CircularNode tail = c;



        tail = insertAtEnd(9,head,tail);

        CircularNode temp = head;

        do
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
        while(temp!=head);

    }

    public static CircularNode insertAtEnd(int data , CircularNode head, CircularNode tail)
    {
        CircularNode newNode = new CircularNode(data);
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
        return tail;
    }

}

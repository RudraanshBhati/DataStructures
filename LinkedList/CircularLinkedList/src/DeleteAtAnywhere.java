public class DeleteAtAnywhere {
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



        head = deleteAnywhere(2,head,tail);

        CircularNode temp = head;

        do
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
        while(temp!=head);

    }

    public static CircularNode deleteAnywhere(int index,CircularNode head , CircularNode tail)
    {

        CircularNode temp = head;
        int i = 0 ;
        while(i < index - 1 && temp.next != head)
        {
            temp = temp.next;
            i++;
        }

        if(index == 0)
        {
            deleteAtBeg(head , tail);
        }

        else if(temp == tail)
        {
            tail = deleteAtEnd(head , tail);
        }

        else
        {
            temp.next.next = null;
        }

        return head;
    }

    public static CircularNode deleteAtBeg(CircularNode head, CircularNode tail)
    {
        head = head.next;
        tail.next = head;
        return head;
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

public class DeleteAnywhere {
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



        head = deleteAnywhere(1,head,tail);

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
        CircularNode temp2 = head.next;
        int i = 0 ;
        while(i < index - 1 && temp.next != head)
        {
            temp = temp.next;
            temp2 = temp2.next;
            i++;
        }

        if(index == 0)
        {
           head =  deleteAtBeg(head , tail);
           return head;
        }

        else if(temp == tail)
        {
            tail = deleteAtEnd(head , tail);
        }

        else if(index != 0 && temp != tail)
        {
            temp.next = temp.next.next;
            temp2.next = null;

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

public class InsertAnywhere {

    public static void main(String[] args) {
        CircularNode a = new CircularNode(1);
        CircularNode b = new CircularNode(2);
        CircularNode c = new CircularNode(3);

        a.next = b;
        b.next = c;
        c.next = a;
        CircularNode head = a;
        CircularNode tail = c;



        head = insertAnywhere(9, 3,head,tail);

        CircularNode temp = head;

        do
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
        while(temp!=head);

    }

    public static CircularNode insertAnywhere(int data , int index , CircularNode head , CircularNode tail)
    {
        CircularNode newNode = new CircularNode(9);
        CircularNode temp = head;
        int i = 0;
        while(i < index - 1 && temp.next != head)
        {
            temp = temp.next;
            i++;
        }

        if(index == 0)
        {
            insertAtBeg(data , head ,tail);
        }

        else if(temp == tail)
        {
            tail = insertAtEnd(data , head ,tail);
            return head;
        }

        else
        {
            newNode.next = temp.next;
            temp.next = newNode;
        }

        return head;

    }

    public static CircularNode insertAtBeg(int data, CircularNode head, CircularNode tail)
    {
        CircularNode newNode = new CircularNode(data);
        tail.next = newNode;
        newNode.next = head;
        head = newNode;

        return head;
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

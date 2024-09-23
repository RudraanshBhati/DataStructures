import java.util.Scanner;

public class DeleteAnywhere {
    public static void main(String[] args) {
        Node a = new Node(11, null, null);
        Node b = new Node(12, null, null);
        Node c = new Node(13, null, null);
        Node d = new Node(14,null,null);

        a.next = b;
        b.next = c;
        b.prev = a;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next=null;


        Scanner sc = new Scanner(System.in);

        Node head = a;
        int key = sc.nextInt();

        head =  deleteAnywhere(head, key);

        Node temp = head;
        while (temp != null) {

            System.out.print(temp.data + " ==> ");
            temp = temp.next;

        }
    }
    public static Node deleteAnywhere(Node head , int key)
    {
        Node temp = head;
        int i = 0;
        while(temp.next != null && i < key)
        {
            temp = temp.next;
            i++;
        }

        if(key == 0)
        {
            head = deletionAtBeg(head);
        }

        else if(temp.next == null)
        {
            head = deletionAtEnd(head);
        }

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }

        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }

        return head;
    }

    public static Node deletionAtBeg(Node head)
    {

        head = head.next;
        head.prev = null;
        return head;

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
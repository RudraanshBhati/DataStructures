import java.util.Scanner;

public class InsertionAnywhere {
    public static void main(String[] args) {
        Node a = new Node(11, null, null);
        Node b = new Node(12, null, null);
        Node c = new Node(13, null, null);
        Node head = a;
        a.next = b;
        b.next = c;
        b.prev = a;
        c.prev = b;
        c.next = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position where you want to add node - ");
        int position = sc.nextInt();

        head = insertAnywhere(head, position);

        Node temp = head;
        while (temp != null) {

            System.out.print(temp.data + " ==> ");
            temp = temp.next;

        }
    }

    public static Node insertAnywhere(Node head, int position) {
        Node newNode = new Node(66, null, null);

        if (head == null || position == 0) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
            return head;
        }

        Node temp = head;
        int i = 0;

        while (temp != null && i < position) {
            temp = temp.next;
            i++;
        }

        if (temp == null) {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
            newNode.prev = last;
        } else {

            newNode.next = temp;
            newNode.prev = temp.prev;
            if (temp.prev != null) {
                temp.prev.next = newNode;
            }
            temp.prev = newNode;
        }
        return head;
    }

}
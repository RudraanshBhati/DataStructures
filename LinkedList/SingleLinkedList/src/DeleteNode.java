public class DeleteNode {
    public static void main(String[] args) {
        Node a = new Node(5, null);
        Node b = new Node(6,null);
        Node c = new Node(7, null);
        a.next = b;
        b.next = c;
        Node head = a;

        deleteNode(b);

        Node temp = head;

        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
    public static void deleteNode(Node node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }
}

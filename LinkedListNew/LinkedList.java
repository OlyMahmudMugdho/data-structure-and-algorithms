/**
 * LiinkedList
 */
public class LinkedList {
    Node head;
    

    public void insert(int value) {
        Node node = new Node(value);

        if(head == null) {
            head = new Node();
            head.next = node;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = node;
    }
}
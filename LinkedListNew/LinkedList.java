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

    public void delete(int value) {
    
        Node previous = head;
        Node current = previous.next;

        if(current.value == value) {
            head.next = current.next;
            return;
        }

        while(current.next != null) {
            previous = current;
            current = current.next;
            if(current.value == value) {
                break;
            }
        }

        previous.next = current.next;
    }

    void print() {
        Node current = head.next;
        while(current.next != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println(current.value);
    }
}
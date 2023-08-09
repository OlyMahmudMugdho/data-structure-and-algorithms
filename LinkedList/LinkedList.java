
public class LinkedList {
    Node head;

    LinkedList() {
        head = new Node();
    }


    void push(int val) {
        Node newNode = new Node(val);


//        if (head.next == null){
//            head.next = newNode;
//            return;
//        }

        Node nextNode = head;
        while (true){
            if (nextNode.next==null){
                nextNode.next = newNode;
                break;
            }
            nextNode = nextNode.next;
        }
    }

    Node get(int index){
        int max = index + 1;
        try {
            Node node = head;
            int n = 0;
            while (n<=max) {
                if (n == max){
                    return node;
                }
                node = node.next;
                n++;
            }
        }
        catch (Exception e){
            System.out.print("Index Out of Bound , returned ");
        }

        return null;
    }
}

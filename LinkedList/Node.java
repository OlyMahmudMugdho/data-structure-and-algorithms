public class Node {
    int value;
    Node next;
    Node prev;

    Node(){
        this.next = null;
    }
    Node(int value){
        this.value = value;
        this.next = null;
    }

}
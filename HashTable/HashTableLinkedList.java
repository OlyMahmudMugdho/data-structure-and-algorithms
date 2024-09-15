
public class HashTableLinkedList<T> {

    HashNode<T> head = new HashNode<>();

    public void insert(T data){
        HashNode<T> current = this.head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = new HashNode<>(data);
    }

    public void print(){
        HashNode<T> current = head.next;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

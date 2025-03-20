

public class HashNode<T> {
    T data;
    HashNode<T> next;

    public HashNode() {
        this.data = null;
        this.next = null;
    }

    public HashNode(T data) {
        this.data = data;
        this.next = null;
    }
}
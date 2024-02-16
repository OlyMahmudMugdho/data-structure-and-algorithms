public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(54);
        queue.enqueue(76);

        queue.dequeue();
        System.out.println(queue.dequeue());
    }
}

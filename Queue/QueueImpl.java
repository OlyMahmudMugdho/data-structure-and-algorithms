
class QueueImpl {
    int MAX_SIZE = 10;
    int[] queue;
    int size = 0;
    int rear = -1;
    int front = 0;

    QueueImpl() {
        this.queue = new int[MAX_SIZE];
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == MAX_SIZE;
    }

    int enqueue(int item) {

        if (isFull()) {
            System.out.println("Queue is full");
            return -1;
        }

        rear = (rear + 1) % MAX_SIZE;
        queue[rear] = item;
        size++;
        return item;
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int removedElement = queue[front];
        front = (front + 1) % MAX_SIZE;
        size--;
        return removedElement;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    public static void main(String[] args) {
        QueueImpl queue = new QueueImpl();

        queue.enqueue(4);
        queue.enqueue(9);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
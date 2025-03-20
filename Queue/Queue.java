
public class Queue {
    int[] array = new int[10];
    int size = array.length;
    int lastIndex = 0;
    
    void enqueue(int value) {
        array[lastIndex] = value;
        lastIndex++;
    }

    int dequeue() {
        lastIndex--;
        int removed = array[lastIndex];
        return removed;
    }
}

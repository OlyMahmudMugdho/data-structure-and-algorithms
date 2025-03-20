
public class Stack {

    int[] array = new int[100];
    int count = 0;

    public int push(int value) {
        this.array[count] = value;
        count++;
        return value;
    }

    public int pop() {
        count--;
        int temp = array[count];
        array[count] = 0;
        return temp;
    }

    public int get(int index) {
        return array[index];
    }
    
}
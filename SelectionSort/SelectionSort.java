import java.util.Arrays;
public class SelectionSort {

    public static void sort(int[] array) {
        int n = array.length - 1;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n + 1; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp; 
        }
    }
    public static void main(String[] args) {
        int[] array = {45,45,7,4,765,3,5};
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}

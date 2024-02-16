import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] array) {
        int n = array.length;

        for(int i = 0; i < (n-1); i++) {
            for(int j = 0; j < (n-i-1); j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] array = {45,45,7,4,765,3,5};
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}

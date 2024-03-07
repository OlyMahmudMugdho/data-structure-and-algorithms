class BubbleSort {

    public static void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < (n - 1); i++) {
            for (int j = 1; j < (n - i - 1); j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }

    static void printArray(int[] array) {
        for (var item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {4,6,3,9,5,6,8};
        printArray(array);
        sort(array);
        printArray(array);
    }
}
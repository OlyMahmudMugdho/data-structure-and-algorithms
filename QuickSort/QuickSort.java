class QuickSort {

    public static void quickSort(int[] arr, int start, int end) {
        if(start >= end) {
            return ;
        }
        
        // getting the index of the partition
        int partitionIndex = partition(arr, start, end);

        // sorting the left side of the partition
        quickSort(arr, start, partitionIndex - 1);
        // sorting the right side of the partition
        quickSort(arr, partitionIndex + 1, end);

    }

    public static int partition(int[] arr, int start, int end) {

        // making the last index of the array as pivot
        int pivot = arr[end];

        // the i is starting from -1
        int i = start - 1;

        // if arr[j] is less than the pivot then swap arr[j] with arr[i + 1]
        // the value of j will increment by 1 (without any condition)
        // but the value of i will increment by 1 if if arr[j] < pivot// now swap the pivot to arr[i + 1]


        for (int j = start; j < end; j++) {
            if (arr[j] < pivot) {
                int temp = arr[j];
                arr[j] = arr[i+1];
                arr[i+1] = temp;
                i++;
            }
        }

        // the ( i + 1 ) is the real index of the pivot
        // now swap the pivot to arr[i + 1]
        // the numbers in the left side of the pivot are smaller than the pivot
        // the numbers in the right side of the pivot are greater than the pivot


        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;
        
        return i + 1;
    }

    public static void printArray(int[] arr) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nums[] = {5,8,2,5,0,6};
        System.out.println("Before Sorting : ");
        printArray(nums);

        quickSort(nums, 0, (nums.length - 1));
        System.out.println("After Sorting : ");
        printArray(nums);
    }
}
/**
 * MergeSort
 */
public class MergeSort {

    public static void merge(int[] arr, int start, int end) {
        int mid = (start + end) / 2;

        int firstArrayLength = mid - start + 1;
        int secondArrayLength = end - mid;

        int[] newArrayOne = new int[firstArrayLength];
        int[] newArrayTwo = new int[secondArrayLength];

        // working with the first half of the original array
        int originalArrayIndex = start;

        // copy to first array
        for (int i = 0; i < firstArrayLength; i++) {
            newArrayOne[i] = arr[originalArrayIndex];
            originalArrayIndex++;
        }

        // now working with the second half of the original array
        // originalArrayIndex = mid + 1;

        // copy the second array
        for (int i = 0; i < secondArrayLength; i++) {
            newArrayTwo[i] = arr[originalArrayIndex];
            originalArrayIndex++;
        }

        originalArrayIndex = start;
        int index1 = 0;
        int index2 = 0;


        while(index1 < firstArrayLength && index2 < secondArrayLength) {
            if(newArrayOne[index1] < newArrayTwo[index2]) {
                arr[originalArrayIndex] = newArrayOne[index1];
                originalArrayIndex++;
                index1++;
            }

            else {
                arr[originalArrayIndex] = newArrayTwo[index2];
                originalArrayIndex++;
                index2++;
            }

        }
        
        while(index1 < firstArrayLength) {
            arr[originalArrayIndex] = newArrayOne[index1];
             index1++;
             originalArrayIndex++;
        }

        while(index2 < secondArrayLength) {
            arr[originalArrayIndex] = newArrayTwo[index2];
             index2++;
             originalArrayIndex++;
        }

    }

    public static void mergeSort(int[] arr, int start, int end) {
        
        if(start >= end) {
            return ;
        }

        int mid = (start + end) / 2;

        mergeSort(arr,start,mid);

        mergeSort(arr, mid + 1, end);

        merge(arr, start, end);
    }

    public static void main(String[] args) {
        int[] arr = {6,9,2,8,5};
        mergeSort(arr,0,(arr.length - 1));

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
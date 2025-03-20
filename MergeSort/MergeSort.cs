public class MergeSort {

    public static void merge(int[] arr, int start, int end)  {
        int mid = (start + end) / 2;

        int len1 = mid - start + 1;
        int len2 = end - mid;

        int[] arr1 = new int[len1];
        int[] arr2 = new int[len2];

        int originalArrayIndex = start;

        for (int i = 0; i < len1; i++)
        {
            arr1[i] = arr[originalArrayIndex];
            originalArrayIndex++;
        }

        for (int i = 0; i < len2; i++)
        {
            arr2[i] = arr[originalArrayIndex];
            originalArrayIndex++;
        }

        originalArrayIndex = start;
        int index1 = 0;
        int index2 = 0;

        while(index1 < len1 && index2 < len2) {
            if(arr1[index1] < arr2[index2]) {
                arr[originalArrayIndex] = arr1[index1];
                originalArrayIndex++;
                index1++;
            }

            else {
                arr[originalArrayIndex] = arr2[index2];
                originalArrayIndex++;
                index2++;
            }
        }

        while(index1 < len1){
            arr[originalArrayIndex] = arr1[index1];
            originalArrayIndex++;
            index1++;
        }

        while (index2 < len2)
        {
            arr[originalArrayIndex] = arr2[index2];
            originalArrayIndex++;
            index2++;
        }

    }
    public static void mergeSort(int[] arr, int start, int end) {
        if(start >=  end) {
            return ;
        }

        int mid = (start + end) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr,mid + 1, end);
        merge(arr, start, end);
    }

    public static void printArray(int[] arr) {
        foreach (int item in arr)
        {
            Console.Write(item + " ");
        }
        Console.WriteLine();
    }

    public static void Main(string[] args)
    {
        int[] nums = {4,8,23,76,3};
        Console.WriteLine("Before sorting  : ");
        printArray(nums);

        Console.WriteLine("After sorting : ");
        mergeSort(nums, 0, nums.Length - 1);
        printArray(nums);
    }

}
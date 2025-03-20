#include <iostream>
using namespace std;


int partition(int array[], int start, int end) {
    int pivot = array[end];
    int i = start -1;
    
    for (int j = start; j < end; j++)
    {
        if(array[j] < pivot) {
            int temp = array[j];
            array[j] = array[i+1];
            array[i+1] = temp;
            i++;
        }
    }

    int temp = array[i+1];
    array[i+1]  = array[end];
    array[end] = temp;
    
    return i + 1;
}

void quickSort(int array[], int start, int end) {
    if(start >= end) {
        return;
    }
    int partitionIndex = partition(array, start, end);
    quickSort(array, start, partitionIndex -1);
    quickSort(array, partitionIndex + 1, end);
}


void printArray(int array[], int size) {
    for (int i = 0; i < size; i++)
    {
        cout << array[i] << " ";
    }
    cout << endl;
    
}

int main() {
    int nums[7] = {1,5,63,4,6,34,6};
        printArray(nums, 7);
        quickSort(nums, 0, 6);
        printArray(nums, 7);
}
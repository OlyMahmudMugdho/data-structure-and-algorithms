#include <iostream>
using namespace std;

void sort(int array[], int length) {
    for(int i = 1; i < length; i++) {
        int j = i - 1;
        int temp = array[i];
        
        while(j >= 0 && array[j] > temp) {
            array[j+1] = array[j];
            j--;
        }

        array[j + 1] = temp;

    }
}

void printArray(int array[], int size) {
    for(int i=0; i < size; i++) {
        cout << array[i] << " ";
    }
    cout << endl;
}

int main() {
    int array[5] = {54,6,32,7,4};
    printArray(array,5);
    sort(array,5);
    printArray(array,5);
    return 0;
}
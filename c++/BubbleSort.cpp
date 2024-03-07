#include <iostream>
using namespace std;

void sort(int array[], int length)
{
    int n = length;
    for (int i = 0; i < (n - 1); i++)
    {
        for (int j = 1; j < (n - i - 1); j++)
        {
            if (array[j] > array[j + 1])
            {
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
    }
}

void printArray(int array[], int length)
{
    for (size_t i = 0; i < length; i++)
    {
        cout << array[i] << " ";
    }
    cout << endl;
}

int main()
{
    int array[7] = {4, 6, 3, 9, 5, 6, 8};
    printArray(array, 7);
    sort(array,7);
    printArray(array,7);
}

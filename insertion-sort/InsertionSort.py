def printArray(array):
    for item in array:
        print(item , end= " ")
    print()

def sort(array) :
    i = 1
    
    while(i < len(array)):
        j = i -1
        temp = array[i]

        while(j >= 0 and array[j] > temp):
            array[j+1] = array[j]
            j-=1
        array[j + 1] = temp
        i+=1

nums = [3,6,3,7,4]

printArray(nums)

sort(nums)
printArray(nums)
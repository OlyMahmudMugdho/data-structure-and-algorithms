def merge(arr,start,end) :

    mid = (start + end)//2

    len1 = mid - start + 1
    len2 = end - mid

    arr1 = []
    arr2 = []

    i = 0
    original_index = start

    while(i<len1):
        arr1.append(arr[original_index])
        i+=1
        original_index+=1

    i = 0
    while(i<len2):
        arr2.append(arr[original_index])
        i+=1
        original_index+=1

    original_index = start
    index1 = 0
    index2 = 0

    while(index1 < len1 and index2 < len2):
        if(arr1[index1] < arr2[index2]):
            arr[original_index] = arr1[index1]
            index1+=1
            original_index+=1
        else:
            arr[original_index] = arr2[index2]
            index2 += 1
            original_index += 1

    while(index1 < len1):
        arr[original_index] = arr1[index1]
        index1+=1
        original_index += 1
    
    while(index2 < len2):
        arr[original_index] = arr2[index2]
        index2 += 1
        original_index += 1




def merge_sort(arr,start, end):
    if(start >= end):
        return
    
    mid =  (start+end)//2

    merge_sort(arr,start,mid)
    merge_sort(arr,mid + 1, end)
    
    merge(arr,start,end)

def print_list(arr):
    for item in arr:
        print(item,end=" ")
    print()

nums = [6,9,12,87,2,97,7]

merge_sort(nums,0,(len(nums)-1))
print_list(nums)
array = [8, 2, 5, 3, 9, 4, 7, 6, 1 ]

print(array)

def quickSort(array:list,start:int,end:int):
    if(end <= start):
        return
    pivot = partition(array,start,end)

    quickSort(array,start, pivot - 1)
    quickSort(array,pivot + 1,end)

def partition(array:list,start:int,end:int):
    pivot = array[end]
    i = start - 1

    for j in range(start,end - 1):
        if(array[j] < pivot):
            i += 1
            temp = array[i]
            array[i] = array[j]
            array[j] = temp
    
    i += 1
    temp = array[i]
    array[i] = array[end]
    array[end] = temp
    return i

quickSort(array, 0,len(array) - 1)

print(array)
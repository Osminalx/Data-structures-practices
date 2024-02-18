array = [8, 7, 9, 2, 3, 1, 5, 4, 6]
print(array)

def selectionSort(array:list):
    for i in range(len(array)-1):
        min = i
        for j  in range(i+1,len(array)):
            if(array[min] > array[j]):
                min = j
        temp = array[i]
        array[i] = array[min]
        array[min] = temp

selectionSort(array)
print(array)

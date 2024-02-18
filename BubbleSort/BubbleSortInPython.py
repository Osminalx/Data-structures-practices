array = [9, 1, 8, 2, 7, 3, 6, 4, 5 ]


print(array)

def bubbleSort(array:list):
    for i in array:
        for j in range(len(array)-1-i):
            if(array[j] > array[j+1]):
                temp = array[j]
                array[j]= array[j+1]
                array[j+1] = temp

bubbleSort(array)
print(array)
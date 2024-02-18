#BinarySearch in python
array = [i for i in range(1000001)]
target = 777777

def binarySearch(array:list, target:int)->int:
    low =0;
    high = len(array) -1
    while(low <= high):
        middle = low +(high-low)//2
        value = array[middle]
        print(f"middle: {middle}")
        if(value < target):
            low = middle + 1
        elif(value > target):
            high = middle - 1
        else:
            return middle
    return -1

index = binarySearch(array,target)
if(index == -1):
    print(f"{target} not found")
else:
    print(f"target found at: {index}")

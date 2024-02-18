array = [1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024]

def interpolationSearch(array:list,value:int)->int:
    high = len(array) -1
    low = 0;
    while(value >= array[low] and value <=array[high] and low <= high):
        probe = low + (high - low) * (value - array[low]) // (array[high] - array[low])
        print(f"ptobe: {probe}")
        if(array[probe] == value):
            return probe
        elif(array[probe] < value):
            low = probe + 1
        else:
            high = probe - 1
    return -1

index = interpolationSearch(array,256)

if(index != -1):
    print(f"Element found at index: {index}")
else:
    print("Element not found")
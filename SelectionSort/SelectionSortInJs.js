const array = [8, 7, 9, 2, 3, 1, 5, 4, 6];

console.log(array);

function selectionSort(array) {
    for (let i = 0; i < array.length - 1; i++) {
        let min = i;
        for (let j = i + 1; j < array.length; j++) {
            if (array[min] > array[j]) {
                min = j;
            }
        }
        let temp = array[i];
        array[i] = array[min];
        array[min] = temp;
    }
}

selectionSort(array);

console.log(array);

const array = [9, 1, 8, 2, 7, 3, 6, 5, 4];
console.log(array);

function insertionSort(array) {
    for (let i = 1; i < array.length; i++) {
        let temp = array[i];
        let j = i - 1;
        while (j >= 0 && array[j] > temp) {
            array[j + 1] = array[j];
            j--;
        }
        array[j + 1] = temp;
    }
}

insertionSort(array);
console.log(array);

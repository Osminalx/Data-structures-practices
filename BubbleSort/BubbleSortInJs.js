const array = [9, 1, 8, 2, 7, 3, 6, 4, 5];

console.log(array);

const bubbleSort = (array /* Array[Number] */) => {
    for (let i = 0; i < array.length - 1; i++) {
        for (let j = 0; j < array.length - 1 - i; j++) {
            if (array[j] > array[j + 1]) {
                let temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
    }
};

bubbleSort(array);

console.log(array);

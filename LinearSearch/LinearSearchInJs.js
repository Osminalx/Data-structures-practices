const array = [9, 1, 8, 2, 7, 3, 6, 4, 5, 10];

const linearSearch = (array /*Array<number>*/, value /*Number*/) => {
    for (let i = 0; i < array.length; i++) {
        if (array[i] == value) {
            return i;
        }
    }
    return -1;
};

const index = linearSearch(array, 7);

if (index != -1) {
    console.log(`Element found at index: ${index}`);
} else {
    console.log('Element not found');
}

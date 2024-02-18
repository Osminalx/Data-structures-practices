const array = Array.from({ length: 101 }, (_, i) => i);
const target = 42;

function binarySearch(array /*: Array<Number>*/, target /* Number */) {
    let low = 0;
    let high = array.length - 1;
    while (low <= high) {
        let middle = Math.round(low + (high - low) / 2);
        value = array[middle];
        console.log('middle: ' + middle);
        if (value < target) low = middle + 1;
        else if (value > target) {
            high = middle - 1;
        } else {
            return middle;
        }
    }
    return -1;
}

const index = binarySearch(array, target);

if (index == -1) {
    console.log(`${target} not found`);
} else {
    console.log('Element found at index: ' + index);
}

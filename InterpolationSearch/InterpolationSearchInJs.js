const array = [1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024];

function interpolationSearch(array /* Array<Number> */, value /*Number */) {
    let high = array.length - 1;
    let low = 0;
    while (value >= array[low] && value <= array[high] && low <= high) {
        let probe = Math.round(low + ((high - low) * (value - array[low])) / (array[high] - array[low]));
        console.log('probe: ' + probe);
        if (array[probe] == value) {
            return probe;
        } else if (array[probe] < value) {
            low = probe + 1;
        } else {
            high = probe - 1;
        }
    }
}

const index = interpolationSearch(array, 256);

const print = index != -1 ? `Element found at index ${index}` : 'Element not found';

console.log(print);

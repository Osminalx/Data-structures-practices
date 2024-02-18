const array = [8, 2, 5, 3, 9, 4, 7, 6, 1];

console.log(array);

function quickSort(items) {
    const length = items.length;

    if (length <= 1) {
        return items;
    }
    const PIVOT = items[0];
    const GREATER = [];
    const LESSER = [];

    for (let i = 1; i < length; i++) {
        if (items[i] > PIVOT) {
            GREATER.push(items[i]);
        } else {
            LESSER.push(items[i]);
        }
    }

    const sorted = [...quickSort(LESSER), PIVOT, ...quickSort(GREATER)];
    return sorted;
}

console.log(quickSort(array));

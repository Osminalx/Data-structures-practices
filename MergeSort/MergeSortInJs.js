const array = [8, 2, 5, 3, 4, 7, 6, 1];

console.log(array);

function merge(list1, list2) {
    const results = [];
    let i = 0;
    let j = 0;

    while (i < list1.length && j < list2.length) {
        if (list1[i] < list2[j]) {
            results.push(list1[i++]);
        } else {
            results.push(list2[j++]);
        }
    }

    return results.concat(list1.slice(i), list2.slice(j));
}

function mergeSort(list) {
    if (list.length < 2) return list;

    const listHalf = Math.floor(list.length / 2);
    const subList1 = list.slice(0, listHalf);
    const subList2 = list.slice(listHalf, list.length);

    return merge(mergeSort(subList1), mergeSort(subList2));
}

console.log(mergeSort(array));

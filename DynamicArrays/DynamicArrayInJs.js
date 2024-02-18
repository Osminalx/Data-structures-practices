//Los DynamicArrays son Arrays comunes en JS
const list = [];

const isEmpty = list => {
    if (list.length === 0) {
        return true;
    } else {
        return false;
    }
};

console.log('is empty?: ' + isEmpty(list));

list.push('A');
list.push('B');
list.push('C');
list.push('D');
list.push('F');
console.log(list);

list.pop();

console.log('Index of B: ' + list.indexOf('B'));

list.splice(0, 1);
console.log(list);
console.log('is empty?: ' + isEmpty(list));

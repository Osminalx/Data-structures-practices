//En Javascript hay dos formas de implementar hashtables: Objects and Maps
// Los métodos que ya trae js para los objetos, son muy permisivos y los puedes modificar
// Mientras que los métodos de los Maps no dejan hacer esas cosas

const myDic = {
    100: 'SpongeBob',
    123: 'Patrick',
    321: 'Sandy',
    555: 'Squidward',
    777: 'Gary',
};

//myDic.name = 'Plankton';

// * No se pueden usar loops para recorrer objetos de js

//! Forma de hacer loops para cada clave(key)
// let names = Object.keys(myDic);
// names.forEach(key => {
//     console.log(key);
// });

//! Forma de hacer loops para cada valor
// let values = Object.values(myDic);
// values.forEach(name => {
//     console.log(name);
// });

//añadir
myDic[888] = 'Plankton';
// Modificar
myDic[321] = 'Gary';
//Eliminar
delete myDic[777];

//! Forma de hacer loops para clave valor
let keyValue = Object.entries(myDic);
keyValue.forEach(arr => {
    console.log(arr);
});

console.log(typeof myDic);
// Maps
const myMap = new Map();
//añadir
myMap.set(100, 'Spongebob');
myMap.set(123, 'Patrick');
myMap.set(321, 'Sandy');
myMap.set(555, 'Suidward');
myMap.set(777, 'Gary');

//Modificar
myMap.set(321, 'plankton');

//Elminar
myMap.delete(123);

//Iterar
myMap.forEach(val => {
    console.log(val);
});

console.log(myMap.get(123));

console.log(typeof myMap);

//En el caso de js/ts, sería algo como en python, es posible hacerse sin una clase
// Pero es recomendable hacer la clase y manejarla como un stack
class Stack {
    constructor() {
        this.items = [];
    }

    push(element) {
        this.items.push(element);
    }

    pop() {
        if (this.items.length == 0) {
            return 'Underflow';
        }
        return this.items.pop();
    }
    peek() {
        return this.items[this.items.length - 1];
    }

    isEmpty() {
        return this.items.length == 0;
    }

    //Función no necesaria, pero se ve mejor
    printStack() {
        let str = '';
        for (let i = 0; i < this.items.length; i++) str += this.items[i] + ' ';
        return str;
    }
}

let stack = new Stack();

console.log(stack.isEmpty());

console.log(stack.pop());

stack.push('Minecraft');
stack.push('Batman');
stack.push('Stardew Valley');
stack.push('LOL');

console.log(stack);

console.log(stack.printStack());

console.log(stack.peek());

let myFavGame = stack.pop();
console.log('mi juego favorito ' + myFavGame);

console.log(stack);
console.log(stack.printStack());

class Queue {
    constructor() {
        this.items = {};
        this.frontIndex = 0;
        this.backIndex = 0;
    }
    enqueue(item) {
        this.items[this.backIndex] = item;
        this.backIndex++;
        return item + ' inserted';
    }
    dequeue() {
        const item = this.items[this.frontIndex];
        delete this.items[this.frontIndex];
        this.frontIndex++;
        return item;
    }
    peek() {
        return this.items[this.frontIndex];
    }
    get printQueue() {
        return this.items;
    }
}
const queue = new Queue();
console.log(queue.enqueue('Karen'));
console.log(queue.enqueue('Chad'));
console.log(queue.enqueue('Steve'));
console.log(queue.enqueue('Harold'));
console.log(queue.dequeue());
console.log(queue.peek());
let str = queue.printQueue;
console.log(str);

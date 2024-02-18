const walk = steps => {
    if (steps < 1) return;
    console.log('You take a step!');
    walk(steps - 1);
};

const factorial = num => {
    if (num < 1) return 1;
    return num * factorial(num - 1);
};

const power = (base, exponent) => {
    if (exponent < 1) return 1;
    return base * power(base, exponent - 1);
};

walk(5);
console.log(factorial(7));
console.log(power(2, 8));

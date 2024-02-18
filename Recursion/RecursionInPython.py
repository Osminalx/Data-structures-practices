def walk(steps:int):
    if(steps<1):
        return
    print("You take a step!")
    walk(steps-1)

def factorial(num: int):
    if(num<1):
        return 1
    return num * factorial(num -1)

def power(base:int,exponent:int):
    if(exponent < 1):
        return 1;
    return base * power(base, exponent - 1)

print(walk(5))
print(factorial(7))
print(power(2,8))
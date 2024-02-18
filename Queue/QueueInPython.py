from collections import deque

queue = deque()

#Empty tampoco existe, o no lo encuentro
def empty(queue):
    if not queue:
        return True
    return False

print(empty(queue))

#Al igual que empty, tampoco existe peek, o no lo encentro
def peek(queue):
    if queue:
        return queue[0]
    else:
        None



#append() para añadir a la cola/queue
queue.append("Karen")
queue.append("Chad")
queue.append("Steve")
queue.append("Harold")

print(queue)
print(peek(queue))
#popleft() para eliminar de la cola
print(queue.popleft())
print(queue.popleft())
print(queue.popleft())

print("\n queue after removing elements")
print(queue)

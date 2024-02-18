#Los dynamicArrays en python son conocidos como listas
list = []

#isEmpty no existe aqui
def isEmpty(list:list):
    if not list:
        return True
    else:
        return False

print(isEmpty(list))

list.append("A")
list.append("C")
list.append("D")
list.append("E")
list.insert(1,"B")

print(list)

list.pop()
list.pop(1)

print(list)

list.index("D")

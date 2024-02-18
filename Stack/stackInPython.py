#En python, así se hacen los stacks
#Con las funciones append() y pop() en un diccionario
stack = []
stack.append("Minecraft")
stack.append("Lol")
stack.append("Pokemon")
stack.append("Batman")
stack.append("Stardew Valley")
stack.append("Minecraft")
print(stack)

my_fav_game = stack.pop()
print(stack)
print(f"Mi juego favorito es: {my_fav_game}")
#Para buscar en donde se encuentra un elemento
print(stack.index("Pokemon"))
#Aquí no existe empty()
#Así que se tiene que crear una función
def empty(stack:list):
    if not stack:
        return True
    else:
        return False
    
stack2 = []
print(empty(stack2))
print(empty(stack))
#Tampoco existe peek(), hay que implementarlo
def peek_stack(stack):
    if stack:
        return stack[-1]    
    else:
        return None
print(peek_stack(stack))
print(peek_stack(stack2))
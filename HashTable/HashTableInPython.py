#En el caso de python las hashtables son los diccionarios
myDic = {
    100: "SpongeBob",
    123: "Patrick",
    321: "Sandy",
    555: "Squidward",
    777: "Gary"
}

myDic[888] = "Plankton" #add
del myDic[100] #Delete
myDic[321] = "Don Cangrejo" #Modify

for key in myDic:
    print(key, "\t", myDic[key])
    #print(f"{key} \t {myDic[key]}")




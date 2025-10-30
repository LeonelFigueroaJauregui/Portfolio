#Lista con elementos repetivos
lista = [1, 2, 3, 4, "hola", 4, 3, 2, 1, "hola"]
print(lista)

#La convertimos a set para quitar los elementos repetidos
set(lista)
print(set(lista))
#La convertimos de vuelta a lista

lista = list(set(lista))
print(lista)



#OPERACIONES CON SETS
#OPERACIONES CON CONJUNTOS

#Igualdad
set1 = {1,2,3}
set2 = {3,4,5}
set3 = {2,1,3}

print(set1 == set2)
print(set1 == set3)

#Longitud

set4 = {"a", "b", "c", "d"}
print(len(set4))

#Union

setA = {1,2,3,4,5}
setB = {4,5,6,7,8,9}

print(setA | setB)

#Interseccion

setA = {1,2,3,4,5}
setB = {4,5,6,7,8,9}

print(setA & setB)

#Diferencia

setA = {1,2,3,4,5}
setB = {4,5,6,7,8,9}

print(setA - setB)
print(setB - setA)

#Diferencia simetrica

setA = {1,2,3,4,5}
setB = {4,5,6,7,8,9}

print(setA ^ setB)

#Subconjunto

a = {1,2,3}
b = {3,4,5}
c = {1,2,3,4,5}

print(a.issubset(c))        #True
es_subconjunto = a <= b     #True

#Superconjunto 

a = {1,2,3}
b = {3,4,5}
c = {1,2,3,4,5}

print(c.issuperset(a))      #True
es_superconjunto = c >= b   #True

#Disjuntos o disconexos

a = {1,2,3}
b = {4,5,6}


print(b.isdisjoint(a))   #True

#frozenset

fset = frozenset({1,2,3,4,5})
print(fset)
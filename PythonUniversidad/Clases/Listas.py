#Creamos una lista de colores y la recorremos con un bucle for
colores = ["azul", "verde", "rojo", "morado"]

for color in colores:
    print(color)


#Añadimos un color a la lista
colores.append("amarillo")
colores.append("naranja")
colores.append("rosa")
print(colores)

#Añadimos numeros dentro de otra lista como un subconjunto
lista1 = [1,2,3]
lista1.append([4,5,6])
print(lista1)

#El insert permite añadir un elemento en una posición concreta
colores2 = ["azul", "verde", "rojo"]
colores2.insert(0, "amarillo")
print(colores2)

#Metodo extend fusiona las lista 
lista2 = [1,2,3]
lista2.extend([4,5,6])
print(lista2)


#Metodo pop elimina el ultimo elemento de la lista
colores3 = ["azul", "verde", "rojo"] 
colores3.pop()            #Si quieres eliminar cierto valor debes poder en el indice: Ejemplo colores3.pop(1)
print(colores3)                           


#Metodo remove elimina el primer elemento que coincida con el valor que le pasamos
lista_numero = [1,2,3,4,5,6,3]
lista_numero.remove(3)
print(lista_numero)

#Metodo del se puede usar para borrar un indice o toda la lista
colores4 = ["azul", "verde", "rojo"]
del colores4()
print(colores4)

#Metodo clear elimina todos los elementos de la lista pero no la lista, la deja vacia
colores5 = ["azul", "verde", "rojo"]
colores5.clear()
print(colores5)

#Metodo index devuelve el indice de un elemento, su ubicacion en la lista
numeros = [1,2,3,4,5,6]
numeros.index(3)
print(numeros.index(3))

#Metodo count devuelve el numero de veces que aparece un elemento en la lista
lista_numeros = [1,2,3,4,5,6,3]
print(lista_numeros.count(3))


#Operador in, nos permite saber si un elemento esta en la lista con true o false
colores6 = ["azul", "verde", "rojo"]
print("azul" in colores6) #true
print("amarillo" in colores6) #false



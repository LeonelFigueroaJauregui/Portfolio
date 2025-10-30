print("""
██████╗ ██████╗  ██████╗  ██████╗ ██████╗  █████╗ ███╗   ███╗ █████╗      ██╗
██╔══██╗██╔══██╗██╔═══██╗██╔════╝ ██╔══██╗██╔══██╗████╗ ████║██╔══██╗    ███║
██████╔╝██████╔╝██║   ██║██║  ███╗██████╔╝███████║██╔████╔██║███████║    ╚██║
██╔═══╝ ██╔══██╗██║   ██║██║   ██║██╔══██╗██╔══██║██║╚██╔╝██║██╔══██║     ██║
██║     ██║  ██║╚██████╔╝╚██████╔╝██║  ██║██║  ██║██║ ╚═╝ ██║██║  ██║     ██║
╚═╝     ╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝  ╚═╝     ╚═╝
                                                                             
""")
#Este programa agrega elementos a una lista vacia hasta que finaliza el usuario
lista = []

while True:
    nuevo = input("Introduce un nuevo elemento a la lista o 'exit' para salir: ")
    if nuevo == "exit":
        break
    else:
        lista.append(nuevo)

print("La lista es: ", lista)

#Ahora pediremos al usuario que introduzca un numero y lo buscaremos en la lista si existe y cuantas veces aparece
buscar = input("Introduce un elemento a buscar en la lista: ")
if buscar in lista:
    print(f"El elemento {buscar} SI se encuentra en la lista")
else:
    print(f"El elemento {buscar} NO se encuentra en la lista")

veces = lista.count(buscar)
print(f"El elemento {buscar} aparece {veces} veces en la lista")

print("""
██████╗ ██████╗  ██████╗  ██████╗ ██████╗  █████╗ ███╗   ███╗ █████╗     ██████╗ 
██╔══██╗██╔══██╗██╔═══██╗██╔════╝ ██╔══██╗██╔══██╗████╗ ████║██╔══██╗    ╚════██╗
██████╔╝██████╔╝██║   ██║██║  ███╗██████╔╝███████║██╔████╔██║███████║     █████╔╝
██╔═══╝ ██╔══██╗██║   ██║██║   ██║██╔══██╗██╔══██║██║╚██╔╝██║██╔══██║    ██╔═══╝ 
██║     ██║  ██║╚██████╔╝╚██████╔╝██║  ██║██║  ██║██║ ╚═╝ ██║██║  ██║    ███████╗
╚═╝     ╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝  ╚═╝    ╚══════╝
                                                                                 
""")

#Un programa que simule una lista de compras que permita agregar, contar, eliminar, modificar,mostrar la lista y salor

lista_compras = []
print("Bienvenido a la lista de compras")
print("1. Agregar un elemento a la lista")
print("2. Contar elementos en la lista")
print("3. Eliminar un elemento de la lista")
print("4. Modificar un elemento de la lista")
print("5. Mostrar la lista")
print("6. Salir")

while True:
    opcion = int(input("Introduce una opcion del (1 al 6) o 'exit' para salir: "))
    if opcion == 1:
        nuevo = input("Introduce un nuevo elemento a la lista: ")
        lista_compras.append(nuevo)
    elif opcion == 2:
        print(f"La lista tiene {len(lista_compras)} elementos")
    elif opcion == 3:
        eliminar = input("Introduce el elemento a eliminar: ")
        if eliminar in lista_compras:
            lista_compras.remove(eliminar)
        else:
            print(f"El elemento {eliminar} no se encuentra en la lista")
    elif opcion == 4:
        modificar = input("Introduce el elemento a modificar: ")
        if modificar in lista_compras:
            indice = lista_compras.index(modificar)
            nuevo = input("Introduce el nuevo elemento: ")
            lista_compras[indice] = nuevo
        else:
            print(f"El elemento {modificar} no se encuentra en la lista")
    elif opcion == 5:
        print(f"La lista de compras es: {lista_compras}")
    elif opcion == 6:
        break
    elif opcion == "exit":
        break
    else:
        print("Opcion no valida")

print("Gracias por usar la lista de compras")


print("""
██████╗ ██████╗  ██████╗  ██████╗ ██████╗  █████╗ ███╗   ███╗ █████╗     ██████╗ 
██╔══██╗██╔══██╗██╔═══██╗██╔════╝ ██╔══██╗██╔══██╗████╗ ████║██╔══██╗    ╚════██╗
██████╔╝██████╔╝██║   ██║██║  ███╗██████╔╝███████║██╔████╔██║███████║     █████╔╝
██╔═══╝ ██╔══██╗██║   ██║██║   ██║██╔══██╗██╔══██║██║╚██╔╝██║██╔══██║     ╚═══██╗
██║     ██║  ██║╚██████╔╝╚██████╔╝██║  ██║██║  ██║██║ ╚═╝ ██║██║  ██║    ██████╔╝
╚═╝     ╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝  ╚═╝    ╚═════╝ 
                                                                                 
""")


# Práctica 3: Una matriz
matriz = [
    [1, 2, 3, 4, 5],          # Fila 0
    [6, 7, 8, 9, 10],         # Fila 1
    [11, 12, 13, 14, 15],     # Fila 2
    [16, 17, 18, 19, 20]      # Fila 3
]

# Imprimir la matriz completa con un solo ciclo for
for fila in matriz:
    print(fila)

# Solicitar el número de fila y columna
fila = int(input("Introduce el número de fila (0-3): "))
columna = int(input("Introduce el número de columna (0-4): "))

# Imprimir el valor de la fila y columna
if 0 <= fila < 4 and 0 <= columna < 5:
    print(f"El valor en la posición ({fila}, {columna}) es: {matriz[fila][columna]}")
else:
    print("Fila o columna fuera de rango")

# Recorrer toda la matriz e imprimir los valores
for i in range(len(matriz)):
    for j in range(len(matriz[i])):
        print(f"Valor en la posición ({i}, {j}) es: {matriz[i][j]}")

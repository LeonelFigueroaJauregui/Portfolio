#TEMA BLUCE WHILE

#EJEMPLO
i = 1
while i<5:
    print(f"El valor del bucle es {i}")
    i = i + 1


#Ejercicios

contador = 1

while contador <5:
    print(contador)
    contador +=1

while contador <5:
    contador +=1
    print(contador)

while contador <5:
    contador +=1
print(contador)

while contador <5:
    print(contador)


while contador == 0:
    print(contador)

while contador !=0:
    print(contador)
    contador -=1

#EJEMPLO DE PREGUNTAR ITERACION
suma = 0
respuesta = input("¿Quieres sumar?: (S/N)")
while respuesta == "S" or respuesta == "s":
    numero = int(input("Introduce un número entero: "))
    suma = suma + numero
    respuesta = input("¿Quieres sumar otro número?: (S/N)")
print(f"La suma de los números introducidos es {suma}")






# Adivinar numero
numero_a_adivinar = int(input("Usuario 1, ingresa un número entre 1 y 100: "))
print("\n" * 50)  # Limpiar la pantalla

adivinado = False
while not adivinado:
    intento = int(input("Usuario 2, adivina el número: "))
    if intento < numero_a_adivinar:
        print("Más arriba")
    elif intento > numero_a_adivinar:
        print("Más abajo")
    else:
        print("Felicidades, adivinaste")
        adivinado = True






























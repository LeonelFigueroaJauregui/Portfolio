#PROGRAMA 1
#Determina el tipo de dato de una variable
valor = True

if type(valor) is int:
  print("Es un entero")
elif type(valor) is float:
  print("Es un flotante")
elif type(valor) is str:
  print("Es un string")
elif type(valor) is bool:
  print("Es un booleano")
else:
  print("Es otro tipo de dato")


#PROGRAMA 2
#Programa ordenar 3 numeros de mayor a menor

num1 = int(input("Ingrese el primer numero: "))
num2 = int(input("Ingrese el segundo numero: "))
num3 = int(input("Ingrese el tercer numero: "))

if num1 >= num2 and num1 >= num3:
    if num2 >= num3:
        print(num1, num2, num3)
    else:
        print(num1, num3, num2)
elif num2 >= num1 and num2 >= num3:
    if num1 >= num3:
        print(num2, num1, num3)
    else:
        print(num2, num3, num1)
else:
    if num1 >= num2:
        print(num3, num1, num2)
    else:
        print(num3, num2, num1)


#PROGRAMA 3
#Ejemplo secuencia match

dia_semana = int(input("Dame un numero del 1 al 7: "))
match dia_semana:
    case 1:
        print("Lunes")
    case 2:
        print("Martes")
    case 3:
        print("Miercoles")
    case 4:
        print("Jueves")
    case 5:
        print("Viernes")
    case 6:
        print("Sabado")
    case 7:
        print("Domingo")
    case _:
        print("Numero no valido")



#PROGRAMA 4
#Programa mayor o menor

num1 = int(input("Ingrese el primer numero: "))
num2 = int(input("Ingrese el segundo numero: "))

if num1 > num2:
    print(num1, "es mayor que", num2)
elif num1 < num2:
    print(num1, "es menor que", num2)
else:
    print("Los numeros son iguales")



#PROGRAMA 5
#Año bisiesto

año = int(input("Dame un año: "))
if año % 4 == 0 and año % 100 != 0 or año % 400 == 0:
    print("El año", año, "es bisiesto")
else:
    print("El año", año, "no es bisiesto")



#PROGRAMA 6
#Segun el clima, caminar o ir al cine

clima = input("Como esta el clima (bueno o malo): ")
if clima == "bueno":
    print("Vamos a caminar")
elif clima == "malo":
    print("Vamos al cine")
elif clima == "bueno" or clima == "malo":
    print("Vamos a almorzar")
else:
    print("opcion no valida")

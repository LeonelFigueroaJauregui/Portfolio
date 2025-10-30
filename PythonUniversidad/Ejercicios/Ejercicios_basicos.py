print("""
██████╗ ██████╗  ██████╗  ██████╗ ██████╗  █████╗ ███╗   ███╗ █████╗      ██╗   
██╔══██╗██╔══██╗██╔═══██╗██╔════╝ ██╔══██╗██╔══██╗████╗ ████║██╔══██╗    ███║██╗
██████╔╝██████╔╝██║   ██║██║  ███╗██████╔╝███████║██╔████╔██║███████║    ╚██║╚═╝
██╔═══╝ ██╔══██╗██║   ██║██║   ██║██╔══██╗██╔══██║██║╚██╔╝██║██╔══██║     ██║██╗
██║     ██║  ██║╚██████╔╝╚██████╔╝██║  ██║██║  ██║██║ ╚═╝ ██║██║  ██║     ██║╚═╝
╚═╝     ╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝  ╚═╝     ╚═╝   
                                                                                
""")
#ESTE PROGRAMA CAMBIA LOS VALORES DE VARIABLES

#Definimos las variables
a=1
b=2
c=3

auxa = a
auxb = b     #Guardamos los valores en variables auxiliares 
auxc = c

b = auxa
c = auxb
a = auxc

#Ejecutamos el cambio de valores
print(f"El valor de b es {b}\nEl valor de c es {c}\nEl valor de a es {a}")


print("""
██████╗ ██████╗  ██████╗  ██████╗ ██████╗  █████╗ ███╗   ███╗ █████╗     ██████╗    
██╔══██╗██╔══██╗██╔═══██╗██╔════╝ ██╔══██╗██╔══██╗████╗ ████║██╔══██╗    ╚════██╗██╗
██████╔╝██████╔╝██║   ██║██║  ███╗██████╔╝███████║██╔████╔██║███████║     █████╔╝╚═╝
██╔═══╝ ██╔══██╗██║   ██║██║   ██║██╔══██╗██╔══██║██║╚██╔╝██║██╔══██║    ██╔═══╝ ██╗
██║     ██║  ██║╚██████╔╝╚██████╔╝██║  ██║██║  ██║██║ ╚═╝ ██║██║  ██║    ███████╗╚═╝
╚═╝     ╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝  ╚═╝    ╚══════╝   
                                                                                    
""")
#ESTE PROGRAMA REALIZA OPERACIONES ARITMETICAS

#Pedimos al usuario que ingrese los valores
num1 = float(input("Ingrese el primer numero: "))
num2 = float(input("Ingrese el segundo numero: "))

#Realizamos las operaciones
suma = num1 + num2
resta = num1 - num2
multiplicacion = num1 * num2
division = num1 / num2
modulo = num1 % num2
division_entera = num1 // num2
potencia = num1 ** num2

#Mostramos los resultados
print(f"La Suma de sus 2 valores es: {suma}")
print(f"La Resta de sus 2 valores es: {resta}")
print(f"La Multiplicación de sus 2 valores es: {multiplicacion}")
print(f"La División de sus 2 valores es: {division}")
print(f"El Módulo de sus 2 valores es: {modulo}")
print(f"La División entera de sus valores es: {division_entera}")
print(f"La Potencia de sus 2 valores es: {potencia}")


print("""
██████╗ ██████╗  ██████╗  ██████╗ ██████╗  █████╗ ███╗   ███╗ █████╗     ██████╗    
██╔══██╗██╔══██╗██╔═══██╗██╔════╝ ██╔══██╗██╔══██╗████╗ ████║██╔══██╗    ╚════██╗██╗
██████╔╝██████╔╝██║   ██║██║  ███╗██████╔╝███████║██╔████╔██║███████║     █████╔╝╚═╝
██╔═══╝ ██╔══██╗██║   ██║██║   ██║██╔══██╗██╔══██║██║╚██╔╝██║██╔══██║     ╚═══██╗██╗
██║     ██║  ██║╚██████╔╝╚██████╔╝██║  ██║██║  ██║██║ ╚═╝ ██║██║  ██║    ██████╔╝╚═╝
╚═╝     ╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝  ╚═╝    ╚═════╝    
                                                                                    
""")
#ESTE PROGRAMA CONVIERTE CELSIUS A FARENHEIT

#Pedimos al usuario que ingrese los grados celsius
celsius = float(input("Ingrese los grados Celsius que quiera convertir a Farenheit: "))
#Realizamos la conversión
fahrenheit = (celsius * 9/5) + 32
#Mostramos el resultado
print(f"Los grados Celsius {celsius} son equivalentes a {fahrenheit} grados Fahrenheit")



print("""
██████╗ ██████╗  ██████╗  ██████╗ ██████╗  █████╗ ███╗   ███╗ █████╗     ██╗  ██╗   
██╔══██╗██╔══██╗██╔═══██╗██╔════╝ ██╔══██╗██╔══██╗████╗ ████║██╔══██╗    ██║  ██║██╗
██████╔╝██████╔╝██║   ██║██║  ███╗██████╔╝███████║██╔████╔██║███████║    ███████║╚═╝
██╔═══╝ ██╔══██╗██║   ██║██║   ██║██╔══██╗██╔══██║██║╚██╔╝██║██╔══██║    ╚════██║██╗
██║     ██║  ██║╚██████╔╝╚██████╔╝██║  ██║██║  ██║██║ ╚═╝ ██║██║  ██║         ██║╚═╝
╚═╝     ╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝  ╚═╝         ╚═╝   
                                                                                    
""")
#ESTE PROGRAMA CALCULA EL AREA DE UN CIRCULO

#Definimos la constante PI
PI = 3.1416

radio = float(input("Ingrese el radio del circulo: ")) #Pedimos al usuario que ingrese el radio del circulo
area = PI * (radio**2) #Calculamos el area del circulo
print(f"El area del circulo es: {area}")

print("""

██████╗ ██████╗  ██████╗  ██████╗ ██████╗  █████╗ ███╗   ███╗ █████╗     ███████╗   
██╔══██╗██╔══██╗██╔═══██╗██╔════╝ ██╔══██╗██╔══██╗████╗ ████║██╔══██╗    ██╔════╝██╗
██████╔╝██████╔╝██║   ██║██║  ███╗██████╔╝███████║██╔████╔██║███████║    ███████╗╚═╝
██╔═══╝ ██╔══██╗██║   ██║██║   ██║██╔══██╗██╔══██║██║╚██╔╝██║██╔══██║    ╚════██║██╗
██║     ██║  ██║╚██████╔╝╚██████╔╝██║  ██║██║  ██║██║ ╚═╝ ██║██║  ██║    ███████║╚═╝
╚═╝     ╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝  ╚═╝    ╚══════╝   
                                                                                                                                                                     
""")
#ESTE PROGRAMA CALCULA EL AREA DE UN TRIANGULO
base = float(input("Ingrese la base del triangulo: ")) #Pedimos al usuario que ingrese la base del triangulo
altura = float(input("Ingrese la altura del triangulo: ")) #Pedimos al usuario que ingrese la altura del triangulo

#Realizamos el calculo del area del triangulo
area = (base * altura) / 2
print(f"El area del triangulo con base: {base}y altura {altura} es: {area}")


print("""
██████╗ ██████╗  ██████╗  ██████╗ ██████╗  █████╗ ███╗   ███╗ █████╗      ██████╗    
██╔══██╗██╔══██╗██╔═══██╗██╔════╝ ██╔══██╗██╔══██╗████╗ ████║██╔══██╗    ██╔════╝ ██╗
██████╔╝██████╔╝██║   ██║██║  ███╗██████╔╝███████║██╔████╔██║███████║    ███████╗ ╚═╝
██╔═══╝ ██╔══██╗██║   ██║██║   ██║██╔══██╗██╔══██║██║╚██╔╝██║██╔══██║    ██╔═══██╗██╗
██║     ██║  ██║╚██████╔╝╚██████╔╝██║  ██║██║  ██║██║ ╚═╝ ██║██║  ██║    ╚██████╔╝╚═╝
╚═╝     ╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝  ╚═╝     ╚═════╝    
                                                                                     
""")

#ESTE PROGRAMA CALCULA EL PROMEDIO DE CALIFICAIONES

#El programa solicita las calificaciones de 5 materias al usuario

calificacion1 = float(input("Ingrese la calificación de la materia 1: "))
calificacion2 = float(input("Ingrese la calificación de la materia 2: "))
calificacion3 = float(input("Ingrese la calificación de la materia 3: "))
calificacion4 = float(input("Ingrese la calificación de la materia 4: "))
calificacion5 = float(input("Ingrese la calificación de la materia 5: "))

#Calculamos el promedio de las calificaciones
promedio = (calificacion1 + calificacion2 + calificacion3 + calificacion4 + calificacion5) / 5

#Mostramos el promedio
print(f"El promedio de las calificaciones es: {promedio}")


print("""
██████╗ ██████╗  ██████╗  ██████╗ ██████╗  █████╗ ███╗   ███╗ █████╗     ███████╗   
██╔══██╗██╔══██╗██╔═══██╗██╔════╝ ██╔══██╗██╔══██╗████╗ ████║██╔══██╗    ╚════██║██╗
██████╔╝██████╔╝██║   ██║██║  ███╗██████╔╝███████║██╔████╔██║███████║        ██╔╝╚═╝
██╔═══╝ ██╔══██╗██║   ██║██║   ██║██╔══██╗██╔══██║██║╚██╔╝██║██╔══██║       ██╔╝ ██╗
██║     ██║  ██║╚██████╔╝╚██████╔╝██║  ██║██║  ██║██║ ╚═╝ ██║██║  ██║       ██║  ╚═╝
╚═╝     ╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝  ╚═╝       ╚═╝     
                                                                                    
""")

#ESTE PROGRAMA CONCATENA NOMBRES Y APELLIDOS

#Solicitamos el nombre y apellido del usuario
nombre = input("Ingrese su nombre: ")
apellido = input("Ingrese su apellido: ")

#Concatenamos el nombre y apellido
nombre_completo = nombre + " " + apellido

print(f"Su nombre completo es: {nombre_completo}")

print("""
██████╗ ██████╗  ██████╗  ██████╗ ██████╗  █████╗ ███╗   ███╗ █████╗      █████╗    
██╔══██╗██╔══██╗██╔═══██╗██╔════╝ ██╔══██╗██╔══██╗████╗ ████║██╔══██╗    ██╔══██╗██╗
██████╔╝██████╔╝██║   ██║██║  ███╗██████╔╝███████║██╔████╔██║███████║    ╚█████╔╝╚═╝
██╔═══╝ ██╔══██╗██║   ██║██║   ██║██╔══██╗██╔══██║██║╚██╔╝██║██╔══██║    ██╔══██╗██╗
██║     ██║  ██║╚██████╔╝╚██████╔╝██║  ██║██║  ██║██║ ╚═╝ ██║██║  ██║    ╚█████╔╝╚═╝
╚═╝     ╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝  ╚═╝     ╚════╝    
                                                                                    
""")
#ESTE PROGRAMA DICE SI ERES MAYOR DE EDAD O NO
edad = int(input("Dime tu edad: "))
mayor_de_edad = edad >= 18

print("Eres mayor de edad" * mayor_de_edad or "Eres menor de edad")

print("El codigo emula un if y else, si no eres mayor de edad,\n te dira que eres menor de edad, si eres mayor de edad,\n te dira que eres mayor de edad")


print("""
██████╗ ██████╗  ██████╗  ██████╗ ██████╗  █████╗ ███╗   ███╗ █████╗      █████╗    
██╔══██╗██╔══██╗██╔═══██╗██╔════╝ ██╔══██╗██╔══██╗████╗ ████║██╔══██╗    ██╔══██╗██╗
██████╔╝██████╔╝██║   ██║██║  ███╗██████╔╝███████║██╔████╔██║███████║    ╚██████║╚═╝
██╔═══╝ ██╔══██╗██║   ██║██║   ██║██╔══██╗██╔══██║██║╚██╔╝██║██╔══██║     ╚═══██║██╗
██║     ██║  ██║╚██████╔╝╚██████╔╝██║  ██║██║  ██║██║ ╚═╝ ██║██║  ██║     █████╔╝╚═╝
╚═╝     ╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝  ╚═╝     ╚════╝    
                                                                                    
""")

#Desarrollar un programa que permita ingresar una cantidad de dinero
#El programa debe mostrar cómo pagar ese monto con la menor cantidad de billetes y monedas colab

Cantidad_a_pagar = float(input("Ingrese la cantidad a pagar: "))

billete_500 = Cantidad_a_pagar // 500
Cantidad_a_pagar = Cantidad_a_pagar % 500
billete_200 = Cantidad_a_pagar // 200
Cantidad_a_pagar = Cantidad_a_pagar % 200
billete_100 = Cantidad_a_pagar // 100
Cantidad_a_pagar = Cantidad_a_pagar % 100
billete_50 = Cantidad_a_pagar // 50
Cantidad_a_pagar = Cantidad_a_pagar % 50
billete_20 = Cantidad_a_pagar // 20
Cantidad_a_pagar = Cantidad_a_pagar % 20
moneda_10 = Cantidad_a_pagar // 10
Cantidad_a_pagar = Cantidad_a_pagar % 10
moneda_5 = Cantidad_a_pagar // 5
Cantidad_a_pagar = Cantidad_a_pagar % 5
moneda_2 = Cantidad_a_pagar // 2
Cantidad_a_pagar = Cantidad_a_pagar % 2
moneda_1 = Cantidad_a_pagar // 1

print(f"Se debe pagar con: {billete_500} billetes de 500")
print(f"Se debe pagar con: {billete_200} billetes de 200")
print(f"Se debe pagar con: {billete_100} billetes de 100")
print(f"Se debe pagar con: {billete_50} billetes de 50")
print(f"Se debe pagar con: {billete_20} billetes de 20")
print(f"Se debe pagar con: {moneda_10} monedas de 10")
print(f"Se debe pagar con: {moneda_5} monedas de 5")
print(f"Se debe pagar con: {moneda_2} monedas de 2")
print(f"Se debe pagar con: {moneda_1} monedas de 1")


print("""
███████╗██╗███╗   ██╗       ██╗ 
██╔════╝██║████╗  ██║    ██╗╚██╗
█████╗  ██║██╔██╗ ██║    ╚═╝ ██║
██╔══╝  ██║██║╚██╗██║    ██╗ ██║
██║     ██║██║ ╚████║    ╚═╝██╔╝
╚═╝     ╚═╝╚═╝  ╚═══╝       ╚═╝ 
                                
""")
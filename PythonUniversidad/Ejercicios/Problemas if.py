print("""
██████╗ ██████╗  ██████╗  ██████╗ ██████╗  █████╗ ███╗   ███╗ █████╗      ██╗
██╔══██╗██╔══██╗██╔═══██╗██╔════╝ ██╔══██╗██╔══██╗████╗ ████║██╔══██╗    ███║
██████╔╝██████╔╝██║   ██║██║  ███╗██████╔╝███████║██╔████╔██║███████║    ╚██║
██╔═══╝ ██╔══██╗██║   ██║██║   ██║██╔══██╗██╔══██║██║╚██╔╝██║██╔══██║     ██║
██║     ██║  ██║╚██████╔╝╚██████╔╝██║  ██║██║  ██║██║ ╚═╝ ██║██║  ██║     ██║
╚═╝     ╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝  ╚═╝     ╚═╝
                                                                             
""")
#Este programa te dice si eres menor de edad, adulto o adulto mayor
edad = int(input("Ingrese su edad: "))
if edad >=1 and edad <= 17:
  print("Es menor de edad")
elif edad >= 18 and edad <= 64:
  print("Es adulto")
elif edad >=65 and edad <= 105:
  print("Es adulto mayor")
else:
  print("No creo que tengas esa edad")


print("""
██████╗ ██████╗  ██████╗  ██████╗ ██████╗  █████╗ ███╗   ███╗ █████╗     ██████╗ 
██╔══██╗██╔══██╗██╔═══██╗██╔════╝ ██╔══██╗██╔══██╗████╗ ████║██╔══██╗    ╚════██╗
██████╔╝██████╔╝██║   ██║██║  ███╗██████╔╝███████║██╔████╔██║███████║     █████╔╝
██╔═══╝ ██╔══██╗██║   ██║██║   ██║██╔══██╗██╔══██║██║╚██╔╝██║██╔══██║    ██╔═══╝ 
██║     ██║  ██║╚██████╔╝╚██████╔╝██║  ██║██║  ██║██║ ╚═╝ ██║██║  ██║    ███████╗
╚═╝     ╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝  ╚═╝    ╚══════╝
                                                                                 
""")

#Este programa te dice si un numero es positivo, negativo o cero
numero = int(input("Ingrese un numero:"))
if numero > 0:
  print("El numero es positivo")
elif numero < 0:
  print("El numero es negativo")
else:
  print("El numero es cero")


print("""
██████╗ ██████╗  ██████╗  ██████╗ ██████╗  █████╗ ███╗   ███╗ █████╗     ██████╗ 
██╔══██╗██╔══██╗██╔═══██╗██╔════╝ ██╔══██╗██╔══██╗████╗ ████║██╔══██╗    ╚════██╗
██████╔╝██████╔╝██║   ██║██║  ███╗██████╔╝███████║██╔████╔██║███████║     █████╔╝
██╔═══╝ ██╔══██╗██║   ██║██║   ██║██╔══██╗██╔══██║██║╚██╔╝██║██╔══██║     ╚═══██╗
██║     ██║  ██║╚██████╔╝╚██████╔╝██║  ██║██║  ██║██║ ╚═╝ ██║██║  ██║    ██████╔╝
╚═╝     ╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝  ╚═╝    ╚═════╝ 
                                                                                 
""")

#Este programa te dice si es noche o dia depende la hora que le des
hora = int(input("Dame una hora en formato 24hrs y sola la hora:"))
if hora < 12:
  print("Buenos dias")
elif hora < 19:
  print("Buenas tardes")
elif hora < 22:
  print("Buenas noches")
else:
  print("Ya deberias estar dormido")


print("""
██████╗ ██████╗  ██████╗  ██████╗ ██████╗  █████╗ ███╗   ███╗ █████╗     ██╗  ██╗
██╔══██╗██╔══██╗██╔═══██╗██╔════╝ ██╔══██╗██╔══██╗████╗ ████║██╔══██╗    ██║  ██║
██████╔╝██████╔╝██║   ██║██║  ███╗██████╔╝███████║██╔████╔██║███████║    ███████║
██╔═══╝ ██╔══██╗██║   ██║██║   ██║██╔══██╗██╔══██║██║╚██╔╝██║██╔══██║    ╚════██║
██║     ██║  ██║╚██████╔╝╚██████╔╝██║  ██║██║  ██║██║ ╚═╝ ██║██║  ██║         ██║
╚═╝     ╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝  ╚═╝         ╚═╝
                                                                                 
""")

#Este programa te dice si tu calificacion es excelente, bien, suficiente o insuficiente
calificacion = float(input("Dame tu calificacion:"))
if calificacion >= 9:
  print("Excelente")
elif calificacion >= 7:
  print("Bien")
elif calificacion > 5:
    print("Suficiente")
else:
    print("Insuficiente")

print("""
██████╗ ██████╗  ██████╗  ██████╗ ██████╗  █████╗ ███╗   ███╗ █████╗     ███████╗
██╔══██╗██╔══██╗██╔═══██╗██╔════╝ ██╔══██╗██╔══██╗████╗ ████║██╔══██╗    ██╔════╝
██████╔╝██████╔╝██║   ██║██║  ███╗██████╔╝███████║██╔████╔██║███████║    ███████╗
██╔═══╝ ██╔══██╗██║   ██║██║   ██║██╔══██╗██╔══██║██║╚██╔╝██║██╔══██║    ╚════██║
██║     ██║  ██║╚██████╔╝╚██████╔╝██║  ██║██║  ██║██║ ╚═╝ ██║██║  ██║    ███████║
╚═╝     ╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝  ╚═╝    ╚══════╝
                                                                                 
""")

#Este programa funciona como un menu telefonico
print("BIENVENIDO AL MENU TELEFONICO")
print("1. Consultar saldo")
print("2. Recargar saldo")
print("3. Ver promociones")
print("4. Hablar con el operador")
print("5. Salir")
opcion = int(input("Dame una opcion:"))
if opcion == 1:
  print("Tu saldo es de $100")
elif opcion == 2:
    recarga = float(input("Cuanto deseas recargar:"))
    print("Tu saldo actual es de $", 100 + recarga)
elif opcion == 3:
    print("Promocion de recarga doble")
elif opcion == 4:
    print("En un momento te atendera un operador")
elif opcion == 5:
    print("Gracias por usar el menu telefonico")
else:
   print("Opcion no valida")

print("""
██████╗ ██████╗  ██████╗  ██████╗ ██████╗  █████╗ ███╗   ███╗ █████╗      ██████╗ 
██╔══██╗██╔══██╗██╔═══██╗██╔════╝ ██╔══██╗██╔══██╗████╗ ████║██╔══██╗    ██╔════╝ 
██████╔╝██████╔╝██║   ██║██║  ███╗██████╔╝███████║██╔████╔██║███████║    ███████╗ 
██╔═══╝ ██╔══██╗██║   ██║██║   ██║██╔══██╗██╔══██║██║╚██╔╝██║██╔══██║    ██╔═══██╗
██║     ██║  ██║╚██████╔╝╚██████╔╝██║  ██║██║  ██║██║ ╚═╝ ██║██║  ██║    ╚██████╔╝
╚═╝     ╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝  ╚═╝     ╚═════╝ 
                                                                                  
""")

# Ordena de mayor a menor los numeros que ingreses
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


print("Fin")


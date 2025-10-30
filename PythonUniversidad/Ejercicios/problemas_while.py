
import time #funcion para la cuenta regresiva


print("""
██████╗ ██████╗  ██████╗  ██████╗ ██████╗  █████╗ ███╗   ███╗ █████╗      ██╗   
██╔══██╗██╔══██╗██╔═══██╗██╔════╝ ██╔══██╗██╔══██╗████╗ ████║██╔══██╗    ███║██╗
██████╔╝██████╔╝██║   ██║██║  ███╗██████╔╝███████║██╔████╔██║███████║    ╚██║╚═╝
██╔═══╝ ██╔══██╗██║   ██║██║   ██║██╔══██╗██╔══██║██║╚██╔╝██║██╔══██║     ██║██╗
██║     ██║  ██║╚██████╔╝╚██████╔╝██║  ██║██║  ██║██║ ╚═╝ ██║██║  ██║     ██║╚═╝
╚═╝     ╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝  ╚═╝     ╚═╝   
                                                                                
""")

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



print("""
██████╗ ██████╗  ██████╗  ██████╗ ██████╗  █████╗ ███╗   ███╗ █████╗     ██████╗ 
██╔══██╗██╔══██╗██╔═══██╗██╔════╝ ██╔══██╗██╔══██╗████╗ ████║██╔══██╗    ╚════██╗
██████╔╝██████╔╝██║   ██║██║  ███╗██████╔╝███████║██╔████╔██║███████║     █████╔╝
██╔═══╝ ██╔══██╗██║   ██║██║   ██║██╔══██╗██╔══██║██║╚██╔╝██║██╔══██║    ██╔═══╝ 
██║     ██║  ██║╚██████╔╝╚██████╔╝██║  ██║██║  ██║██║ ╚═╝ ██║██║  ██║    ███████╗
╚═╝     ╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝  ╚═╝    ╚══════╝
                                                                                 
""")



numero_n = int(input("El numero 2 a que potencia quieres elevarlo?"))
contador = 0
resultado = 1

while contador <numero_n:
    resultado *= 2
    contador += 1
    print(f"Resultado: {resultado}")



print("""
██████╗ ██████╗  ██████╗  ██████╗ ██████╗  █████╗ ███╗   ███╗ █████╗     ██████╗ 
██╔══██╗██╔══██╗██╔═══██╗██╔════╝ ██╔══██╗██╔══██╗████╗ ████║██╔══██╗    ╚════██╗
██████╔╝██████╔╝██║   ██║██║  ███╗██████╔╝███████║██╔████╔██║███████║     █████╔╝
██╔═══╝ ██╔══██╗██║   ██║██║   ██║██╔══██╗██╔══██║██║╚██╔╝██║██╔══██║     ╚═══██╗
██║     ██║  ██║╚██████╔╝╚██████╔╝██║  ██║██║  ██║██║ ╚═╝ ██║██║  ██║    ██████╔╝
╚═╝     ╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝  ╚═╝    ╚═════╝ 
                                                                                 
""")

cuenta_regresiva = int(input("Desde que numero empieza la cuenta regresiva hasta 0?"))
while cuenta_regresiva !=0:
    print(f"{cuenta_regresiva}")
    cuenta_regresiva-=1
    time.sleep(1)
    
print("¡¡FELIZ AÑO NUEVO!!")



print("""
██████╗ ██████╗  ██████╗  ██████╗ ██████╗  █████╗ ███╗   ███╗ █████╗     ██╗  ██╗
██╔══██╗██╔══██╗██╔═══██╗██╔════╝ ██╔══██╗██╔══██╗████╗ ████║██╔══██╗    ██║  ██║
██████╔╝██████╔╝██║   ██║██║  ███╗██████╔╝███████║██╔████╔██║███████║    ███████║
██╔═══╝ ██╔══██╗██║   ██║██║   ██║██╔══██╗██╔══██║██║╚██╔╝██║██╔══██║    ╚════██║
██║     ██║  ██║╚██████╔╝╚██████╔╝██║  ██║██║  ██║██║ ╚═╝ ██║██║  ██║         ██║
╚═╝     ╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝  ╚═╝         ╚═╝
                                                                                 
""")

correo1 = input("Escribe tu correo")
correo2 = input("Vuelve a escribir tu correo: ")
while correo1 !=correo2:
    print("Los correos no coinciden vuelvelo a intentar")
    correo2 = input("Vuelve a escribir tu correo")
print("CORREO CONFIRMADO")



print("""
██████╗ ██████╗  ██████╗  ██████╗ ██████╗  █████╗ ███╗   ███╗ █████╗     ███████╗
██╔══██╗██╔══██╗██╔═══██╗██╔════╝ ██╔══██╗██╔══██╗████╗ ████║██╔══██╗    ██╔════╝
██████╔╝██████╔╝██║   ██║██║  ███╗██████╔╝███████║██╔████╔██║███████║    ███████╗
██╔═══╝ ██╔══██╗██║   ██║██║   ██║██╔══██╗██╔══██║██║╚██╔╝██║██╔══██║    ╚════██║
██║     ██║  ██║╚██████╔╝╚██████╔╝██║  ██║██║  ██║██║ ╚═╝ ██║██║  ██║    ███████║
╚═╝     ╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝  ╚═╝    ╚══════╝
                                                                                 
""")


personas = []

while True:
    nombre = input("Nombre completo (o * para terminar): ")
    if nombre == "*":
        break
    edad = int(input("Edad: "))
    personas.append((nombre, edad))

if personas:
    persona_mas_joven = min(personas, key=lambda x: x[1])
    print(f"La persona más joven es {persona_mas_joven[0]} con {persona_mas_joven[1]} años.")
else:
    print("No se ingresaron personas.")







































print("""
███████╗██╗   ██╗███╗   ██╗ ██████╗██╗ ██████╗ ███╗   ██╗███████╗███████╗
██╔════╝██║   ██║████╗  ██║██╔════╝██║██╔═══██╗████╗  ██║██╔════╝██╔════╝
█████╗  ██║   ██║██╔██╗ ██║██║     ██║██║   ██║██╔██╗ ██║█████╗  ███████╗
██╔══╝  ██║   ██║██║╚██╗██║██║     ██║██║   ██║██║╚██╗██║██╔══╝  ╚════██║
██║     ╚██████╔╝██║ ╚████║╚██████╗██║╚██████╔╝██║ ╚████║███████╗███████║
╚═╝      ╚═════╝ ╚═╝  ╚═══╝ ╚═════╝╚═╝ ╚═════╝ ╚═╝  ╚═══╝╚══════╝╚══════╝
                                                                         
                                                  Por: /leonel Figueroa/
""")

print("""
 _____ _               _      _         __  
|  ___(_)             (_)    (_)       /  | 
| |__  _  ___ _ __ ___ _  ___ _  ___   `| | 
|  __|| |/ _ \ '__/ __| |/ __| |/ _ \   | | 
| |___| |  __/ | | (__| | (__| | (_) | _| |_
\____/| |\___|_|  \___|_|\___|_|\___/  \___/
     _/ |                                   
    |__/                                  
""")

#Funcion doble de un numero
def doble(int):
    print(int * 2)

#Invocamos la funcion
doble(8)
doble(10)
doble(12)


print("""
  ______ _               _      _         ___  
 |  ____(_)             (_)    (_)       |__ \ 
 | |__   _  ___ _ __ ___ _  ___ _  ___      ) |
 |  __| | |/ _ \ '__/ __| |/ __| |/ _ \    / / 
 | |____| |  __/ | | (__| | (__| | (_) |  / /_ 
 |______| |\___|_|  \___|_|\___|_|\___/  |____|
       _/ |                                    
      |__/                                     
""")

#Funcion para saber si un numero es par o impar
def par_impar(int):
    if  int % 2 == 0:
        print(f"El numero: {int} es par")
    else:
        print(f"El numero: {int} es impar")
        

#Invocamos la funcion
par_impar(8)
par_impar(9)

print("""

  ______ _               _      _         ____  
 |  ____(_)             (_)    (_)       |___ \ 
 | |__   _  ___ _ __ ___ _  ___ _  ___     __) |
 |  __| | |/ _ \ '__/ __| |/ __| |/ _ \   |__ < 
 | |____| |  __/ | | (__| | (__| | (_) |  ___) |
 |______| |\___|_|  \___|_|\___|_|\___/  |____/ 
       _/ |                                     
      |__/                                      
""")
#Funcion para encontrar el mayor de 3 numeros

def num_mayor(int,int2,int3):
    if int > int2 and int > int3:
        print(f"El numero mayor es: {int}")
    elif int2 > int and int2 > int3:
        print(f"El numero mayor es: {int2}")
    else:
        print(f"El numero mayor es: {int3}")

#Invocamos a  la funcion
num_mayor(8,9,10)

print("""
  ______ _               _      _         _  _   
 |  ____(_)             (_)    (_)       | || |  
 | |__   _  ___ _ __ ___ _  ___ _  ___   | || |_ 
 |  __| | |/ _ \ '__/ __| |/ __| |/ _ \  |__   _|
 | |____| |  __/ | | (__| | (__| | (_) |    | |  
 |______| |\___|_|  \___|_|\___|_|\___/     |_|  
       _/ |                                      
      |__/                                       
""")

#Ejercicio con funciones
Lista_inicial = ["rojo", "verde", "amarillo"]

#Creamos la funcion
def agregar_color():
    color = input("Que color deseas agregar a la lista: ")
    Lista_inicial.insert(0, color)     #Agregamos el color a la lista en la posicion 0(inicio)
    return Lista_inicial

#Invocamos la funcion
agregar_color()
print(Lista_inicial)      #Comprobamos si se añadio el color fuera de la funcion
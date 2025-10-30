print("""
██████  ██  ██████  ██████ ██  ██████  ███    ██  █████  ██████  ██  ██████  ███████ 
██   ██ ██ ██      ██      ██ ██    ██ ████   ██ ██   ██ ██   ██ ██ ██    ██ ██      
██   ██ ██ ██      ██      ██ ██    ██ ██ ██  ██ ███████ ██████  ██ ██    ██ ███████ 
██   ██ ██ ██      ██      ██ ██    ██ ██  ██ ██ ██   ██ ██   ██ ██ ██    ██      ██ 
██████  ██  ██████  ██████ ██  ██████  ██   ████ ██   ██ ██   ██ ██  ██████  ███████ 
                                                                                     
                                                                                     
""")

#sintaxis diccionario = {"clave1":"valor1", "clave2":"valor2",:...}

#Diccionario simple
mi_diccionario = {
    "nombre": "Juan",
    "edad": 30,
    "ciudad": "Tepatitlán de Morelos",
}

print(mi_diccionario)

#Acceder a un valor mediante la clave:

print(mi_diccionario["nombre"]) #imprime juan
print(mi_diccionario["edad"]) #imprime 25

#Agregar o modificar elementos:
#agrega una clave – valor
mi_diccionario["profesion"] = "programador"


#Modificar un valor existente:

mi_diccionario["edad"] = 26
print(mi_diccionario)

#Eliminar un elemento:
mi_diccionario.pop("ciudad")
print(mi_diccionario)                  #Lo elimina por su clave

#Otra forma de eliminar un elemento:
del mi_diccionario["ciudad"]
print(mi_diccionario)                  #Elimina la clave y su valor


#Diferencias entre pop y del:
#del elimina la clave y su valor pero no devuelve nada, si la clave no existe
#lanza un KeyError
#pop() Elimina la clave y devuelve el valor, además puedes especificar un
#valor por defecto para evitar un KeyError


#Eliminar todo el diccionario
del mi_diccionario
print(mi_diccionario)   #Error porque el diccionario ya no existe

#Recorrer un diccionario
mi_diccionario = {
    "nombre": "Juan",
    "edad": 30,
    "ciudad": "Tepatitlán de Morelos",
}

for clave, valor in mi_diccionario.items():
    print(f"La clave es: {clave} y el valor es: {valor}")



# Métodos útiles en diccionarios
# keys(): devuelve todas las claves del diccionario
# values(): Devuelve todos los valores del diccionario
# items(): Devuelve una lista de tuplas con las claves y valores
# get(): Devuelve el valor asociado a una clave específica en un
# diccionario.
# La ventaja de usar get() en lugar de acceder directamente al
# diccionario con diccionario[clave] es que get() no lanza una excepción
# si la clave no existe.
# En su lugar, devuelve un valor predeterminado (que por defecto es
# None).

diccionario_simple = {
    "nombre": "Juan",
    "edad": 30,
    "ciudad": "Tepatitlán de Morelos",
    "profesion": "programador",
}


print(diccionario_simple.get("nombre")) #Devuelve Juan
print(mi_diccionario.get("RFC"))     #Devuelve None  
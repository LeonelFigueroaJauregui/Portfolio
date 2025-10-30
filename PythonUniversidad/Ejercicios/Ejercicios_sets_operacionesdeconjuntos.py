print("""

███████╗     ██╗███████╗██████╗  ██████╗██╗ ██████╗██╗ ██████╗      ██╗
██╔════╝     ██║██╔════╝██╔══██╗██╔════╝██║██╔════╝██║██╔═══██╗    ███║
█████╗       ██║█████╗  ██████╔╝██║     ██║██║     ██║██║   ██║    ╚██║
██╔══╝  ██   ██║██╔══╝  ██╔══██╗██║     ██║██║     ██║██║   ██║     ██║
███████╗╚█████╔╝███████╗██║  ██║╚██████╗██║╚██████╗██║╚██████╔╝     ██║
╚══════╝ ╚════╝ ╚══════╝╚═╝  ╚═╝ ╚═════╝╚═╝ ╚═════╝╚═╝ ╚═════╝      ╚═╝
                                                                       
""")

set1 = {1, 2, 3, 4, 5}
set2 = {4, 5, 6, 7, 8}

# Unión
union_set = set1 | set2
print("Unión:", union_set)

# Intersección
interserseccion_set = set1 & set2
print("Intersección:", interserseccion_set)

# Diferencia (set1 - set2)
diferencia_set = set1 - set2
print("Diferencia (set1 - set2):", diferencia_set)

# Diferencia simétrica
diferencia_simetrica_set = set1 ^ set2
print("Diferencia simétrica:", diferencia_simetrica_set)

# Verificar si set1 es un subconjunto de set2
subconjunto_set = set1.issubset(set2)
print("set1 es subconjunto de set2:", subconjunto_set)

# Verificar si set1 es un superconjunto de set2
superconjunto_set = set1.issuperset(set2)
print("set1 es superconjunto de set2:", superconjunto_set)

# Agregar el elemento 6 a set1 y eliminar el elemento 2 de set1
set1.add(6)
set1.remove(2)
print("set1 modificado:", set1)

# Eliminar todos los elementos de set2
set2.clear()
print("set2 modificado:", set2)

# Verificar si el elemento 3 está en set1
elemento_presente = 3 in set1
print("El elemento 3 está en set1:", elemento_presente)

# Encontrar la cantidad de elementos en set1
set1_longitud = len(set1)
print("Cantidad de elementos en set1:", set1_longitud)


print("""
███████╗     ██╗███████╗██████╗  ██████╗██╗ ██████╗██╗ ██████╗     ██████╗ 
██╔════╝     ██║██╔════╝██╔══██╗██╔════╝██║██╔════╝██║██╔═══██╗    ╚════██╗
█████╗       ██║█████╗  ██████╔╝██║     ██║██║     ██║██║   ██║     █████╔╝
██╔══╝  ██   ██║██╔══╝  ██╔══██╗██║     ██║██║     ██║██║   ██║    ██╔═══╝ 
███████╗╚█████╔╝███████╗██║  ██║╚██████╗██║╚██████╗██║╚██████╔╝    ███████╗
╚══════╝ ╚════╝ ╚══════╝╚═╝  ╚═╝ ╚═════╝╚═╝ ╚═════╝╚═╝ ╚═════╝     ╚══════╝
                                                                           
""")

#Datos tres conjuntos
setA = {1, 2, 3, 4, 5}
setB = {4, 5, 6, 7, 8}
setC = {5, 6, 9, 10 }


#Union de los 3
union_set = setA | setB | setC
print("Unión de los 3 conjuntos:", union_set)

#Intersección de los 3
interseccion_set = setA & setB & setC
print("Intersección de los 3 conjuntos:", interseccion_set)

#Diferencia de los 3
diferencia_set = setA - setB - setC 
print("Diferencia de los 3 conjuntos:", diferencia_set)



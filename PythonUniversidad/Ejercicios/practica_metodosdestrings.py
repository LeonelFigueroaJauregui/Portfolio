print("""
██████╗ ██████╗  █████╗  ██████╗████████╗██╗ ██████╗ █████╗ 
██╔══██╗██╔══██╗██╔══██╗██╔════╝╚══██╔══╝██║██╔════╝██╔══██╗
██████╔╝██████╔╝███████║██║        ██║   ██║██║     ███████║
██╔═══╝ ██╔══██╗██╔══██║██║        ██║   ██║██║     ██╔══██║
██║     ██║  ██║██║  ██║╚██████╗   ██║   ██║╚██████╗██║  ██║
╚═╝     ╚═╝  ╚═╝╚═╝  ╚═╝ ╚═════╝   ╚═╝   ╚═╝ ╚═════╝╚═╝  ╚═╝
                                                            
""")
#Le pedimos al usuario que introduzca una frase
frase = input("Introduzca una frase: ")


#Longitud de la frase
print(f"La longitud de su frase es de: {len(frase)}")

#Convierta toda la frase a minisculas
print(f"Su frase en minúsculas es: {frase.lower()}")

#Eliminamos los espacios en blanco al principio y al final de la cadena
print(f"Su frase sin espacios en blanco al principio y al final es: {frase.strip()}")

#Remplazamos todas las comas por puntos y muestra la nueva cadena
print(f"Su frase con las comas remplazadas por puntos es: {frase.replace(',', '.')}")

#Dividimos la cadena en palabras y cuenta cuantas palabras hay
print(f"Su frase dividida en palabras es: {frase.split()}")
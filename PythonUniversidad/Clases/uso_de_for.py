#Ejercicios de ciclos

for i in range(0,201,5):
  print(i)


for i in range(100,-101,-1):
    print(i)

for i in range(2, 101, 2):
   print(i)

for i in range(1, 102, 2):
    print(i)

for i in range(0,67,3):
    print(i)


for i in range(1,11):
   print(f"{i} por 6 = {6*i}")



for i in range(2):
      print("We will")
      print("rock you")


#------------------------------------------------------------------------------------------------------
#------------------------------------------------------------------------------------------------------
#------------------------------------------------------------------------------------------------------
#------------------------------------------------------------------------------------------------------



#EJERCICIOS

#Factorial e un numero
numero = int(input("Dame un numero entero: "))
factorial = 1
for i in range(1, numero +1):
    factorial = factorial * i
print(f"Tu factorial es {numero}, y el resultado es {factorial}")



#Piramede de signos ***
numero = int(input("Dame un numero entero: "))
for i in range(1, numero+1):
    print("*"*i)


#Limones y medios limones
limones = int(input("Dame el numero de limones: "))
if limones >=1:
    print("Un limon, medio limon")

for i in range(2, limones + 1):
     print(f"{i} limones, medio limon")



#Numeros del 1 al 20, excepto los multiplos de 5 con "continue"
for i in range(1, 21):
    if i % 5 == 0:
        continue
    print(i)
    

#Tablas de multiplicar al 10
for i in range(1, 11):
    print(f"Tabla del {i}")
    for j in range(1, 11):
        print(f"{i} x {j} = {i*j}")
    print("")











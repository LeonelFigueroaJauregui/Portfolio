#Metodo de la regla falsa
import math
def f(x):
    return math.exp(-x) - x
def regla_falsa(a, b, tol, max_iter):
    if f(a) * f(b) >= 0:
        print("La función no cambia de signo en el intervalo [a, b].")
        return None
    for i in range(max_iter):
        c = (a * f(b) - b * f(a)) / (f(b) - f(a))
        if abs(f(c)) < tol:
            print(f"Raíz encontrada: {c} en la iteración {i+1}")
            return c
        if f(c) * f(a) < 0:
            b = c
        else:
            a = c
    print("Número máximo de iteraciones alcanzado sin encontrar una raíz.")
    return None

# Ejemplo de uso
a = 0
b = 1
tol = 1e-5
max_iter = 100
raiz = regla_falsa(a, b, tol, max_iter)
if raiz is not None:
    print(f"La raíz aproximada es: {raiz}")












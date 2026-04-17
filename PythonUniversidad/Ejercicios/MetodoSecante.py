#Leonel Figueroa Jauregui
#11/03/2026


import numpy as np

import matplotlib.pyplot as plt

def metodo_secante(f, x0, x1, tolerancia=1e-6, max_iteraciones=100):
    """
    Implementa el método de la secante para encontrar raíces de una función.
    
    Args:
        f: función objetivo
        x0: primer punto inicial
        x1: segundo punto inicial
        tolerancia: criterio de convergencia
        max_iteraciones: número máximo de iteraciones
    
    Returns:
        raiz: aproximación de la raíz
        iteraciones: lista de iteraciones para gráfica
    """
    iteraciones = [(0, x0), (1, x1)]
    
    for i in range(2, max_iteraciones):
        fx0 = f(x0)
        fx1 = f(x1)
        
        if abs(fx1 - fx0) < 1e-12:
            break
        
        # Fórmula del método de la secante
        x2 = x1 - fx1 * (x1 - x0) / (fx1 - fx0)
        
        iteraciones.append((i, x2))
        
        if abs(x2 - x1) < tolerancia:
            return x2, iteraciones
        
        x0, x1 = x1, x2
    
    return x1, iteraciones




# Ejemplo de uso
def f(x):
    return x**3 - 2*x - 5

# Ejecutar método
raiz, iteraciones = metodo_secante(f, 2.0, 2.5)
print(f"Raíz aproximada: {raiz:.10f}")

# Gráfica
x = np.linspace(0, 3, 1000)
y = f(x)

plt.figure(figsize=(12, 5))

# Gráfica 1: Función y puntos
plt.subplot(1, 2, 1)
plt.plot(x, y, 'b-', label='f(x)')
plt.axhline(y=0, color='k', linestyle='--', alpha=0.3)
plt.plot(raiz, 0, 'ro', markersize=10, label=f'Raíz: {raiz:.6f}')
plt.grid(True, alpha=0.3)
plt.legend()
plt.xlabel('x')
plt.ylabel('f(x)')
plt.title('Método de la Secante')

# Gráfica 2: Convergencia
plt.subplot(1, 2, 2)
iters, valores = zip(*iteraciones)
plt.plot(iters, valores, 'bo-', markersize=6)
plt.axhline(y=raiz, color='r', linestyle='--', label='Raíz')
plt.grid(True, alpha=0.3)
plt.legend()
plt.xlabel('Iteración')
plt.ylabel('Valor de x')
plt.title('Convergencia')

plt.tight_layout()
plt.show()
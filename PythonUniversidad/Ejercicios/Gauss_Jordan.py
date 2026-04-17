import numpy as np

def gauss_jordan(matriz):
    """
    Resuelve un sistema de ecuaciones usando el método de Gauss-Jordan
    """
    # Convertir a float para evitar problemas de división
    A = matriz.astype(float)
    n = len(A)
    
    # Eliminación de Gauss-Jordan
    for i in range(n):
        # Buscar el pivote
        max_row = i
        for k in range(i + 1, n):
            if abs(A[k, i]) > abs(A[max_row, i]):
                max_row = k
        
        # Intercambiar filas
        A[[i, max_row]] = A[[max_row, i]]
        
        # Hacer el pivote igual a 1
        A[i] = A[i] / A[i, i]
        
        # Eliminar columna
        for k in range(n):
            if k != i:
                A[k] = A[k] - A[k, i] * A[i]
    
    return A

def main():
    print("=== Método de Gauss-Jordan ===\n")
    
    # Solicitar dimensiones
    n = int(input("Ingrese el número de ecuaciones: "))
    
    # Crear matriz aumentada
    print(f"\nIngrese los coeficientes de la matriz aumentada ({n}x{n+1}):")
    print("(Formato: ingrese cada fila separada por espacios)\n")
    
    matriz = []
    for i in range(n):
        fila = list(map(float, input(f"Fila {i+1}: ").split()))
        if len(fila) != n + 1:
            print(f"Error: Debe ingresar {n+1} valores")
            return
        matriz.append(fila)
    
    matriz = np.array(matriz)
    
    print("\nMatriz original:")
    print(matriz)
    
    # Resolver
    resultado = gauss_jordan(matriz)
    
    print("\nMatriz reducida (soluciones):")
    print(resultado)
    
    print("\nSoluciones:")
    for i in range(n):
        print(f"x{i+1} = {resultado[i, -1]:.6f}")

if __name__ == "__main__":
    main()
import math

def punto_fijo(g, x0, tol=1e-6, max_iter=100):
    """
    Método del Punto Fijo para encontrar raíces de f(x) = 0
    reescrita como x = g(x).

    Parámetros:
    -----------
    g        : función g(x) tal que x = g(x)
    x0       : valor inicial (aproximación inicial)
    tol      : tolerancia para el criterio de parada (default 1e-6)
    max_iter : número máximo de iteraciones (default 100)

    Retorna:
    --------
    raiz     : aproximación de la raíz encontrada
    iteraciones : lista con el historial de cada iteración
    """

    print(f"{'Iter':>5} {'x_n':>20} {'x_n+1':>20} {'Error abs':>15}")
    print("-" * 65)

    iteraciones = []
    x_actual = x0

    for i in range(1, max_iter + 1):
        x_nuevo = g(x_actual)
        error = abs(x_nuevo - x_actual)

        iteraciones.append({
            "iteracion": i,
            "x_n":       x_actual,
            "x_n1":      x_nuevo,
            "error":     error
        })

        print(f"{i:>5} {x_actual:>20.10f} {x_nuevo:>20.10f} {error:>15.2e}")

        if error < tol:
            print(f"\n✔ Convergencia alcanzada en {i} iteraciones.")
            return x_nuevo, iteraciones

        x_actual = x_nuevo

    print(f"\n✘ No convergió en {max_iter} iteraciones. Último valor: {x_actual:.10f}")
    return x_actual, iteraciones


# ─────────────────────────────────────────────
# EJEMPLO 1
# Encontrar la raíz de: f(x) = x³ - x - 1 = 0
# Reescrita como:        x = (x + 1)^(1/3)
# ─────────────────────────────────────────────
if __name__ == "__main__":
    print("=" * 65)
    print("EJEMPLO 1: f(x) = x³ - x - 1 = 0")
    print("Forma iterativa: g(x) = (x + 1)^(1/3)")
    print("=" * 65)

    g1 = lambda x: (x + 1) ** (1/3)
    raiz1, _ = punto_fijo(g1, x0=1.5, tol=1e-6)
    print(f"\nRaíz aproximada: {raiz1:.10f}")
    print(f"Verificación f(raíz) = {raiz1**3 - raiz1 - 1:.2e}\n")

    # ─────────────────────────────────────────────
    # EJEMPLO 2
    # Encontrar la raíz de: f(x) = cos(x) - x = 0
    # Reescrita como:        x = cos(x)
    # ─────────────────────────────────────────────
    print("=" * 65)
    print("EJEMPLO 2: f(x) = cos(x) - x = 0")
    print("Forma iterativa: g(x) = cos(x)")
    print("=" * 65)

    g2 = lambda x: math.cos(x)
    raiz2, _ = punto_fijo(g2, x0=0.5, tol=1e-6)
    print(f"\nRaíz aproximada: {raiz2:.10f}")
    print(f"Verificación f(raíz) = {math.cos(raiz2) - raiz2:.2e}\n")

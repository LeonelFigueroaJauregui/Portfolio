import math
import numpy as np
import matplotlib.pyplot as plt
def f(x):
    return x**2 + 4*x + 3


def bisection(f, a, b, tol):
    if f(a) * f(b) >= 0:
        print("La función no cambia de signo en el intervalo [a, b].")
        return None

    while (b - a) / 2 > tol:
        c = (a + b) / 2
        if f(c) == 0:
            return c
        elif f(a) * f(c) < 0:
            b = c
        else:
            a = c

    return (a + b) / 2



if __name__ == "__main__":
    x = np.linspace(-4, 0, 1000)
    y = f(x)

    fig = plt.figure()
    ax = plt.gca()
    plt.plot(x, y)
    plt.grid()

    ax.spines['left'].set_position('zero')
    ax.spines['right'].set_color('none')
    ax.spines['bottom'].set_position('zero')
    ax.spines['top'].set_color('none')

    plt.show()

    
    
    
    # uso
    root = bisection(f, -4, 0, 1e-6)
    print("Raíz aproximada:", root)


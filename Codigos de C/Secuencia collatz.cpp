#include <stdio.h>

// Función que calcula la longitud de la secuencia de Collatz
int longitud_collatz(long numero) 
{
    int longitud = 1; // Contamos el número inicial
    while (numero != 1) 
    {
        if (numero % 2 == 0) 
        {
            numero /= 2; // Si es par
        } else {
            numero = 3 * numero + 1; // Si es impar
        }
        longitud++; // Incrementamos la longitud
    }
    return longitud; // Devolvemos la longitud total
}

int main() 
{
    int longitud_maxima = 0; // Longitud máxima encontrada
    int numero_maximo = 0; // Número que produce la longitud máxima

    // CIclo FOR desde 1 hasta 999,999
    for (int i = 1; i < 1000000; i++) 
    {
        int longitud_actual = longitud_collatz(i); // Calculamos la longitud
        // Si la longitud actual es mayor que la máxima
        if (longitud_actual > longitud_maxima) 
        {
            longitud_maxima = longitud_actual; // Actualizamos la longitud máxima
            numero_maximo = i; // Actualizamos el número correspondiente
        }
    }

    // Imprimimos el resultado
    printf("El número inicial menor a un millón que produce la cadena más larga es: %d\n", numero_maximo);
    printf("La longitud de la cadena es: %d\n", longitud_maxima);

    return 0; 
}

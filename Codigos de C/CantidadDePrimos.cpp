#include <stdio.h>

int main()
{
    int cantidadPrimos, NumeroPrimo;
    int numeroActual, contadorPrimos;

     //Declara cuatro variables enteras:
     //CantidadPrimos (cantidad de números primos a mostrar), Numeroprimo(bandera para verificar si un número es primo), 
     //numeroActual (número actual a verificar) y contadorPrimos (contador de números primos encontrados).

    printf("¿Cuántos números primos quiere ver? ");
    scanf("%d", &cantidadPrimos);     //Muestra un mensaje al usuario y lee el número de primos que desea ver, almacenándolo en cantidadPrimos.

    numeroActual = 1;
    contadorPrimos = 0;        //Inicializa numeroActual en 1 y contadorPrimos en 0.

    while (contadorPrimos < cantidadPrimos)
    {           //Inicia un bucle while que se ejecuta mientras contadorPrimos sea menor que cantidadPrimos.
        NumeroPrimo = 1;

        for (int divisor = 2; divisor < numeroActual && NumeroPrimo; divisor++)
        {     //Inicia un bucle for que verifica si numumeroActual es divisible por algún número entre 2 y numeroActual-1.
            if (numeroActual % divisor == 0)
            {
                NumeroPrimo = 0;
            }
        }//Si numeroActual es divisible por divisor, Numeroprimo se establece en 0, indicando que numeroActual no es primo.

        if (NumeroPrimo)
        {
            printf("%d\n", numeroActual);
            contadorPrimos++;
        }//Si numeroPrimo sigue siendo 1 después del bucle for, numeroActual es primo y se imprime. Luego, se incrementa contadorPrimo.

        numeroActual++;
    }

    return 0;
}


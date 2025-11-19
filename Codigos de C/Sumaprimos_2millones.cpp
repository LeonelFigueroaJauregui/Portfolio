#include <stdio.h>

int NumeroPrimo(int d)     //Hacemos la Funcion primo
{
    if (d <= 1) return 0;
    if (d == 2) return 1;
    if (d % 2 == 0) return 0;
    for (int i = 3; i <= d / 2; i += 2) 
    {
        if (d % i == 0) return 0;
    }
    return 1;
}

int main() 
{
    long long suma = 0;
    const int limite = 2000000;    //Usamos variable long para soportar numeros altos

    for (int i = 2; i < limite; i++) 
    {
        if (NumeroPrimo(i))          //Usamos la funcion en el IF
        {
            suma += i;
        }
    }

    printf("La suma de todos los números primos hasta %d es: %lld\n", limite, suma);     //Imprimimos la suma
    return 0;
}

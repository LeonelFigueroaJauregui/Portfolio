#include <stdio.h>

//Nombra mi funcion
int Funcionpar(int);

int main() 
{
    int a = 1, b = 2;   //defino mis primeros 2 valores de la secuencia
    int suma = 2;       //Inicio la suma en 2 porque es el primer numero par
    
    printf("%d\n", a);
    printf("%d\n", b);        //Imprimo los primeros 2 numeros

    while (1)               //Creo un bucle infinito 
    { 
        int siguiente = a + b;         //Calcula el siguiente numero sumando los 2 anteriores
        if (siguiente > 4000000) break;    //Si el siguiente numero supera 4M rompe el bucle

        printf("%d\n", siguiente);

        if (Funcionpar) suma += siguiente;     //Reciclamos la función para identificar los numeros pares y los sume

        a = b;
        b = siguiente; 
    }

    printf("La suma de los números pares es: %d\n", suma);   //Imprimimos la suma de los numeros pares

    return 0;
}


//Creamos como funcionara la funcion
int Funcionpar(int d)
{
int z = d;
    if (d%2==0)
    {
        z = 1;
    }
else
{
    z = 0;
}

return z;
}
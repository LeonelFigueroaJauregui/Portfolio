#include <stdio.h>

int main()
{
    int a,suma;                                       //le damos nombre a las variables
    printf("Ingrese un valor numerico:");
    scanf("%d", &a);

    suma=0;
    while(a!=0)                         //While sirve para repetir que este adentro infinitamente hasta que se cumpla lo que dice dentro del parentesis, en este caso que a sea igual a 0 se parara el programa
    {
        suma = suma+a;

        printf("Ingrese otro valor numerico");
        scanf("%d", &a);


    }

    printf("La suma de sus valores es: %d\a", suma);

    return 0;
}

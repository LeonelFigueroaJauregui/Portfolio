#include <stdio.h>
int main()
{                                            //define mis variables y su nomre
    int n, primo;

    printf("Ingrese un numero");
    scanf("%d", &n);                         //espero que el usuario ingrese un numero entero

    primo=1;

    for(int x=2; x<n && primo; x++)         //uso el for para contar desde el 2 porque el 1 es un primo natural y cuente todos los posibles divisores
    {
        if(n%x==0)                          //uso el if y defino la variable para encontrar los primos = 0
        {
            primo=0;
        }
    }

    if(primo)
    {
        printf("%d es primo\n", n);                        //Si el numero que encontro es primo imprimir que es primo
    }
    else
    {                                                       //Uso la funcion else por si no es numero primo imprimir en la pantalla que no es primo
        printf("%d No es primo\n", n);
    }
    return 0;
 
}
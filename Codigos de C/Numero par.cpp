#include <stdio.h>
int main()
{
    int x=0;
    int par=0;
    printf("Dame el número: ");
    scanf("%d", &x);

    par=x%2;

    if(par==0)
    {
        printf("El numero %d es par." ,x);
    } 
    else
    {
        printf("El numero %d es impar" ,x);
    }


}

//If: determina si se cumple lo que dice lo imprime
//Else: si If no se cumple se hare lo que diga en esta funcion
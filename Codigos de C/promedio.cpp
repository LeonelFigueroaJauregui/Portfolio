#include <stdio.h>

int main()
{
    int a,num,suma;                      //definimos el nombre de nuestras variables
    float prom;                          //Un float o un double para imprimir el numero en decimal

    printf("Ingrese un valor numerico");
    scanf("%d", &a);

    num=0;
    suma=0;

    while(a!=0)
    {
        suma=suma+a;
        num=num+1;

        printf("Ingrese otro valor numerico");
        scanf("%d", &a);
    }

    prom = (float)suma/num;                    //El promedio lo sacara en float, dividiendo la suma entre los numeros

    printf("El promedio de tu suma es %.2f\a", prom);    //El &.2f es porque es float y para definir cuantos decimales quiero despues del punto

    return 0;
}
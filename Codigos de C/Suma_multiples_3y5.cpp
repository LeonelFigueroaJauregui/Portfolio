#include <stdio.h>


int main()
{
    int n;                        //definimos las variables
    int suma=0;
    
printf("Escribe un numero o cualquier cosa y dale Enter para que el programa imprima todos los multiplos del 3 y 5 hasta el 1000 y los sume ");
    scanf("%d", &n);


    for (int x=1; x<=1001; x++)                  //Ciclo for para encontrar hasta el 1000 los multiplos
    {
        if(x%3==0 || x%5==0)           //Imprimir solamente si son multiplos de 3 y 5
        {
            printf("%d \n", x);

            suma=suma+x;                 //sumar todos los resultados

        }
    }
   printf("La suma de tus multiplos es: \n %d", suma);
   return 0;

}
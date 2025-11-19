#include <stdio.h>

int main()
{
    char nombre[20];
    int edad;
    double altura;

    printf("Ingrese su nombre: ");
    scanf("%s", nombre);

    printf("Ingrese su edad: ");
    scanf("%d", &edad);

    printf("Ingrese su altura: ");
    scanf("%lf", &altura);

printf("Usted es %s, tiene %d años y una altura de %lf\n"
,nombre
,edad
,altura);

return 0;

}



//"scanf" sirve para recibir datos 
//%s(char) define valores alfanumericos como letras
//%d(int) define valores enteros 
//%lf(double) define valores flotantes como decimales
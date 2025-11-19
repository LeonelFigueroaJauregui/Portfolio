#include <stdio.h>

int main()
{
    char nombre [20];
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


}

// La "%s" define valores alfanumericos como las letras y la variable es: (char)
// La "%d" define valores enteros y la variable es: (int)
// la "%lf" define valores flotantes o numeros decimales y la variable es: (double)
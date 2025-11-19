                             //**Leonel Figueroa Jauregui */
                                    //**Billetes */

//Se ingresa por consola un número entero que representa un sueldo que se debe pagar.
//Considerando que existen billetes de las denominaciones que se indican más abajo;
//informar, que cantidad de billetes de cada denominación se deberá utilizar, dando prioridad a los de valor nominal más alto. 
//Denominaciones ($) = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1}  
//Utiliza funciones y variables tipo puntero usando el paso de argumentos por referencia.


#include <stdio.h>

void calcularBilletes(int* sueldo, int denominacion, int* cantidad) 
{
    *cantidad = *sueldo / denominacion;
    *sueldo %= denominacion;
}

int main() {
    int sueldo;
    printf("Ingrese el sueldo a pagar: ");
    scanf("%d", &sueldo);

    int billetes1000, billetes500, billetes200, billetes100, billetes50, billetes20, billetes10, billetes5, billetes2, billetes1;

    calcularBilletes(&sueldo, 1000, &billetes1000);
    calcularBilletes(&sueldo, 500, &billetes500);
    calcularBilletes(&sueldo, 200, &billetes200);
    calcularBilletes(&sueldo, 100, &billetes100);
    calcularBilletes(&sueldo, 50, &billetes50);
    calcularBilletes(&sueldo, 20, &billetes20);
    calcularBilletes(&sueldo, 10, &billetes10);
    calcularBilletes(&sueldo, 5, &billetes5);
    calcularBilletes(&sueldo, 2, &billetes2);
    calcularBilletes(&sueldo, 1, &billetes1);

    printf("Billetes de 1000: %d\n", billetes1000);
    printf("Billetes de 500: %d\n", billetes500);
    printf("Billetes de 200: %d\n", billetes200);
    printf("Billetes de 100: %d\n", billetes100);
    printf("Billetes de 50: %d\n", billetes50);
    printf("Billetes de 20: %d\n", billetes20);
    printf("Billetes de 10: %d\n", billetes10);
    printf("Billetes de 5: %d\n", billetes5);
    printf("Billetes de 2: %d\n", billetes2);
    printf("Billetes de 1: %d\n", billetes1);


return 0;
}


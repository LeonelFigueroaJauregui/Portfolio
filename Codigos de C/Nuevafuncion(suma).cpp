#include <stdio.h>
int main()
{
    int x;     
    int y;     
    int suma;  
    printf("Dame el primer numero: ");
    scanf("%d", &x);  
    printf("Dame el segundo numero: ");
    scanf("%d", &y);  
    suma = x + y;
    printf("El resultado es: %d", suma);
    return 0;
}
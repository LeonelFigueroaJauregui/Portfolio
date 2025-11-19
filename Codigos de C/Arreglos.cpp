#include <stdio.h>

int main() 
{
    int numeros[10];  // Array para almacenar los 10 números
    int i;

    // Pedir al usuario que ingrese los números
    printf("Por favor, ingrese 10 numeros enteros:\n");
    for(i = 0; i < 10; i++) {
        printf("Ingrese el numero %d: ", i+1);
        scanf("%d", &numeros[i]);
    }

    // Mostrar números en orden original
    printf("\nOrden original: ");
    for(i = 0; i < 10; i++) {
        printf("%d ", numeros[i]);
    }

    // Mostrar números en orden inverso
    printf("\nOrden inverso: ");
    for(i = 9; i >= 0; i--) {
        printf("%d ", numeros[i]);
    }
    
    printf("\n");
    return 0;
}
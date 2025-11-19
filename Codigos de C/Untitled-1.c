#include <stdio.h>

int Palindromo(char str[]) 
{
    int l = 0;
    int h = 0;

    // Calcular la longitud de la cadena manualmente
    while (str[h] != '\0') 
    {
        h++;
    }
    h--;

    while (h > l) 
    {
        if (str[l++] != str[h--]) 
        {
            return 0; // false
        }
    }
    return 1; // true
}

int main() 
{
    char str[100];
    printf("Introduce una cadena: ");
    scanf("%s", str);

    if (Palindromo(str)) 
    {
        printf("%s es un palindromo.\n", str);
    } else {
        printf("%s no es un palindromo.\n", str);
    }

    return 0;
}
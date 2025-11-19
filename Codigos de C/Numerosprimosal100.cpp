
#include <stdio.h>
int main()
{
    int x=0;
    int primo=0;
    printf("Dame el número: ");
    scanf("%d", &x);

    primo=x%x & x%1;

    if(primo==x)
    {
        printf("El numero %d es primo." ,x);
    } 
    

}

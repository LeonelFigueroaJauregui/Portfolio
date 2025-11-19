#include <stdio.h>

int main()
{
     int a,b;
     int mayor,menor;
     printf("Ingrese dos valores: ");
     scanf("%d %d",&a,&b);

     if( a>b )
     {
         mayor=a;
        menor=b;
     }

     else
     {
        mayor=b;
        menor=a;
      }
        printf("Mayor: %d\n",mayor);
        printf("Menor: %d\n",menor);
     return 0;
}
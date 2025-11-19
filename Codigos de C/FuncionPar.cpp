#include <stdio.h>

//Nombra mi funcion
int Funcionpar(int);

//Inicia el programa
int main()
{
    int x, y;
    printf("Ingrese un valor numerico: ");
    scanf("%d", &x);

    //invocar la función
    y = Funcionpar(x);
    if(y)
   {
    printf("Tu numero %d es par ", x);
   }
    
    else
    {
        printf("tu numero no es par");
        
    }
}

//Creamos como funcionara la funcion
int Funcionpar(int d)
{
int z = d;
    if (d%2==0)
    {
        z = 1;
    }
else
{
    z = 0;
}

return z;
}




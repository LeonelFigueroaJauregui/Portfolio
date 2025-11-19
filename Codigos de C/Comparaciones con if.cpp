#include <stdio.h>
int main()
{
    int x=0;
    printf("Eligue un numero");
    scanf("%d", &x);


    if(x==1000 || x>1000)
    {
        printf("El numero %d es grande",x  );

    }
    
    if(x==100 || x<999  ) 
    {
        printf("El numero %d es mediano", x);
    }

   

   

}
    
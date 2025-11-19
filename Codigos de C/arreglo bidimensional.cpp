#include <stdio.h>
 int main()
 {
      int boletas[6][3];
      int prom1=0, prom2=0, prom3=0, prom4=0, prom5=0;
       printf("Ingrese sus calificaciones (3 veces por estudiante):  ");
      for(int x=0; x<5; x++)
      {
          for(int y=0; y<3; y++)
          {
             
              scanf("%d", &boletas[x][y]);
          }
      }
      for(int x=0; x<5; x++)
      {
          for(int y=0; y<3; y++)
          {
            
              printf("%d/", boletas[x][y]);
          }
          printf("\n");
      }
      prom1=(boletas[0][0]+boletas[0][1]+boletas[0][2])/3;
       prom2=(boletas[1][0]+boletas[1][1]+boletas[1][2])/3;
        prom3=(boletas[2][0]+boletas[2][1]+boletas[2][2])/3;
         prom4=(boletas[3][0]+boletas[3][1]+boletas[3][2])/3;
          prom5=(boletas[4][0]+boletas[4][1]+boletas[4][2])/3;

printf("Promedio estudiante 1 %d\n", prom1);
printf("Promedio estudiante 2 %d\n", prom2);
printf("Promedio estudiante 3 %d\n", prom3);
printf("Promedio estudiante 4 %d\n", prom4);
printf("Promedio estudiante 5 %d\n", prom5);

     return 0;
 }
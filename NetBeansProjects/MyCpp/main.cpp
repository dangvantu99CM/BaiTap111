#include <stdio.h>
#include<conio.h>
int main(int argc, char** argv) {
   int i;
   int *ip;
   float x,*fp;
   i = 5;
   x = 5.5;
   ip = &i;  printf("\ni = %d x = %f",i,x);
   printf("\n&i = %p ip = %p",&i,ip);
   printf("\n&x = %p fp = %p",&x,fp);
   getch();
   return 0;
}


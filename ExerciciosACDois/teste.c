#include <stdio.h>
#include <stdlib.h>

int main(){
    int x = 20, y = 10;
while( x != y)
{
  x += 2;
  y += 3;
  printf("%d %d\n", x, y);
}
printf("Saiu do loop");
    return 0;
}
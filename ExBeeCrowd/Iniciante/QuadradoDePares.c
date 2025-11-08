#include <stdlib.h>
#include <stdio.h>

int main(){
    int maximo;
    scanf("%d", &maximo);
    for(int i = 1; i <= maximo; i++){
        if(i % 2 == 0){
            printf("%d^2 = %d\n", i, i * i);
        }
    }
    return 0;
}
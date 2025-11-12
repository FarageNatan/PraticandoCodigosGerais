#include <stdio.h>
#include <stdlib.h>

int main(){
    int numero;
    scanf("%d", &numero);
    for(int i = 1; i <= 10; i++){
        printf("%d x %d = %d\n", i, numero, i * numero);
    }
    return 0;
}
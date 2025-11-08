#include <stdio.h>
#include <stdlib.h>

int main(){
    int casos, numero;
    char resultado[50];
    scanf("%d", &casos);
    for(int i = 0; i < casos; i++){
        scanf("%d", &numero);
        if(numero > 0 && numero % 2 == 0){
            printf("EVEN POSITIVE\n");
        }else if(numero > 0 && numero % 2 != 0){
            printf("ODD POSITIVE\n");
        }else if(numero < 0 && numero % 2 == 0){
            printf("EVEN NEGATIVE\n");
        }else if(numero < 0 && numero % 2 != 0){
            printf("ODD NEGATIVE\n");
        }else if(numero == 0){
            printf("NULL\n");
        }
    }
    return 0;
}
#include <stdlib.h>
#include <stdio.h>

int main(){
    int casos;
    scanf("%d", &casos);
    int respostas[casos];
    
    for(int i = 0; i < casos; i++){
        scanf("%d", &respostas[i]);
    }

    for(int j = 0; j < casos; j++){
        printf("resposta %d: %d\n", j + 1, respostas[j]);
    }

    return 0;
}
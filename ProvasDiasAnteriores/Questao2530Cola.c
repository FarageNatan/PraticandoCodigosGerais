#include <stdio.h>
#include <stdlib.h>

int numRespostas(){
    int resp;
    scanf("%d", &resp);
    return resp;
}

int* respostasDasQuestoes(int n){
    int* respostas = (int*)malloc(sizeof(int) * n);
    for(int i = 0; i < n; i++){
        scanf("%d", &respostas[i]);
    }
    return respostas;
}

int* confereResposta(int* respostasRicardinho, int* respostasJuan, int tam1, int tam2){
    int* comparaIgual = (int*)malloc(sizeof(int) * tam1);
    


}



int main(){



    return 0;
}
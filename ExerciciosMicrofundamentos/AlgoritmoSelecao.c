#include <stdio.h>
#include <stdlib.h>

void swap(int i, int menor, int array[]){
    int temp = array[i];
    array[i] = array[menor];
    array[menor] = temp;
}


void ordenacaoSelecao(int array[]){
    int contarComp = 0;
    for(int i = 0; i < 8; i++){
        int menor = i;
        for(int j = (i + 1); j < 8; j++){
            contarComp++;
            if(array[menor] > array[j]){
                menor = j;
            }
        }
        swap(i, menor, array);
    }
    printf("A quantidade de comparaçoes foi: %i\n", contarComp);
}

int main(){
    int array[] = {15, 88, 32, 9, 12, 99, 43};
    printf("Vetor original: \n");
    for(int i = 0; i < 7; i++){
        printf("%i ", array[i]);
    }
    printf("\n");
    ordenacaoSelecao(array);
    printf("Vetor ordenado: \n");
    for(int j = 0; j < 7; j++){
        printf("%i ", array[j]);
    }
    printf("\n");

    return 0;
}
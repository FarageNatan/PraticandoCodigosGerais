#include <stdio.h>
#include <stdlib.h>

void swap(int i, int menor, int array[]){
    int temp = array[i];
    array[i] = array[menor];
    array[menor] = temp; 
}

void ordenaBolha(int array[]){
    int comparacoes = 0;
    for(int rep = (6 - 1); rep > 0; rep--){
        for(int bolha = 0; bolha < rep; bolha++){
            if(array[bolha] > array[bolha + 1]){
                comparacoes++;
                swap(bolha, bolha + 1, array);
            }
        }
    }
    printf("Foram feitas %i\n", comparacoes);
}

int main(){
    int array[] = {43, 11, 9, 84, 28, 91};
    
    printf("Array original: \n");
    for(int i = 0; i < 6; i++){
        printf("%i ", array[i]);
    }
    printf("\n");

    ordenaBolha(array);

    printf("Array ordenado: \n");
    for(int i = 0; i < 6; i++){
        printf("%i ", array[i]);
    }
    printf("\n");

    return 0;
}
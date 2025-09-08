#include <stdio.h>
#include <stdlib.h>

void insercao(int array[], int tamanho){
    for(int i = 1; i < tamanho; i++){
        int temp = array[i];
        int j = i - 1;
        while((j >= 0) && (array[j] > temp)){
            array[j + 1] = array[j];
            j--;
        }
        array[j + 1] = temp;
    }
}

int tamanhoVetor(int array[]){
    int cont = 0;
    for(int i = 0; array[i] != '\0'; i++){
        cont++;
    }
    return cont;
}

int main(){
    int array[] = {43, 9, 21, 66, 89, 13, 30};
    int tamanho = tamanhoVetor(array);
    
    printf("Vetor original: ");
    for(int i = 0; i < 8; i++){
        printf("%i ", array[i]);
    }
    printf("\n");
    
    insercao(array, tamanho);

    printf("Vetor ordenado: ");
    for(int j = 0; j < 8; j++){
        printf("%i ", array[j]);
    }
    printf("\n");

    return 0;
}
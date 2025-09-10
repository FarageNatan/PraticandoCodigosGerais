#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void swap(int array[], int i, int j){
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
}

void ordenarQuick(int array[], int esq, int dir){
    int i = esq, j = dir, pivo = array[(esq + dir) / 2];
    while(i <= j){
        while(array[i] < pivo){
            i++;
        }
        while(array[j] > pivo){
            j--;
        }
        if(i <= j){
            swap(array, i, j);
            i++;
            j--;
        }
    }
    if(esq < j) ordenarQuick(array, esq, j);
    if(i < dir) ordenarQuick(array, i, dir);
}

int main(){
    int tamanho = 100;
    int array[tamanho];
    
    srand(time(NULL));

    printf("Preenchendo o array com 100 numeros aleatorios...\n");
    for(int i = 0; i < tamanho; i++){
        array[i] = rand() % 1000; 
    }
    
    printf("\nArray original:\n");
    for(int j = 0; j < tamanho; j++){
        printf("%i ", array[j]);
    }
    printf("\n");

    ordenarQuick(array, 0, tamanho - 1);

    printf("\nArray ordenado:\n");
    for(int v = 0; v < tamanho; v++){
        printf("%i ", array[v]);
    }
    printf("\n");

    return 0;
}
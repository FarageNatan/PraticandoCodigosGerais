#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>
#include <string.h>

typedef struct Atleta {
    char nome[50];
    int peso;
} Atleta;

bool comparar(Atleta a1, Atleta a2){
    bool resp = false;
    if(a1.peso > a2.peso){
        resp = true;
    }else if(a1.peso < a2.peso){
        resp = false;
    }else{
        if(strcmp(a1.nome, a2.nome) < 0){
            resp = true;
        }
    }
    return resp;
}

void swap(Atleta* array, int i, int j){
    Atleta temp = array[i];
    array[i] = array[j];
    array[j] = temp;
}

void ordenar(Atleta* array, int tamArray){
    for(int i = 0; i < tamArray; i++){
        for(int j = tamArray - 1; j > i; j--){
            if(comparar(array[j], array[j - 1])){
                swap(array, j, j - 1);
            }
        }
    }
}

int main() {
    Atleta atletas[100];
    int cont = 0;

    //Armazena nome e peso de cada atleta
    while (cont < 100 && scanf("%49s %d", atletas[cont].nome, &atletas[cont].peso) != EOF){
        cont++;
    }

    if (cont > 0) {
        ordenar(atletas, cont);
    }

    for (int i = 0; i < cont; i++) {
        printf("%s %d\n", atletas[i].nome, atletas[i].peso);
    }

    return 0;
}
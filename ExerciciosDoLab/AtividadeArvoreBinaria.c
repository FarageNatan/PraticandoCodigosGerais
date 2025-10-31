#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

typedef struct ArvoreBinaria
{
    
};

typedef struct No
{
    int elemento;
    struct No* prox;
};



int main(){

    char linha[200];  
    char texto[4];     
    int numero;         

    while (fgets(linha, sizeof(linha), stdin) != NULL) {  // lê até EOF
        // Remove o '\n' do final da linha, se houver
        linha[strcspn(linha, "\n")] = '\0';

        // Tenta ler "texto número"
        int lidos = sscanf(linha, "%s %d", texto, &numero);

        if (lidos == 2) {
            // Caso 1: tem texto e número
            printf("CASO 1 -> texto: %s | numero: %d\n", texto, numero);
        } 
        else if (lidos == 1) {
            // Caso 2: apenas texto
            printf("CASO 2 -> texto: %s\n", texto);
        } 
        else {
            // Linha inválida (nem 1 nem 2 campos)
            printf("Linha ignorada: %s\n", linha);
        }
    }

    return 0;
}
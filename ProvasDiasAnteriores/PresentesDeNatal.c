#include <stdio.h>
#include <stdlib.h>

typedef struct
{
    char nome[51];
    double preco;
    int preferencia;
} Presente;

int ehMenor(char *s1, char *s2) {
    int resultado;
    int i = 0;
    
    while (s1[i] != '\0' && s2[i] != '\0') {
        if (s1[i] != s2[i]) {
            resultado = (s1[i] < s2[i]);
            return resultado; // Retorna imediatamente ao encontrar uma diferença
        }
        i++;
    }
    
    // Se uma string for prefixo da outra, a menor vem primeiro
    resultado = (s1[i] == '\0' && s2[i] != '\0');
    return resultado;
}

int ehMelhor(Presente p1, Presente p2){
    int resultado;
    if(p1.preferencia != p2.preferencia){
        resultado = (p1.preferencia > p2.preferencia);
    } else if(p1.preco != p2.preco){
        // ORDEM CRESCENTE de preco, como pedido no enunciado
        resultado = (p1.preco < p2.preco);
    } else {
        resultado = ehMenor(p1.nome, p2.nome);
    }
    return resultado;
}

void ordenarPresentes(Presente *lista, int n) {
    for (int i = 0; i < n - 1; i++) {
        int indiceDoMelhor = i;
        for (int j = i + 1; j < n; j++) {
            if (ehMelhor(lista[j], lista[indiceDoMelhor])) {
                indiceDoMelhor = j;
            }
        }
        Presente temp = lista[indiceDoMelhor];
        lista[indiceDoMelhor] = lista[i];
        lista[i] = temp;
    }
}

int main(){
    char nomePessoa[1000];
    int tamanhoLista;
    
    while(scanf(" %[^\n] %d", nomePessoa, &tamanhoLista) == 2){
        Presente lista[tamanhoLista];
        for (int i = 0; i < tamanhoLista; i++) {
            // Assume que nome do presente não tem espaços
            scanf("%s %lf %d", lista[i].nome, &lista[i].preco, &lista[i].preferencia);
        }

        ordenarPresentes(lista, tamanhoLista);

        printf("Lista de %s\n", nomePessoa);
        for (int i = 0; i < tamanhoLista; i++) {
            // CORREÇÃO: Formato de impressão com " - R$"
            printf("%s - R$%.2f\n", lista[i].nome, lista[i].preco);
        }
        printf("\n");
    }
    return 0;
}
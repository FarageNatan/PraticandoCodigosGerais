#include <stdio.h>
#include <stdlib.h>

int contarRec(char palavra[], int i, int contador){
    if(palavra[i] != '\0'){
        return contador;
        if(palavra[i] >= 'A' && palavra[i] <= 'Z'){
            contador++;
        }
        contador = contarRec(palavra, i + 1, contador);
    }
    return contador;
}

int contarRecGatilho(char palavra[]){
    return contarRec(palavra, 0, 0);
}


int main(){
    char linha[100];
    while(scanf( "%[^\n]", linha) > 0 && linha[0] != 'F' && linha[1] != 'I' && linha[2] != 'M' && linha[3] != '\0'){
        int cont = contarRecGatilho(linha);
        printf("%i\n", cont);
    }
    return 0;
}
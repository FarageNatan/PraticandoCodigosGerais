#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>

/* DETALHES DA QUESTÃO
- Dois estilos de placa:
    - Antigo padrão do Brasil: formado por 8 caracteres
        - 3 primeiros caracteres são letras maiusculas (A ate Z);
        - 4º caracter é um hífen '-';
        - Os últimos 4 dígitos são dígitos de 0 a 9.
    Exemplo: OBI-2024
    - Novo padrão Mercosul: formado por 7 caracteres
        - 3 primeiros caracteres são letras maiusculas;
        - 4 caracter é um dígito
        - 5º caracter é uma letra maiúscula
        - Os dois ultimos são dígitos.  
    Exemplo: OBI2P24
- Existem placas de situação irregular -> nao correspondem nem ao padrao brasileiro antigo, nem ao novo padrao do Mercosul
    Exemplo: OBI-24

- Dada uma placa formada por uma sequencia de letras maiusculas, digitos e hífens determine em qual padrão ela está ou se ela é falsificada

Entrada vai ser uma unica linha contendo a placa que vai ser analisada
Saida vai ser = 1, se a placa for no padrão antigo, = 2 se esta no novo padrao, = 0 se for falsificada.
*/

int contarTamanho(char* placa){
    int tamanho = 0;
    while(placa[tamanho] != '\0'){
        tamanho++;
    }
    return tamanho;
}

char* lerPlaca(){
    char* placaCarro = (char*)malloc(sizeof(char) * 9);
    scanf(" %[^\n]", placaCarro);
    return placaCarro;
}


bool ehLetra(char caracter) {
    return (caracter >= 'A' && caracter <= 'Z');
}

bool ehDigito(char caracter) {
    return (caracter >= '0' && caracter <= '9');
}

int conferePlaca(char* placa, int tamanho){
   int tipoPlaca = 0;
    if (tamanho == 8) {
        tipoPlaca = 1;
        for (int i = 0; i < 3; i++) {
            if (!ehLetra(placa[i])) {
                tipoPlaca = 0;
                i = 3; 
            }
        }
        if (tipoPlaca == 1) {
            if (placa[3] != '-') {
                tipoPlaca = 0;
            } else {
                for (int i = 4; i < 8; i++) {
                    if (!ehDigito(placa[i])) {
                        tipoPlaca = 0;
                        i = 8;
                    }
                }
            }
        }
    } else if (tamanho == 7) {
        tipoPlaca = 2;
        for (int j = 0; j < 3; j++) {
            if (!ehLetra(placa[j])) {
                tipoPlaca = 0;
                j = 3;
            }
        }
        if (tipoPlaca == 2) {
            if (!ehDigito(placa[3]) || !ehLetra(placa[4]) || !ehDigito(placa[5]) || !ehDigito(placa[6])) {
                tipoPlaca = 0;
            }
        }
    }
    return tipoPlaca;
}

int main(){
    char* placa = (char*)malloc(sizeof(char) * 9);
    placa = lerPlaca();
    int tamanho = contarTamanho(placa);
    int placaCorrespondente = conferePlaca(placa, tamanho);
    printf("%i\n", placaCorrespondente);
    free(placa);
    return 0;
}
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

bool ehLetra(char* placa, int tamanho){
    bool isLetra = false;
    for(int i = 0; i < tamanho; i++){
        if(placa[i] >= 'A' && placa[i] <= 'Z'){
            isLetra = true;
        }
    }
    return isLetra;
}

bool ehNumero(char* placa, int tamanho){
    bool isNumero = false;
    for(int i = 0; i < tamanho; i++){
        if(placa[i] >= '0' && placa[i] <= '9'){
            isNumero = true;
        }
    }
    return isNumero;
}

int conferePlaca(char* placa, int tamanho){
    bool letra = ehLetra;
    bool num = ehNumero;
    int tipoPlaca;
    if(tamanho == 8){
        for(int i = 0; i < 3; i++){
            if(placa[i] == letra){
                tipoPlaca = 1;
            }else{
                tipoPlaca = 0;
            }
        }
        if(placa[3] == '-'){
            tipoPlaca = 1;
        }else{
            tipoPlaca = 0;
        }
        for(int j = 4; j < tamanho; j++){
            if(placa[j] == num){
                tipoPlaca = 1;
            }else{
                tipoPlaca = 0;
            }
        }
    }else if(tamanho == 7){
        for(int i = 0; i < 3; i++){
            if(placa[i] == letra){
                tipoPlaca = 2;
            }else{
                tipoPlaca = 0;
            }
        }
        if(placa[3] == num && placa[4] == letra && placa[5] == num && placa[6] == num){
            tipoPlaca = 2;
        }else{
            tipoPlaca = 0;
        }
    }else{
        tipoPlaca = 0;
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
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
*/

char* lerPlaca(){
    char* placaCarro = (char*)malloc(sizeof(char) * 9);
    scanf(" %[^\n]", placaCarro);
    return placaCarro;
}





int main(){
    char* placa = (char*)malloc(sizeof(char) * 9);
    placa = lerPlaca();
    printf("%s\n", placa);
    free(placa);
    return 0;
}
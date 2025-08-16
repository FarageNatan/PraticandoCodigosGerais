#include <stdio.h>
#include <stdlib.h>
/*Laboratório 1
- Aquecimento em C usando abordagem iterativa e recursiva
- Não pode ser usado: string.h, ctype.h 
Exercício 1 (Aquecimento Iterativo em C): 
Crie um metodo iterativo em C que recebe uma string como parâmetro e retorna a quantidade de caracteres maiúsculos presentes na string. Teste seu programa usando redirecionamento de entrada e saída fornecidos. A entrada padrão é composta por várias linhas, onde cada linha contém um string. A última linha contém a palavra FIM, indicando a finalização da entrada de dados. O programa deve imprimir, para cada string de entrada, a quantidade de caracteres maiúsculos.
Exercício 2 (Aquecimento Recursivo em C): 
Refaça o exercício 1, porém com o método implementado de forma recursiva.*/

int quantidadeMaiusculas(char palavra[]){
    int contador = 0;
    for(int i = 0; palavra[i] != '\0'; i++){
        if(palavra[i] >= 'A' && palavra[i] <= 'Z'){
            contador++;
        }
    }
    return contador;
}


int main(){
    char palavra[100];
    int cont = 0;
    scanf(" %[^\r\n]", palavra);
    while(palavra[0] != 'F' && palavra[1] != 'I' && palavra[2] != 'M' && palavra[3] != '\0'){
        cont = quantidadeMaiusculas(palavra);
        printf("%i\n", cont);
        scanf(" %[^\r\n]", palavra);
    }
    return 0;
}
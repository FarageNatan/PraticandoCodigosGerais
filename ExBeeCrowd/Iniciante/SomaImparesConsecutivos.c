#include <stdio.h>
#include <stdlib.h>

int main(){
    int soma = 0;
    int num1, num2;
    scanf("%d %d", &num1, &num2);
    if(num1 < num2){
        for(int i = num1 + 1; i <= num2; i++){
            if(i % 2 != 0){
                soma += i;
            }
        }
    }else{
        for(int j = num2 + 1; j < num1; j++){
            if(j % 2 != 0){
                soma += j;
            }
        }
    }
    printf("%d\n", soma);
    return 0;
}
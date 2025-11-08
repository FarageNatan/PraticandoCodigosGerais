#include <stdio.h>
#include <stdlib.h>

int main(){
    int casos;
    scanf("%d", &casos);
    int dentro = 0, fora = 0, numero;
    for(int i = 0; i < casos; i++){
        scanf("%d", &numero);
        if(numero >= 10 && numero <= 20){
            dentro++;
        }else{
            fora++;
        }
    }
    printf("%d in\n %d out\n", dentro, fora);
    return 0;
}
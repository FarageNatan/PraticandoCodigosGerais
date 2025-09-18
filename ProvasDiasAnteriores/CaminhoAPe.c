#include <stdio.h>
#include <stdlib.h>

int main(){
    int pontosOnibus[] = {0, 400, 800, 1200, 1600, 2000};
    int qualPonto = pontosOnibus[0];
    int distanciaEscola;

    printf("Distancia Escola: ");
    scanf("%d", &distanciaEscola);

    for(int i = 0; i < 6; i++){
        if(distanciaEscola > qualPonto){
            qualPonto = pontosOnibus[i];
        }
    }
    
    int caminhar = qualPonto - distanciaEscola;

    printf("%d", caminhar);

    return 0;
}
#include <stdio.h>
#include <stdlib.h>

int main(){
    int qtd_resp1, qtd_resp2;
    while(scanf("%d %d", &qtd_resp1, &qtd_resp2) != EOF){
        printf("%i %i\n", qtd_resp1, qtd_resp2);
        int* resp1 = (int*)malloc(sizeof(int) * qtd_resp1);
        int* resp2 = (int*)malloc(sizeof(int) * qtd_resp2);
        for(int i = 0; i < qtd_resp1; i++){
            int valor;
            scanf("%d", &resp1[i]);
        }
        for(int j = 0; j < qtd_resp2; j++){
            scanf("%d", &resp2[j]);
        }
        int p = 0;
        for(int v = 0; v < qtd_resp1; v++){
            if(resp2[p] == resp1[v]){
                p++;
            }
        }
        if(p == qtd_resp2){
            printf("sim\n");
        }else{
            printf("nao\n");
        }

    }
    return 0;
}
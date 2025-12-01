#include <stdlib.h>
#include <stdio.h>

int main() {
    int idadeHuguinho, idadeZezinho, idadeLuizinho;
    scanf("%d %d %d", &idadeHuguinho, &idadeZezinho, &idadeLuizinho);

    if ((idadeHuguinho > idadeZezinho && idadeHuguinho < idadeLuizinho) || (idadeHuguinho < idadeZezinho && idadeHuguinho > idadeLuizinho)) {
        printf("huguinho\n");
    } else if ((idadeZezinho > idadeHuguinho && idadeZezinho < idadeLuizinho) || (idadeZezinho < idadeHuguinho && idadeZezinho > idadeLuizinho)) {
        printf("zezinho\n");
    } else {
        printf("luisinho\n");
    }

    return 0;
}
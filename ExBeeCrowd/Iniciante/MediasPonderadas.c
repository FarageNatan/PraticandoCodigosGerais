#include <stdlib.h>
#include <stdio.h>

int main() {
    int casosTeste = 0;
    scanf("%d", &casosTeste);

    int i = 0;
    float media;
    float valores[3];

    while (i < casosTeste) {
        for (int j = 0; j < 3; j++) {
            scanf("%f", &valores[j]);
        }
        media = ((valores[0] * 2) + (valores[1] * 3) + (valores[2] * 5)) / 10;
        printf("%.1f\n", media);
        i++;
    }

    return 0;
}
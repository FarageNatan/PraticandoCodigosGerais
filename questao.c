#include <stdio.h>

#define MOD 1000000007

void bubbleSort(int v[], int n) {
    int i, j;
    for (i = 0; i < n - 1; i++) {
        for (j = 0; j < n - 1 - i; j++) {
            if (v[j] > v[j + 1]) {
                int aux = v[j];
                v[j] = v[j + 1];
                v[j + 1] = aux;
            }
        }
    }
}

int main() {
    int N, K;

    while (scanf("%d %d", &N, &K) != EOF) {

        int notas[N];
        int i;

        for (i = 0; i < N; i++) {
            scanf("%d", &notas[i]);
        }

        // Ordenar usando Bubble Sort
        bubbleSort(notas, N);

        // Pegar a K-ésima maior nota
        // K = 1 → maior
        // K = 2 → segunda maior
        // índice correspondente = N - K
        long long resposta = notas[N - K];
        resposta %= MOD;

        printf("%lld\n", resposta);
    }

    return 0;
}

package ExerciciosMicrofundamentos;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] array, int esq, int dir){
        // caso base: se esq >= dir, o subarray tem 0 ou 1 elemento (já ordenado)
        if (esq < dir){
            int meio = (esq + dir) / 2;
            mergeSort(array, esq, meio);
            mergeSort(array, meio + 1, dir);
            merge(array, esq, meio, dir);
        }
    }

    public static void merge(int[] array, int esq, int meio, int dir){
        // calcular o tamanho dos vetores temporarios
        int tamA = (meio + 1) - esq; // elementos de esq..meio
        int tamB = dir - meio;      // elementos de meio+1..dir

        // Vetores temporarios (com espaço extra para a sentinela)
        int[] tempA = new int[tamA + 1];
        int[] tempB = new int[tamB + 1];

        // Preencher os vetores temporarios corretamente
        for (int p = 0; p < tamA; p++) {
            tempA[p] = array[esq + p];         // <-- corrigido: esq + p
        }
        for (int t = 0; t < tamB; t++) {
            tempB[t] = array[meio + 1 + t];
        }

        // Sentinelas para evitar checar limites a cada comparação
        tempA[tamA] = Integer.MAX_VALUE;
        tempB[tamB] = Integer.MAX_VALUE;

        // Intercalação
        int i = 0, j = 0;
        for (int k = esq; k <= dir; k++) {
            if (tempA[i] <= tempB[j]) {
                array[k] = tempA[i];
                i++;
            } else {
                array[k] = tempB[j];
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {15, 3, 8, 2, 9, 1, 4};
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        // passar índices, não valores
        mergeSort(array, 0, array.length - 1);
        for(int j = 0; j < array.length; j++){
            System.out.print(array[j] + " ");
        }
        System.out.println();
    }
}

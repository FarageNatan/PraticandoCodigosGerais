package ExerciciosMicrofundamentos;

import java.util.Scanner;

public class AlgoritmoSelecaoModificado {
    static Scanner sc = new Scanner(System.in);

    public static void swap(int i, int menor, int[] array){
        int temp = array[i];
        array[i] = array[menor];
        array[menor] = temp;
    }

    /*public static void SelecaoOriginal(int[] array, int tamanho){
        for(int i = 0; i < tamanho; i++){
            int menor = i;
            for(int j = (i + 1); j < tamanho; j++){
                if(array[menor] > array[j]){
                    menor = j;
                }
            }
            swap(i, menor, array);
        }
    }*/

    public static void SelecaoModificado(int[] array, int tamanho){
        for(int i = 0; i < tamanho; i++){
            int maior = i;
            for(int j = (i + 1); j < tamanho; j++){
                if(array[j] > array[maior]){
                    maior = j;
                }
            }
            swap(i, maior, array);
        }
    }

    public static void main(String[] args) {
        int[] array = {43, 12, 8, 99, 30, 65, 4};
        for(int i = 0; i < array.length; i++){
            System.out.println("Array Original: " + array[i]  + " ");
        }
        
        // SelecaoOriginal(array, array.length);
        
        // for(int j = 0; j < array.length; j++){
        //     System.out.println("Array Selecao Original: " + array[j]  + " ");
        // }

        SelecaoModificado(array, array.length);

        for(int v = 0; v < array.length; v++){
            System.out.println("Array Selecao Modificado: " + array[v]  + " ");
        }
    }
}

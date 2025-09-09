package ExerciciosMicrofundamentos;

import java.util.Scanner;

public class BubbleSortOtimizado {
    static Scanner sc = new Scanner(System.in);
    
    public static void swap(int i, int j, int[] array){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void bubbleOriginal(int[] array){
        int contador = 0;
        for(int i = (array.length - 1); i > 0; i--){ //parte ordenada do array, "armazenada" no final
            for(int j = 0; j < array.length; j++){
                if(array[j] > array[j + 1]){
                    contador++;
                    swap(j, j + 1, array);
                }
            }
        }
        System.out.println("Ele fez " + contador + " comparacoes");
    }

    public static void bubbleOtimizado(int[] array, int tamanho){
        int contador = 0;
        boolean fezMov = true;
        for(int i = tamanho - 1; i > 0 && fezMov; i--){ //parte ordenada do array, "armazenada" no final
            fezMov = false;    
            for(int j = 0; j < i; j++){
                if(array[j] > array[j + 1]){
                    contador++;
                    swap(j, j + 1, array);
                    fezMov = true;
                }
            }
        }
        System.out.println("Ele fez " + contador + " comparacoes");
    }

    public static void main(String[] args) {
        System.out.println("Determine o tamanho do array: ");
        int tamanho = sc.nextInt();
        int[] array = new int[tamanho];

        System.out.println("Determine os numeros do array: ");
        for(int v = 0; v < tamanho; v++){
            array[v] = sc.nextInt();
        }

        System.out.println("Array original: ");
        for(int i = 0; i < tamanho; i++){
            System.out.println(array[i]);
        }

        bubbleOtimizado(array, tamanho);

        System.out.println("Array ordenado: ");
        for(int j = 0; j < tamanho; j++){
            System.out.println(array[j]);
        }
    }
}

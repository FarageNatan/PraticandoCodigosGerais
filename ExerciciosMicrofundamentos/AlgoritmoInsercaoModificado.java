package ExerciciosMicrofundamentos;

import java.util.Scanner;

public class AlgoritmoInsercaoModificado {
    static Scanner sc = new Scanner(System.in);

    //Ordenacao Original
    public static void ordenacaoInsercaoOriginal(int[] array){
        for(int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;
            while((j >= 0) && temp < array[j]){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

    public static void ordenacaoInsercaoMod(int[] array){
        for(int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;
            while ((j >= 0) && temp > array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }


    public static void main(String[] args) {
        int[] array = {41, 9, 77, 56, 12, 23, 61};
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        ordenacaoInsercaoMod(array);
        System.out.println("Array ordenado descrescente: ");
        for(int j = 0; j < array.length; j++){
            System.out.println(array[j]);
        }
    }
}

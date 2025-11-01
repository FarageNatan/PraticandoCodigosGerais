package ExerciciosMicrofundamentos;

import java.util.Scanner;

public class AlgoritmoShellSort {
    public static void shellSort(int[] array){
        int h = 1, tamVetor = array.length;
        do{h = (h * 3) + 1;}while(h < tamVetor);
        do{
            h /= 3; //Determinar o numero de divisoes que deve ser feita
            for(int cor = 0; cor < h; cor++){
                ordenarCor(array, cor, h);
            }
        }while(h != 1);
    }

    //Insercao original
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

    public static void ordenarCor(int[] array, int cor, int h){ //Metodo de ordenacao por insercao, porem considerando um intervalo de h elementos ao inves de 1 elemento.
        for(int i = (h + cor); i < array.length; i += h){
            int temp = array[i];
            int j = i - h;
            while ((j >= 0) && temp < array[j]){
                array[j + h] = array[j];
                j -= h;
            }
            array[j + h] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Determine tam array: ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Determine os elementos do array: ");
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Array original: ");
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        shellSort(array);

        System.out.println("Array Ordenado: ");
        for(int j = 0; j < n; j++){
            System.out.print(array[j] + " ");
        }

        System.out.println();


        sc.close();
    }
}

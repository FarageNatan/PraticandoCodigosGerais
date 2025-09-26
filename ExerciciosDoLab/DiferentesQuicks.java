package ExerciciosDoLab;

import java.util.Date;
import java.util.Scanner;

public class DiferentesQuicks {
    static Scanner sc = new Scanner(System.in);
    
    public static void quicksortMeio(int[] array, int esq, int dir){
        int i = esq, j = dir, pivo = array[(esq + dir) / 2];

        while(i <= j){
            while(array[i] < pivo){
                i++;
            }
            while(array[j] < pivo){
                j--;
            }
            if(i <= j){
                swap(array, i, j);
                i++;
                j--;
            }
        }
        if(esq < j) quicksortMeio(array, esq, j);
        if(i < dir) quicksortMeio(array, i, dir);

    }

    public static void quicksortFirstPivo(int[] array, int esq, int dir){
        int i = esq, j = dir, pivo = array[esq];
        while(i <= j){
            while(array[i] < pivo){
                i++;
            }
            while(array[j] > pivo){
                j--;
            }
            if(i <= j){
                swap(array, i, j);
                i++;
                j--;
            }
        }
        if(esq < j) quicksortFirstPivo(array, esq, j);
        if(i < dir) quicksortFirstPivo(array, i, dir);

    }

    public static void quicksortLastPivo(int[] array, int esq, int dir){
        int i = esq, j = dir, pivo = array[dir];
        while(i <= j){
            while(array[i] < pivo){
                i++;
            }
            while(array[j] > pivo){
                j--;
            }
            if(i <= j){
                swap(array, i, j);
                i++;
                j--;
            }
        }
        if(esq < j) quicksortFirstPivo(array, esq, j);
        if(i < dir) quicksortFirstPivo(array, i, dir);

    }

    public static void quicksortRandomPivo(int[] array, int esq, int dir){
        int i = esq, j = dir;
        int indiciePivo = esq + (int)(Math.random() * (dir - esq + 1)), pivo = array[indiciePivo];
        while(i <= j){
            while(array[i] < pivo){
                i++;
            }
            while(array[j] > pivo){
                j--;
            }
            if(i <= j){
                swap(array, i, j);
                i++;
                j--;
            }
        }
        if(esq < j) quicksortRandomPivo(array, esq, j);
        if(i < dir) quicksortRandomPivo(array, i, dir);

    }

    /* a < b < c
       a < c < b
       b < a < c
       b < c < a
       c < a < b
       c < b < a */ 
    public static void quicksortMedianOfThree(int[] array, int esq, int dir){
        int primeiro = array[esq], ultimo = array[dir], meio = array[(esq + dir) / 2];

        if(primeiro < ultimo && ultimo < meio){
            array[(esq + dir) / 2] = ultimo;
            array[dir] = meio;
        }else if(meio < primeiro && primeiro < ultimo){
            array[esq] = meio;
            array[(esq + dir) / 2] = primeiro;
        }else if(meio < ultimo && ultimo < primeiro){
            array[esq] = meio;
            array[(esq + dir) / 2] = ultimo;
            array[dir] = primeiro;
        }else if(ultimo < primeiro && primeiro < meio){
            array[esq] = ultimo;
            array[(esq + dir) / 2] = primeiro;
            array[dir] = meio;
        }else{
            array[esq] = ultimo;
            array[dir] = primeiro;
        }//Ordenando o primeiro, meio e ultimo elemento do array

        int i = esq, j = dir, pivo = array[(esq + dir) / 2];
        while(i <= j){
            while(array[i] < pivo){
                i++;
            }
            while(array[j] > pivo){
                j--;
            }
            if(i <= j){
                swap(array, i, j);
                i++;
                j--;
            }
        }
        
        if(esq < j) quicksortMedianOfThree(array, esq, j);
        if(i < dir) quicksortMedianOfThree(array, i, dir);
    }

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {13, 56, 84, 18, 15, 41, 58, 94, 37};
        // for(int i = 0; i < array.length; i++){
        //     array[i] = sc.nextInt();
        // }
        long inicio = new Date().getTime();
        quicksortFirstPivo(array, 0, array.length - 1);
        long fim = new Date().getTime();
        double tempo = fim - inicio / 1000000; //em ms
        System.out.println(tempo + " ms");
        for(int j = 0; j < array.length; j++){
            System.out.print(array[j] + " ");
        }
    }
}

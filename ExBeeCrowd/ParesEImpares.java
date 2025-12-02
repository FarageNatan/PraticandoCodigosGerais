import java.util.*;

public class ParesEImpares {
    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] pares = new int[100];
        int[] impares = new int[100];
        int par = 0, imp = 0;

        //Versao BeeCrowd        
         Arrays.sort(pares, 0, par);

         Arrays.sort(impares, 0, imp);

        // for (int i = 0; i < n; i++) {
        //     int valores = sc.nextInt();
        //     if (valores % 2 == 0) {
        //         pares[par++] = valores;
        //     } else {
        //         impares[imp++] = valores;
        //     }
        // }

        // // Ordena pares em ordem crescente (bubble sort)
        // for (int i = par - 1; i > 0; i--) {
        //     for (int j = 0; j < i; j++) {
        //         if (pares[j] > pares[j + 1]) {
        //             swap(pares, j, j + 1);
        //         }
        //     }
        // }

        // Ordena ímpares em ordem decrescente (bubble sort)
        for (int i = imp - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (impares[j] < impares[j + 1]) {
                    swap(impares, j, j + 1);
                }
            }
        }

        for (int i = 0; i < par; i++) {
            System.out.println(pares[i]);
        }
        for (int i = 0; i < imp; i++) {
            System.out.println(impares[i]);
        }

        sc.close();
    }
}
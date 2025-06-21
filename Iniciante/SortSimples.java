package Iniciante;
import java.util.*;

public class SortSimples {
    static Scanner sc = new Scanner(System.in);

    public static void swap(int[] valores, int i, int j) {
        int temp = valores[i];
        valores[i] = valores[j];
        valores[j] = temp;
    }

    public static void main(String[] args) {
        int[] valores = new int[3];
        int[] original = new int[3];

        for (int i = 0; i < 3; i++) {
            valores[i] = sc.nextInt();
            original[i] = valores[i];
        }

        for (int j = 0; j < valores.length - 1; j++) {
            int menor = j;
            for (int n = j + 1; n < valores.length; n++) {
                if (valores[menor] > valores[n]) {
                    menor = n;
                }
            }
            swap(valores, menor, j);
        }

        for (int p = 0; p < 3; p++) {
            System.out.println(valores[p]);
        }

        System.out.println();

        for (int p = 0; p < 3; p++) {
            System.out.println(original[p]);
        }
    }
}

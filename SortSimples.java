import java.util.Scanner;

public class SortSimples {
    static Scanner entrada = new Scanner(System.in);
    
    public static int[] numeros() {
        int[] valores = new int[3]; 
        for (int i = 0; i < 3; i++) {
            valores[i] = entrada.nextInt(); // Agora garantindo que os valores sejam inteiros
        }
        return valores;
    }

    public static int[] ordenarSort(int[] valores) {
        for (int i = 1; i < valores.length; i++) {
            int tmp = valores[i];
            int j = i - 1;
            while (j >= 0 && valores[j] > tmp) {
                valores[j + 1] = valores[j];
                j--;
            }
            valores[j + 1] = tmp;
        }
        return valores;
    }

    public static void main(String[] args) {
        int[] numeros = numeros();
        int[] valores = ordenarSort(numeros);
        
        for (int valor : valores) {
            System.out.println(valor);
        }

        System.out.println();

        for (int j = 0; j <= 2; j++) {
            System.out.println(numeros[j]);
        }
    }
}
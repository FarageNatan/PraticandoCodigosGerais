package Strings;

import java.util.*;

public class EncaixaOuNaoII {
    static Scanner sc = new Scanner(System.in);

    public static int numCasos() {
        return sc.nextInt();
    }

    public static void compararFrases(int casos) {
        sc.nextLine(); // Consumir o caractere de quebra de linha após o número de casos
        for (int i = 0; i < casos; i++) {
            String linha = sc.nextLine();
            String[] partes = linha.split(" ");
            String A = partes[0];
            String B = partes[1];

            if (A.endsWith(B)) {
                System.out.println("encaixa");
            } else {
                System.out.println("nao encaixa");
            }
        }
    }

    public static void main(String[] args) {
        int numCasos = numCasos();
        compararFrases(numCasos);
    }
}

package Iniciante;

import java.util.Scanner;

public class NotasEMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o valor e converte para centavos (evita problemas com ponto flutuante)
        double valorDouble = scanner.nextDouble();
        int valor = (int) Math.round(valorDouble * 100);

        // Notas em centavos
        int[] notas = {10000, 5000, 2000, 1000, 500, 200};
        int[] moedas = {100, 50, 25, 10, 5, 1};

        System.out.println("NOTAS:");
        for (int nota : notas) {
            int quantidade = valor / nota;
            System.out.printf("%d nota(s) de R$ %.2f%n", quantidade, nota / 100.0);
            valor %= nota;
        }

        System.out.println("MOEDAS:");
        for (int moeda : moedas) {
            int quantidade = valor / moeda;
            System.out.printf("%d moeda(s) de R$ %.2f%n", quantidade, moeda / 100.0);
            valor %= moeda;
        }

        scanner.close();
    }
}

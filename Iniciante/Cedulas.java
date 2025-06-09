package Iniciante;
import java.util.Scanner;

public class Cedulas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o valor de entrada
        int valor = scanner.nextInt();

        // Exibe o valor de entrada antes de começar a decomposição
        System.out.println(valor);

        // Definição das notas
        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        int[] contadores = new int[notas.length];

        // Calcula a quantidade de notas
        for (int i = 0; i < notas.length; i++) {
            contadores[i] = valor / notas[i]; // Conta quantas notas são usadas
            valor %= notas[i]; // Atualiza o valor restante
        }

        // Exibe o resultado no formato esperado
        for (int i = 0; i < notas.length; i++) {
            System.out.println(contadores[i] + " nota(s) de R$ " + notas[i] + ",00");
        }

        scanner.close();
    }
}
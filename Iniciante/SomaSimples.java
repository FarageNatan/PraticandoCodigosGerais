package Iniciante;

import java.util.Scanner;

public class SomaSimples {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int resultado = a + b;
        System.out.println("SOMA = " + resultado);
    }
}

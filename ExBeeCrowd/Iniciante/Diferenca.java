package Iniciante;

import java.util.Scanner;

public class Diferenca {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0, d = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        int resultado = (a * b - c * d);
        System.out.println("DIFERENCA = " + resultado);
    }
}

package Iniciante;

import java.util.Scanner;
import java.util.Arrays;

public class TiposDeTriangulo {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double[] valores = new double[3];

        // Leitura dos lados
        for (int i = 0; i < 3; i++) {
            valores[i] = sc.nextDouble();
        }

        // Ordena em ordem decrescente
        Arrays.sort(valores);
        double A = valores[2];
        double B = valores[1];
        double C = valores[0];

        // Verifica formação de triângulo
        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            double a2 = A * A;
            double b2c2 = B * B + C * C;

            // Tipo quanto aos ângulos
            if (a2 == b2c2) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (a2 > b2c2) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            // Tipo quanto aos lados
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || A == C || B == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}
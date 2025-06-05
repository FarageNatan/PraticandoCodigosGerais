package Iniciante;

import java.util.Scanner;

public class Consumo {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int distanciaPercorrida = sc.nextInt();
        double combustivelGasto = sc.nextDouble();
        double consumoMedio = distanciaPercorrida / combustivelGasto;

        System.out.println(String.format("%.3f", consumoMedio) + " km/l");

    }
}

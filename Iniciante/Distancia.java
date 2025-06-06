package Iniciante;

import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distancia = sc.nextInt();
        int tempoMinutos = distancia * 2;
        System.out.println(tempoMinutos + " minutos");
        sc.close();
    }
}

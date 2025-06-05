package Iniciante;

import java.util.Scanner;

public class Media1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double a = 0, b = 0;
        a = sc.nextDouble();
        b = sc.nextDouble();

        double resultado = ((a * 3.5 + b * 7.5) / 11);
        System.out.println("MEDIA = " + String.format("%.5f", resultado));
    }
}

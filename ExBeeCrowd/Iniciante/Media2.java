package Iniciante;

import java.util.Scanner;

public class Media2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double a = 0, b = 0, c = 0;
        
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        double resultado = (((a * 2) + (b * 3) + (c * 5)) / 10);

        System.out.println("MEDIA = " + String.format("%.1f", resultado));
    }
}

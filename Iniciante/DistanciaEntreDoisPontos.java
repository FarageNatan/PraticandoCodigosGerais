package Iniciante;

import java.util.Scanner;
import java.lang.Math;

public class DistanciaEntreDoisPontos {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        double x1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
        System.out.println(String.format("%.4f", distancia));
    }
}

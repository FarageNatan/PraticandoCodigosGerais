package Iniciante;

import java.util.Scanner;

public class Area {
    static Scanner sc = new Scanner(System.in);
    
    public static double areaTrianguloRet(double a, double c){
        double area = (a * c) / 2;
        return area;
    }

    public static double areaCirculo(double c){
        double area = 3.14159 * c * c;
        return area;
    }

    public static double areaTrapezio(double a, double b, double c){
        double area = (a + b) * c / 2;
        return area;
    }

    public static double areaQuadrado(double b){
        return b * b;
    }

    public static double areaRetangulo(double a, double b){
        return a * b;
    }

    public static void main(String[] args) {
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double tr = areaTrianguloRet(a, c);
        double circ = areaCirculo(c);
        double t = areaTrapezio(a, b, c);
        double q = areaQuadrado(b);
        double r = areaRetangulo(a, b);

        System.out.println("TRIANGULO: " + String.format("%.3f", tr));
        System.out.println("CIRCULO: " + String.format("%.3f", circ));
        System.out.println("TRAPEZIO: " + String.format("%.3f", t));
        System.out.println("QUADRADO: " + String.format("%.3f", q));
        System.out.println("RETANGULO: " + String.format("%.3f", r));
    }
}

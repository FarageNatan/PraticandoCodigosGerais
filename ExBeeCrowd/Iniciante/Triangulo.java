package Iniciante;

import java.util.Scanner;

public class Triangulo {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double A , B, C, resultado = 0;
        boolean ehTriangulo = false;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        if(A + B > C && B + C > A && C + A > B){
            ehTriangulo = true;
        }
        if(ehTriangulo == true){
            resultado = A + B + C;
            System.out.println(String.format("Perimetro = %.1f", resultado));
        }else{
            resultado = (A + B) * C / 2;
            System.out.println(String.format("Area = %.1f", resultado));
        }
    }
}

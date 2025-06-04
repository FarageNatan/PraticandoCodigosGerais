package Iniciante;
import java.util.Scanner;

public class ExtremamenteBasico {
    static Scanner sc = new Scanner(System.in);
    
    public static int soma(){
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        return a + b;
    }

    public static void main(String[]args){
        int resultado = soma();
        System.out.println("X = " + resultado);
    }
}

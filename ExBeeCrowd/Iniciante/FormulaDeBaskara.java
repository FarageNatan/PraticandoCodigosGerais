package Iniciante;
import java.util.*;

public class FormulaDeBaskara {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double delta = Math.pow(B, 2) - (4 * A * C);
        if(delta < 1 || A < 1){
            System.out.println("Impossivel calcular");
        }else{ 
            double R1 = (-B + Math.sqrt(delta)) / (2 * A);
            double R2 = (-B - Math.sqrt(delta)) / (2 * A);
            System.out.println(String.format("R1 = %.5f", R1));
            System.out.println(String.format("R2 = %.5f", R2));
        }
    }
}

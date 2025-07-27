package Iniciante;
import java.util.*;

public class ImpostoDeRenda {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double salario = sc.nextDouble();

        double[] limites = {2000.00, 3000.00, 4500.00};      
        double[] aliquotas = {0.08, 0.18, 0.28};             
        double[] faixas = {1000.00, 1500.00};                

        double imposto = 0;

        if (salario <= limites[0]) {
            System.out.println("Isento");
        } else {
            if (salario > limites[2]) {
                imposto += (salario - limites[2]) * aliquotas[2];
                salario = limites[2];
            }
            if (salario > limites[1]) {
                imposto += (salario - limites[1]) * aliquotas[1];
                salario = limites[1];
            }
            if (salario > limites[0]) {
                imposto += (salario - limites[0]) * aliquotas[0];
            }

            System.out.printf("R$ %.2f\n", imposto);
        }
    }
}
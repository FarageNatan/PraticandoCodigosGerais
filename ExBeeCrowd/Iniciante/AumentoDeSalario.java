package Iniciante;
import java.util.*;

public class AumentoDeSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salarioAtual = sc.nextDouble();
        double reajusteGanho = 0;
        int reajusteEmPercentual = 0;

        if (salarioAtual <= 400.00) {
            reajusteEmPercentual = 15;
        } else if (salarioAtual <= 800.00) {
            reajusteEmPercentual = 12;
        } else if (salarioAtual <= 1200.00) {
            reajusteEmPercentual = 10;
        } else if (salarioAtual <= 2000.00) {
            reajusteEmPercentual = 7;
        } else {
            reajusteEmPercentual = 4;
        }

        reajusteGanho = salarioAtual * reajusteEmPercentual / 100;
        double salarioFinal = salarioAtual + reajusteGanho;

        System.out.printf("Novo salario: %.2f%n", salarioFinal);
        System.out.printf("Reajuste ganho: %.2f%n", reajusteGanho);
        System.out.println("Em percentual: " + reajusteEmPercentual + " %");
        sc.close();
    }
}
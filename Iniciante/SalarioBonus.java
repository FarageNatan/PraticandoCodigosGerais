package Iniciante;
import java.util.*;

public class SalarioBonus {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // String nome = sc.nextLine();
        double salarioFixo = sc.nextDouble();
        double vendasEfetuadas = sc.nextDouble();
        
        double comissao = vendasEfetuadas * 0.15;
        double total = salarioFixo + comissao;

        System.out.println("TOTAL = R$ " + String.format("%.2f", total));
    }
}

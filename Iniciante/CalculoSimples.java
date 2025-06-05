package Iniciante;
import java.util.*;

public class CalculoSimples {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
      int codigo1 = 0, codigo2 = 0, quantidade1 = 0, quantidade2 = 0;
      double valor1 = 0, valor2 = 0;
        
        codigo1 = sc.nextInt();
        quantidade1 = sc.nextInt();
        valor1 = sc.nextDouble();
        
        codigo2 = sc.nextInt();
        quantidade2 = sc.nextInt();
        valor2 = sc.nextDouble();

        double total = quantidade1 * valor1 + quantidade2 * valor2;

        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", total));
    }    
}

import java.io.IOException;
import java.util.*;
 
public class AreaCirculo { // Nome da classe corrigido
    
    public static double areaCirculo(double raio) {
        double area = raio * raio * 3.14159; 
        return area; 
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double valor = sc.nextDouble();
        
        double resultado = areaCirculo(valor);

        System.out.printf("A=%.4f%n", resultado);
    
        sc.close();
    }
}
import java.io.IOException;
import java.util.*;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class AreaCirculo {
    static Scanner sc = new Scanner(System.in);
    
    public static double areaCirculo(double raio){
        double area = raio * raio * 3.14160;
        return area; 
    }
    
    public static void main(String[] args) {

        double resultado = areaCirculo(2.00);

        double res2 = areaCirculo(100.64);
        
        double res3 = areaCirculo(150.00);

        System.out.println("A=" + resultado);
        System.out.println("A=" + res3);
        System.out.println("A=" + res2);
    }
}
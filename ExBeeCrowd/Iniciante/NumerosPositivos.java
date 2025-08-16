package Iniciante;

import java.io.IOException;
import java.util.*;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class NumerosPositivos {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        double numeros = 0;
        int contador = 0;
        for(int i = 1; i <= 6; i++){
            numeros = sc.nextDouble();
            if(numeros > 0){
                contador++;
            }
        }
        System.out.println(contador + " valores positivos");
    }
}
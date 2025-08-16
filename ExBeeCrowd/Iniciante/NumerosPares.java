package Iniciante;

import java.io.IOException;
import java.util.*;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class NumerosPares {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        for(int i = 1; i < 101; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
package Iniciante;

import java.util.Scanner;

public class NumerosImpares {
    static Scanner sc = new Scanner(System.in);

    public static int numLimite(){
        return sc.nextInt();
    }

    public static void numImpares(int limite){
        for(int i = 0; i <= limite; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int valor = numLimite();
        numImpares(valor);
    }
}

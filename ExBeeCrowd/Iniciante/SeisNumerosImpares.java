package Iniciante;

import java.util.Scanner;

public class SeisNumerosImpares {
    static Scanner sc = new Scanner(System.in);
    
    public static int limiteInicial() {
        int valor;
        valor = sc.nextInt();
        return valor;
    }
    
    public static int[] numerosImpares(int limiteI) {
        int[] numerosImpares = new int[6];
        int contador = 0;
        int i = limiteI;
        
        while (contador < 6) {
            if (i % 2 != 0) {
                numerosImpares[contador] = i;
                contador++;
            }
            i++;
        }
        return numerosImpares;
    }

    public static void main(String[] args) {
        int valor = limiteInicial();
        int[] valoresImpares = numerosImpares(valor);
        
        for (int i = 0; i < 6; i++) {
            System.out.println(valoresImpares[i]);
        }
    }
}
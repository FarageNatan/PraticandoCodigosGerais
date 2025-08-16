package Iniciante;

import java.util.Scanner;


public class ParesImparesPositivosNegativos {
    static Scanner sc = new Scanner(System.in);

    public static int ehPositivo(int valor){
        int contador = 0;
        if(valor > 0) contador++;
        return contador;
    }

    public static int ehNegativo(int valor){
        int contador = 0;
        if(valor < 0) contador++;
        return contador;
    }

    public static int ehPar(int valor){
        int contador = 0;
        if(valor % 2 == 0) contador++;
        return contador;
    }

    public static int ehImpar(int valor){
        int contador = 0;
        if(valor % 2 != 0) contador++;
        return contador;
    }
    
    public static void main(String[] args) {
        int numPar = 0, numImpar = 0, numPos = 0, numNeg = 0;
        int[] valor = new int[5];
        for(int i = 0; i < 5; i++){
            valor[i] = sc.nextInt();
        }
        for(int j = 0; j < 5; j++){
            numPar += ehPar(valor[j]);
            numImpar += ehImpar(valor[j]); 
            numPos += ehPositivo(valor[j]);
            numNeg += ehNegativo(valor[j]);
        }
        System.out.println(numPar + " valor(es) par(es)");
        System.out.println(numImpar + " valor(es) impar(es)");
        System.out.println(numPos + " valor(es) positivo(s)");
        System.out.println(numNeg + " valor(es) negativo(s)");
    }
}

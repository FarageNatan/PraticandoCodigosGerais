package Iniciante;

import java.util.Scanner;

public class ParesEntreCincoNumeros {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] valores = new int[5];
        int pares = 0;
        for(int i = 0; i < 5; i++){
            valores[i] = sc.nextInt();
            if(valores[i] % 2 == 0){
                pares++;
            }
        }
        System.out.println(pares + " valores pares");
    }    
}

package DesafiosDeCodigoDIO;

import java.util.Scanner;

public class DesafioCamarotedoBlueColdIceCubes {
    static Scanner leitor = new Scanner(System.in);
    
    public static void main(String[] args) {
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;
        for(int i = 0; i < tamanhoDaFila; i++){
            if(i % 2 != 0){
                pessoasNoCamarote++;
            }
        }
        System.out.println(pessoasNoCamarote + " pessoas no camarote");
    }
}

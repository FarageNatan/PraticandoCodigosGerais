package Iniciante;

import java.util.Scanner;

public class PositivosEMedia {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double[] valores = new double[6];
        double soma = 0, media = 0;
        int positivos =0;
        for(int i = 0; i < 6; i++){
            valores[i] = sc.nextDouble();
        }
        for(int j = 0; j < 6; j++){
            if(valores[j] > 0){
                soma += valores[j];
                positivos++;
            }
        }
        media = soma / positivos;
        System.out.println(positivos + " valores positivos");
        System.out.println(media);
    }
}

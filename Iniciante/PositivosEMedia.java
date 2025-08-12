package Iniciante;

import java.util.Scanner;

public class PositivosEMedia {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double[] valores = new double[5];
        for(int i = 0; i < 5; i++){
            valores[i] = sc.nextDouble();
        }
    }
}

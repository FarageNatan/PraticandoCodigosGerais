package Iniciante;

import java.util.Scanner;

public class MaiorEPosicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[101];
        int maior = 0;
        for(int i = 0; i < 100; i++){
            array[i] = sc.nextInt();                
        }

        int pos = 0;
        for(int j = 0; j < 100; j++){
            if(array[j] > maior){
                maior = array[j];
                pos = j + 1;
            }
        }
        System.out.println(maior);
        System.out.println(pos);

        sc.close();
    }
}

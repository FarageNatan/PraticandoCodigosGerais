package Iniciante;

import java.util.Scanner;

public class OMaior {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0, maior = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a > maior){
            maior = a;
        }
        if(b > maior){
            maior = b;
        }
        if(c > maior){
            maior = c;
        }

        System.out.println(maior + " eh o maior");
    }
}

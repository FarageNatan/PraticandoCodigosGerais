package Iniciante;

import java.util.Scanner;

public class IdadeEmDias {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       int idade = sc.nextInt();
       int anos = 0, meses = 0, dias = 0;
        anos = idade / 365;
        int diasRestantes = idade % 365;
        meses = diasRestantes / 30;
        dias = diasRestantes % 30;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
    }
}

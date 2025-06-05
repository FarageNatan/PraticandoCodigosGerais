package Iniciante;

import java.util.Scanner;

public class Salario {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
        int funcionario = 0, horas = 0;
        double valorHora = 0;
        
        funcionario = sc.nextInt();
        horas = sc.nextInt();
        valorHora = sc.nextDouble();

        double salario = valorHora * horas;
        System.out.println("NUMBER = " + funcionario);
        System.out.println("SALARY = U$ " + String.format("%.2f", salario));
    }
}

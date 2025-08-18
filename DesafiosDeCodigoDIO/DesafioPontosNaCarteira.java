package DesafiosDeCodigoDIO;
import java.util.Scanner;

public class DesafioPontosNaCarteira {
    static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {
        int velocidade = leitor.nextInt();
        int multas = leitor.nextInt();

        if (velocidade > 80) {
            multas++;
        }

        if (multas >= 3) {
            System.out.println(multas + " multas. Levou pontos na carteira");
        } else {
            System.out.println(multas + " multas. Nao levou pontos na carteira");
        }
    }
}
package DesafiosDeCodigoDIO;

import java.util.Scanner;

public class DesafioSalvandoMusicas {
    static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {
    String arquivoDoPc = leitor.nextLine();
        if (arquivoDoPc.endsWith("mp3")) {
            System.out.println("Salvar");
        } else {
            System.out.println("Deletar");
        }
    }
}

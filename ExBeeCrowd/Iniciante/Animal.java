package Iniciante;

import java.util.Scanner;

public class Animal {
    static Scanner sc = new Scanner(System.in);

    public static String temColuna() {
        return sc.nextLine();
    }

    public static String qualEspecie(String tipo) {
        return sc.nextLine();
    }

    public static String qualDieta(String tipo, String coluna) {
        return sc.nextLine();
    }

    public static void main(String[] args) {
        String esp1 = temColuna();
        String esp2 = qualEspecie(esp1);
        String esp3 = qualDieta(esp1, esp2);

        if (esp1.equals("vertebrado")) {
            if (esp2.equals("ave")) {
                if (esp3.equals("carnivoro")) {
                    System.out.println("aguia");
                }
                if (esp3.equals("onivoro")) {
                    System.out.println("pomba");
                }
            }
            if (esp2.equals("mamifero")) {
                if (esp3.equals("onivoro")) {
                    System.out.println("homem");
                }
                if (esp3.equals("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        }

        if (esp1.equals("invertebrado")) {
            if (esp2.equals("inseto")) {
                if (esp3.equals("hematofago")) {
                    System.out.println("pulga");
                }
                if (esp3.equals("herbivoro")) {
                    System.out.println("lagarta");
                }
            }
            if (esp2.equals("anelideo")) {
                if (esp3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                }
                if (esp3.equals("onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }
    }
}
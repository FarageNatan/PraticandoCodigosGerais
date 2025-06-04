package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class ProdutoSimplels {
    static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) throws IOException {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = a * b;
        System.out.println("PROD = " + prod);
    }
}

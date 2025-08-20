package DesafiosDeCodigoDIO;

import java.util.Scanner; 
    
public class DesafioImoveisDisponiveis {
    static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {
        
        String frase = leitor.next();
        String array[] = new String[3];
        
        array = frase.split("/");
        
        String A = array[0];
        String B = array[1];
        String C = array[2];
        
        System.out.println("Imovel: " + A + " R$" + B + " " + C);
    }
}
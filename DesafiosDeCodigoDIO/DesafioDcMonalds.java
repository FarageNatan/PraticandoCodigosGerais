package DesafiosDeCodigoDIO;

import java.util.Scanner;

public class DesafioDcMonalds{
    static Scanner leitor = new Scanner(System.in);
    
    public static void main(String[] args) {
        String ingredientes = leitor.nextLine();
        String listaIngredientes[] = new String[5];
        
        listaIngredientes = ingredientes.split(";");
        
        for (int i = 0; i < listaIngredientes.length; i++) {
            System.out.println(listaIngredientes[i]);
        }
    }
}
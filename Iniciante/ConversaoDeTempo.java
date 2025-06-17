package Iniciante;
import java.util.*;

public class ConversaoDeTempo {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int tempo = sc.nextInt();
        int horas = tempo / 3600; 
        int min = (tempo % 3600) / 60; 
        int segundos = tempo % 60; 

        System.out.println(horas + ":" + min + ":" + segundos);
    }
}
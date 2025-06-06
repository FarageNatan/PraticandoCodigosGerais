package Iniciante;
import java.util.*;

public class GastoDeCombustivel {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int tempoViagem = sc.nextInt();
        int velocMedia = sc.nextInt();
        //Consumo automóvel = 12 KM/L
        int distanciaPercorrida = tempoViagem * velocMedia;
        double quantidadeLitros = (double)distanciaPercorrida / 12;
        
        System.out.println(String.format("%.3f", quantidadeLitros));
    }

}

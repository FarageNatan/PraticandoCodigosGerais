package Iniciante;
import java.util.*;

public class Esfera{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double raio = sc.nextDouble();
        double volumeEsfera = ((4.0/3) * 3.14159 * raio * raio * raio);

        System.out.println("VOLUME = " + String.format("%.3f", volumeEsfera));
    }

}
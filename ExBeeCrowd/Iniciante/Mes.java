package Iniciante;
import java.util.*;

public class Mes {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int mes = sc.nextInt();
        String[] meses = { "January", "February", "March", "April", "May", "June",
                           "July", "August", "September", "October", "November", "December" };

        if (mes >= 1 && mes <= 12) {
            System.out.println(meses[mes - 1]);
        } else {
            System.out.println("Mês inválido");
        }
    }
}
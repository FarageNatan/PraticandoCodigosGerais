package Iniciante;
import java.util.*;

public class TempoDeJogoComMinutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicio = sc.nextInt();
        int minutoInicio = sc.nextInt();
        int horaFim = sc.nextInt();
        int minutoFim = sc.nextInt();

        int inicioTotalMin = horaInicio * 60 + minutoInicio;
        int fimTotalMin = horaFim * 60 + minutoFim;

        if (fimTotalMin <= inicioTotalMin) {
            fimTotalMin += 24 * 60;
        }

        int duracaoMinutos = fimTotalMin - inicioTotalMin;
        int duracaoHoras = duracaoMinutos / 60;
        int duracaoMinRestantes = duracaoMinutos % 60;

        System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinRestantes + " MINUTO(S)");
        sc.close();
    }
}


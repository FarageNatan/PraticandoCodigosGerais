package Iniciante;

import java.util.*;

public class TempoDeJogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horarioInicial = sc.nextInt();
        int horarioFinal = sc.nextInt();
        int tempoTotal = 0;

        if (horarioFinal > horarioInicial) {
            tempoTotal = horarioFinal - horarioInicial;
        } else {
            tempoTotal = 24 - horarioInicial + horarioFinal;
        }

        System.out.println("O JOGO DUROU " + tempoTotal + " HORA(S)");
        sc.close();
    }
}
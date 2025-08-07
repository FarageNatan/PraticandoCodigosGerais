package Iniciante;

import java.util.Scanner;

public class TempoDeUmEvento {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int horaInicio = 0, minInicio = 0, segInicio = 0, diaInicio = 0;
        int horaFim = 0, minFim = 0, segFim = 0, diaFim = 0;
        int totalDia = 0, totalHora = 0, totalMin = 0, totalSeg = 0;
        int segTotalInicio = 0, segTotalFim = 0, duracaoSeg = 0;
        
        String linhaDiaInicio = sc.nextLine();
        diaInicio = Integer.parseInt(linhaDiaInicio.replace("Dia", "").trim());

        String horarioInicial = sc.nextLine();
        String[] partesIniciais = horarioInicial.split(":");
        horaInicio = Integer.parseInt(partesIniciais[0].trim());
        minInicio = Integer.parseInt(partesIniciais[1].trim());
        segInicio = Integer.parseInt(partesIniciais[2].trim());

        String linhaDiaFim = sc.nextLine(); // Ex: "Dia 9"
        diaFim = Integer.parseInt(linhaDiaFim.replace("Dia", "").trim());

        String horarioFinal = sc.nextLine();
        String[] partesFinais = horarioFinal.split(":");
        horaFim = Integer.parseInt(partesFinais[0].trim());
        minFim = Integer.parseInt(partesFinais[1].trim());
        segFim = Integer.parseInt(partesFinais[2].trim());

        segTotalInicio = diaInicio * 86400 + horaInicio * 3600 + minInicio * 60 + segInicio;
        segTotalFim = diaFim * 86400 + horaFim * 3600 + minFim * 60 + segFim;
        duracaoSeg = segTotalFim - segTotalInicio;

        totalDia = duracaoSeg / 86400;
        duracaoSeg %= 86400;

        totalHora = duracaoSeg / 3600;
        duracaoSeg %= 3600;

        totalMin = duracaoSeg / 60;
        totalSeg = duracaoSeg % 60;

        // Saída
        System.out.println(totalDia + " dia(s)");
        System.out.println(totalHora + " hora(s)");
        System.out.println(totalMin + " minuto(s)");
        System.out.println(totalSeg + " segundo(s)");
    }
}
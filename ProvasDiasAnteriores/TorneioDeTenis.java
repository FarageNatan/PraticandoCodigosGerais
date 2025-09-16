//package ProvasDiasAnteriores;

import java.util.Scanner;

//QUESTAO DE JAVA PROVA PRATICA 1 - LABORATORIO DE SEGUNDA - ULTIMO HORARIO

/* DETALHES DA QUESTAO:
 * - cada participante disputou 6 jogos
 * 
 * Desempenho do torneio separa em 3 grupos
 * 
 * Grupos de participantes com habilidades semelhantes
 * 
 * Critério para divisão dos grupos:
 * 
 * Grupo 1 - Participantes com 5 ou 6 vitórias
 * 
 * Grupo 2 - Participantes com 3 ou 4 vitórias
 * 
 * Grupo 3 - Participantes com 1 ou 2 vitórias
 * 
 * Participantes com 0 vitorias - retiradas do torneio
 * 
 */

public class TorneioDeTenis {
    static Scanner sc = new Scanner(System.in);
    
    public static char[] resultadosPartidas(){
        char[] resultados = new char[6];
        for(int i = 0; i < 6; i++){
            resultados[i] = sc.nextLine().charAt(0);
        }
        return resultados;
    }

    public static int qualGrupo(char[] resultados){
        int grupo = 0, vitorias = 0;
        for(int i = 0; i < 6; i++){
            if(resultados[i] == 'V' || resultados[i] == 'v'){
                vitorias++;
            }
        }
        if(vitorias == 5 || vitorias == 6){
            grupo = 1;
        } else if(vitorias == 3 || vitorias == 4){
            grupo = 2;
        }else if(vitorias == 1 || vitorias == 2){
            grupo = 3;
        }else{
            grupo = -1; 
        }
        return grupo;
    }

    public static void main(String[] args) {
        char[] partidas = resultadosPartidas();
        int grupoDoParticipante = qualGrupo(partidas);
        System.out.println(grupoDoParticipante);
    }
}

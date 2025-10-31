package ExerciciosDoLab;
import java.util.*;

class Atleta{
    String nome;
    int pesoLevantado;
    
    public Atleta(String nome, int pesoLevantado) {
        this.nome = nome;
        this.pesoLevantado = pesoLevantado;
    }
}

public class QuestaoJava {

    public static boolean comparar(Atleta x1, Atleta x2) {
        boolean resp = false;
        if(x1.pesoLevantado > x2.pesoLevantado){
            resp = true;
        }else if(x1.pesoLevantado == x2.pesoLevantado){
            if(x1.nome.compareTo(x2.nome) < 0){
                resp = true;
            }
        } else{
            resp = false;
        }
        return resp;
    }

    public static void ordenacaoPeso(Atleta[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = array.length - 1; j > i; j--){
                if(comparar(array[j], array[j-1])){ //fazer uma função que trate todos os casos de ordenação ajuda a deixar o codigo mais limpo.
                    swap(array, j, j - 1);
                }
            }
        }
    }

    public static void swap(Atleta[] array, int i, int j){
        Atleta temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numAtletas = sc.nextInt();
        Atleta[] participante = new Atleta[numAtletas];
        for(int i = 0; i < numAtletas; i++){
            String nome = sc.next();
            int peso = sc.nextInt();
            participante[i] = new Atleta(nome, peso); //Apenas nesse momento criamos um objeto do tipo atleta, antes tinhamos apenas um array de ponteiros para atletas
        }

        ordenacaoPeso(participante);

        for(int j = 0; j < numAtletas; j++){
            System.out.println(participante[j].nome + " " + participante[j].pesoLevantado);
        }

        sc.close();
    }
}

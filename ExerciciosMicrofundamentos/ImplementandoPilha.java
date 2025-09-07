package ExerciciosMicrofundamentos;

import java.util.Scanner;

class Pilha{
    int tamanhoPilha;
    int[] vetorPilha;

    Pilha(int tamanho){
        this.tamanhoPilha = 0;
        this.vetorPilha = new int[tamanho];
    }

    public void InserirFim(int num) throws Exception{
        if(tamanhoPilha >= vetorPilha.length) throw new Exception("Pilha cheia");
        vetorPilha[tamanhoPilha] = num;
        tamanhoPilha++;
    }

    public int RemoverFim() throws Exception{
        if(tamanhoPilha == 0) throw new Exception("Pilha vazia");
        return vetorPilha[--tamanhoPilha];
    }
}



public class ImplementandoPilha {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
    }


}

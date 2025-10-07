package ExerciciosMicrofundamentos;

class Celula{
    int elemento;
    Celula prox;

    public Celula(){
        this.elemento = 0;
        this.prox = null;
    }

    public Celula(int x){
        this.elemento = x;
        this.prox = null;
    }
}

class Lista{
    private Celula primeiro, ultimo;
    
    public Lista(){
        ultimo = primeiro = new Celula();
    }

    public void InserirFim(int x){
        ultimo.prox = new Celula(x);
        ultimo = ultimo.prox;
    }

    public void Mostrar(){
        for(Celula i = primeiro; i != null; i = i.prox){
            System.out.println(i.elemento);
        }
    }

    public void InserirInicio(int x){
        Celula tmp = new Celula(x);
        tmp.prox = primeiro.prox;
        primeiro.prox = tmp;
        if(primeiro == ultimo){
            ultimo = tmp;
        }
        tmp = null;
    }

    public int RemoverFim(){
        if(primeiro == ultimo) System.out.println("Lista Vazia");
        Celula i;
        for(i = primeiro; i.prox != ultimo; i = i.prox); // Anda até a penultima célula
        int elemento = ultimo.elemento;
        ultimo = i;
        i = ultimo.prox = null;
        return elemento;
    }

    public int RemoverInicio(){
        if(primeiro == ultimo) System.out.println("Lista Vazia");
        Celula tmp = primeiro;
        primeiro = primeiro.prox; //Primeiro passa a apontar a "segunda" celula
        int elemento = primeiro.elemento;
        tmp.prox = null;
        tmp = null;
        return elemento;
    }

    int tamanho() {
        int contador = 0;
        Celula atual = primeiro;

        while (atual != null) {
            contador++;
            atual = atual.prox;
        }

        return contador;
    }

    public void Inserir(int x, int pos){
        int tamanho = tamanho();
        if(pos < 0 || pos > tamanho) System.out.println("Posicao Invalida");
        else if(pos == 0){ InserirInicio(x); 
        }else if(pos == tamanho){
            InserirFim(x);
        }else{
            Celula i = primeiro;
            for(int j = 0; j < pos; j++, i = i.prox); //Move até 1 posicao antes de pos
            Celula tmp = new Celula();
            tmp.prox = i.prox;
            i.prox = tmp;
            tmp = i = null;
        }
    }

    public int Remover(int x, int pos){
        int elemento = 0, tamanho = tamanho();
        if(pos < 0 || pos > tamanho || primeiro == ultimo) System.out.println("Lista vazia ou Posicao invalida");
        else if(pos == 0){
            elemento = RemoverInicio();
        }else if(pos == tamanho - 1){
            elemento = RemoverFim();
        }else{
            Celula i = primeiro;
            for(int j = 0; j < pos; j++, i = i.prox);
            Celula tmp = i.prox;
            elemento = tmp.elemento;
            i.prox = tmp.prox;
            tmp.prox = null;
            i = tmp = null;
        }
        return elemento;
    }

}

public class ListaFlexivel{

}

package ExerciciosMicrofundamentos;
import java.util.*;

public class Lista {
    static Scanner sc = new Scanner(System.in);    
    
    public int[] vetorLista;
    public int contador;

    public Lista(){
        this.vetorLista = new int[6];
        this.contador = 0;
    }

    //Os metodos de inserir sao todos do tipo void
    public void InserirInicio(int numInserir) throws Exception{
        if(contador >= vetorLista.length) throw new Exception("Erro");
        for(int i = contador; i > 0; i--){ //Devemos deslocar os elementos do array
            vetorLista[i] = vetorLista[i - 1]; //Como o array pega a quantidade do contador ele vai armazenar na proxima posicao que esta vazia;
        }
        vetorLista[contador] = numInserir;
        contador++;
    }

    public void InserirFim(int numInserir) throws Exception{
        if(contador >= vetorLista.length) throw new Exception("Erro!");
        //como vamos inserir no fim nao precisamos deslocar elementos, precisamos somente verificar se o array esta cheio
        vetorLista[contador] = numInserir;
        contador++;
    }

    public void InserirPos(int numInserir, int pos) throws Exception{
        if(contador >= vetorLista.length || pos < 0 || pos > contador) throw new Exception("Erro");
        for(int i = contador; i > pos; i++){
            vetorLista[i] = vetorLista[i - 1];
        }
        vetorLista[pos] = numInserir;
        contador++;
    }

    //No caso dos metodos para remover, todos devem ser de um tipo diferente de void, ja que vão retornar algum valor. Nao passamos nenhum valor para o parametro, apenas quando for determinar a posicao do numero que quer ser retirado.
    public int RemoverInicio() throws Exception{
        if(contador == 0) throw new Exception("Erro");
        int resp = vetorLista[0];
        contador--;
        for(int i = 0; i < vetorLista.length; i++){
            vetorLista[i] = vetorLista[i + 1];
        }
        return resp;
    }

    public int RemoverFim() throws Exception{ 
        if(contador == 0) throw new Exception("Erro");
        return vetorLista[--contador];
    }

    public int RemoverPos(int pos) throws Exception{
        if(contador == 0 || pos < 0 || pos > contador) throw new Exception("Erro");
        int resp = vetorLista[pos];
        contador--; 
        for(int i = pos; i < contador; i++){
            vetorLista[i] = vetorLista[i + 1];
        }
        return resp;
    }
}

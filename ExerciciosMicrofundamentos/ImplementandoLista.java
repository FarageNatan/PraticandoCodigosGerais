package ExerciciosMicrofundamentos;
import java.util.*;

class Lista {
    public int[] vetorLista;
    public int contador;

    public Lista(int tam){
        this.vetorLista = new int[tam];
        this.contador = 0;
    }

    //Os metodos de inserir sao todos do tipo void
    public void InserirInicio(int numInserir) throws Exception{
        if(contador >= vetorLista.length) throw new Exception("Erro");
        for(int i = contador; i > 0; i--){ //Devemos deslocar os elementos do array
            vetorLista[i] = vetorLista[i - 1]; //Como o array pega a quantidade do contador ele vai armazenar na proxima posicao que esta vazia;
        }
        vetorLista[0] = numInserir;
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
        for(int i = 0; i < contador; i++){
            vetorLista[i] = vetorLista[i + 1];
        }
        return resp;
    }

    public int RemoverFim() throws Exception{ 
        if(contador == 0) throw new Exception("Erro");
        return vetorLista[--contador];
    }

    public int RemoverPos(int pos) throws Exception{
        if(contador == 0 || pos < 0 || pos >= contador) throw new Exception("Erro");
        int resp = vetorLista[pos];
        contador--; 
        for(int i = pos; i < contador; i++){
            vetorLista[i] = vetorLista[i + 1];
        }
        return resp;
    }

    // ------ Métodos Adicionais ------- > Pedidos do MicroFundamento

    public void mostrarElementos(){
        for(int i = 0; i < contador; i++){
            System.out.println(vetorLista[i] + " ");
        }
    }

    //implemente um método que retorna a soma dos elementos contidos na mesma
    public int SomaElementosLista(){
        int soma = 0;
        for(int i = 0; i < contador; i++){ //vai ate o contador porque foi ate onde tem elementos inseridos
            soma += vetorLista[i];
        }
        return soma;
    }

    public int maiorElementoLista()throws Exception{
        if(contador == 0) throw new Exception("Vetor vazio"); 
        int maior = vetorLista[0];
        for(int i = 0; i < contador; i++){
            if(vetorLista[i] > maior){
                maior = vetorLista[i];
            }
        }
        return maior;
    }

    public int[] trocarOrdemLista(){
        int[] ordemInvertida = new int[vetorLista.length];
        for(int i = 0; i < vetorLista.length; i++){
            ordemInvertida[i] = vetorLista[contador - i - 1];
        }
        return ordemInvertida;
    }

    public int[] paresEMultiplosCinco(){
        int[] numerosValidos = new int[vetorLista.length];
        for(int i = 0; i < vetorLista.length; i++){
            if(vetorLista[i] % 2 == 0 && vetorLista[i] % 5 == 0){
                numerosValidos[i] = vetorLista[i];
            }
        }
        return numerosValidos;
    }

}

public class ImplementandoLista{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception{
        System.out.println("Qual o tamanho do vetor: ");
        int tamanhoVetor = sc.nextInt();
        
        Lista lista = new Lista(tamanhoVetor);
    
        for(int i = 0; i < tamanhoVetor; i++){
            System.out.println("Preencher vetor com numero: ");
            int num = sc.nextInt();
            lista.InserirInicio(num);
        }

        lista.mostrarElementos();
        
    }
}
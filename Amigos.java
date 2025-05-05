import java.util.*;

public class Amigos {
    static Scanner entrada = new Scanner(System.in);
    
    public static String[] listaAtual(){
      String atualLista = entrada.nextLine();
      return atualLista.split(" "); //Divide a linha separando por espaço
    }

    public static String[] listaNova(){
        String novaLista = entrada.nextLine();
        return novaLista.split(" "); //Divide a linha separando por espaço
    }

    public static String sugestaoAmigo(){
        String amigoSugerido = entrada.nextLine();
        if(amigoSugerido.equals("nao")){
            return null;
        }
        return amigoSugerido;
    }

    public static void main(String[]args){
        String[] atual = listaAtual();
        String[] nova = listaNova();
        String amigo = sugestaoAmigo();
        int tamAtual = atual.length, tamNova = nova.length;
        String[] listaCompleta;
        int posicao = -1;

        if(amigo != null){ //se houver sugestao de amigo
            for(int i = 0; i < tamAtual; i++){
                if(atual[i].equals(amigo)){
                    posicao = i;
                    i = tamAtual;
                }
            }
        } // procura a posicao do amigo sugerido na lista atual

        //Insere a nova lista antes do amigo sugerido
        if(posicao != -1){
            listaCompleta = new String[tamAtual + tamNova];

            for(int i = 0; i < posicao; i++){
                listaCompleta[i] = atual[i]; //insere a parte antes do amigo
            }

            for(int i = 0; i < tamNova; i++){
                listaCompleta[i] = nova[i]; //insere a nova lista
            }

            for(int i = 0; i < tamNova; i++){
                listaCompleta[tamNova + 1] = atual[i]; //resto da lista 
            }
        }else{ //nao encontrou a sugestao na lista
            listaCompleta = new String[tamAtual + tamNova];
            for(int i = 0; i < tamAtual; i++){
                listaCompleta[i] = atual[i];
            }

            for(int i = 0; i < tamNova; i++){
                listaCompleta[tamAtual + i] = nova[i];
            }
        } //junta a lista atual com a nova no final

        


        



    }
}

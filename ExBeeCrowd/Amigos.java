import java.util.*;

public class Amigos {
    static Scanner entrada = new Scanner(System.in);
    
    public static String[] listaAtual(){
      String atualLista = entrada.nextLine();
      return atualLista.split(" ");
    }

    public static String[] listaNova(){
        String novaLista = entrada.nextLine();
        return novaLista.split(" "); 
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

        if(amigo != null){
            for(int i = 0; i < tamAtual; i++){
                if(atual[i].equals(amigo)){
                    posicao = i;
                    i = tamAtual;
                }
            }
        }

        if(posicao != -1){
            listaCompleta = new String[tamAtual + tamNova];

            for(int i = 0; i < posicao; i++){
                listaCompleta[i] = atual[i];
            }

            for(int i = 0; i < tamNova; i++){
                listaCompleta[i] = nova[i];
            }

            for(int i = 0; i < tamNova; i++){
                listaCompleta[tamNova + 1] = atual[i]; 
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

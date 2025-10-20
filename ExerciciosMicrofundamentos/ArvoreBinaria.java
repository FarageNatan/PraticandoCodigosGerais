package ExerciciosMicrofundamentos;

class No{
    int elemento;
    No esq, dir;
    No(int elemento){
        this.elemento = elemento; //this.atributo = parametro
    }
    No(int elemento, No esq, No dir){
        this.elemento = elemento;
        this.esq = esq;
        this.dir = dir;
    }
}

class ArvoreB{
    No raiz;
    //---- Construtor -----
    ArvoreB(){
        raiz = null;
    }
    //---- Gatilhos -------
    private void inserir(int x) throws Exception{
        raiz = inserir(x, raiz);
    }
    private void inserirPai(int x) throws Exception{
        if(raiz == null){
            raiz = new No(x);
        }else if(x < raiz.elemento){
            inserirPai(x, raiz.esq, raiz);
        }else if(x > raiz.elemento){
            inserirPai(x, raiz.dir, raiz);
        }else{
            throw new Exception("Erro!");
        }
    }
    private boolean pesquisar(int x){

    }
    private void caminharCentral(){

    }
    private void caminharPos(){

    }
    private void caminharPre(){

    }
    private void remover(int x){

    }

    //----- Funcoes ------
    public No inserir(int x, No i) throws Exception{
        if(i == null){
            i = new No(x);
        }else if(x < i.elemento){
            i.esq = inserir(x, i.esq);
        }else if(x > i.elemento){
            i.dir = inserir(x, i.dir);
        }else{
            throw new Exception("Erro!");
        }
        return i;
    }

    void inserirPai(int x, No i, No pai) throws Exception{
        if(i ==  null){ //Posicao que devemos inserir
            if(x < pai.elemento){ //Nao temos nenhuma referencia se é maior ou menor que o pai, por isso devemos testar novamente.
                pai.esq = new No(x);
            }else{
                pai.dir = new No(x);
            }
        }else if(x < i.elemento){
            inserirPai(x, i.esq, i);
        }else if(x > i.elemento){
            inserirPai(x, i.dir, i);
        }else{
            throw new Exception("Erro!");
        }
    }
}

public class ArvoreBinaria {
    
}

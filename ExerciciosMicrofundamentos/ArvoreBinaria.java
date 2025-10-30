package ExerciciosMicrofundamentos;

import java.util.Random;
import java.util.Scanner;

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
    public void inserir(int x) throws Exception{
        raiz = inserir(x, raiz);
    }

    public void inserirPai(int x) throws Exception{
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

    public boolean pesquisar(int x) throws Exception{
        boolean resp = pesquisar(x, raiz);
        return resp;
    }

    public void remover(int x){
        
    }

    public void caminharPre(){
        caminharPre(raiz);
    }

    public void caminharCentral(){
        caminharCentral(raiz);
    }

    public void caminharPos(){
        caminharPos(raiz);
    }

    public int alturaArvore(No i) throws Exception{
        int altura = alturaArvore(raiz, 0);
        return altura;
    }

    //----- Funcoes ------
    private No inserir(int x, No i) throws Exception{
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

    private void inserirPai(int x, No i, No pai) throws Exception{
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

    private boolean pesquisar(int x, No i) throws Exception{
        boolean encontrado = false;
        if(i == null){
            encontrado = false;
            throw new Exception("Erro!");
        }else{
            if(x < i.elemento){
                pesquisar(x, i.esq);
            }else if(x > i.elemento){
                pesquisar(x, i.dir);
            }else{
                encontrado = true;
            }
        }
        return encontrado;
    }

    private void caminharCentral(No i){
        if(i != null){
            caminharCentral(i.esq);
            System.out.println(i.elemento + " ");
            caminharCentral(i.dir);
        }
    }
    
    private void caminharPos(No i){
        if(i != null){
            caminharPos(i.esq);
            caminharPos(i.dir);
            System.out.println(i.elemento + " ");
        }
    }

    private void caminharPre(No i){
        if(i != null){
            System.out.println(i.elemento + " ");
            caminharPre(i.esq);
            caminharPre(i.dir);
        }
    }

    private int alturaArvore(No i, int altura) throws Exception{
        if(i != null){
            int alturaEsq = alturaArvore(i.esq, altura + 1);
            int alturaDir = alturaArvore(i.dir, altura + 1);
            if(alturaDir > alturaEsq){
                altura = alturaDir;
            }else if(alturaEsq > alturaDir){
                altura = alturaEsq;
            }
        }
        return altura;
    }

    private exercicioDois(No i){
        
    }

}

public class ArvoreBinaria {
    
}

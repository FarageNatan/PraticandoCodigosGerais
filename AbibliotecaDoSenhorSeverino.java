import java.util.*;

public class AbibliotecaDoSenhorSeverino {
    static Scanner entrada = new Scanner(System.in);

    public static int qtdLivros(){
        int valor = 0;
        valor = Integer.parseInt(entrada.nextLine());
        return valor;
    }

    public static String[] codigoLivro(int v){
        String[] codigos = new String[v];
        for(int i = 0; i < v; i++){
            codigos[i] = entrada.nextLine();
        }
        return codigos;
    }

    public static String[] ordenarLivros(String[] codigos, int v){
        for(int i = 0; i < v; i++){
            String tmp = codigos[i];
            int j = i - 1;
            while((j >= 0) && (codigos[j].compareTo(tmp) > 0)){
                codigos[j + 1] = codigos[j];
                j--;
            }
            codigos[j + 1] = tmp; 
        }
        return codigos;
    }

    public static void main(String[]args){
        while(entrada.hasNextLine()){
            int tamanho = qtdLivros();
            String[] livros = codigoLivro(tamanho);
            String[] ordenado = ordenarLivros(livros, tamanho);
            for(int i = 0; i < tamanho; i++){
                System.out.println(ordenado[i]);
            }
        }
    }
}

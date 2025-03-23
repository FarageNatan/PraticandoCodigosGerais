import java.util.Scanner;

public class OrdenarTamanho {
    static Scanner entrada = new Scanner(System.in);

    public static int numCasos(){
        int casos = entrada.nextInt();
        entrada.nextLine(); 
        while (casos <= 0) {
            System.out.println("valor invalido");
            casos = entrada.nextInt();
            entrada.nextLine();
        }
        return casos;
    }

    public static void tamanhoOrdena(int casos){
        String[] testes = new String[casos];
        for(int i = 0; i < casos; i++){
            testes[i] = entrada.nextLine();
        }
        for(int j = 0; j < (casos - 1); j++){
            int menor = j;
            for(int t = j + 1; t < casos; t++){
                if(testes[menor].length() < testes[t].length()){
                    menor = t;
                }
            }
            swap(testes, menor, j);
        }
        for(int n = 0; n < casos; n++){
            System.out.println(testes[n]);
        }
    }

    public static void swap(String[] array, int i, int j){
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args){
        int casos = numCasos();
        tamanhoOrdena(casos);
    }


}

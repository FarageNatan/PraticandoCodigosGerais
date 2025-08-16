import java.util.Scanner;

public class TimeDeDuendes {
    static Scanner entrada = new Scanner(System.in);

    public static int duendesLista(){
        int qtdDuendes = entrada.nextInt();
        while(qtdDuendes < 3 || qtdDuendes > 30 || qtdDuendes % 3 != 0){
            System.out.println("Quantidade Invalida");
            qtdDuendes = entrada.nextInt();
        }
        return qtdDuendes;
    }

    public static void organizaLista(int numDuendes){
        String[] nomeDuende = new String[numDuendes];
        int[] idadeDuende = new int[numDuendes];
        for(int i = 0; i < numDuendes; i++){
            nomeDuende[i] = entrada.nextLine();
            if(nomeDuende[i].length() > 20){
                System.out.println("Maior que 20");
                nomeDuende[i] = entrada.nextLine();
            }
            idadeDuende[i] = entrada.nextInt();
            if(idadeDuende[i] < 10 || idadeDuende[i] > 100){
                System.out.println("Idade invalida");
                idadeDuende[i] = entrada.nextInt();
            }
        }
        for(int j = 0; j < (numDuendes - 1); j++){
            int menor = j;
            for(int n = (j + 1); j < n; j++){
                if(idadeDuende[menor] < idadeDuende[n]){
                    menor = n;
                }
            }
            swap(menor, j);
        }
    }

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}

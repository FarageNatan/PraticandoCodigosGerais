import java.util.*;

public class ParesEImpares{
    static Scanner entrada = new Scanner(System.in);

    public int linhasEntrada(){
        int valor = 0;
         valor = entrada.nextInt();
        return valor;
    }

    public int[] ordernarQuestoes(int valor){
        int[] numeros = new int[valor];
        int[] ordenados = new int[valor];
        
        for(int i = 0; i < valor; i++){
            numeros[i] = entrada.nextInt();
        }

        for(int j = 0; j < valor; j++){
            if(numeros[j] % 2 == 0 && numeros[j] < numeros[j + 1]){
                ordenados[j] = numeros[j];
            }
        }


        return ordenados;
    }

    public static void main(String[] args) {
        
    }
}
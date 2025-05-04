import java.util.Scanner;

class OrdernarTamanho{
    static Scanner entrada = new Scanner(System.in);

    public static int casosTeste(){
        int casos = 0;
        casos = entrada.nextInt();
        return casos;
    }
    
    public static void ordernarTamanho(int casos){
        String[] frases = new String[casos];
        for(int i = 0; i < casos; i++){
            frases[i] = entrada.nextLine();
        }

    }
    
    
    public static void main(String[]args){
        int casos;
        casos = casosTeste();
        String[] frases = new String[casos];
        ordernarTamanho(casos);

    }




}
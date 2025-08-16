package Iniciante;
import java.util.*;

public class Lanche {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int codigo = sc.nextInt();
        double preco = 0;
        int quantidade = sc.nextInt();
        if(codigo == 1){
            preco = 4.00;
        }
        else if(codigo == 2){
            preco = 4.50;
        }
        else if(codigo == 3){
            preco = 5.00;
        }
        else if(codigo == 4){
            preco = 2.00;
        }
        else if(codigo == 5){
            preco = 1.50;
        }
        System.out.println(String.format("Total: R$ %.2f", preco * quantidade));
    }    
}

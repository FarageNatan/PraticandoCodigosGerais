package Iniciante;
import java.util.*;

class TesteDeSelecaoUm{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //determinar valores
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        //condicoes
        if(B > C && D > A && C + D > A + B && (C > 0 && D > 0) && A % 2 == 0){
            System.out.println("Valores aceitos");
        }else{
            System.out.println("Valores nao aceitos");
        }
    }
}
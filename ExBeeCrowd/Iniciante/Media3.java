package Iniciante;
import java.util.*;

/*Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal, correspondente às quatro notas de um aluno. Calcule a média com pesos 2, 3, 4 e 1, respectivamente, para cada uma destas notas e mostre esta média acompanhada pela mensagem "Media: ". Se esta média for maior ou igual a 7.0, imprima a mensagem "Aluno aprovado.". Se a média calculada for inferior a 5.0, imprima a mensagem "Aluno reprovado.". Se a média calculada for um valor entre 5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.".

No caso do aluno estar em exame, leia um valor correspondente à nota do exame obtida pelo aluno. Imprima então a mensagem "Nota do exame: " acompanhada pela nota digitada. Recalcule a média (some a pontuação do exame com a média anteriormente calculada e divida por 2). e imprima a mensagem "Aluno aprovado." (caso a média final seja 5.0 ou mais ) ou "Aluno reprovado.", (caso a média tenha ficado 4.9 ou menos). Para estes dois casos (aprovado ou reprovado após ter pego exame) apresente na última linha uma mensagem "Media final: " seguido da média final para esse aluno. */

public class Media3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double[] valores = new double[4];
        for(int i = 0; i < 4; i++){
            valores[i] = sc.nextDouble();
        }
        double media = (valores[0] * 2 + valores[1] * 3 + valores[2] * 4 + valores[3] * 1) / 10;
       System.out.println("Media: " + String.format(Locale.US, "%.1f", Math.floor(media * 10) / 10));
        if(media >= 7.0){
            System.out.println("Aluno aprovado.");
        } 
        else if(media < 5.0){
            System.out.println("Aluno reprovado.");
        }
        else if(media >= 5.0 && media <= 6.9){
            System.out.println("Aluno em exame.");
        }
        if(media >= 5.0 && media <= 6.9){
            double notaExame = sc.nextDouble();
            System.out.println("Nota do exame: " + String.format(Locale.US, "%.1f", Math.floor(notaExame * 10) / 10));
            double novaMedia = (notaExame + media) / 2;
            if(novaMedia >= 5.0){
                System.out.println("Aluno aprovado.");
                System.out.println("Media final: " + String.format(Locale.US, "%.1f", Math.floor(novaMedia * 10) / 10));
            }else{
                System.out.println("Aluno reprovado.");
               System.out.println("Media final: " + String.format(Locale.US, "%.1f", Math.floor(novaMedia * 10) / 10));
            }
        }
    }
}

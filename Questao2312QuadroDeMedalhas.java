import java.util.Scanner;

class Paises {
    int ouro;
    int prata;
    int bronze;
    String nome;

    public Paises(int o, int p, int b, String n) {
        ouro = o;
        prata = p;
        bronze = b;
        nome = n;
    }
}

public class Questao2312QuadroDeMedalhas {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numeroDePaises = sc.nextInt();
        sc.nextLine(); 

        Paises[] pais = new Paises[numeroDePaises];
        
        // --- Leitura dos dados ---
        for (int i = 0; i < numeroDePaises; i++) {
            pais[i] = new Paises(0, 0, 0, "");
            pais[i].nome = sc.next();
            pais[i].ouro = sc.nextInt();
            pais[i].prata = sc.nextInt();
            pais[i].bronze = sc.nextInt();
            sc.nextLine(); 
        }

        for (int i = 0; i < numeroDePaises - 1; i++) {
            int indiceDoMelhor = i;
            for (int j = i + 1; j < numeroDePaises; j++) {
                if (ehMelhor(pais[j], pais[indiceDoMelhor])) {
                    indiceDoMelhor = j;
                }
            }
            Paises temp = pais[indiceDoMelhor];
            pais[indiceDoMelhor] = pais[i];
            pais[i] = temp;
        }

        for (int j = 0; j < numeroDePaises; j++) {
            System.out.println(pais[j].nome + " " + pais[j].ouro + " " + pais[j].prata + " " + pais[j].bronze);
        }
    }
    
    public static boolean ehMelhor(Paises paisA, Paises paisB) {
        boolean resultado;

        if (paisA.ouro != paisB.ouro) {
            resultado = paisA.ouro > paisB.ouro;
        } else if (paisA.prata != paisB.prata) {
            resultado = paisA.prata > paisB.prata;
        } else if (paisA.bronze != paisB.bronze) {
            resultado = paisA.bronze > paisB.bronze;
        } else {
            resultado = ehMenor(paisA.nome, paisB.nome);
        }

        return resultado;
    }

    public static boolean ehMenor(String strA, String strB) {
        boolean resultado = false;
        int minLength;

        if (strA.length() < strB.length()) {
            minLength = strA.length();
        } else {
            minLength = strB.length();
        }

        int comparacao = 0;
        for (int i = 0; i < minLength; i++) {
            if (strA.charAt(i) != strB.charAt(i)) {
                comparacao = strA.charAt(i) - strB.charAt(i);
                i = minLength;
            }
        }
        
        if (comparacao != 0) {
            resultado = comparacao < 0;
        } else {
            resultado = strA.length() < strB.length();
        }

        return resultado;
    }
}
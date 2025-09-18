import java.util.*;

public class VidaAlienigina {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numeroCaracteres = sc.nextInt();
        int tamanhoFrase = sc.nextInt();
        sc.nextLine();

        String alfabeto = sc.nextLine();
        String frase = sc.nextLine();

        boolean valido = true;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            int encontrado = 0;

            for (int j = 0; j < alfabeto.length(); j++) {
                if (c == alfabeto.charAt(j)) {
                    encontrado = 1;
                }
            }

            if (encontrado == 0) {
                valido = false;
            }
        }

        if (valido) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
}

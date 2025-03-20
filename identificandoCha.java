import java.io.IOException;
import java.util.Scanner;

public class identificandoCha {
    static Scanner entrada = new Scanner(System.in);

    public static int analiseCha(int tipoCha, int[] compResp) {
        int respCertas = 0;
        for (int i = 0; i < compResp.length; i++) {
            if (compResp[i] == tipoCha) {
                respCertas++;
            }
        }
        return respCertas;
    }

    public static void main(String[] args) throws IOException {
        int chaTipo = 0;
        int[] compResp = new int[5]; 

        chaTipo = entrada.nextInt();

        for (int i = 0; i <= 4; i++) {
            compResp[i] = entrada.nextInt();
        }

        int certasResp = analiseCha(chaTipo, compResp);

        System.out.println(certasResp);
    }
}
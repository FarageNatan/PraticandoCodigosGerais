import java.util.Scanner;

public class traduzNatal {
    static Scanner entrada = new Scanner(System.in);

    public static int traducao() {
        return entrada.nextInt();
    }

    public static int criancas() {
        return entrada.nextInt();
    }

    public static void listaLingua(int trad, String[] idiomas, String[] mensagens) {
        entrada.nextLine();
        for (int i = 0; i < trad; i++) {
            idiomas[i] = entrada.nextLine();
            mensagens[i] = entrada.nextLine();
        }
    }

    public static void dadosCriancas(int kids, String[] nomes, String[] idiomasCriancas) {
        entrada.nextLine();
        for (int i = 0; i < kids; i++) {
            nomes[i] = entrada.nextLine();
            idiomasCriancas[i] = entrada.nextLine();
        }
    }

    public static void gerarEtiquetas(int trad, String[] idiomas, String[] mensagens, int kids, String[] nomes, String[] idiomasCriancas) {
        for (int i = 0; i < kids; i++) {
            String idioma = idiomasCriancas[i];
            String mensagem = "";

            for (int j = 0; j < trad; j++) {
                if (idiomas[j].equals(idioma)) {
                    mensagem = mensagens[j];
                    break;
                }
            }

            System.out.println(nomes[i]);
            System.out.println(mensagem);
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        int T = traducao();
        String[] idiomas = new String[T];
        String[] mensagens = new String[T];
        listaLingua(T, idiomas, mensagens);

        int C = criancas();
        String[] nomes = new String[C];
        String[] idiomasCriancas = new String[C];
        dadosCriancas(C, nomes, idiomasCriancas);

        gerarEtiquetas(T, idiomas, mensagens, C, nomes, idiomasCriancas);
    }
}

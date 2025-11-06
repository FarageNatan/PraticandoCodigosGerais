import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean entradaValida = true;

        int quantidadeCartelas = 0;
        int quantidadeNumerosCartela = 0;
        int limNumCartela = 0;

        if (sc.hasNextInt()) {
            quantidadeCartelas = sc.nextInt();
        } else {
            entradaValida = false;
        }

        if (sc.hasNextInt()) {
            quantidadeNumerosCartela = sc.nextInt();
        } else {
            entradaValida = false;
        }

        if (sc.hasNextInt()) {
            limNumCartela = sc.nextInt();
        } else {
            entradaValida = false;
        }

        if (entradaValida) {
            int[][] cartelas = new int[quantidadeCartelas][quantidadeNumerosCartela];
            boolean[][] marcado = new boolean[quantidadeCartelas][quantidadeNumerosCartela];
            int[] restantes = new int[quantidadeCartelas];

            // Inicializa restantes com a quantidade por cartela
            for (int i = 0; i < quantidadeCartelas; i = i + 1) {
                restantes[i] = quantidadeNumerosCartela;
            }

            // Leitura das cartelas
            for (int i = 0; i < quantidadeCartelas; i = i + 1) {
                for (int j = 0; j < quantidadeNumerosCartela; ) {
                    if (sc.hasNextInt()) {
                        int numero = sc.nextInt();
                        if (numero < 1 || numero > limNumCartela) {
                            System.out.println("Numero Invalido");
                        } else {
                            cartelas[i][j] = numero;
                            marcado[i][j] = false; // inicializa marcado
                            j = j + 1;
                        }
                    } else {
                        entradaValida = false;
                        j = quantidadeNumerosCartela; // força saída do loop interno
                        i = quantidadeCartelas; // força saída do loop externo
                    }
                }
            }

            if (entradaValida) {
                boolean encontrouVencedora = false;
                int indiceVencedora = 0; // 1-based quando impresso

                // Lê números sorteados um a um até EOF ou até encontrar vencedora
                while (sc.hasNextInt() && !encontrouVencedora) {
                    int d = sc.nextInt();
                    if (d < 1 || d > limNumCartela) {
                        // número sorteado fora do intervalo é ignorado
                        // nada a fazer
                    } else {
                        // Para cada cartela, verifica se o número está em alguma posição não marcada
                        for (int i = 0; i < quantidadeCartelas; i = i + 1) {
                            for (int j = 0; j < quantidadeNumerosCartela; j = j + 1) {
                                if (!marcado[i][j]) {
                                    if (cartelas[i][j] == d) {
                                        marcado[i][j] = true;
                                        restantes[i] = restantes[i] - 1;
                                    }
                                }
                            }
                        }

                        // Após marcar, verifica se alguma cartela ficou com 0 restantes
                        for (int i = 0; i < quantidadeCartelas; i = i + 1) {
                            if (!encontrouVencedora) {
                                if (restantes[i] == 0) {
                                    encontrouVencedora = true;
                                    indiceVencedora = i + 1; // converte para 1-based
                                    // não usamos break; o flag evita novas atribuições
                                }
                            }
                        }
                    }
                }

                // Imprime apenas o número da primeira cartela completa.
                // Se nenhuma cartela completou, imprime 0 (ajuste se preferir outro comportamento).
                if (encontrouVencedora) {
                    System.out.println(indiceVencedora);
                } else {
                    System.out.println(0);
                }
            } else {
                System.err.println("Entrada terminada inesperadamente durante a leitura das cartelas.");
            }
        } else {
            System.err.println("Entrada inicial incompleta.");
        }

        sc.close();
    }
}

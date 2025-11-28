import java.util.Scanner;

class TabelaHashComReserva{
    String[] tabela; //Representa a tabela e a area de reserva
    int m; //tamanho da tabela
    int r; //tamanho da area de reserva
    int nItensReserva; //Quantidade de elementos armazenados na area de reserva

    public TabelaHashComReserva(int m, int r){
        tabela = new String[m + r];
        this.m = m;
        this.r = r;
        nItensReserva = 0;
    }

    private int hash(String chave){
        int resultado = 0;
        for(int i = 0; i < chave.length(); i++){
            resultado += chave.charAt(i);
        }
        return resultado % m;
    }

    private boolean isPosicaoLivre(int pos){
        return tabela[pos] == null;
    }

    public void inserir(String chave) throws Exception{
        int pos = hash(chave);
        if(isPosicaoLivre(pos)){
            tabela[pos] = chave;
        }else if(tabela[pos].equals(chave)){
            throw new Exception("Chave duplicada!");
        }else{
            for (int i = 0; i < nItensReserva; i++) {
                if (tabela[m + i].equals(chave)) {
                    throw new Exception("Chave duplicada na area de reserva!");
                }
            }
            if(nItensReserva == r){
                throw new Exception("Area de reserva cheia!");
            }else{
                tabela[m + nItensReserva] = chave;
                nItensReserva++;
            }
        }
    }

    public String pesquisar(String chave){
        String pais = null;
        int pos = hash(chave);
        if(!isPosicaoLivre(pos)){
            if(tabela[pos].equals(chave)){
                pais = tabela[pos];
            }else{
                for(int i = 0; i < nItensReserva; i++){
                    if(tabela[m + i].equals(chave)){
                        pais = tabela[m + i];
                        i = r;
                    }
                }
            }
        }
        return pais;
    }
}


public class LaboratorioHash{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String[] paises = {"Brasil", "Chile", "Australia", "Islandia", "Estados Unidos", "Canada", "França", "Alemanha", "Mexico", "Portugal", "Equador", "Nigeria", "Peru", "Uruguai"};
        
        TabelaHashComReserva tabelaHash = new TabelaHashComReserva(15, 4);

        for(int i = 0; i < paises.length; i++){
            tabelaHash.inserir(paises[i]);
        }

        System.out.print("Qual pais deseja pesquisar:");
        String pais = sc.nextLine();
        
        System.out.println("Pesquisar: " + tabelaHash.pesquisar(pais));

        sc.close();   
    }
}
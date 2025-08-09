public class movimentacaoSelecao {
    public static void swap(int a, int b, int array[]){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
    public static void main(String[] args) {
        int mov = 0, n = 9;
        int[] array = new int[100];
        for(int i = 0; i < (n -1); i++){
            int menor = i;
            for(int j = (i + 1); j < n; j++){
                if(array[menor] > array[j]){
                    menor = j;
                }
            }
            swap(menor, i, array);
            mov += 3;
        }
        System.out.println("Teoria: " + (3 * 9 - 3));
        System.out.println("Pratica: " + mov);
    }
}

import java.util.Scanner;

public class IgorInTheMuseum {

    char[][] matrizAdj;
    int linhas, colunas;
    int qtPinturas = 0;

    public IgorInTheMuseum(char[][] matriz, int qtLinhas, int qtColunas){
        linhas = qtLinhas;
        colunas = qtColunas;
        matrizAdj = new char[qtLinhas][qtColunas];

        for(int i = 0; i < qtLinhas; i++){
            System.arraycopy(matriz[i], 0, matrizAdj[i], 0, qtColunas);
        }
    }

    public void dfs(int i, int j){
        this.matrizAdj[i][j] = '-'; // marcado
        // os vértices adjacentes da matrizAdj só podem ser: frente, trás, esquerda, direita
        verificaVertice(i-1, j); // frente
        verificaVertice(i, j-1); // esquerda
        verificaVertice(i, j+1); // direita
        verificaVertice(i+1, j); // trás
    }

    public void verificaVertice(int i, int j){
        if(matrizAdj[i][j] == '*')
            qtPinturas++;
        else if(matrizAdj[i][j] == '.')
            dfs(i, j);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int linhas = input.nextInt();
        int colunas = input.nextInt();
        int qtPosicoes = input.nextInt();
        char[][] matriz = new char[linhas][colunas];

        for(int i = 0; i < linhas; i++){
            String linha = input.next();
            for(int j = 0; j < colunas; j++){
                matriz[i][j] = linha.charAt(j);
            }
        }

        for (int i = 0; i < qtPosicoes; i++){
            IgorInTheMuseum grafo = new IgorInTheMuseum(matriz,linhas, colunas);
            grafo.dfs(input.nextInt() - 1, input.nextInt() -1);
            System.out.println(grafo.qtPinturas);
        }
    }
}

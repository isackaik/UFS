import java.util.Scanner;

public class IgorInTheMuseum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int linhas = input.nextInt();
        int colunas = input.nextInt();
        int qtPosicoes = input.nextInt();
        String[][] matriz = new String[linhas][colunas];

        for(int i = 0; i < linhas; i++){
            String linha = input.next();
            for(int j = 0; j < colunas; j++){
                matriz[i][j] = linha.substring(j, j+1);
            }
        }

        System.out.println("Verificando");
    }
}

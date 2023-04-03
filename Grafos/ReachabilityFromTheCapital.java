import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReachabilityFromTheCapital {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] dados = input.nextLine().split(" ");

        int qtVertices = Integer.parseInt(dados[0]);
        int qtArestas = Integer.parseInt(dados[1]);
        int verticeInicial = Integer.parseInt(dados[2]);

        List<List<Integer>> lista = new ArrayList<>();
        Grafos grafo = new Grafos(lista, qtVertices);

        for (int i = 0; i <= grafo.numVertices; i++) {
            lista.add(new ArrayList<>());
        }

        for (int i = 0; i < qtArestas; i++)
            lista.get(input.nextInt()).add(input.nextInt());

        grafo.componentes(verticeInicial);
        grafo.verificarVertices();
        System.out.println(grafo.estradasAdicionais);

        input.close();
    }
}

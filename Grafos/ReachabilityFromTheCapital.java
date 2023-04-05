import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class ReachabilityFromTheCapital {
    int numVertices;
    Stack<Integer> pilha;
    int[] profundidadeEntrada;
    int[] profundidadeSaida;
    int[] high;
    int[] comp;
    int entrada = 0, saida = 0, verticesFortes = 0;
    int estradasAdicionais = 0;
    List<List<Integer>> listaAdjacencia;

    public ReachabilityFromTheCapital(List<List<Integer>> listaAdjacencia, int numVertices) {
        this.numVertices = numVertices;
        this.listaAdjacencia = listaAdjacencia;
        pilha = new Stack<>();
        profundidadeEntrada = new int[numVertices + 1];
        profundidadeSaida = new int[numVertices + 1];
        comp = new int[numVertices + 1];
        high = new int[numVertices + 1];
    }

    public void dfsDigrafo(int v) {
        pilha.push(v);
        profundidadeEntrada[v] = ++entrada;
        high[v] = profundidadeEntrada[v];

        for (int i : listaAdjacencia.get(v)) {
            if (profundidadeEntrada[i] == 0)
                dfsDigrafo(i);
        }

        profundidadeSaida[v] = ++saida;
        System.out.println(pilha.pop());
    }

    public void componentes(int v) {
        profundidadeEntrada[v] = ++entrada;
        pilha.push(v);
        high[v] = profundidadeEntrada[v];
        for (int i : listaAdjacencia.get(v)) {
            if (profundidadeEntrada[i] == 0) {
                componentes(i);
                high[v] = Math.min(high[v], high[i]);
            } else {
                if ((profundidadeEntrada[i] <= profundidadeEntrada[v]) && pilha.contains(i)) {
                    high[v] = Math.min(high[v], profundidadeEntrada[i]);
                }
            }
        }

        if (high[v] == profundidadeEntrada[v]) {
            verticesFortes++;
            int x;
            do {
                x = pilha.pop();
                comp[x] = verticesFortes;
            } while (x != v);
        }
    }

    public void verificarVertices() {
        for (int i = 1; i <= numVertices; i++) {
            if (profundidadeEntrada[i] == 0) {
                estradasAdicionais++;
                componentes(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] dados = input.nextLine().split(" ");

        int qtVertices = Integer.parseInt(dados[0]);
        int qtArestas = Integer.parseInt(dados[1]);
        int verticeInicial = Integer.parseInt(dados[2]);

        List<List<Integer>> lista = new ArrayList<>();
        ReachabilityFromTheCapital grafo = new ReachabilityFromTheCapital(lista, qtVertices);

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
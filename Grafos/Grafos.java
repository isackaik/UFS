import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Grafos {
    int numVertices;
    Stack<Integer> pilha;
    int[] profundidadeEntrada;
    int[] profundidadeSaida;
    int[] high;
    int[] comp;
    int entrada = 0, saida = 0, componentes = 0;
    List<List<Integer>> listaAdjacencia;

    public Grafos(List<List<Integer>> listaAdjacencia, int numVertices) {
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

    public int componentes(int v) {
        profundidadeEntrada[v] = ++entrada;
        pilha.push(v);
        high[v] = profundidadeEntrada[v];
        for (int i : listaAdjacencia.get(v)) {
            if (profundidadeEntrada[i] == 0) {
                componentes(i);
                high[v] = (high[v] <= high[i]) ? high[v] : high[i];
            } else {
                if ((profundidadeEntrada[i] <= profundidadeEntrada[v]) && pilha.contains(i)) {
                    high[v] = (high[v] <= profundidadeEntrada[i]) ? high[v] : profundidadeEntrada[i];
                }
            }
        }

        if (high[v] == profundidadeEntrada[v]) {
            componentes++;
            int x = 0;
            do {
                x = pilha.pop();
                comp[x] = componentes;
            } while (x == v);
        }

        return componentes;
    }

    public static void main(String[] args) {
        List<List<Integer>> lista = new ArrayList<>();
        Grafos grafo = new Grafos(lista, 9);

        for (int i = 0; i <= grafo.numVertices; i++) {
            lista.add(new ArrayList<>());
        }

        lista.get(1).add(2);
        lista.get(1).add(8);
        lista.get(2).add(3);
        lista.get(3).add(1);
        lista.get(3).add(4);
        lista.get(3).add(7);
        lista.get(4).add(5);
        lista.get(5).add(6);
        lista.get(6).add(4);
        lista.get(8).add(9);
        lista.get(8).add(3);
        lista.get(9).add(7);
        lista.get(7).add(5);

        // grafo.dfsDigrafo(1);
        System.out.println(grafo.componentes(1));
        System.out.println("Verificando");

    }
}

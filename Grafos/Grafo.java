import java.util.ArrayList;
import java.util.List;

public class Grafo {

    private int numVertices;
    private boolean[] visitado;
    private List<List<Integer>> listaAdjacencia;
    private List<Integer> grauVertices;

    public Grafo(int numVertices) {
        this.numVertices = numVertices;
        listaAdjacencia = new ArrayList<>();
        grauVertices = new ArrayList<>();
        visitado = new boolean[numVertices];

        // cria uma lista para cada vertice
        for (int i = 0; i < this.numVertices; i++) {
            listaAdjacencia.add(new ArrayList<>());
            visitado[i] = false;
            grauVertices.add(0);
        }

        // cria os campos de adjacência de cada vértice em cada lista de vértice
        for (int i = 0; i < this.numVertices; i++) {
            for (int j = 0; j < this.numVertices; j++) {
                listaAdjacencia.get(i).add(0);
            }
        }
    }

    public String adicionarVertice() {
        // cria nova lista para o novo vertice na lista de adjacência
        listaAdjacencia.add(new ArrayList<>());
        grauVertices.add(0);
        numVertices++;

        // cria os campos de adjacência de cada vértice em cada lista de vértice
        for (int i = 0; i < numVertices; i++)
            listaAdjacencia.get(numVertices - 1).add(0);

        return "Novo vertice adicionado";
    }

    public String removerVertice(int vertice) {
        // remove o campo de vertice de cada lista de adjacencia dos demais vertices
        for (int i = 0; i < numVertices; i++)
            listaAdjacencia.get(i).remove(vertice);

        // remove a lista de adjacencia do vertice e a contagem do seu grau
        listaAdjacencia.remove(vertice);
        grauVertices.remove(vertice);
        numVertices--;

        return "Vertice " + vertice + " removido";
    }

    public String adicionarAresta(int v, int w) {
        // incrementa a lista de adjacencia em ambos os vertices, no indice de seu
        // extremo da aresta
        listaAdjacencia.get(v).set(w, listaAdjacencia.get(v).get(w) + 1);
        listaAdjacencia.get(w).set(v, listaAdjacencia.get(w).get(v) + 1);

        // incrementa grau dos vertices que foram ligados pela aresta
        grauVertices.set(v, grauVertices.get(v) + 1);
        grauVertices.set(w, grauVertices.get(w) + 1);

        return "Aresta adicionada entre " + v + " e " + w;
    }

    public String removerAresta(int v, int w) {
        // decrementa a lista de adjacencia em ambos os vertices, no indice de seu
        // extremo da aresta
        listaAdjacencia.get(v).set(w, listaAdjacencia.get(v).get(w) - 1);
        listaAdjacencia.get(w).set(v, listaAdjacencia.get(w).get(v) - 1);

        // decrementa grau dos vertices que tiverem a aresta removida
        grauVertices.set(v, grauVertices.get(v) - 1);
        grauVertices.set(w, grauVertices.get(v) - 1);

        return "Removido aresta entre " + v + " e " + w;
    }

    public int verificaGrau(int v) {
        return grauVertices.get(v);
    }

    public boolean verificaVizinho(int v, int w) {
        // como implementei pensando em um grafo não-direcionado, é feito a verificacao
        // em uma das listas de vertices a fim de avaliar se sao adjacentes
        if (listaAdjacencia.get(v).get(w) != 0) {
            return true;
        }
        return false;
    }

    public boolean ehEuleriano(Grafo grafo) {
        // verifica se todos vertices tem grau par. Se sim, o grafo é euleriano. Caso
        // não, não o é.
        for (int i = 0; i < numVertices; i++) {
            if ((grauVertices.get(i) % 2) != 0)
                return false;
        }
        return true;
    }

    public void dfs(List<List<Integer>> listaAdjacencia, int v) {
        visitado[v] = true;
        System.out.println(v);
        for (int i = 0; i < numVertices; i++) {
            if (listaAdjacencia.get(v).get(i) != 0 && visitado[i] == false)
                dfs(listaAdjacencia, i);
        }
    }

    public static void main(String[] args) {

        Grafo grafo = new Grafo(8);
        grafo.adicionarAresta(0, 5);
        grafo.adicionarAresta(0, 7);
        grafo.adicionarAresta(5, 7);
        grafo.adicionarAresta(7, 6);
        grafo.adicionarAresta(7, 2);
        grafo.adicionarAresta(2, 4);
        grafo.adicionarAresta(4, 1);
        grafo.adicionarAresta(1, 3);
        grafo.adicionarAresta(3, 6);

        grafo.dfs(grafo.listaAdjacencia, 2);
    }
}
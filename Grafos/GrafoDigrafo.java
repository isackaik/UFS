
public class GrafoDigrafo {

    int numVertices;
    int[] profundidadeEntrada;
    int[] profundidadeSaida;
    int entrada = 0, saida = 0;
    // List<List<Integer>> listaAdjacencia;
    // List<Integer> grauVertices;

    public GrafoDigrafo(int numvertices) {
        this.numVertices = numvertices;
        profundidadeEntrada = new int[this.numVertices];
        profundidadeSaida = new int[this.numVertices];
    }

    public void dfsDigrafo(int[][] matrizAdjacencia, int verticeInicial) {
        profundidadeEntrada[verticeInicial] = entrada++;

        for (int i = 0; i < numVertices; i++) {
            if (matrizAdjacencia[verticeInicial][i] != 0 && profundidadeEntrada[i] == 0)
                dfsDigrafo(matrizAdjacencia, i);
        }
        System.out.println(verticeInicial);
    }
}

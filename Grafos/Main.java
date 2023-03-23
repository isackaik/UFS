public class Main {

    public static void main(String[] args) {

        int[][] matriz = {
                { 0, 1, 1, 0, 0, 1, 0 },
                { 0, 0, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 1, 1 },
                { 0, 0, 0, 0, 0, 1, 0 },
                { 0, 0, 1, 0, 0, 0, 1 },
                { 0, 0, 0, 0, 0, 0, 0 },
        };

        GrafoDigrafo grafo = new GrafoDigrafo(7);
        grafo.dfsDigrafo(matriz, 1);
    }
}

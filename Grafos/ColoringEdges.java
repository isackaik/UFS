import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColoringEdges {

    int qtVertices;
    List<List<Integer>> listaAdj;
    boolean[] visitado;

    public ColoringEdges(int qtVertices){
        this.qtVertices = qtVertices;
        visitado = new boolean[qtVertices];
        listaAdj = new ArrayList<>();

        for (int i = 0; i < qtVertices; i++){
            listaAdj.add(new ArrayList<>());
            visitado[i] = false;
        }
    }

    public void addArestas(int origem, int destino){
        listaAdj.get(origem).add(destino);
    }

    public void dfsDigrafo(int v){
        visitado[v] = true;
        System.out.println(v + 1);
        for (int i = 0; i < listaAdj.get(v).size(); i++){
            if(!visitado[listaAdj.get(v).get(i)]){
                dfsDigrafo(listaAdj.get(v).get(i));
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vertices = input.nextInt();
        int arestas = input.nextInt();

        ColoringEdges grafo = new ColoringEdges(vertices);
        for(int i = 0; i < arestas; i++){
            grafo.addArestas(input.nextInt()-1, input.nextInt()-1);
        }

        System.out.println("Verificando");
    }
}

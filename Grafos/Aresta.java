public class Aresta {

    int origem;
    int destino;
    int peso;
    int distancia;

    public Aresta(int origem, int destino){
        this.origem = origem;
        this.destino = destino;
        distancia = destino - origem;
    }

    public Aresta(int origem, int destino, int peso){
        this.origem = origem;
        this.destino = destino;
        distancia = destino - origem;
        this.peso = peso;
    }
}

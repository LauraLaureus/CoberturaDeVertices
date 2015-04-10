package coberturadevertices;

public class Grafo {

    private final int numVertices;
    private ContenedorAristas aristas;
    private ConjuntoVertices vertices;

    public Grafo(int numVertices) {
        this.numVertices = numVertices;
    }

    public int getNumVertices() {
        return numVertices;
    }

    public void añadirContenedorAristas(ContenedorAristas contenedorAristas) {
        this.aristas = contenedorAristas;
    }

    public ContenedorAristas getAristas() {
        return aristas;
    }

    public void añadirVertices(ConjuntoVertices vertices) {
        this.vertices = vertices;
    }
    
    public Vertice getVertice(int id){
        return this.vertices.dameVertice(id);
    }

}

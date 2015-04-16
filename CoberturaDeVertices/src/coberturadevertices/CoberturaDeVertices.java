package coberturadevertices;

import java.util.Iterator;

public class CoberturaDeVertices {

    public static void main(String[] args) {
        Cargador cargador = new Cargador("entrada.txt");
        Grafo g = cargador.carga();
        ConjuntoVertices conjuntoVertices = coberturaVertices(g);
        salida(conjuntoVertices);
        Prueba.prueba(g, conjuntoVertices);
    }

    private static ConjuntoVertices coberturaVertices(Grafo g) {
        ConjuntoVertices conjuntoVertices = new ConjuntoVertices();
        ContenedorAristas e = g.getAristas().clone();
        ContenedorAristas eAux = new ContenedorAristas();
        
        Iterator<Arista> it = e.iterator();
        while (it.hasNext()){
            Arista arista = it.next();
            eAux = e.getAristas(arista.getU());
            eAux.addAll(e.getAristas(arista.getV()));
            conjuntoVertices.añadeVértice(g.getVertice(arista.getU()));
            conjuntoVertices.añadeVértice(g.getVertice(arista.getV()));
            e.removeAll(eAux);
            it = e.iterator();
        }
        
        return conjuntoVertices;
    }

    private static void salida(ConjuntoVertices coberturaVertices) {
        for (Integer vertice : coberturaVertices.getConjunto().keySet()) {
            System.out.println("Vértice " + vertice);
        }
    }
    
}

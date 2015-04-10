package coberturadevertices;

import java.util.Iterator;

public class CoberturaDeVertices {

    public static void main(String[] args) {
        Cargador cargador = new Cargador("entrada.txt");
        Grafo g = cargador.carga();
        coberturaVertices(g);
    }

    private static void coberturaVertices(Grafo g) {
        ConjuntoVertices conjuntoVertices = new ConjuntoVertices();
        ContenedorAristas e = g.getAristas();
        ContenedorAristas eAux = new ContenedorAristas();
        
        Iterator<Arista> it = e.iterator();
        while (it.hasNext()){
            Arista arista = it.next();
            
        }
    }
    
}

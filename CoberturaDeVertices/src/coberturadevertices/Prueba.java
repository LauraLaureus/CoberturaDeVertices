package coberturadevertices;

public class Prueba {
    
    
    public static void prueba (Grafo g, ConjuntoVertices v){
        
        ContenedorAristas a = g.getAristas();
        
        for (Arista arista : a) {
            if(!(v.contiene(g.getVertice(arista.getU())) || v.contiene(g.getVertice(arista.getV()))) ){
                System.out.println("La solución no es correcta");
                return;
            }
        }
        System.out.println("La solución es acertada");
    }
}

package coberturadevertices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ContenedorAristas extends ArrayList<Arista> {

    public void añadirArista(Arista nueva) {
        if (!this.contains(nueva)) {
            this.add(nueva);
        }
    }

    @Override
    public Arista[] toArray() {
        Arista[] arista = new Arista[this.size()];
        for (int i = 0; i < this.size(); i++) {
            arista[i] = this.get(i);
        }
        return arista;
    }

    public Arista[] getConjuntoAristasOrdenado() {
        Comparator<Arista> comparador = new Comparator<Arista>() {
            @Override
            public int compare(Arista o1, Arista o2) {
                return new Integer(o1.getPeso()).compareTo(o2.getPeso());
            }
        };
        /*
         Esta implementación es un adaptativa, mergesort iterativo estable
         que requiere muchas menos comparaciones que n lg (n)
         cuando la matriz de entrada está parcialmente ordenada,
         al tiempo que ofrece el rendimiento de un mergesort tradicionales
         cuando la matriz de entrada se ordena al azar.
         Si la matriz de entrada está casi ordenada,
         la aplicación requiere aproximadamente n comparaciones.
         Los requisitos de almacenamiento temporales varían de una pequeña
         constante para matrices de entrada casi ordenados a n / 2
         referencias de objetos para matrices de entrada ordenados aleatoriamente.
         http://docs.oracle.com/javase/7/docs/api/java/util/Collections.html#sort%28java.util.List%29
         */
        Collections.sort(this, comparador);
        return this.toArray();
    }
    
    public ContenedorAristas clone(){
        ContenedorAristas nuevo = new ContenedorAristas();
        for (Arista a : this) {
            nuevo.add( (Arista) a.clone());
        }
        return nuevo;
    }
    
    public ContenedorAristas getAristas (Integer vertice){
        ContenedorAristas result = new ContenedorAristas();
        for (Arista arista : this) {
            if (arista.tieneVertice(vertice)) result.add(arista);
        }
        return result;
    }
}

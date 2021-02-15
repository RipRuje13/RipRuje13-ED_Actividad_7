package ed_actividad7;

import java.util.ArrayList;
import java.util.Collections;

public class Algoritmos {
    public void dijkstra(Grafo grafo, String inicio, String fin) {

        Nodo i = grafo.getNodo(inicio);
        Nodo f = grafo.getNodo(fin);
        
        if (i == null || f == null) {
            System.out.println("No se encontraron los nodos");
        } else {
            
            ArrayList<Nodo> colaPrioridad = new ArrayList<>();
            
            Nodo nodoActual = i;
            colaPrioridad.add(nodoActual);
            
            while (!nodoActual.name.equals(fin) && !colaPrioridad.isEmpty()) {
                
                Collections.sort(colaPrioridad);
                nodoActual = colaPrioridad.get(0);
                colaPrioridad.remove(nodoActual);
                Arista nodoAyacente = nodoActual.nodosAdyacentes;
                while (nodoAyacente != null) {
                    
                    Nodo aux = grafo.getNodo(nodoAyacente.nodo);
                    if (!colaPrioridad.contains(aux) && !aux.Visitado) {
                        colaPrioridad.add(aux);
                    }
                    if (!aux.Visitado) {
                        aux.setAcomulado(nodoActual.pesoAristaAcomulado + nodoAyacente.peso, nodoActual.name);
                    }
                    nodoAyacente = nodoAyacente.sig;
                }
                
                nodoActual.Visitado = true;
            }
            if (!f.nameEtiquetaNodoAcomulado.equals("")) {
                System.out.println("Caamino mas corto:");
                System.out.println(backTracking(grafo, fin));
                System.out.println("Costo Total:" + f.pesoAristaAcomulado);
            }
            grafo.resetValueNodos();
        }
    }

   
    private String backTracking(Grafo grafo, String nameNodoEnd) {
        Nodo aux = grafo.getNodo(nameNodoEnd);
        if (!aux.nameEtiquetaNodoAcomulado.equals("")) {
            return backTracking(grafo, aux.nameEtiquetaNodoAcomulado) + "->" + aux.name;
        } else {
            return aux.name;
        }
    }

    public void prim(Grafo grafo,String incio) {
        Nodo in = grafo.getNodo(incio);
        ArrayList<Nodo> colaPrioridad = new ArrayList<>();
        ArrayList<Nodo> arbolExpansionMinima = new ArrayList<>();
        Nodo nodoActual = in;
        colaPrioridad.add(nodoActual);
        
        while (arbolExpansionMinima.size() != grafo.size) {
               
            Collections.sort(colaPrioridad);
            nodoActual = colaPrioridad.get(0);
            arbolExpansionMinima.add(nodoActual);
            colaPrioridad.remove(nodoActual);
            Arista nodoAyacente = nodoActual.nodosAdyacentes;
            while (nodoAyacente != null) {
                    
                Nodo aux = grafo.getNodo(nodoAyacente.nodo);
                if (!colaPrioridad.contains(aux) && !aux.Visitado) {
                    colaPrioridad.add(aux);
                }
                if (!aux.Visitado) {
                    aux.setAcomulado(nodoAyacente.peso, "");
                }
                nodoAyacente = nodoAyacente.sig;
            }
               
            nodoActual.Visitado = true;
        }
        System.out.println("El árbol de expansión es ");
        arbolExpansionMinima.forEach(nodo -> System.out.print(nodo.name + "->"));
        System.out.println("\nY el costo total es " + sumaDecosto(arbolExpansionMinima));
    }

    public void kruskal(Grafo grafo) {
        
        ArrayList<AristaS> arista = new ArrayList<>();
        getAllVerticesToGrafo(arista, grafo);
        Collections.sort(arista);
        ArrayList<AristaS> camino = new ArrayList<>();
        
        while (!arista.isEmpty()) {
          
            AristaS aristaSimple = arista.get(0);
            arista.remove(aristaSimple);
            Nodo a = grafo.getNodo(aristaSimple.nodoA);
            Nodo b = grafo.getNodo(aristaSimple.nodoB);
            if (!a.Visitado || !b.Visitado) {
                camino.add(aristaSimple);
                a.Visitado = true;
                b.Visitado = true;
            } else {
               
                ArrayList<AristaS> copyCamino = new ArrayList<>(camino);
               
                if (!Ciclo(copyCamino, aristaSimple.nodoA, aristaSimple.nodoB, grafo)) {
                    camino.add(aristaSimple);
                }
            }
        }
        System.out.println("Camino más corto kruskal (Aristas)");
        camino.forEach(value ->
                System.out.println(value + ","));
        

    }
    
    private boolean Ciclo(ArrayList<AristaS> caminos, String origen, String nodoB, Grafo grafo) {
        Nodo aux = grafo.getNodo(origen);
        Arista aristaAux = aux.nodosAdyacentes;
        while (aristaAux != null) {
            AristaS aristAux = new AristaS(aux.name, aristaAux.nodo);
            if (caminos.contains(aristAux)) {
                if (aristAux.contenis(nodoB)) {
                    return true;
                } else {
                    caminos.remove(aristAux);
                    boolean response = Ciclo(caminos, aristaAux.nodo, nodoB, grafo);
                    if (response) {
                        return true;
                    }
                }
            }
            aristaAux = aristaAux.sig;
        }
        return false;
    }

    private int sumaDecosto (ArrayList<Nodo> nodos) {
        int costo = 0;
        for (Nodo n : nodos) {
            costo += n.pesoAristaAcomulado;
        }
        return costo;
    }

    private void getVertices(ArrayList<AristaS> aristaSimples, Nodo nodo) {
        Arista puneto = nodo.nodosAdyacentes;
        while (puneto != null) {
            AristaS auxArista = new AristaS(nodo.name, puneto.nodo, puneto.peso);
            if (!aristaSimples.contains(auxArista)) {
                aristaSimples.add(auxArista);
            }
            puneto = puneto.sig;
        }
    }

    private void getAllVerticesToGrafo(ArrayList<AristaS> aristaSimples, Grafo grafo) {
        Nodo aux = grafo.n;
        while (aux != null) {
            getVertices(aristaSimples, aux);
            aux = aux.sig;
        }
    }
    
}

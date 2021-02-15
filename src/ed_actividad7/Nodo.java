package ed_actividad7;

import java.util.Objects;

public class Nodo implements Comparable<Nodo> {
    String name;
    Arista nodosAdyacentes=null;
    Nodo sig=null;
    int pesoAristaAcomulado;
    String nameEtiquetaNodoAcomulado;
    boolean Visitado;
    Nodo(String n){
        this.name=n;
        resetValueNodos();
    }
    public void resetValueNodos(){
        pesoAristaAcomulado=0;
        nameEtiquetaNodoAcomulado="";
        Visitado=false;
    }
    public void addNodoAdyacente(String nodo,int peso){
        if(nodosAdyacentes!=null){
            Arista punteroArista=nodosAdyacentes;
            while (punteroArista.sig!=null){
                punteroArista=punteroArista.sig;
            }
            punteroArista.sig= new Arista(nodo,peso);
        }else{
            nodosAdyacentes= new Arista(nodo,peso);
        }
    }
    public void setAcomulado(int pesoArista,String vertice){
        if(pesoArista<pesoAristaAcomulado || pesoAristaAcomulado==0){
            pesoAristaAcomulado=pesoArista;
            nameEtiquetaNodoAcomulado=vertice;
        }
    }

    public String toStringWithPesos(){
        if(nodosAdyacentes!=null){
            return name+" : "+nodosAdyacentes.toStringWithPesos(name);
        }else{
            return name+" : ";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nodo that = (Nodo) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    public void imprimirNodoPeso(){
        System.out.print(" "+name+"("+pesoAristaAcomulado+")- "+nameEtiquetaNodoAcomulado);
    }

    @Override
    public String toString() {
        if(nodosAdyacentes!=null){
            return name+" : "+nodosAdyacentes.toString();
        }else{
            return name+" : ";
        }
    }

    @Override
    public int compareTo(Nodo other) {
        return pesoAristaAcomulado-other.pesoAristaAcomulado;
    }
}

package ed_actividad7;

public class Arista {
    
    Arista sig;
    String nodo;
    int peso;
    int nuevoPeso=-1;
    boolean isVisitado=true;
    Arista(String nameNodo,int pesoArista){
        this.nodo=nameNodo;
        this.peso=pesoArista;
        sig=null;
    }
    public String toStringWithPesos(String root){
        if(sig!=null){
            return root+"-("+peso+")->"+nodo+","+sig.toStringWithPesos(root);
        }else{
            return root+"-("+peso+")->"+nodo;
        }
    }

    @Override
    public String toString() {
        if(sig==null){
            return nodo;
        }else{
            return nodo+"->"+sig;
        }
    }

}

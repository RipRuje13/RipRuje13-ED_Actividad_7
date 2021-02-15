package ed_actividad7;

public class AristaS  implements Comparable<AristaS> {
    String nodoA;
    String nodoB;
    int peso;
    AristaS(String nodoA,String nodoB,int peso){
        this.nodoA=nodoA;
        this.nodoB=nodoB;
        this.peso=peso;
    }
    AristaS(String nodoA,String nodoB){
        this.nodoA=nodoA;
        this.nodoB=nodoB;
        this.peso=0;
    }
    @Override
    public int compareTo(AristaS other) {
        return peso-other.peso;
    }
    public boolean contenis(String a) {
        return nodoA.equals(a) || nodoB.equals(a);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AristaS that = (AristaS) o;
        return nodoA.equals(that.nodoA) && nodoB.equals(that.nodoB) || nodoA.equals(that.nodoB) && nodoB.equals(that.nodoA);
    }


    @Override
    public String toString() {
        return nodoA+"->"+nodoB;
    }
}

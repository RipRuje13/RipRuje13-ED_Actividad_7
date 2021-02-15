
package ed_actividad7;
import java.io.*;
import java.util.ArrayList;

public class Grafo {
    public Nodo n;
    public int size=0;
    public void Construir(String titulo) throws IOException {
        File f = new File(titulo);
        FileReader rf = new FileReader(f);
        BufferedReader br = new BufferedReader(rf);
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            addNodo(br.readLine());
        }
        for (int i = 1; i <= m; i++) {
            String[] values = br.readLine().split(" ");
            addNodoAyacente(values[0], values[1], Integer.parseInt(values[2]));
        }
    }

    public void addNodo(String nombreNodo) {
        if (n != null) {
            Nodo aux = n;
            while (aux.sig != null) {
                aux = aux.sig;
            }
            aux.sig = new Nodo(nombreNodo);
        } else {
            n = new Nodo(nombreNodo);
        }
        size++;
    }
    public Nodo getNodo(String nombreNodo) {
        Nodo apunter = n;
        while (apunter != null) {
            if (apunter.name.equals(nombreNodo)) {
                return apunter;
            }
            apunter = apunter.sig;
        }
        return null;
    }
    public void resetValueNodos(){
        Nodo apunter = n;
        while (apunter != null) {
            apunter.resetValueNodos();
            apunter = apunter.sig;
        }
    }

    public void addNodoAyacente(String nombreRoot, String nodoAdyacente, int peso) {
        Nodo nodoA = getNodo(nombreRoot);
        Nodo nodoB = getNodo(nodoAdyacente);
        if (nodoA != null) {
            nodoA.addNodoAdyacente(nodoAdyacente, peso);
            nodoB.addNodoAdyacente(nombreRoot, peso);
        }
    }

    public String toStringWithPesos() {
        Nodo aux = n;
        StringBuilder auxString = new StringBuilder("Grafo con pesos\n");
        while (aux != null) {
            auxString.append(aux.toStringWithPesos()).append("\n");
            aux = aux.sig;
        }
        return auxString.toString();
    }

    @Override
    public String toString() {
        Nodo aux = n;
        StringBuilder auxString = new StringBuilder("Grafo\n");
        while (aux != null) {
            auxString.append(aux.toString()).append("\n");
            aux = aux.sig;
        }
        return auxString.toString();
    }
}

package ed_actividad7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class ED_Actividad7 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int res, op,op2;
        String ini,fin;
        Grafo grafo= new Grafo();
        Algoritmos algoritmos= new Algoritmos();

try{        
  do {
            System.out.println("\nElija el algoritmo que desea");
            System.out.println("1.Obtener árbol de expansión mínimo utilizando Prim");
            System.out.println("2.Obtener árbol de expansión mínimo utilizando Kruskal");
            System.out.println("3.Obtener el camino mínimo utilizando Dijkstra");
            System.out.println("4.Salir");
                             
            res = sc.nextInt();
            
            switch (res) {
                case 1:                    
                    System.out.println("¿Que grafo desea del 1-8?");
                    op = sc.nextInt();
                    switch (op){
                        
                        case 1:              
                            System.out.println("¿Cual sera su vertice de inicio ?");
                            sc.nextLine();
                            ini = sc.nextLine();
                            grafo.Construir("Grafo1.txt");
                            algoritmos.prim(grafo,ini);
                        break;
                         case 2:
                           System.out.println("¿Cual sera su vertice de inicio ?");
                            sc.nextLine();
                            ini = sc.nextLine();
                            grafo.Construir("Grafo2.txt");
                            algoritmos.prim(grafo,ini);
                        break;
                        case 3:
                            System.out.println("¿Cual sera su vertice de inicio ?");
                            sc.nextLine();
                            ini = sc.nextLine();
                            grafo.Construir("Grafo3.txt");
                            algoritmos.prim(grafo,ini);
                        break;
                        case 4:
                            System.out.println("¿Cual sera su vertice de inicio ?");
                            sc.nextLine();
                            ini = sc.nextLine();
                            grafo.Construir("Grafo4.txt");
                            algoritmos.prim(grafo,ini);
                        break;
                        case 5:
                            System.out.println("¿Cual sera su vertice de inicio ?");
                            sc.nextLine();
                            ini = sc.nextLine();
                            grafo.Construir("Grafo5.txt");
                            algoritmos.prim(grafo,ini);
                        break;
                        case 6:
                            System.out.println("¿Cual sera su vertice de inicio ?");
                            sc.nextLine();
                            ini = sc.nextLine();
                            grafo.Construir("Grafo6.txt");
                            algoritmos.prim(grafo,ini);
                        break;
                        case 7:
                            System.out.println("¿Cual sera su vertice de inicio ?");
                            sc.nextLine();
                            ini = sc.nextLine();
                            grafo.Construir("Grafo7.txt");
                            algoritmos.prim(grafo,ini);
                        break;
                        case 8:
                           System.out.println("¿Cual sera su vertice de inicio ?");
                            sc.nextLine();
                            ini = sc.nextLine();
                            grafo.Construir("Grafo8.txt");
                            algoritmos.prim(grafo,ini);
                        break;
                    }
                    
                    
                    
                break;    
                   
                case 2:
                    System.out.println("¿Que grafo desea del 1-8?");
                    op = sc.nextInt();
                    switch (op){
                        
                        case 1:
                            grafo.Construir("Grafo1.txt");
                            algoritmos.kruskal(grafo);
                            
                        break;
                         case 2:
                            grafo.Construir("Grafo2.txt");
                            algoritmos.kruskal(grafo);
                            
                        break;
                        case 3:
                            grafo.Construir("Grafo3.txt");
                            algoritmos.kruskal(grafo);
                            
                        break;
                        case 4:
                            grafo.Construir("Grafo4.txt");
                            algoritmos.kruskal(grafo);
                            
                        break;
                        case 5:
                            grafo.Construir("Grafo5.txt");
                            algoritmos.kruskal(grafo);
                            
                        break;
                        case 6:
                            grafo.Construir("Grafo6.txt");
                            algoritmos.kruskal(grafo);
                            
                        break;
                        case 7:
                            grafo.Construir("Grafo7.txt");
                            algoritmos.kruskal(grafo);
                            
                            
                        break;
                        case 8:
                            grafo.Construir("Grafo8.txt");
                            algoritmos.kruskal(grafo);
                           
                        break;
                        
                    }
                  
                break;
                
                case 3:
                    System.out.println("¿Que grafo desea del 1-8?");
                    op = sc.nextInt();
                    switch (op){
                        
                        case 1:                            
                            System.out.println("¿Cual sera su vertice de inicio ?");
                            sc.nextLine();
                            ini = sc.nextLine();
                            System.out.println("¿Cual sera su vertice final?");
                            fin = sc.nextLine();
                            grafo.Construir("Grafo1.txt");
                            algoritmos.dijkstra(grafo, ini, fin);
                           
                        break;
                         case 2:
                           System.out.println("¿Cual sera su vertice de inicio ?");
                            sc.nextLine();
                            ini = sc.nextLine();
                            System.out.println("¿Cual sera su vertice final?");
                            fin = sc.nextLine();
                            
                            grafo.Construir("Grafo1.txt");
                            algoritmos.dijkstra(grafo, ini, fin);
                        break;
                        case 3:
                            System.out.println("¿Cual sera su vertice de inicio ?");
                            sc.nextLine();
                            ini = sc.nextLine();
                            System.out.println("¿Cual sera su vertice final?");
                            fin = sc.nextLine();
                            
                            grafo.Construir("Grafo1.txt");
                            algoritmos.dijkstra(grafo, ini, fin);
                        break;
                        case 4:
                            System.out.println("¿Cual sera su vertice de inicio ?");
                            sc.nextLine();
                            ini = sc.nextLine();
                            System.out.println("¿Cual sera su vertice final?");
                            fin = sc.nextLine();
                            
                            grafo.Construir("Grafo1.txt");
                            algoritmos.dijkstra(grafo, ini, fin);
                        break;
                        case 5:
                            System.out.println("¿Cual sera su vertice de inicio ?");
                            sc.nextLine();
                            ini = sc.nextLine();
                            System.out.println("¿Cual sera su vertice final?");
                            fin = sc.nextLine();
                            
                            grafo.Construir("Grafo1.txt");
                            algoritmos.dijkstra(grafo, ini, fin);
                        break;
                        case 6:
                            System.out.println("¿Cual sera su vertice de inicio ?");
                            sc.nextLine();
                            ini = sc.nextLine();
                            System.out.println("¿Cual sera su vertice final?");
                            fin = sc.nextLine();
                            
                            grafo.Construir("Grafo1.txt");
                            algoritmos.dijkstra(grafo, ini, fin);
                        break;
                        case 7:
                           System.out.println("¿Cual sera su vertice de inicio ?");
                            sc.nextLine();
                            ini = sc.nextLine();
                            System.out.println("¿Cual sera su vertice final?");
                            fin = sc.nextLine();
                            
                            grafo.Construir("Grafo1.txt");
                            algoritmos.dijkstra(grafo, ini, fin);
                        break;
                        case 8:
                           System.out.println("¿Cual sera su vertice de inicio ?");
                            sc.nextLine();
                            ini = sc.nextLine();
                            System.out.println("¿Cual sera su vertice final?");
                            fin = sc.nextLine();
                          
                            grafo.Construir("Grafo1.txt");
                            algoritmos.dijkstra(grafo, ini, fin);
                            break;
                    }                                        
                break;    
                
            }
        } while (res != 4);
    
} catch (FileNotFoundException ex) {
    System.out.println("El archivo no fue encontrado");
  }

}
        
}
    


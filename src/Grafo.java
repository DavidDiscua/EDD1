/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Martinez
 */
import edu.uci.ics.jung.algorithms.shortestpath.DijkstraShortestPath;
import edu.uci.ics.jung.graph.*;
import edu.uci.ics.jung.graph.util.EdgeType;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import org.apache.commons.collections15.Transformer;

public class Grafo { //inicio grafo
   SparseMultigraph<String, MyEdge> grafito;
   //HOLAAAA MUNDO
    
    public Grafo() {//inicio constructor
        grafito = new SparseMultigraph<String, MyEdge>();
        init();
    }//fin constructor
    
    private class MyEdge {//inicio clase MyEdge
        private double precio;
        private String aereo;
        private String tSalida;
        private String tLlegada;
        public MyEdge(String aereo, double precio, String tSalida, String tLlegada) {//inicio clase myEdge
            this.precio = precio;
            this.aereo = aereo;
            this.tSalida = tSalida;
            this.tLlegada = tLlegada;
        }//fin clase myEdge
        public double getPrecio() {
            return precio;
        }
        public String getAereo() {
            return aereo;
        }
        public String getTSalida() {
            return tSalida;
        }
        public String getTLlegada() {
            return tLlegada;
        }
        public String toString() {//inicio metodo toString
            return "Saliendo de: " + tSalida + " llegando a: " + tLlegada + ", por " + aereo + " con un precio de " + precio + "\n";
        }//fin metodo toString
    }//fin clase MyEdge
    
    private void init() {//inicio metodo init
        cargarTerminales();
        cargarAristas();
    }//fin metodo init
    
    private void cargarTerminales() {
        try {
            File archivo = new File("./src/resources/Terminales de Salida.txt");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String tmp;
            while ((tmp = br.readLine()) != null) {
                grafito.addVertex(tmp);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private void cargarAristas() {
        try {
            File archivo = new File("./src/resources/Tabla de Costos de Viaje EDD (delimitado por ''@'').txt");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String tmp, tSalida, tLlegada, precio, aereolinea;
            StringTokenizer tokens = null;
            while ((tmp = br.readLine()) != null) {
                tokens = new StringTokenizer(tmp, "@");
                while (tokens.hasMoreTokens()) {
                    aereolinea = tokens.nextToken();
                    tSalida = tokens.nextToken();
                    tLlegada = tokens.nextToken();
                    precio = tokens.nextToken();
                    grafito.addEdge(new MyEdge(aereolinea, Double.parseDouble(precio), tSalida, tLlegada), tSalida, tLlegada, EdgeType.DIRECTED);
                } 
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void calcularCamino(ArrayList<String> caminos) {
        Transformer<MyEdge, Double> optimusPrime = new Transformer<MyEdge, Double>() {
            public Double transform(MyEdge arista) {
                return arista.getPrecio();
            }
        };
        DijkstraShortestPath<String, MyEdge> dijkstra = new DijkstraShortestPath(grafito, optimusPrime);
        List<MyEdge> lista = dijkstra.getPath(caminos.get(0), caminos.get(caminos.size() - 1));
        Number distancia = dijkstra.getDistance(caminos.get(0), caminos.get(caminos.size() - 1));
        System.out.println("The Shortes Path from " + caminos.get(0) + " to " + caminos.get(caminos.size() - 1) + " is: ");
        System.out.println(lista.toString());
        System.out.println("and the length of the path is: " + distancia);
    }
}//Fin clase grafo

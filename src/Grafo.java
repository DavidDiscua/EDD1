/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Martinez
 */
import com.sun.corba.se.impl.orbutil.graph.Graph;
import edu.uci.ics.jung.graph.*;
import edu.uci.ics.jung.graph.util.EdgeType;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Grafo { //inicio grafo
   SparseMultigraph<String, MyEdge> grafito;
   //HOLAAAA MUNDO
    
    public Grafo() {//inicio constructor
        grafito = new SparseMultigraph<String, MyEdge>();
        init();
    }//fin constructor
    
    private class MyEdge {//inicio clase MyEdge
        double precio;
        String aereo;
        public MyEdge(String aereo, double precio) {//inicio clase myEdge
            this.precio = precio;
            this.aereo = aereo;
        }//fin clase myEdge
        public String toString() {//inicio metodo toString
            return Double.toString(precio) + " con la aereolinea" + aereo;
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
                    grafito.addEdge(new MyEdge(aereolinea, Double.parseDouble(precio)), tSalida, tLlegada, EdgeType.DIRECTED);
                } 
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
}//Fin clase grafo

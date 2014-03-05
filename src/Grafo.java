/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Martinez
 */
import edu.uci.ics.jung.graph.*;
import edu.uci.ics.jung.graph.util.EdgeType;
import edu.uci.ics.jung.graph.util.Pair;
import java.util.Collection;

public class Grafo { //inicio grafo
    Graph<String, MyEdge> grafito = new SparseMultigraph<String, MyEdge>();
    
    public Grafo() {//inicio cosntructor
        
    }//fin constructor
    
    private class MyEdge {//inicio clase MyEdge
        double price;
        String aereo;
        public MyEdge(double price, String aereo) {//inicio clase myEdge
            this.price = price;
            this.aereo = aereo;
        }//fin clase myEdge
        public String toString() {//inicio metodo toString
            return Double.toString(price) + " con " + aereo;
        }//fin metodo toString
    }//fin clase MyEdge
    
    private void init() {//inicio metodo init
    
    }//fin metodo init
}//Fin clase grafor

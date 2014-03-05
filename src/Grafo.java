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

public class Grafo { 
    Graph<String, MyEdge> grafito = new SparseMultigraph<String, MyEdge>();
    
    public Grafo() {
        
    }
    
    private class MyEdge {
        double price;
        String aereo;
        public MyEdge(double price, String aereo) {
            this.price = price;
            this.aereo = aereo;
        }
        public String toString() {
            return Double.toString(price) + " con " + aereo;
        }
    }
    
    private void init() {
    
    }
}


import com.sun.corba.se.impl.orbutil.graph.Graph;
import edu.uci.ics.jung.algorithms.shortestpath.DijkstraShortestPath;
import edu.uci.ics.jung.graph.SparseMultigraph;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.lang.model.SourceVersion;
import javax.tools.Tool;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lualmaca
 */
public class Main {

    public static void main(String[] args) {

        Grafo grafito = new Grafo();
        /*probar imprimir terminales*/

        System.out.println("No  Aereolinea    TSalida   TLlegada     (Cost US$)");
     /*   for (int i = 0; i < grafito.grafito.getEdgeCount(); i++) {//inicio for
            System.out.println((i + 1));


        }//fin for*/
        
        Object[] Vertices = grafito.grafito.getVertices().toArray();
        Object[] Aristas = grafito.grafito.getEdges().toArray();
      
        for (int i = 0; i <Vertices.length; i++) {
           // System.out.println((i+1)+" "+Vertices[i]);
            
           // System.out.println(Vertices[0].toString()+" "+grafito.grafito.getIncidentEdges(Vertices[0].toString()));
            //System.out.println(Vertices[0].toString()+" "+grafito.grafito.getNeighbors(Vertices[0].toString()));
            for (int j = 1; j <Vertices.length; j++) {
                
            
             System.out.println(Vertices[i].toString()+" "+grafito.grafito.findEdge(Vertices[i].toString(),Vertices[j].toString())+Vertices[j].toString());
             }
          }//
        
         for (int i = 0; i <Aristas.length; i++) {
          //  System.out.println((i+1)+" "+Aristas[i]);
        }

    }
}//fin clase main


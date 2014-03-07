
import java.io.InputStream;
import java.io.OutputStream;
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
        for (int i = 0; i <grafito.grafito.getEdgeCount(); i++) {//inicio for
            

            
        }//fin for
    }
    //Implementacion de busqueda vecino mas cercano
    public class NearestNeighbor {
        
        private int[] path;
        
        private Tool tool = new Tool() {

            @Override
            public int run(InputStream in, OutputStream out, OutputStream out1, String... strings) {
                return 0;
               
            }

            @Override
            public Set<SourceVersion> getSourceVersions() {
                return null;
                
            }
        };
        
        /**
         * Constructor that finds the path and the cost of the nearest neighbor solution
         * @param distanceMatrix
         * @param startCity
         */
        public NearestNeighbor(final int[][] distanceMatrix, final int startCity) {
                
                path = new int[distanceMatrix[0].length];
                
                path[0] = startCity;
                int currentCity = startCity;
                
                /**
                 * until there are cities that are not yet been visited
                 */
                int i = 1;
                while (i < path.length) {
                        // find next city
                        int nextCity = findMin(distanceMatrix[currentCity]);
                        // if the city is not -1 (meaning if there is a city to be visited
                        if(nextCity != -1) {
                                // add the city to the path
                                path[i] = nextCity;
                                // update currentCity and i
                                currentCity = nextCity;
                                i++;
                        }
                }
        }
        
        /**
         * Find the nearest city that has not yet been visited
         * @param row
         * @return next city to visit
         */
        private int findMin(int[] row) {
                
                int nextCity = -1;
                int i = 0;
                int min = Integer.MAX_VALUE;
                
                while(i < row.length)  {
                        if(tool.isCityInPath(path, i) == false && row[i] < min) {
                                min = row[i];
                                nextCity = i;
                        }
                        i++;
                }
                return nextCity;
        }

        /**
         * @return the array that contains the path 
         */
        public int[] getPath() {
                return path;
        }
}
    
    
}//fin clase main



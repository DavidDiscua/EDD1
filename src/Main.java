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
        for (int i = 0; i <grafito.grafito.getVertexCount(); i++) {//inicio for
            
            System.out.println(grafito.grafito.getVertices());
            
        }//fin for
    }
}

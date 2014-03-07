
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author David Discua
 */
public class Master extends javax.swing.JFrame {//INICIO CLASE MAIN

    private Grafo grafito;
    private Queue<String> ciudades;
    private String tSalida;
    private String tLlegada;
    private ArrayList caminos;
    private ArrayList nums;
    int fila;
    int columna;

    public Master() {//INICIO CONSTRUCTOR
        initComponents();
        //Decorar Frame
        this.setLocationRelativeTo(null);
        cargarTabla();
        //fin Decorar Frame

        fila = 0;
        columna = 0;
        grafito = new Grafo();
        ciudades = new LinkedList<String>();
        caminos = new ArrayList();
        nums = new ArrayList();
    }//FIN CONSTRUCTOR

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        seleccion_salida = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        Lista = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton2 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        COSTO = new javax.swing.JLabel();
        SALIDA2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PRECIO = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        PRECIO1 = new javax.swing.JLabel();
        COSTO2 = new javax.swing.JLabel();
        SALIDA = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();
        IMAGEN = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EL VIAJERO");
        setBackground(new java.awt.Color(204, 204, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(731, 640));
        setMinimumSize(new java.awt.Dimension(731, 640));
        setPreferredSize(new java.awt.Dimension(731, 640));
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 80, 730, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Lista de Ciudades");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(580, 130, 120, 20);

        seleccion_salida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Aereolinea", "Tde Salida", "Tde Llegada", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        seleccion_salida.setGridColor(new java.awt.Color(204, 204, 255));
        seleccion_salida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seleccion_salidaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(seleccion_salida);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 150, 340, 390);

        jButton1.setText("Seleccionar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(370, 150, 110, 30);

        getContentPane().add(Lista);
        Lista.setBounds(570, 150, 130, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Seleccione las ciudades que desea visitar");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 110, 290, 30);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(350, 250, 380, 10);

        jToggleButton1.setText("Calcular");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(370, 200, 110, 30);

        jButton2.setText("Clear");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(600, 200, 80, 23);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(0, 540, 730, 10);

        COSTO.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        COSTO.setForeground(new java.awt.Color(51, 0, 255));
        getContentPane().add(COSTO);
        COSTO.setBounds(520, 370, 150, 30);

        SALIDA2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SALIDA2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(SALIDA2);
        SALIDA2.setBounds(390, 440, 300, 70);

        jLabel3.setFont(new java.awt.Font("Segoe Print", 3, 12)); // NOI18N
        jLabel3.setText("David Discua & Luis Martinez");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(280, 570, 190, 20);

        jLabel5.setFont(new java.awt.Font("Segoe Print", 2, 12)); // NOI18N
        jLabel5.setText("by");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(360, 550, 20, 20);

        PRECIO.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PRECIO.setText("Precio de Ida:");
        getContentPane().add(PRECIO);
        PRECIO.setBounds(360, 370, 100, 30);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(350, 400, 380, 10);

        PRECIO1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PRECIO1.setText("Precio de Regreso:");
        getContentPane().add(PRECIO1);
        PRECIO1.setBounds(360, 510, 140, 30);

        COSTO2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        COSTO2.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(COSTO2);
        COSTO2.setBounds(520, 510, 150, 30);

        SALIDA.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SALIDA.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(SALIDA);
        SALIDA.setBounds(390, 290, 300, 80);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("La manera mas economica de regresarse es:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(410, 410, 260, 30);

        mensaje.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mensaje.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mensaje.setText("MENSAJE");
        mensaje.setToolTipText("");
        mensaje.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(mensaje);
        mensaje.setBounds(360, 250, 370, 50);

        IMAGEN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Viajero.jpg"))); // NOI18N
        getContentPane().add(IMAGEN);
        IMAGEN.setBounds(0, 0, 730, 80);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seleccion_salidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seleccion_salidaMouseClicked
        // Obtener Fila
        setFila(seleccion_salida.getSelectedRow());
        System.out.println(getFila());


    }//GEN-LAST:event_seleccion_salidaMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        boolean ver = false;
        for (int i = 0; i < Lista.getItemCount(); i++) {
            if (seleccion_salida.getValueAt(getFila(), 1).toString().equals(Lista.getItemAt(i).toString())) {
                ver = true;
                break;
            }
        }//fin for

        if (ver == false) {
            nums.add((seleccion_salida.getValueAt(getFila(), 1).toString()));
            ciudades.add((seleccion_salida.getValueAt(getFila(), 1).toString()));
            Lista.addItem(seleccion_salida.getValueAt(getFila(), 1).toString());
        } else {//inicio else
            JOptionPane.showMessageDialog(this, "Ya ha ingresado esa ciudad");
        }//fin else


    }//GEN-LAST:event_jButton1MouseClicked

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked


        if (ciudades.isEmpty() == false) {

            mensaje.setText("La forma de hacer el tour, mediante la ruta mas corta,\n"
                    + "desde " + nums.get(0).toString() + " hasta " + nums.get(nums.size() - 1).toString() + " es: ");
            caminos = grafito.calcularCamino(ciudades);
            SALIDA.setText(caminos.get(0).toString());
            COSTO.setText(caminos.get(1).toString());

            //sacar inverso
            Queue<String> temp = new LinkedList<String>();
            temp.add(nums.get(0).toString());
            temp.add(nums.get(nums.size() - 1).toString());

            caminos = grafito.calcularCamino(temp);
            SALIDA2.setText(caminos.get(0).toString());
            COSTO2.setText(caminos.get(1).toString());


        } else if (ciudades.isEmpty() == true) {
            JOptionPane.showMessageDialog(this, "No has seleccionado las Ciudades aun");
        }
        //vaciar los items y pilas
        ciudades.clear();
        Lista.removeAllItems();
        nums.clear();

    }//GEN-LAST:event_jToggleButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked


        if (ciudades.isEmpty() == true) {
            JOptionPane.showMessageDialog(this, "La Lista ya esta vacía");
        } else {
            ciudades.clear();
            Lista.removeAllItems();
            nums.clear();
            JOptionPane.showMessageDialog(this, "Se ha limpiado la lista correctamente");
        }//fin else limpiar listas
        SALIDA.setText("");
        SALIDA2.setText("");
        COSTO.setText("");
        COSTO2.setText("");
    }//GEN-LAST:event_jButton2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {//INICIO METODO MAIN

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>




        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Master().setVisible(true);
            }
        });
    }//FIN METODO MAIN
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel COSTO;
    private javax.swing.JLabel COSTO2;
    private javax.swing.JLabel IMAGEN;
    private javax.swing.JComboBox Lista;
    private javax.swing.JLabel PRECIO;
    private javax.swing.JLabel PRECIO1;
    private javax.swing.JLabel SALIDA;
    private javax.swing.JLabel SALIDA2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel mensaje;
    private javax.swing.JTable seleccion_salida;
    // End of variables declaration//GEN-END:variables

//-------------------------------------------FUNCIONES---------------
    public static Set<String> cargarTerminalesDisponibles() {//INICIO FUNCION CARGAR TERMINALES
        Set<String> retVal = new TreeSet<String>();
        try {
            File archivo = new File("./src/resources/Terminales de Salida.txt");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String tmp;
            while ((tmp = br.readLine()) != null) {
                retVal.add(tmp);
            }
            return retVal;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return retVal;
    }//FIN FUNCION CARGAR TERMINALES

    public static void imprimirTerminales(Set<String> t) {//INICIO FUNCION IMPRIMIR TERMINALES
        Iterator iter = t.iterator();
        for (int i = 0; iter.hasNext(); i++) {
            System.out.println((i + 1) + ")" + iter.next());
        }
        System.out.println("Para terminar de ingresar ciudades, ingrese -1.");
    }//FIN FUNCION IMPRMIR TERMINALES

    public static boolean validarTerminales(Queue<String> cola, Set<String> t) {//INICIO FUNCION VALIDAR TERMIANLES
        Queue<String> tmp = cola;
        Iterator iter = cola.iterator();
        while (iter.hasNext()) {
            if (t.contains(iter.next()) == false) {
                return false;
            }
        }
        return true;
    }//FIN FUNCION VALIDAR TERMINALES

    private void cargarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) seleccion_salida.getModel();
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
                    Object[] V = {aereolinea, tSalida, tLlegada, precio};
                    modelo.addRow(V);

                }//fin while Tokenizer 
            }//fin while linea por linea
            seleccion_salida.setModel(modelo);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public int getFila() {
        return fila;
    }//fin get Fila

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }//fin get columna

    public void setColumna(int columna) {
        this.columna = columna;
    }
    //---------------------FIN FUNCIONES-----------------------------
}//FIN CLASE MAIN

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ejercicio03;

import Grafo.GrafoMatriz;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class FrmEjercicio03 extends javax.swing.JFrame {

    GrafoMatriz<String> grafo = new GrafoMatriz<>(10,true);
    
    public FrmEjercicio03() {
        initComponents();
        cmbOrigen.addItem("--Seleccione--");
        cmbDestino.addItem("--Seleccione--");
        cmbInterseccionInicial.addItem("--Seleccione--");
    }

     private void limpiar(){
        txtInterseccion.setText("");
        txtInterseccion.requestFocus();
    }
    private void llenarCombo(){
        cmbOrigen.removeAllItems();
        cmbDestino.removeAllItems();
        cmbInterseccionInicial.removeAllItems();
        
        cmbOrigen.addItem("--Seleccione--");
        cmbDestino.addItem("--Seleccione--");
        cmbInterseccionInicial.addItem("--Seleccione--");
        
        ArrayList<String> intersecciones = grafo.obtenerVertices();
        for(String interseccion : intersecciones){
            cmbOrigen.addItem(interseccion);
            cmbDestino.addItem(interseccion);
            cmbInterseccionInicial.addItem(interseccion);
        }  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        bg1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtInterseccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cmbOrigen = new javax.swing.JComboBox<>();
        cmbDestino = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaMatriz = new javax.swing.JTextArea();
        btnBFS = new javax.swing.JButton();
        btnDFS = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbInterseccionInicial = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaRecorridos = new javax.swing.JTextArea();
        btnRelacion = new javax.swing.JButton();
        txtTiempo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));

        bg1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel1.setText("Mapa de Calles Urbanas");

        txtInterseccion.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        txtInterseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInterseccionActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel2.setText("Nombre de la Intersección:");

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel3.setText("Añadir Tramo Vial / Calle:");

        cmbOrigen.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        cmbOrigen.setBorder(javax.swing.BorderFactory.createTitledBorder("Origen (Desde):"));
        cmbOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrigenActionPerformed(evt);
            }
        });

        cmbDestino.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        cmbDestino.setBorder(javax.swing.BorderFactory.createTitledBorder("Destino (Hacia):"));

        txaMatriz.setEditable(false);
        txaMatriz.setColumns(20);
        txaMatriz.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        txaMatriz.setRows(5);
        jScrollPane1.setViewportView(txaMatriz);

        btnBFS.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        btnBFS.setText("BFS");
        btnBFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBFSActionPerformed(evt);
            }
        });

        btnDFS.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        btnDFS.setText("DFS");
        btnDFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDFSActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel4.setText("Recorridos:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel5.setText("Matriz de Adyacencia:");

        cmbInterseccionInicial.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        cmbInterseccionInicial.setBorder(javax.swing.BorderFactory.createTitledBorder("Intersección de Partida:"));

        txaRecorridos.setEditable(false);
        txaRecorridos.setColumns(20);
        txaRecorridos.setLineWrap(true);
        txaRecorridos.setRows(5);
        txaRecorridos.setWrapStyleWord(true);
        jScrollPane3.setViewportView(txaRecorridos);

        btnRelacion.setText("RELACION");
        btnRelacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelacionActionPerformed(evt);
            }
        });

        txtTiempo.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        txtTiempo.setBorder(javax.swing.BorderFactory.createTitledBorder("Tiempo(min):"));

        javax.swing.GroupLayout bg1Layout = new javax.swing.GroupLayout(bg1);
        bg1.setLayout(bg1Layout);
        bg1Layout.setHorizontalGroup(
            bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addGap(43, 43, 43)
                .addComponent(cmbInterseccionInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(btnBFS, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnDFS, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
            .addGroup(bg1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg1Layout.createSequentialGroup()
                        .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bg1Layout.createSequentialGroup()
                                    .addComponent(cmbOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cmbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg1Layout.createSequentialGroup()
                        .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bg1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnRelacion))
                            .addGroup(bg1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtInterseccion, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(54, 54, 54))
                    .addGroup(bg1Layout.createSequentialGroup()
                        .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        bg1Layout.setVerticalGroup(
            bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInterseccion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRelacion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg1Layout.createSequentialGroup()
                        .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnBFS, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDFS, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbInterseccionInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(112, 112, 112))))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(bg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtInterseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInterseccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInterseccionActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        nombre = txtInterseccion.getText().trim();
        if(nombre.isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingresa el nombre de la Interseccion","Aviso",1);
            return;
        }
        grafo.agregarVertice(nombre);
        llenarCombo();
        limpiar();
        txaMatriz.setText(grafo.obtenerMatrizTexto());
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cmbOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOrigenActionPerformed

    private void btnBFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBFSActionPerformed
        if(cmbInterseccionInicial.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Seleccione la interseccion desde donde iniciara el recorrido","Aviso",2);
            return;
        }
        intercepcionInicial = cmbInterseccionInicial.getSelectedItem().toString();
        txaRecorridos.setText("");
        txaRecorridos.setText(grafo.bfsTexto(intercepcionInicial));
    }//GEN-LAST:event_btnBFSActionPerformed

    private void btnDFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDFSActionPerformed
        if(cmbInterseccionInicial.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Seleccione la interseccion desde donde Iniciara el recorrido","Aviso",2);
            return;
        }
        intercepcionInicial = cmbInterseccionInicial.getSelectedItem().toString();
        txaRecorridos.setText("");
        txaRecorridos.setText(grafo.dfsTexto(intercepcionInicial));
    }//GEN-LAST:event_btnDFSActionPerformed

    private void btnRelacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelacionActionPerformed
        if(cmbOrigen.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "Seleccione origen","Aviso",2);
            return;
        }
        if(cmbDestino.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "Seleccione destino","Aviso",2);
            return;
        }

        if(cmbOrigen.getSelectedIndex() == cmbDestino.getSelectedIndex()){
            JOptionPane.showMessageDialog(null,"No se puede establecer relacion consigo mismo","Error",0);
            cmbOrigen.setSelectedIndex(0);
            cmbDestino.setSelectedIndex(0);
            return;
        }
        if(txtTiempo.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null,"Ingrese tiempo de recorrido entre ambas intersecciones","Aviso",2);
            return;
        }

        try{
            origen = cmbOrigen.getSelectedItem().toString();
            destino = cmbDestino.getSelectedItem().toString();
            distancia = Integer.parseInt(txtTiempo.getText().trim());
            grafo.agregarArista(origen, destino, distancia);
            txaMatriz.setText(grafo.obtenerMatrizTexto());
            cmbOrigen.setSelectedIndex(0);
            cmbDestino.setSelectedIndex(0);
            txtTiempo.setText("");
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Se debe ingresar un numero entero","Advertencia",2);
            txtTiempo.setText("");
        }

    }//GEN-LAST:event_btnRelacionActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bg1;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBFS;
    private javax.swing.JButton btnDFS;
    private javax.swing.JButton btnRelacion;
    private javax.swing.JComboBox<String> cmbDestino;
    private javax.swing.JComboBox<String> cmbInterseccionInicial;
    private javax.swing.JComboBox<String> cmbOrigen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea txaMatriz;
    private javax.swing.JTextArea txaRecorridos;
    private javax.swing.JTextField txtInterseccion;
    private javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
     private int distancia;
    private String nombre, origen, destino, intercepcionInicial;
}

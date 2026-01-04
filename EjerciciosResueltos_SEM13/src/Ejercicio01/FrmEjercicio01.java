/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ejercicio01;

import Grafo.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class FrmEjercicio01 extends javax.swing.JFrame {

    GrafoMatriz<String> grafo = new GrafoMatriz<>(10,false);
    public FrmEjercicio01() {
        initComponents();
        cmbCiudad1.addItem("--Seleccione--");
        cmbCiudad2.addItem("--Seleccione--");
        cmbCiudadInicial.addItem("--Seleccione--");
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        bg1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cmbCiudad1 = new javax.swing.JComboBox<>();
        cmbCiudad2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaMatriz = new javax.swing.JTextArea();
        btnBFS = new javax.swing.JButton();
        btnDFS = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbCiudadInicial = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaRecorridos = new javax.swing.JTextArea();
        btnRelacion = new javax.swing.JButton();
        txtDistancia = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));

        bg1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel1.setText("Red de Ciudades y Rutas");

        txtCiudad.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        txtCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCiudadActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel2.setText("Ciudad:");

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel3.setText("Establecer  distancia entre ciudades:");

        cmbCiudad1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        cmbCiudad1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ciudad 1:"));
        cmbCiudad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCiudad1ActionPerformed(evt);
            }
        });

        cmbCiudad2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        cmbCiudad2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ciudad 2:"));

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

        cmbCiudadInicial.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        cmbCiudadInicial.setBorder(javax.swing.BorderFactory.createTitledBorder("Ciudad Inicial:"));

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

        txtDistancia.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        txtDistancia.setBorder(javax.swing.BorderFactory.createTitledBorder("Distancia(Km):"));

        javax.swing.GroupLayout bg1Layout = new javax.swing.GroupLayout(bg1);
        bg1.setLayout(bg1Layout);
        bg1Layout.setHorizontalGroup(
            bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addGap(43, 43, 43)
                .addComponent(cmbCiudadInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(btnBFS, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
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
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bg1Layout.createSequentialGroup()
                                    .addComponent(cmbCiudad1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cmbCiudad2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg1Layout.createSequentialGroup()
                        .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bg1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnRelacion))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bg1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)))
                .addGap(24, 24, 24)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCiudad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCiudad2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRelacion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(cmbCiudadInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCiudadActionPerformed
    private void limpiar(){
        txtCiudad.setText("");
        txtCiudad.requestFocus();
    }
    private void llenarCombo(){
        cmbCiudad1.removeAllItems();
        cmbCiudad2.removeAllItems();
        cmbCiudadInicial.removeAllItems();
        
        cmbCiudad1.addItem("--Seleccione--");
        cmbCiudad2.addItem("--Seleccione--");
        cmbCiudadInicial.addItem("--Seleccione--");
        
        ArrayList<String> ciudades = grafo.obtenerVertices();
        for(String ciudad : ciudades){
            cmbCiudad1.addItem(ciudad);
            cmbCiudad2.addItem(ciudad);
            cmbCiudadInicial.addItem(ciudad);
        }  
    }
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        nombre = txtCiudad.getText().trim();
        if(nombre.isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingresa el nombre de la ciudad","Aviso",1);
            return;
        }
        grafo.agregarVertice(nombre);
        llenarCombo();
        limpiar();
        txaMatriz.setText(grafo.obtenerMatrizTexto());
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBFSActionPerformed
        if(cmbCiudadInicial.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Seleccione la ciudad de donde iniciara el recorrido","Aviso",2);
            return;
        }
        ciudadInicial = cmbCiudadInicial.getSelectedItem().toString();
        txaRecorridos.setText("");
        txaRecorridos.setText(grafo.bfsTexto(ciudadInicial));
    }//GEN-LAST:event_btnBFSActionPerformed

    private void btnDFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDFSActionPerformed
        if(cmbCiudadInicial.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Seleccione estudiante desde donde Iniciara el recorrido","Aviso",2);
            return;
        }
        ciudadInicial = cmbCiudadInicial.getSelectedItem().toString();
        txaRecorridos.setText("");
        txaRecorridos.setText(grafo.dfsTexto(ciudadInicial));
    }//GEN-LAST:event_btnDFSActionPerformed

    private void btnRelacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelacionActionPerformed
        if(cmbCiudad1.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "Seleccione ciudad 1","Aviso",2);
            return;
        }
        if(cmbCiudad2.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "Seleccione ciudad 2","Aviso",2);
            return;
        }
        
        if(cmbCiudad1.getSelectedIndex() == cmbCiudad2.getSelectedIndex()){
            JOptionPane.showMessageDialog(null,"No se puede establecer relacion consigo mismo","Error",0);
            cmbCiudad1.setSelectedIndex(0);
            cmbCiudad2.setSelectedIndex(0);
            return;
        }
        if(txtDistancia.getText().trim().isEmpty()){
           JOptionPane.showMessageDialog(null,"Ingrese distancia entre ambas ciudades","Aviso",2);
            return;
        }
        
        try{
            ciudad1 = cmbCiudad1.getSelectedItem().toString();
            ciudad2 = cmbCiudad2.getSelectedItem().toString();
            distancia = Integer.parseInt(txtDistancia.getText().trim());
            grafo.agregarArista(ciudad1, ciudad2, distancia);
            txaMatriz.setText(grafo.obtenerMatrizTexto());
            cmbCiudad1.setSelectedIndex(0);
            cmbCiudad2.setSelectedIndex(0);
            txtDistancia.setText("");
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Se debe ingresar un numero entero","Advertencia",2);
            txtDistancia.setText("");
        }
        
    }//GEN-LAST:event_btnRelacionActionPerformed

    private void cmbCiudad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCiudad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCiudad1ActionPerformed

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
    private javax.swing.JComboBox<String> cmbCiudad1;
    private javax.swing.JComboBox<String> cmbCiudad2;
    private javax.swing.JComboBox<String> cmbCiudadInicial;
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
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtDistancia;
    // End of variables declaration//GEN-END:variables
    private int distancia;
    private String nombre, ciudad1, ciudad2, ciudadInicial;
}

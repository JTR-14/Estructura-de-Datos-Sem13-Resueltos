/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ejercicio02;

import Grafo.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FrmEjercicio02 extends javax.swing.JFrame {

    GrafoLista<String> grafo = new GrafoLista<>(false);
    public FrmEjercicio02() {
        initComponents();
        cmbEstudiante1.addItem("--Seleccione--");
        cmbEstudiante2.addItem("--Seleccione--");
        cmbEstudianteInicial.addItem("--Seleccione--");
    }

    private void llenarCombo(){
        cmbEstudiante1.removeAllItems();
        cmbEstudiante2.removeAllItems();
        cmbEstudianteInicial.removeAllItems();
        
        cmbEstudiante1.addItem("--Seleccione--");
        cmbEstudiante2.addItem("--Seleccione--");
        cmbEstudianteInicial.addItem("--Seleccione--");
        
        ArrayList<String> estudiantes = grafo.obtenerListaNodos();
        for(String estudiante : estudiantes){
            cmbEstudiante1.addItem(estudiante);
            cmbEstudiante2.addItem(estudiante);
            cmbEstudianteInicial.addItem(estudiante);
        }  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtEstudiante = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cmbEstudiante1 = new javax.swing.JComboBox<>();
        cmbEstudiante2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaLista = new javax.swing.JTextArea();
        btnBFS = new javax.swing.JButton();
        btnDFS = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaRecorridos = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAmistad = new javax.swing.JButton();
        cmbEstudianteInicial = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel1.setText(" Red Social Universitaria");

        txtEstudiante.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        txtEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstudianteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel2.setText("Estudiante:");

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel3.setText("Establecer  relación  de amistad:");

        cmbEstudiante1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        cmbEstudiante1.setBorder(javax.swing.BorderFactory.createTitledBorder("Estudiante 1:"));

        cmbEstudiante2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        cmbEstudiante2.setBorder(javax.swing.BorderFactory.createTitledBorder("Estudiante 2:"));

        txaLista.setEditable(false);
        txaLista.setColumns(20);
        txaLista.setLineWrap(true);
        txaLista.setRows(5);
        txaLista.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txaLista);

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

        txaRecorridos.setEditable(false);
        txaRecorridos.setColumns(20);
        txaRecorridos.setLineWrap(true);
        txaRecorridos.setRows(5);
        txaRecorridos.setWrapStyleWord(true);
        jScrollPane3.setViewportView(txaRecorridos);

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel4.setText("Recorridos:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel5.setText("Lista de Adyacencia:");

        btnAmistad.setText("AMISTAD");
        btnAmistad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmistadActionPerformed(evt);
            }
        });

        cmbEstudianteInicial.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        cmbEstudianteInicial.setBorder(javax.swing.BorderFactory.createTitledBorder("Estudiante Inicial:"));

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jSeparator1)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(txtEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 12, Short.MAX_VALUE))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(cmbEstudiante1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(cmbEstudiante2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAmistad, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)))
                        .addContainerGap())
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel4)
                        .addGap(53, 53, 53)
                        .addComponent(cmbEstudianteInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBFS, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnDFS, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel2))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbEstudiante1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEstudiante2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAmistad, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel4))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDFS, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBFS, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbEstudianteInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstudianteActionPerformed

    private void btnDFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDFSActionPerformed
        if(cmbEstudianteInicial.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Seleccione estudiante desde donde Iniciara el recorrido","Aviso",2);
            return;
        }
        estudianteInicial = cmbEstudianteInicial.getSelectedItem().toString();
        txaRecorridos.setText("");
        txaRecorridos.setText(grafo.dfsTexto(estudianteInicial));
    }//GEN-LAST:event_btnDFSActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        nombre = txtEstudiante.getText().trim();
        if(nombre.isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingresa el nombre de un estudiante","Aviso",1);
            return;
        }
        grafo.agregarVertice(nombre);
        llenarCombo();
        limpiar();
        txaLista.setText(grafo.obtenerGrafoTexto());
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAmistadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmistadActionPerformed
        if(cmbEstudiante1.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "Seleccione estudiante 1","Aviso",2);
            return;                   
        }
        if(cmbEstudiante2.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "Seleccione estudiante 2","Aviso",2);
            return;                   
        }
        if(cmbEstudiante1.getSelectedIndex() == cmbEstudiante2.getSelectedIndex()){
            JOptionPane.showMessageDialog(null,"No se puede establecer relacion consigo mismo","Error",0);
            cmbEstudiante1.setSelectedIndex(0);
            cmbEstudiante2.setSelectedIndex(0);
            return;
        }
        estudiante1 = cmbEstudiante1.getSelectedItem().toString();
        estudiante2 = cmbEstudiante2.getSelectedItem().toString();
        
        grafo.agregarArista(estudiante1,estudiante2);
        txaLista.setText(grafo.obtenerGrafoTexto());
        
        cmbEstudiante1.setSelectedIndex(0);
        cmbEstudiante2.setSelectedIndex(0);
    }//GEN-LAST:event_btnAmistadActionPerformed

    private void btnBFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBFSActionPerformed
        if(cmbEstudianteInicial.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Seleccione estudiante desde donde Iniciara el recorrido","Aviso",2);
            return;
        }
        estudianteInicial = cmbEstudianteInicial.getSelectedItem().toString();
        txaRecorridos.setText("");
        txaRecorridos.setText(grafo.bfsTexto(estudianteInicial));
    }//GEN-LAST:event_btnBFSActionPerformed

    private void limpiar(){
        txtEstudiante.setText("");
        txtEstudiante.requestFocus();
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAmistad;
    private javax.swing.JButton btnBFS;
    private javax.swing.JButton btnDFS;
    private javax.swing.JComboBox<String> cmbEstudiante1;
    private javax.swing.JComboBox<String> cmbEstudiante2;
    private javax.swing.JComboBox<String> cmbEstudianteInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea txaLista;
    private javax.swing.JTextArea txaRecorridos;
    private javax.swing.JTextField txtEstudiante;
    // End of variables declaration//GEN-END:variables
    private String nombre, estudiante1, estudiante2, estudianteInicial;
}

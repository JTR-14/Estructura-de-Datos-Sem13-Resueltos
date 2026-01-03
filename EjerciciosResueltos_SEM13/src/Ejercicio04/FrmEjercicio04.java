/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ejercicio04;

import Grafo.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class FrmEjercicio04 extends javax.swing.JFrame {

    GrafoLista<String> mallaCurricular = new GrafoLista<>(true);
    
    public FrmEjercicio04() {
        initComponents();
        cmbOrigen.addItem("--Seleccione--");
        cmbDestino.addItem("--Seleccione--");
        cmbCursoInicial.addItem("--Seleccione--");
    }

   private void llenarCombo(){
        cmbOrigen.removeAllItems();
        cmbDestino.removeAllItems();
        cmbCursoInicial.removeAllItems();
        
        cmbOrigen.addItem("--Seleccione--");
        cmbDestino.addItem("--Seleccione--");
        cmbCursoInicial.addItem("--Seleccione--");
        
        ArrayList<String> cursos = mallaCurricular.obtenerListaNodos();
        for(String curso : cursos){
            cmbOrigen.addItem(curso);
            cmbDestino.addItem(curso);
            cmbCursoInicial.addItem(curso);
        }  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        bg1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCurso = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cmbOrigen = new javax.swing.JComboBox<>();
        cmbDestino = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaLista = new javax.swing.JTextArea();
        btnDFS = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaRecorridos = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        btnRelacion = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cmbCursoInicial = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));

        bg1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel1.setText("Dependencias entre Cursos Universitarios");

        txtCurso.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        txtCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCursoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel2.setText("Curso:");

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel3.setText("Establecer  relación  de amistad:");

        cmbOrigen.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        cmbOrigen.setBorder(javax.swing.BorderFactory.createTitledBorder("Prerrequisito:"));

        cmbDestino.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        cmbDestino.setBorder(javax.swing.BorderFactory.createTitledBorder("Curso Desbloqueado:"));

        txaLista.setEditable(false);
        txaLista.setColumns(20);
        txaLista.setLineWrap(true);
        txaLista.setRows(5);
        txaLista.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txaLista);

        btnDFS.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        btnDFS.setText("DFS");
        btnDFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDFSActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel5.setText("→");

        txaRecorridos.setEditable(false);
        txaRecorridos.setColumns(20);
        txaRecorridos.setLineWrap(true);
        txaRecorridos.setRows(5);
        txaRecorridos.setWrapStyleWord(true);
        jScrollPane3.setViewportView(txaRecorridos);

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel6.setText("Recorridos:");

        btnRelacion.setText("RELACION");
        btnRelacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelacionActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel7.setText("Lista de adyacencia:");

        cmbCursoInicial.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        cmbCursoInicial.setBorder(javax.swing.BorderFactory.createTitledBorder("Curso Inicial:"));

        javax.swing.GroupLayout bg1Layout = new javax.swing.GroupLayout(bg1);
        bg1.setLayout(bg1Layout);
        bg1Layout.setHorizontalGroup(
            bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg1Layout.createSequentialGroup()
                .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bg1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(btnAgregar))
                            .addGroup(bg1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbCursoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(btnDFS, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bg1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btnRelacion, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(bg1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bg1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(211, 211, 211)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bg1Layout.createSequentialGroup()
                                .addComponent(cmbOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(cmbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(bg1Layout.createSequentialGroup()
                .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bg1Layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(jLabel1))
                        .addGroup(bg1Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                                .addComponent(jSeparator2))))
                    .addGroup(bg1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bg1Layout.setVerticalGroup(
            bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2))
                    .addGroup(bg1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bg1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(cmbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bg1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(22, 22, 22))
                            .addGroup(bg1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnRelacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)))))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCursoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(btnDFS, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bg1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCursoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        nombre = txtCurso.getText().trim();
        if(nombre.isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingresa el nombre de un curso","Aviso",1);
            return;
        }
        mallaCurricular.agregarVertice(nombre);
        llenarCombo();
        limpiar();
        txaLista.setText(mallaCurricular.obtenerGrafoCursos());
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnRelacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelacionActionPerformed
         if(cmbOrigen.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "Seleccione curso que es Prerrequisito","Aviso",2);
            return;                   
        }
        if(cmbDestino.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "Seleccione Curso Desbloqueado","Aviso",2);
            return;                   
        }
        if(cmbOrigen.getSelectedIndex() == cmbDestino.getSelectedIndex()){
            JOptionPane.showMessageDialog(null,"El curso aprobado no puede abrir el mismo curso","Error",0);
            cmbOrigen.setSelectedIndex(0);
            cmbDestino.setSelectedIndex(0);
            return;
        }
        cursoOrigen = cmbOrigen.getSelectedItem().toString();
        cursoDestino = cmbDestino.getSelectedItem().toString();
        
        mallaCurricular.agregarArista(cursoOrigen,cursoDestino);
        txaLista.setText(mallaCurricular.obtenerGrafoCursos());
        
        cmbOrigen.setSelectedIndex(0);
        cmbDestino.setSelectedIndex(0);
    }//GEN-LAST:event_btnRelacionActionPerformed

    private void btnDFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDFSActionPerformed
        if(cmbCursoInicial.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Seleccione curso desde donde iniciara el recorrido","Aviso",2);
            return;
        }
        cursoInicial = cmbCursoInicial.getSelectedItem().toString();
        txaRecorridos.setText("");
        txaRecorridos.setText(mallaCurricular.dfsTexto(cursoInicial));
    }//GEN-LAST:event_btnDFSActionPerformed

    private void limpiar(){
        txtCurso.setText("");
        txtCurso.requestFocus();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bg1;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnDFS;
    private javax.swing.JButton btnRelacion;
    private javax.swing.JComboBox<String> cmbCursoInicial;
    private javax.swing.JComboBox<String> cmbDestino;
    private javax.swing.JComboBox<String> cmbOrigen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea txaLista;
    private javax.swing.JTextArea txaRecorridos;
    private javax.swing.JTextField txtCurso;
    // End of variables declaration//GEN-END:variables
    private String nombre, cursoOrigen, cursoDestino, cursoInicial;
}

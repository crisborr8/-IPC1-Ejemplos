/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.rpg;

import javax.swing.JOptionPane;

/**
 *
 * @author criss
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        vrinv = new VerInventario();
        vrinv.setPrincipal(this);
        hab = new Habilidades();
        hab.setPrincipal(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_cerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_clase = new javax.swing.JLabel();
        btn_inventario = new javax.swing.JButton();
        btn_habilidades = new javax.swing.JButton();
        btn_abrirCaja = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbl_nivel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_experiencia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_cerrar.setText("Cerrar sesion");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuario");

        lbl_usuario.setText("jLabel2");

        jLabel3.setText("Clase");

        lbl_clase.setText("jLabel4");

        btn_inventario.setText("Ver inventario");
        btn_inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inventarioActionPerformed(evt);
            }
        });

        btn_habilidades.setText("Ver habilidades");
        btn_habilidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_habilidadesActionPerformed(evt);
            }
        });

        btn_abrirCaja.setText("Abrir caja");
        btn_abrirCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_abrirCajaActionPerformed(evt);
            }
        });

        jLabel2.setText("Nivel");

        lbl_nivel.setText("jLabel4");

        jLabel5.setText("Experiencia");

        lbl_experiencia.setText("100/2500");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_clase)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_usuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_cerrar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(36, 36, 36)
                                .addComponent(lbl_experiencia))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(43, 43, 43)
                                .addComponent(lbl_nivel))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_abrirCaja))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn_habilidades)
                                        .addComponent(btn_inventario))
                                    .addGap(171, 171, 171))))
                        .addGap(0, 76, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cerrar)
                    .addComponent(jLabel1)
                    .addComponent(lbl_usuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbl_clase))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nivel)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbl_experiencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btn_inventario)
                .addGap(8, 8, 8)
                .addComponent(btn_abrirCaja)
                .addGap(1, 1, 1)
                .addComponent(btn_habilidades)
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Inicio_sesion is;
    VerInventario vrinv;
    Habilidades hab;
    usuario usr;
    public void cargarClase(Inicio_sesion is){
        this.is = is;
    }

    public void setUsr(usuario usr) {
        this.usr = usr;
        lbl_usuario.setText(usr.getNombre_usuario());
        lbl_clase.setText(usr.getClase());
        lbl_nivel.setText(usr.getNivel() + "");
        lbl_experiencia.setText(usr.getExp_actual() + "/" +usr.getExp_necesaria());
    }
    
    
    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        this.setVisible(false);
        is.setVisible(true);
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btn_inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inventarioActionPerformed
        this.setVisible(false);
        vrinv.setVisible(true);
        vrinv.setDatosEnTabla(usr);
    }//GEN-LAST:event_btn_inventarioActionPerformed

    private void btn_habilidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_habilidadesActionPerformed
        this.setVisible(false);
        hab.setVisible(true);
    }//GEN-LAST:event_btn_habilidadesActionPerformed

    private void btn_abrirCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_abrirCajaActionPerformed
        //De forma aleatorea me dara ya sea un item, una habilidad o experiencia
        //si el numero aleatoreo es 1 -> item
        //2 -> habilidad
        // 3 -> experiencia
        //Generar un numero entre el 1 y el 3
        int numero = (int)(Math.random()*3+1);
        if(numero == 1){ //Item
            //Generar el item
            Inventario inv = new Inventario().getItemAleatorio();
            //Buscar en la lista de inventario si existe
            /*
            for(int i = 0; i < usr.getLista_inventario().size(); i++){
                Inventario inv_actual = usr.getLista_inventario().get(i);
                //----
            }*/
            boolean existeEnInventario = false;
            for(Inventario inv_actual : usr.getLista_inventario()){
                if(inv_actual.getNombre().equals(inv.getNombre()) && inv_actual.getTipo().equals(inv.getTipo())){
                    inv_actual.setCantidad(inv_actual.getCantidad() + inv.getCantidad());
                    existeEnInventario = true;
                    break;
                }
            }
            if(!existeEnInventario){
                usr.getLista_inventario().add(inv);
            }
            //Mensaje de exito
            JOptionPane.showMessageDialog(null, "Se ha abierto un item\nSe ha agregado " + inv.getCantidad() + " de " + inv.getNombre());
        } else if (numero == 2){
            JOptionPane.showMessageDialog(null, "Se generaran habilidades");
        } else {
            JOptionPane.showMessageDialog(null, "Se generara experiencia");
        }
    }//GEN-LAST:event_btn_abrirCajaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_abrirCaja;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_habilidades;
    private javax.swing.JButton btn_inventario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbl_clase;
    private javax.swing.JLabel lbl_experiencia;
    private javax.swing.JLabel lbl_nivel;
    private javax.swing.JLabel lbl_usuario;
    // End of variables declaration//GEN-END:variables
}

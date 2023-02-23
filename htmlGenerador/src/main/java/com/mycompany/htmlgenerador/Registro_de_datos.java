/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.htmlgenerador;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author criss
 */
public class Registro_de_datos extends javax.swing.JFrame {

    /**
     * Creates new form Registro_de_datos
     */
    public Registro_de_datos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JButton();
        btn_generar = new javax.swing.JButton();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_edad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_tarjeta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        jLabel3.setText("Edad");

        btn_agregar.setText("Agregar a lista");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_generar.setText("Generar HTLM");
        btn_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarActionPerformed(evt);
            }
        });

        txt_edad.setToolTipText("");

        jLabel4.setText("Tarjeta");

        txt_tarjeta.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_generar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_agregar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(44, 44, 44)
                        .addComponent(txt_tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txt_tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btn_agregar)
                .addGap(18, 18, 18)
                .addComponent(btn_generar)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Las listas de los usuarios
    List<Usuario> lista_usuario = new ArrayList<Usuario>();
    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        //Agregará a una lista los datos del usuario
        if(txt_nombre.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Error, nombre no debe de ir vacio");
        } else if (txt_apellido.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Error, apellido no debe de ir vacio");
        } else if (txt_edad.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Error, edad no debe de ir vacio");
        } else if (txt_tarjeta.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Error, tarjeta no debe de ir vacio");
        } else {
            try{
                Usuario new_user = new Usuario();
                new_user.setNombre(txt_nombre.getText().trim());
                new_user.setApellido(txt_apellido.getText().trim());
                new_user.setEdad(Integer.parseInt(txt_edad.getText().trim()));
                //para guardar la tarjeta, vamos a cambiar todos los primeros dígitos por XXXX y solo
                //se dejarán los ultimos 4 como numeros
                String tarjeta_modificada = txt_tarjeta.getText().trim().substring(txt_tarjeta.getText().trim().length() - 4);
                tarjeta_modificada = "XXXXXX" + tarjeta_modificada;
                new_user.setTarjeta(tarjeta_modificada);
                lista_usuario.add(new_user);
                JOptionPane.showMessageDialog(null, "Su usuario ha sido ingresado con exito! :D");
            } catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Error, edad debe de ser un numero");
            }
        }
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarActionPerformed
        //Generacion de html para reporte
        String estructura_de_tabla_de_html = "<table><tr>\n" +
                "    <th>Nombre</th>\n" +
                "    <th>Apellido</th>\n" +
                "    <th>Edad</th>\n" +
                "    <th>Tarjeta</th>\n" +
                "  </tr>";
        //Estos dos FOR funcionan exactamente igual, la diferencia es que en el 
        //segundo no hacemos uso de un contador (la variable i)
        /*
        for(int i = 0; i < lista_usuario.size(); i++){
            Usuario usr = lista_usuario.get(i);
        }
        for(Usuario usr : lista_usuario){
            
        }
        */
        for(Usuario usr : lista_usuario){
            estructura_de_tabla_de_html += "<tr>"
                    + "<th>" + usr.getNombre() + "</th>"
                    + "<th>" + usr.getApellido() + "</th>"
                    + "<th>" + usr.getEdad() + "</th>"
                    + "<th>" + usr.getTarjeta() + "</th>"
                    + "</tr>";
        }
        estructura_de_tabla_de_html += "</table>";
        String estructura_de_html = "<html>"
                + "<style>\n" +
                        "table, th, td {\n" +
                        "  border:1px solid black;\n" +
                        "}\n" +
                        "</style>"
                + "<body><h1>Informe</h1>" + estructura_de_tabla_de_html + "</body></html>";
        File archivo = new File("reporte.html");
        try {
            //Código para escribir el archivo
            archivo.createNewFile(); //Crear un archivo y si existe no hace nada
            FileWriter escritor_de_Archivo = new FileWriter("reporte.html");
            escritor_de_Archivo.write(estructura_de_html);
            escritor_de_Archivo.close();
            //Codigo para abrir el archivo creado y escrito
            Desktop abridor = Desktop.getDesktop();
            abridor.open(archivo);
        } catch (IOException ex) {
            Logger.getLogger(Registro_de_datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_generarActionPerformed

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
            java.util.logging.Logger.getLogger(Registro_de_datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_de_datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_de_datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_de_datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_de_datos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_generar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_edad;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_tarjeta;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_davidreyes;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }
    String usuario, contra, usuario_res, contra_res;
    ArrayList<Object> listausuarios = new ArrayList(), listacontra = new ArrayList();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Registro = new javax.swing.JDialog();
        jb_usuarioregistro = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jtf_usuarioregis = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jpf_passwordregis = new javax.swing.JPasswordField();
        jb_usuario = new javax.swing.JLabel();
        jtf_Usuario = new javax.swing.JTextField();
        lb_Password = new javax.swing.JLabel();
        jp_contraseña = new javax.swing.JPasswordField();
        jb_ingresar = new javax.swing.JButton();
        jb_registrar = new javax.swing.JButton();

        jb_usuarioregistro.setText("Usuario:");

        jButton1.setText("Registrar");

        jLabel1.setText("Contraseña:");

        javax.swing.GroupLayout RegistroLayout = new javax.swing.GroupLayout(Registro.getContentPane());
        Registro.getContentPane().setLayout(RegistroLayout);
        RegistroLayout.setHorizontalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jButton1))
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jb_usuarioregistro)
                            .addComponent(jtf_usuarioregis)
                            .addComponent(jpf_passwordregis, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        RegistroLayout.setVerticalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jb_usuarioregistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtf_usuarioregis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpf_passwordregis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jButton1)
                .addGap(76, 76, 76))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jb_usuario.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jb_usuario.setText(" Usuario");

        lb_Password.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lb_Password.setText("Password");

        jb_ingresar.setText("Ingresar");
        jb_ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_ingresarMouseClicked(evt);
            }
        });

        jb_registrar.setText("Registrar");
        jb_registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_registrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_Password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtf_Usuario)
                    .addComponent(jp_contraseña)
                    .addComponent(jb_ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jb_usuario)
                .addGap(18, 18, 18)
                .addComponent(jtf_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_Password)
                .addGap(18, 18, 18)
                .addComponent(jp_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jb_ingresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_registrar)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_ingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ingresarMouseClicked

    }//GEN-LAST:event_jb_ingresarMouseClicked

    private void jb_registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_registrarMouseClicked

        Registro.setModal(true);
        Registro.pack();
        Registro.setLocationRelativeTo(null);
        Registro.setVisible(true);
        usuario_res = jb_usuarioregistro.getText();
        contra_res = jpf_passwordregis.getText();
        if (listausuarios.isEmpty()) {
            listausuarios.add(usuario_res);
            listacontra.add(contra_res);
        } else {
            if (listausuarios.contains(usuario_res)) {
                JOptionPane.showMessageDialog(this, "Este usuario no esta disponible");
                jb_usuarioregistro.setText("");
                jpf_passwordregis.setText("");

            } else {
                listausuarios.add(usuario_res);
                listacontra.add(contra_res);
                JOptionPane.showMessageDialog(this, "Registro completado");

            }
        }
        jb_usuarioregistro.setText("");
        jpf_passwordregis.setText("");

    }//GEN-LAST:event_jb_registrarMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Registro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jb_ingresar;
    private javax.swing.JButton jb_registrar;
    private javax.swing.JLabel jb_usuario;
    private javax.swing.JLabel jb_usuarioregistro;
    private javax.swing.JPasswordField jp_contraseña;
    private javax.swing.JPasswordField jpf_passwordregis;
    private javax.swing.JTextField jtf_Usuario;
    private javax.swing.JTextField jtf_usuarioregis;
    private javax.swing.JLabel lb_Password;
    // End of variables declaration//GEN-END:variables
}

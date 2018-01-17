/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import model.bean.DaoImplLoja;
import javax.swing.JOptionPane;
import model.bean.DaoImplGestores;

/**
 *
 * @author felipedania
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
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
        jTextFieldLOGIN = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jButtonENTRAR = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        newLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        jLabel1.setText("Login");

        jLabel2.setText("Senha");

        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });
        jPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldKeyPressed(evt);
            }
        });

        jButtonENTRAR.setText("ENTRAR");
        jButtonENTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonENTRARActionPerformed(evt);
            }
        });
        jButtonENTRAR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonENTRARKeyPressed(evt);
            }
        });

        jButton1.setText("ENCERRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo_Acaits.png"))); // NOI18N

        newLogin.setText("Criar login");
        newLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newLogin)
                        .addGap(61, 61, 61)
                        .addComponent(jButtonENTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1))
                            .addComponent(jTextFieldLOGIN)
                            .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldLOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonENTRAR)
                    .addComponent(newLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonENTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonENTRARActionPerformed
        model.bean.DaoImplLoja loginUsuario = new DaoImplLoja();
        model.bean.DaoImplGestores loginGestores = new DaoImplGestores();
        String senha = String.valueOf(jPasswordField.getPassword());
//        String usuario = String.valueOf(jTextFieldLOGIN.getText());

        if (jTextFieldLOGIN.getText() != "" && senha != "") {
            if (loginUsuario.validarLoginLoja(jTextFieldLOGIN.getText(), senha)) {
                TestaCardapio testaCardapio = new TestaCardapio();
                testaCardapio.setVisible(true);
                this.dispose();
            } else if (loginGestores.validarLoginGestores(jTextFieldLOGIN.getText(), senha)) {
                TestaGestor testaGestor = new TestaGestor();
                testaGestor.setVisible(true);
                this.dispose();
            }
        } else if (jTextFieldLOGIN.getText() == "" && senha == "") {
            jTextFieldLOGIN.setBackground(Color.red);
            jPasswordField.setBackground(Color.red);
            JOptionPane.showMessageDialog(null, "Campos em branco, insira para efetuar o login");
        }
    }//GEN-LAST:event_jButtonENTRARActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldActionPerformed

    private void jPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldKeyPressed

    }//GEN-LAST:event_jPasswordFieldKeyPressed

    private void newLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newLoginActionPerformed
        NovoLogin newLogin = new NovoLogin();
        newLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_newLoginActionPerformed

    private void jButtonENTRARKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonENTRARKeyPressed
        model.bean.DaoImplLoja loginUsuario = new DaoImplLoja();
        model.bean.DaoImplGestores loginGestores = new DaoImplGestores();
        String senha = String.valueOf(jPasswordField.getPassword());

        if (jTextFieldLOGIN.getText() != "" && senha != "") {
            if (loginUsuario.validarLoginLoja(jTextFieldLOGIN.getText(), senha)) {
                TestaCardapio testaCardapio = new TestaCardapio();
                testaCardapio.setVisible(true);
                this.dispose();
            } else if (loginGestores.validarLoginGestores(jTextFieldLOGIN.getText(), senha)) {
                TestaGestor testaGestor = new TestaGestor();
                testaGestor.setVisible(true);
                this.dispose();
            }
        } else {
            jTextFieldLOGIN.setText("");
            jPasswordField.setText("");
            JOptionPane.showMessageDialog(null, "Dados incorretos, insira novamente");
        }
    }//GEN-LAST:event_jButtonENTRARKeyPressed

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
                if ("Mac OS X".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonENTRAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldLOGIN;
    private javax.swing.JButton newLogin;
    // End of variables declaration//GEN-END:variables
}
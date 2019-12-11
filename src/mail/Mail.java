package mail;

import Clases.Correo;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;

public class Mail extends javax.swing.JFrame {

    Correo mail = new Correo();

    public Mail() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Aplicacion para enviar correos");
        width.setText("Ancho: " + taMensaje.getWidth());
        heigth.setText("Altura: " + taMensaje.getHeight());
        taMensaje.setLineWrap(true);
        taMensaje.setWrapStyleWord(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txCorreo = new javax.swing.JTextField();
        txAsunto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taMensaje = new javax.swing.JTextArea();
        width = new javax.swing.JLabel();
        heigth = new javax.swing.JLabel();
        anchoActual = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(217, 48, 37));
        jLabel1.setText("Correo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 100, 30));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(217, 48, 37));
        jLabel2.setText("Asunto");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 100, 30));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(217, 48, 37));
        jLabel3.setText("Mensaje");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 100, 30));

        txCorreo.setBackground(new java.awt.Color(241, 243, 244));
        txCorreo.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 400, 30));

        txAsunto.setBackground(new java.awt.Color(241, 243, 244));
        txAsunto.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txAsunto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 400, 30));

        taMensaje.setBackground(new java.awt.Color(241, 243, 244));
        taMensaje.setColumns(20);
        taMensaje.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        taMensaje.setRows(5);
        taMensaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                taMensajeKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(taMensaje);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 400, 150));

        width.setForeground(new java.awt.Color(0, 0, 0));
        width.setText("jLabel4");
        jPanel1.add(width, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, -1, -1));

        heigth.setForeground(new java.awt.Color(0, 0, 0));
        heigth.setText("jLabel5");
        jPanel1.add(heigth, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, -1, -1));

        anchoActual.setText("jLabel4");
        jPanel1.add(anchoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 80, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 320));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(26, 115, 232));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 150, 40));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 320, 660, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txCorreo.getText().length() > 0) {
            if (txAsunto.getText().length() > 0) {
                if (taMensaje.getText().length() > 0) {
                    try {
                        mail.Conectar(txCorreo.getText(), txAsunto.getText(), taMensaje.getText());
                    } catch (MessagingException ex) {
                        Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null, "Error: " + ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Falta el mensaje del correo");
                    taMensaje.grabFocus();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Falta el asunto del correo");
                txAsunto.grabFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Falta el correo del destinatario");
            txCorreo.grabFocus();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void taMensajeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_taMensajeKeyReleased
        anchoActual.setText("" + taMensaje.getText().length());
    }//GEN-LAST:event_taMensajeKeyReleased

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
            java.util.logging.Logger.getLogger(Mail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anchoActual;
    private javax.swing.JLabel heigth;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea taMensaje;
    private javax.swing.JTextField txAsunto;
    private javax.swing.JTextField txCorreo;
    private javax.swing.JLabel width;
    // End of variables declaration//GEN-END:variables
}

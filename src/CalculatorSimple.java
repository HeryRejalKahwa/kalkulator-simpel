/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Agus
 */
public class CalculatorSimple extends javax.swing.JFrame {
String angka;
double jumlah,angka1,angka2;
int pilih;
    public CalculatorSimple() {
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

        kah1 = new javax.swing.JButton();
        kah2 = new javax.swing.JButton();
        kah3 = new javax.swing.JButton();
        kahtambah = new javax.swing.JButton();
        kah4 = new javax.swing.JButton();
        kah5 = new javax.swing.JButton();
        kah6 = new javax.swing.JButton();
        kahkurang = new javax.swing.JButton();
        kah7 = new javax.swing.JButton();
        kah8 = new javax.swing.JButton();
        kah9 = new javax.swing.JButton();
        kahkali = new javax.swing.JButton();
        kah0 = new javax.swing.JButton();
        kahtitik = new javax.swing.JButton();
        kahclear = new javax.swing.JButton();
        kahbagi = new javax.swing.JButton();
        kahplusminus = new javax.swing.JButton();
        kahsamadengan = new javax.swing.JButton();
        display = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kah1.setText("1");
        kah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kah1ActionPerformed(evt);
            }
        });
        getContentPane().add(kah1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 68, 61, 32));

        kah2.setText("2");
        kah2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kah2ActionPerformed(evt);
            }
        });
        getContentPane().add(kah2, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 68, 61, 32));

        kah3.setText("3");
        kah3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kah3ActionPerformed(evt);
            }
        });
        getContentPane().add(kah3, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 68, 61, 32));

        kahtambah.setText("+");
        getContentPane().add(kahtambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 68, 61, 32));

        kah4.setText("4");
        kah4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kah4ActionPerformed(evt);
            }
        });
        getContentPane().add(kah4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 106, 61, 32));

        kah5.setText("5");
        kah5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kah5ActionPerformed(evt);
            }
        });
        getContentPane().add(kah5, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 106, 61, 32));

        kah6.setText("6");
        kah6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kah6ActionPerformed(evt);
            }
        });
        getContentPane().add(kah6, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 106, 61, 32));

        kahkurang.setText("-");
        getContentPane().add(kahkurang, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 106, 61, 32));

        kah7.setText("7");
        kah7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kah7ActionPerformed(evt);
            }
        });
        getContentPane().add(kah7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 144, 61, 32));

        kah8.setText("8");
        kah8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kah8ActionPerformed(evt);
            }
        });
        getContentPane().add(kah8, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 144, 61, 32));

        kah9.setText("9");
        kah9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kah9ActionPerformed(evt);
            }
        });
        getContentPane().add(kah9, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 144, 61, 32));

        kahkali.setText("*");
        getContentPane().add(kahkali, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 144, 61, 32));

        kah0.setText("0");
        kah0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kah0ActionPerformed(evt);
            }
        });
        getContentPane().add(kah0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 182, 61, 32));

        kahtitik.setText(".");
        kahtitik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kahtitikActionPerformed(evt);
            }
        });
        getContentPane().add(kahtitik, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 182, 61, 32));

        kahclear.setText("c");
        getContentPane().add(kahclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 182, 61, 32));

        kahbagi.setText("/");
        getContentPane().add(kahbagi, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 182, 61, 32));

        kahplusminus.setText("+/-");
        getContentPane().add(kahplusminus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 132, 32));

        kahsamadengan.setText("=");
        getContentPane().add(kahsamadengan, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 220, 132, 32));

        display.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        display.setToolTipText("");
        getContentPane().add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 274, 46));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kah1ActionPerformed
   angka += "1";
display.setText(angka);
    }//GEN-LAST:event_kah1ActionPerformed

    private void kah2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kah2ActionPerformed
   angka += "2";
display.setText(angka);
    }//GEN-LAST:event_kah2ActionPerformed

    private void kah3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kah3ActionPerformed
   angka += "3";
display.setText(angka);
    }//GEN-LAST:event_kah3ActionPerformed

    private void kah4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kah4ActionPerformed
  angka += "4";
display.setText(angka);
    }//GEN-LAST:event_kah4ActionPerformed

    private void kah5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kah5ActionPerformed
     angka += "5";
display.setText(angka);
    }//GEN-LAST:event_kah5ActionPerformed

    private void kah6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kah6ActionPerformed
   angka += "6";
display.setText(angka);
    }//GEN-LAST:event_kah6ActionPerformed

    private void kah7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kah7ActionPerformed
    angka += "7";
display.setText(angka);
    }//GEN-LAST:event_kah7ActionPerformed

    private void kah8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kah8ActionPerformed
    angka += "8";
display.setText(angka);
    }//GEN-LAST:event_kah8ActionPerformed

    private void kah9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kah9ActionPerformed
     angka += "9";
display.setText(angka);
    }//GEN-LAST:event_kah9ActionPerformed

    private void kah0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kah0ActionPerformed
   angka += "0";
display.setText(angka);
    }//GEN-LAST:event_kah0ActionPerformed

    private void kahtitikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kahtitikActionPerformed
    angka += ".";
display.setText(angka);
    }//GEN-LAST:event_kahtitikActionPerformed

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
            java.util.logging.Logger.getLogger(CalculatorSimple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorSimple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorSimple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorSimple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorSimple().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField display;
    private javax.swing.JButton kah0;
    private javax.swing.JButton kah1;
    private javax.swing.JButton kah2;
    private javax.swing.JButton kah3;
    private javax.swing.JButton kah4;
    private javax.swing.JButton kah5;
    private javax.swing.JButton kah6;
    private javax.swing.JButton kah7;
    private javax.swing.JButton kah8;
    private javax.swing.JButton kah9;
    private javax.swing.JButton kahbagi;
    private javax.swing.JButton kahclear;
    private javax.swing.JButton kahkali;
    private javax.swing.JButton kahkurang;
    private javax.swing.JButton kahplusminus;
    private javax.swing.JButton kahsamadengan;
    private javax.swing.JButton kahtambah;
    private javax.swing.JButton kahtitik;
    // End of variables declaration//GEN-END:variables
}

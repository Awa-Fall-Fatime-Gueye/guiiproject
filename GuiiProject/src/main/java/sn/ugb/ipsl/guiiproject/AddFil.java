/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ugb.ipsl.guiiproject;

import javax.swing.JOptionPane;
import sn.ugb.ipsl.entite.Filiere;
import sn.ugb.ipsl.service.FiliereServiceImp;

/**
 *
 * @author user
 */
public class AddFil extends javax.swing.JPanel {
    FiliereServiceImp filiereservice = new FiliereServiceImp();

    /**
     * Creates new form AddFil
     */
    public AddFil() {
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
        FiliereTextField1 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Ajout filiere");
        add(jLabel1);
        jLabel1.setBounds(155, 21, 121, 29);

        jLabel2.setText("nomF:");
        add(jLabel2);
        jLabel2.setBounds(20, 94, 30, 14);

        FiliereTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiliereTextField1ActionPerformed(evt);
            }
        });
        add(FiliereTextField1);
        FiliereTextField1.setBounds(60, 91, 194, 20);

        jToggleButton1.setText("Annuler");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        add(jToggleButton1);
        jToggleButton1.setBounds(217, 239, 69, 23);

        jToggleButton2.setText("Enregistrer");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        add(jToggleButton2);
        jToggleButton2.setBounds(295, 240, 85, 23);
    }// </editor-fold>//GEN-END:initComponents

    private void FiliereTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiliereTextField1ActionPerformed
      
    }//GEN-LAST:event_FiliereTextField1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        String fil=FiliereTextField1.getText();
        if (fil==null || fil.isBlank()) {
           JOptionPane.showMessageDialog(this, "ce champ est obligatoire", "error", JOptionPane.ERROR_MESSAGE);
           return;
        }
        filiereservice.add(fil);
         JOptionPane.showMessageDialog(this, "la filiere est ajouter", "", JOptionPane.INFORMATION_MESSAGE);
        FiliereTextField1.setText("");
    }//GEN-LAST:event_jToggleButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FiliereTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}
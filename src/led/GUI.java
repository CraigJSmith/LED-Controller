package led;

import java.util.logging.Level;
import java.util.logging.Logger;
import static led.SerialClass.*;

public class GUI extends javax.swing.JFrame {
    private int value;

    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        redButton = new javax.swing.JToggleButton();
        yellowButton = new javax.swing.JToggleButton();
        greenButton = new javax.swing.JToggleButton();
        blueButton = new javax.swing.JToggleButton();
        pinkButton = new javax.swing.JToggleButton();
        cyanButton = new javax.swing.JToggleButton();
        whiteButton = new javax.swing.JToggleButton();
        offButton = new javax.swing.JToggleButton();
        pwm = new javax.swing.JSlider();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        redButton.setBackground(new java.awt.Color(255, 0, 0));
        buttonGroup1.add(redButton);
        redButton.setText("Red");
        redButton.setFocusPainted(false);
        redButton.setFocusable(false);
        redButton.setOpaque(true);
        redButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redButtonActionPerformed(evt);
            }
        });

        yellowButton.setBackground(new java.awt.Color(255, 255, 0));
        buttonGroup1.add(yellowButton);
        yellowButton.setText("Yellow");
        yellowButton.setFocusable(false);
        yellowButton.setOpaque(true);
        yellowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellowButtonActionPerformed(evt);
            }
        });

        greenButton.setBackground(new java.awt.Color(0, 255, 0));
        buttonGroup1.add(greenButton);
        greenButton.setText("Green");
        greenButton.setFocusable(false);
        greenButton.setOpaque(true);
        greenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenButtonActionPerformed(evt);
            }
        });

        blueButton.setBackground(new java.awt.Color(0, 0, 255));
        buttonGroup1.add(blueButton);
        blueButton.setText("Blue");
        blueButton.setFocusable(false);
        blueButton.setOpaque(true);
        blueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueButtonActionPerformed(evt);
            }
        });

        pinkButton.setBackground(new java.awt.Color(255, 0, 255));
        buttonGroup1.add(pinkButton);
        pinkButton.setText("Pink");
        pinkButton.setFocusable(false);
        pinkButton.setOpaque(true);
        pinkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinkButtonActionPerformed(evt);
            }
        });

        cyanButton.setBackground(new java.awt.Color(0, 204, 255));
        buttonGroup1.add(cyanButton);
        cyanButton.setText("Cyan");
        cyanButton.setFocusable(false);
        cyanButton.setOpaque(true);
        cyanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cyanButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(whiteButton);
        whiteButton.setText("White");
        whiteButton.setFocusable(false);
        whiteButton.setOpaque(true);
        whiteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whiteButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(offButton);
        offButton.setText("Off");
        offButton.setFocusable(false);
        offButton.setOpaque(true);
        offButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offButtonActionPerformed(evt);
            }
        });

        pwm.setMajorTickSpacing(64);
        pwm.setMaximum(256);
        pwm.setPaintTicks(true);
        pwm.setValue(128);
        pwm.setFocusable(false);
        pwm.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                pwmStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(yellowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pinkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cyanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(redButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(greenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(blueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pwm, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(whiteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(offButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(redButton)
                    .addComponent(greenButton)
                    .addComponent(blueButton))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yellowButton)
                    .addComponent(pinkButton)
                    .addComponent(cyanButton))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(offButton)
                    .addComponent(whiteButton))
                .addGap(18, 18, 18)
                .addComponent(pwm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void redButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redButtonActionPerformed
    if (redButton.isSelected())
    {
        writeData("off");
        try {Thread.sleep(40);} catch(InterruptedException ex) {Thread.currentThread().interrupt();}
        writeData("redon");
    }
    }//GEN-LAST:event_redButtonActionPerformed

    private void yellowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellowButtonActionPerformed
    if (yellowButton.isSelected())
    {
        writeData("off");
        try {Thread.sleep(40);} catch(InterruptedException ex) {Thread.currentThread().interrupt();}
        writeData("redon");
        try {Thread.sleep(40);} catch(InterruptedException ex) {Thread.currentThread().interrupt();}
        writeData("greenon");
    }
    }//GEN-LAST:event_yellowButtonActionPerformed

    private void greenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenButtonActionPerformed
    if (greenButton.isSelected())
    {
        writeData("off");
        try {Thread.sleep(40);} catch(InterruptedException ex) {Thread.currentThread().interrupt();}
        writeData("greenon");
    }
    }//GEN-LAST:event_greenButtonActionPerformed

    private void blueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueButtonActionPerformed
    if (blueButton.isSelected())
    {
        writeData("off");
        try {Thread.sleep(40);} catch(InterruptedException ex) {Thread.currentThread().interrupt();}
        writeData("blueon");
    }
    }//GEN-LAST:event_blueButtonActionPerformed

    private void pinkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinkButtonActionPerformed
    if (pinkButton.isSelected())
    {
        writeData("off");
        try {Thread.sleep(40);} catch(InterruptedException ex) {Thread.currentThread().interrupt();}
        writeData("redon");
        try {Thread.sleep(40);} catch(InterruptedException ex) {Thread.currentThread().interrupt();}
        writeData("blueon");
    }
    }//GEN-LAST:event_pinkButtonActionPerformed

    private void cyanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cyanButtonActionPerformed
    if (cyanButton.isSelected())
    {
        writeData("off");
        try {Thread.sleep(40);} catch(InterruptedException ex) {Thread.currentThread().interrupt();}
        writeData("blueon");
        try {Thread.sleep(40);} catch(InterruptedException ex) {Thread.currentThread().interrupt();}
        writeData("greenon");
    }
    }//GEN-LAST:event_cyanButtonActionPerformed

    private void whiteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whiteButtonActionPerformed
    if (whiteButton.isSelected())
    {
        writeData("on");
    }
    }//GEN-LAST:event_whiteButtonActionPerformed

    private void offButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offButtonActionPerformed
    if (offButton.isSelected())
    {
        writeData("off");
        pwm.setValue(0);
    }
    }//GEN-LAST:event_offButtonActionPerformed

    private void pwmStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_pwmStateChanged
    try {Thread.sleep(40);} catch(InterruptedException ex) {Thread.currentThread().interrupt();}
    value = pwm.getValue();
    writeData("."+ value);
    }//GEN-LAST:event_pwmStateChanged

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton blueButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JToggleButton cyanButton;
    private javax.swing.JToggleButton greenButton;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JToggleButton offButton;
    private javax.swing.JToggleButton pinkButton;
    private javax.swing.JSlider pwm;
    private javax.swing.JToggleButton redButton;
    private javax.swing.JToggleButton whiteButton;
    private javax.swing.JToggleButton yellowButton;
    // End of variables declaration//GEN-END:variables
}
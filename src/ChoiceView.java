
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jessa
 */
public class ChoiceView extends javax.swing.JPanel {

    /**
     * Creates new form SelectionC
     */
    public ChoiceView() {
        initComponents();
        this.buttonGroup1.add(rbtnA);
        this.buttonGroup1.add(rbtnB);
        this.buttonGroup1.add(rbtnC);
        this.buttonGroup1.add(rbtnD);
    }
    public ChoiceView(String question, String a, String b, String c, String d, String answer){
        initComponents();
        rbtnA.setActionCommand("A");
        rbtnB.setActionCommand("B");
        rbtnC.setActionCommand("C");
        rbtnD.setActionCommand("D");
        this.buttonGroup1.add(rbtnA);
        this.buttonGroup1.add(rbtnB);
        this.buttonGroup1.add(rbtnC);
        this.buttonGroup1.add(rbtnD);
        this.lbQuestion.setText(question);
        this.lbA.setText(a);
        this.lbB.setText(b);
        this.lbC.setText(c);
        this.lbD.setText(d);
        this.rbtnA.setText(a);
        this.rbtnB.setText(b);
        this.rbtnC.setText(c);
        this.rbtnD.setText(d);
    }

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public JRadioButton getRbtnA() {
        return rbtnA;
    }

    public JRadioButton getRbtnB() {
        return rbtnB;
    }

    public JRadioButton getRbtnC() {
        return rbtnC;
    }

    public JRadioButton getRbtnD() {
        return rbtnD;
    }

    public JLabel getLbA() {
        return lbA;
    }

    public JLabel getLbB() {
        return lbB;
    }

    public JLabel getLbC() {
        return lbC;
    }

    public JLabel getLbD() {
        return lbD;
    }

    public JLabel getLbQuestion() {
        return lbQuestion;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel3 = new keeptoo.KGradientPanel();
        jPanel3 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        jPanel2 = new javax.swing.JPanel();
        rbtnA = new javax.swing.JRadioButton();
        lbA = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        rbtnB = new javax.swing.JRadioButton();
        lbB = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        rbtnC = new javax.swing.JRadioButton();
        lbC = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        rbtnD = new javax.swing.JRadioButton();
        lbD = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        jPanel7 = new javax.swing.JPanel();
        lbQuestion = new javax.swing.JLabel();

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel2.setkEndColor(new java.awt.Color(204, 204, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        kGradientPanel4.setkEndColor(new java.awt.Color(255, 204, 204));
        kGradientPanel4.setkStartColor(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rbtnA.setBackground(new java.awt.Color(255, 255, 255));
        rbtnA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(rbtnA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 43));

        lbA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbA.setText("jLabel2");
        lbA.setMaximumSize(new java.awt.Dimension(56, 20));
        lbA.setMinimumSize(new java.awt.Dimension(56, 20));
        lbA.setPreferredSize(new java.awt.Dimension(56, 20));
        jPanel2.add(lbA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 394, 43));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rbtnB.setBackground(new java.awt.Color(255, 255, 255));
        rbtnB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel4.add(rbtnB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 43));

        lbB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbB.setText("jLabel3");
        lbB.setMaximumSize(new java.awt.Dimension(56, 20));
        lbB.setMinimumSize(new java.awt.Dimension(56, 20));
        lbB.setPreferredSize(new java.awt.Dimension(56, 20));
        jPanel4.add(lbB, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 0, 395, 43));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rbtnC.setBackground(new java.awt.Color(255, 255, 255));
        rbtnC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCActionPerformed(evt);
            }
        });
        jPanel5.add(rbtnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 43));

        lbC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbC.setText("jLabel4");
        lbC.setMaximumSize(new java.awt.Dimension(56, 20));
        lbC.setMinimumSize(new java.awt.Dimension(56, 20));
        lbC.setPreferredSize(new java.awt.Dimension(56, 20));
        jPanel5.add(lbC, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 0, 395, 43));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rbtnD.setBackground(new java.awt.Color(255, 255, 255));
        rbtnD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel6.add(rbtnD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 43));

        lbD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbD.setText("jLabel5");
        lbD.setMaximumSize(new java.awt.Dimension(56, 20));
        lbD.setMinimumSize(new java.awt.Dimension(56, 20));
        lbD.setPreferredSize(new java.awt.Dimension(56, 20));
        jPanel6.add(lbD, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 0, 393, 43));

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/002-information-1.png"))); // NOI18N

        kGradientPanel5.setkEndColor(new java.awt.Color(255, 204, 204));
        kGradientPanel5.setkStartColor(new java.awt.Color(204, 204, 255));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        lbQuestion.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbQuestion.setText("jLabel2");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout kGradientPanel5Layout = new javax.swing.GroupLayout(kGradientPanel5);
        kGradientPanel5.setLayout(kGradientPanel5Layout);
        kGradientPanel5Layout.setHorizontalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        kGradientPanel5Layout.setVerticalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(kGradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(214, 214, 214))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(kGradientPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private keeptoo.KGradientPanel kGradientPanel5;
    private javax.swing.JLabel lbA;
    private javax.swing.JLabel lbB;
    private javax.swing.JLabel lbC;
    private javax.swing.JLabel lbD;
    private javax.swing.JLabel lbQuestion;
    private javax.swing.JRadioButton rbtnA;
    private javax.swing.JRadioButton rbtnB;
    private javax.swing.JRadioButton rbtnC;
    private javax.swing.JRadioButton rbtnD;
    // End of variables declaration//GEN-END:variables
}


import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jessa
 */
public class EditMultiChoiceView extends javax.swing.JPanel {

    /**
     * Creates new form CardQuizMultiAdmin
     */
    public EditMultiChoiceView() {
        initComponents();
    }
    public EditMultiChoiceView(String question, String a, String b, String c, String d, String answer){
        initComponents();
        this.tfQuestion.setText(question);
        this.tfCBA.setText(a);
        this.tfCBB.setText(b);
        this.tfCBC.setText(c);
        this.tfCBD.setText(d);   
    }

    public JButton getBtnDelQuiz() {
        return btnDelQuiz;
    }

    public JButton getBtnEditQuiz() {
        return btnEditQuiz;
    }

    public JCheckBox getCbA() {
        return cbA;
    }

    public JCheckBox getCbB() {
        return cbB;
    }

    public JCheckBox getCbC() {
        return cbC;
    }

    public JCheckBox getCbD() {
        return cbD;
    }

    public JTextField getTfCBA() {
        return tfCBA;
    }

    public JTextField getTfCBB() {
        return tfCBB;
    }

    public JTextField getTfCBC() {
        return tfCBC;
    }

    public JTextField getTfCBD() {
        return tfCBD;
    }

    public JTextField getTfQuestion() {
        return tfQuestion;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        jPanel3 = new javax.swing.JPanel();
        cbA1 = new javax.swing.JCheckBox();
        cbB1 = new javax.swing.JCheckBox();
        cbC1 = new javax.swing.JCheckBox();
        cbD1 = new javax.swing.JCheckBox();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        btnDelQuiz1 = new javax.swing.JButton();
        kGradientPanel6 = new keeptoo.KGradientPanel();
        btnEditQuiz1 = new javax.swing.JButton();
        tfQuestion1 = new javax.swing.JTextField();
        tfCBA1 = new javax.swing.JTextField();
        tfCBB1 = new javax.swing.JTextField();
        tfCBC1 = new javax.swing.JTextField();
        tfCBD1 = new javax.swing.JTextField();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfCBA = new javax.swing.JTextField();
        tfCBB = new javax.swing.JTextField();
        tfCBC = new javax.swing.JTextField();
        tfCBD = new javax.swing.JTextField();
        tfQuestion = new javax.swing.JTextField();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        btnDelQuiz = new javax.swing.JButton();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        btnEditQuiz = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        cbA = new javax.swing.JCheckBox();
        cbB = new javax.swing.JCheckBox();
        cbC = new javax.swing.JCheckBox();
        cbD = new javax.swing.JCheckBox();

        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setMinimumSize(new java.awt.Dimension(435, 212));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        kGradientPanel4.setkEndColor(new java.awt.Color(204, 204, 255));
        kGradientPanel4.setkStartColor(new java.awt.Color(255, 204, 204));
        kGradientPanel4.setLayout(new javax.swing.BoxLayout(kGradientPanel4, javax.swing.BoxLayout.LINE_AXIS));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        cbA1.setBackground(new java.awt.Color(204, 204, 255));
        cbA1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbA1ActionPerformed(evt);
            }
        });

        cbB1.setBackground(new java.awt.Color(204, 204, 255));
        cbB1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbB1ActionPerformed(evt);
            }
        });

        cbC1.setBackground(new java.awt.Color(204, 204, 255));
        cbC1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbC1ActionPerformed(evt);
            }
        });

        cbD1.setBackground(new java.awt.Color(204, 204, 255));
        cbD1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        kGradientPanel5.setkEndColor(new java.awt.Color(255, 204, 204));
        kGradientPanel5.setkGradientFocus(100);
        kGradientPanel5.setkStartColor(new java.awt.Color(204, 204, 255));

        btnDelQuiz1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelQuiz1.setForeground(new java.awt.Color(255, 255, 255));
        btnDelQuiz1.setText("DELETE");
        btnDelQuiz1.setBorder(null);
        btnDelQuiz1.setContentAreaFilled(false);
        btnDelQuiz1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout kGradientPanel5Layout = new javax.swing.GroupLayout(kGradientPanel5);
        kGradientPanel5.setLayout(kGradientPanel5Layout);
        kGradientPanel5Layout.setHorizontalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDelQuiz1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        kGradientPanel5Layout.setVerticalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDelQuiz1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        kGradientPanel6.setkEndColor(new java.awt.Color(204, 204, 255));
        kGradientPanel6.setkGradientFocus(100);
        kGradientPanel6.setkStartColor(new java.awt.Color(255, 204, 204));

        btnEditQuiz1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEditQuiz1.setForeground(new java.awt.Color(255, 255, 255));
        btnEditQuiz1.setText("EDIT");
        btnEditQuiz1.setBorder(null);
        btnEditQuiz1.setContentAreaFilled(false);

        javax.swing.GroupLayout kGradientPanel6Layout = new javax.swing.GroupLayout(kGradientPanel6);
        kGradientPanel6.setLayout(kGradientPanel6Layout);
        kGradientPanel6Layout.setHorizontalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEditQuiz1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        kGradientPanel6Layout.setVerticalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEditQuiz1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tfQuestion1.setBackground(new java.awt.Color(204, 204, 255));
        tfQuestion1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfQuestion1.setText("jTextField1");
        tfQuestion1.setBorder(null);

        tfCBA1.setBackground(new java.awt.Color(204, 204, 255));
        tfCBA1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfCBA1.setText("jTextField2");
        tfCBA1.setBorder(null);

        tfCBB1.setBackground(new java.awt.Color(204, 204, 255));
        tfCBB1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfCBB1.setText("jTextField3");
        tfCBB1.setBorder(null);
        tfCBB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCBB1ActionPerformed(evt);
            }
        });

        tfCBC1.setBackground(new java.awt.Color(204, 204, 255));
        tfCBC1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfCBC1.setText("jTextField4");
        tfCBC1.setBorder(null);

        tfCBD1.setBackground(new java.awt.Color(204, 204, 255));
        tfCBD1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfCBD1.setText("jTextField5");
        tfCBD1.setBorder(null);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbC1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbA1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfCBC1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(tfCBA1)))
                    .addComponent(kGradientPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cbD1)
                        .addGap(1, 1, 1)
                        .addComponent(tfCBD1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cbB1)
                        .addGap(1, 1, 1)
                        .addComponent(tfCBB1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kGradientPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tfQuestion1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(tfQuestion1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(cbB1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(tfCBA1)
                    .addComponent(tfCBB1))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cbD1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cbC1))
                    .addComponent(tfCBD1)
                    .addComponent(tfCBC1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kGradientPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kGradientPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        kGradientPanel4.add(jPanel3);

        jPanel1.add(kGradientPanel4, new java.awt.GridBagConstraints());

        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setMinimumSize(new java.awt.Dimension(435, 212));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 204, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 204, 204));
        kGradientPanel1.setLayout(new java.awt.CardLayout(12, 12));

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.black);
        jLabel2.setText("Question");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        jPanel2.add(jLabel2, gridBagConstraints);

        tfCBA.setBackground(new java.awt.Color(204, 204, 255));
        tfCBA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfCBA.setMaximumSize(new java.awt.Dimension(200, 20));
        tfCBA.setMinimumSize(new java.awt.Dimension(200, 20));
        tfCBA.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(tfCBA, gridBagConstraints);

        tfCBB.setBackground(new java.awt.Color(204, 204, 255));
        tfCBB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfCBB.setMaximumSize(new java.awt.Dimension(200, 20));
        tfCBB.setMinimumSize(new java.awt.Dimension(200, 20));
        tfCBB.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(tfCBB, gridBagConstraints);

        tfCBC.setBackground(new java.awt.Color(204, 204, 255));
        tfCBC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfCBC.setMaximumSize(new java.awt.Dimension(200, 20));
        tfCBC.setMinimumSize(new java.awt.Dimension(200, 20));
        tfCBC.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(tfCBC, gridBagConstraints);

        tfCBD.setBackground(new java.awt.Color(204, 204, 255));
        tfCBD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfCBD.setMaximumSize(new java.awt.Dimension(200, 20));
        tfCBD.setMinimumSize(new java.awt.Dimension(200, 20));
        tfCBD.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(tfCBD, gridBagConstraints);

        tfQuestion.setBackground(new java.awt.Color(204, 204, 255));
        tfQuestion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel2.add(tfQuestion, gridBagConstraints);

        kGradientPanel2.setkEndColor(new java.awt.Color(204, 204, 255));
        kGradientPanel2.setkGradientFocus(100);
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 204, 204));

        btnDelQuiz.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelQuiz.setForeground(new java.awt.Color(255, 255, 255));
        btnDelQuiz.setText("DELETE");
        btnDelQuiz.setBorder(null);
        btnDelQuiz.setContentAreaFilled(false);
        btnDelQuiz.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnDelQuiz.setMaximumSize(new java.awt.Dimension(100, 50));
        btnDelQuiz.setMinimumSize(new java.awt.Dimension(100, 50));
        btnDelQuiz.setPreferredSize(new java.awt.Dimension(100, 50));

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDelQuiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDelQuiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 9;
        jPanel2.add(kGradientPanel2, gridBagConstraints);

        kGradientPanel3.setkEndColor(new java.awt.Color(204, 204, 255));
        kGradientPanel3.setkGradientFocus(100);
        kGradientPanel3.setkStartColor(new java.awt.Color(255, 204, 204));

        btnEditQuiz.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEditQuiz.setForeground(new java.awt.Color(255, 255, 255));
        btnEditQuiz.setText("EDIT");
        btnEditQuiz.setBorder(null);
        btnEditQuiz.setContentAreaFilled(false);
        btnEditQuiz.setMaximumSize(new java.awt.Dimension(100, 50));
        btnEditQuiz.setMinimumSize(new java.awt.Dimension(100, 50));
        btnEditQuiz.setPreferredSize(new java.awt.Dimension(100, 50));

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEditQuiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEditQuiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 9;
        jPanel2.add(kGradientPanel3, gridBagConstraints);

        jPanel4.setMaximumSize(new java.awt.Dimension(0, 10));
        jPanel4.setMinimumSize(new java.awt.Dimension(0, 10));
        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(0, 10));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 20;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(jPanel4, gridBagConstraints);

        jPanel5.setMaximumSize(new java.awt.Dimension(0, 10));
        jPanel5.setMinimumSize(new java.awt.Dimension(0, 10));
        jPanel5.setOpaque(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(0, 10));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 20;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(jPanel5, gridBagConstraints);

        jPanel6.setMaximumSize(new java.awt.Dimension(0, 10));
        jPanel6.setMinimumSize(new java.awt.Dimension(0, 10));
        jPanel6.setOpaque(false);
        jPanel6.setPreferredSize(new java.awt.Dimension(0, 10));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 20;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(jPanel6, gridBagConstraints);

        jPanel7.setMaximumSize(new java.awt.Dimension(0, 10));
        jPanel7.setMinimumSize(new java.awt.Dimension(0, 10));
        jPanel7.setOpaque(false);
        jPanel7.setPreferredSize(new java.awt.Dimension(0, 10));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(jPanel7, gridBagConstraints);

        jPanel8.setMaximumSize(new java.awt.Dimension(0, 10));
        jPanel8.setMinimumSize(new java.awt.Dimension(0, 10));
        jPanel8.setOpaque(false);
        jPanel8.setPreferredSize(new java.awt.Dimension(0, 10));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 20;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(jPanel8, gridBagConstraints);

        jPanel9.setMaximumSize(new java.awt.Dimension(0, 10));
        jPanel9.setMinimumSize(new java.awt.Dimension(0, 10));
        jPanel9.setOpaque(false);
        jPanel9.setPreferredSize(new java.awt.Dimension(0, 10));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 20;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(jPanel9, gridBagConstraints);

        cbA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbA.setForeground(java.awt.Color.black);
        cbA.setText("(A)");
        cbA.setContentAreaFilled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        jPanel2.add(cbA, gridBagConstraints);

        cbB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbB.setForeground(java.awt.Color.black);
        cbB.setText("(B)");
        cbB.setContentAreaFilled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 3;
        jPanel2.add(cbB, gridBagConstraints);

        cbC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbC.setForeground(java.awt.Color.black);
        cbC.setText("(C)");
        cbC.setContentAreaFilled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        jPanel2.add(cbC, gridBagConstraints);

        cbD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbD.setForeground(java.awt.Color.black);
        cbD.setText("(D)");
        cbD.setContentAreaFilled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 4;
        jPanel2.add(cbD, gridBagConstraints);

        kGradientPanel1.add(jPanel2, "card2");

        add(kGradientPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void cbA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbA1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbA1ActionPerformed

    private void cbB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbB1ActionPerformed

    private void cbC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbC1ActionPerformed

    private void tfCBB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCBB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCBB1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelQuiz;
    private javax.swing.JButton btnDelQuiz1;
    private javax.swing.JButton btnEditQuiz;
    private javax.swing.JButton btnEditQuiz1;
    private javax.swing.JCheckBox cbA;
    private javax.swing.JCheckBox cbA1;
    private javax.swing.JCheckBox cbB;
    private javax.swing.JCheckBox cbB1;
    private javax.swing.JCheckBox cbC;
    private javax.swing.JCheckBox cbC1;
    private javax.swing.JCheckBox cbD;
    private javax.swing.JCheckBox cbD1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private keeptoo.KGradientPanel kGradientPanel5;
    private keeptoo.KGradientPanel kGradientPanel6;
    private javax.swing.JTextField tfCBA;
    private javax.swing.JTextField tfCBA1;
    private javax.swing.JTextField tfCBB;
    private javax.swing.JTextField tfCBB1;
    private javax.swing.JTextField tfCBC;
    private javax.swing.JTextField tfCBC1;
    private javax.swing.JTextField tfCBD;
    private javax.swing.JTextField tfCBD1;
    private javax.swing.JTextField tfQuestion;
    private javax.swing.JTextField tfQuestion1;
    // End of variables declaration//GEN-END:variables
}

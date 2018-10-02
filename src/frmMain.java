/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class frmMain extends javax.swing.JFrame {

    public frmMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHeader = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        lbPrompt = new javax.swing.JLabel();
        taNameField = new javax.swing.JTextField();
        pnlSideInfo = new javax.swing.JPanel();
        lblPromptGrade = new javax.swing.JLabel();
        lblIS110 = new javax.swing.JLabel();
        lblIS201 = new javax.swing.JLabel();
        lblIS303 = new javax.swing.JLabel();
        lblACC200 = new javax.swing.JLabel();
        lblFIN201 = new javax.swing.JLabel();
        lblBUSM241 = new javax.swing.JLabel();
        taBUSM241Credit = new javax.swing.JTextField();
        taIS110Credit = new javax.swing.JTextField();
        taIS201Credit = new javax.swing.JTextField();
        taIS303Credit = new javax.swing.JTextField();
        taACC200Credit = new javax.swing.JTextField();
        taFIN201Credit = new javax.swing.JTextField();
        cbIS201 = new javax.swing.JComboBox<>();
        cbIS110 = new javax.swing.JComboBox<>();
        cbACC200 = new javax.swing.JComboBox<>();
        cbIS303 = new javax.swing.JComboBox<>();
        cbBUSM241 = new javax.swing.JComboBox<>();
        cbFIN201 = new javax.swing.JComboBox<>();
        lblGrade = new javax.swing.JLabel();
        lblCourse = new javax.swing.JLabel();
        lblCredits = new javax.swing.JLabel();
        btnCalc = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        pnlOutput = new javax.swing.JPanel();
        lblGPA = new javax.swing.JLabel();
        lblDisplayGPA = new javax.swing.JLabel();
        pnlGoodGrade = new javax.swing.JPanel();
        pnlOkGrade = new javax.swing.JPanel();
        pnlBadGrade = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHeader.setBackground(new java.awt.Color(51, 102, 255));
        pnlHeader.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setText("IS Pre-Req GPA Calculator");
        pnlHeader.add(lbTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        lbPrompt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbPrompt.setForeground(new java.awt.Color(255, 255, 255));
        lbPrompt.setText("Enter Your name:");
        pnlHeader.add(lbPrompt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));
        pnlHeader.add(taNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 130, 30));

        getContentPane().add(pnlHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 140));

        pnlSideInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlSideInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPromptGrade.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblPromptGrade.setText("Enter Grades");
        pnlSideInfo.add(lblPromptGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lblIS110.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblIS110.setText("IS 110");
        pnlSideInfo.add(lblIS110, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        lblIS201.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblIS201.setText("IS 201");
        pnlSideInfo.add(lblIS201, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        lblIS303.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblIS303.setText("IS 303");
        pnlSideInfo.add(lblIS303, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        lblACC200.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblACC200.setText("ACC 200");
        pnlSideInfo.add(lblACC200, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        lblFIN201.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblFIN201.setText("FIN 201");
        lblFIN201.setToolTipText("");
        pnlSideInfo.add(lblFIN201, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        lblBUSM241.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblBUSM241.setText("BUSM 241");
        pnlSideInfo.add(lblBUSM241, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        taBUSM241Credit.setText("3");
        pnlSideInfo.add(taBUSM241Credit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 30, -1));

        taIS110Credit.setText("1");
        taIS110Credit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taIS110CreditActionPerformed(evt);
            }
        });
        pnlSideInfo.add(taIS110Credit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 30, -1));

        taIS201Credit.setText("3");
        taIS201Credit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taIS201CreditActionPerformed(evt);
            }
        });
        pnlSideInfo.add(taIS201Credit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 30, -1));

        taIS303Credit.setText("3");
        pnlSideInfo.add(taIS303Credit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 30, -1));

        taACC200Credit.setText("3");
        pnlSideInfo.add(taACC200Credit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 30, -1));

        taFIN201Credit.setText("3");
        pnlSideInfo.add(taFIN201Credit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 30, -1));

        cbIS201.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cbIS201.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "E" }));
        pnlSideInfo.add(cbIS201, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        cbIS110.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cbIS110.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "E" }));
        pnlSideInfo.add(cbIS110, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        cbACC200.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cbACC200.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "E" }));
        pnlSideInfo.add(cbACC200, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));

        cbIS303.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cbIS303.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "E" }));
        pnlSideInfo.add(cbIS303, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        cbBUSM241.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cbBUSM241.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "E" }));
        pnlSideInfo.add(cbBUSM241, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        cbFIN201.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cbFIN201.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "E" }));
        pnlSideInfo.add(cbFIN201, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        lblGrade.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblGrade.setText("Grade");
        pnlSideInfo.add(lblGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        lblCourse.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblCourse.setText("Course");
        pnlSideInfo.add(lblCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        lblCredits.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblCredits.setText("Credits");
        pnlSideInfo.add(lblCredits, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        btnCalc.setText("Calc GPA");
        btnCalc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalcMouseClicked(evt);
            }
        });
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });
        pnlSideInfo.add(btnCalc, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        btnReset.setText("Reset");
        pnlSideInfo.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, -1, -1));

        getContentPane().add(pnlSideInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 320, 570));

        pnlOutput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlOutput.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGPA.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblGPA.setText("GPA");
        pnlOutput.add(lblGPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        lblDisplayGPA.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDisplayGPA.setText("jLabel5");
        pnlOutput.add(lblDisplayGPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        pnlGoodGrade.setBackground(new java.awt.Color(0, 153, 51));
        pnlGoodGrade.setForeground(new java.awt.Color(51, 0, 204));

        javax.swing.GroupLayout pnlGoodGradeLayout = new javax.swing.GroupLayout(pnlGoodGrade);
        pnlGoodGrade.setLayout(pnlGoodGradeLayout);
        pnlGoodGradeLayout.setHorizontalGroup(
            pnlGoodGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pnlGoodGradeLayout.setVerticalGroup(
            pnlGoodGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        pnlOutput.add(pnlGoodGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 50, 50));

        pnlOkGrade.setBackground(new java.awt.Color(255, 204, 0));
        pnlOkGrade.setForeground(new java.awt.Color(51, 0, 204));

        javax.swing.GroupLayout pnlOkGradeLayout = new javax.swing.GroupLayout(pnlOkGrade);
        pnlOkGrade.setLayout(pnlOkGradeLayout);
        pnlOkGradeLayout.setHorizontalGroup(
            pnlOkGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pnlOkGradeLayout.setVerticalGroup(
            pnlOkGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        pnlOutput.add(pnlOkGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 50, 50));

        pnlBadGrade.setBackground(new java.awt.Color(204, 0, 0));
        pnlBadGrade.setForeground(new java.awt.Color(51, 0, 204));

        javax.swing.GroupLayout pnlBadGradeLayout = new javax.swing.GroupLayout(pnlBadGrade);
        pnlBadGrade.setLayout(pnlBadGradeLayout);
        pnlBadGradeLayout.setHorizontalGroup(
            pnlBadGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pnlBadGradeLayout.setVerticalGroup(
            pnlBadGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        pnlOutput.add(pnlBadGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 50, 50));

        getContentPane().add(pnlOutput, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 220, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void taIS110CreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taIS110CreditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taIS110CreditActionPerformed

    private void taIS201CreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taIS201CreditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taIS201CreditActionPerformed

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcActionPerformed

    private void btnCalcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcMouseClicked

        int numClasses = 6;
        double dtotalWeightedGPA = 0;
        double dFinalGPA;

        //for loop to get the sum
        //for (int iCount = 0; iCount < numClasses; iCount++ ){
        //Call the CalcGPA method
        System.out.println(taIS110Credit.getText());
        System.out.println(cbIS110.getSelectedItem().toString());
        dtotalWeightedGPA += CalcGPA(taIS110Credit.getText(), cbIS110.getSelectedItem().toString());
        dtotalWeightedGPA += CalcGPA(taIS201Credit.getText(), cbIS201.getSelectedItem().toString());
        dtotalWeightedGPA += CalcGPA(taIS303Credit.getText(), cbIS303.getSelectedItem().toString());
        dtotalWeightedGPA += CalcGPA(taACC200Credit.getText(), cbACC200.getSelectedItem().toString());
        dtotalWeightedGPA += CalcGPA(taFIN201Credit.getText(), cbFIN201.getSelectedItem().toString());
        dtotalWeightedGPA += CalcGPA(taBUSM241Credit.getText(), cbBUSM241.getSelectedItem().toString());
        System.out.println(dtotalWeightedGPA);

        // }
        //add them all together, then divide by numClasses
        dFinalGPA = dtotalWeightedGPA / numClasses;
        
        //Change output label for GPA
        lblDisplayGPA.setText(String.valueOf(dFinalGPA));
        //if/else stuff for green if gpa >= 3.7, yellow if gpa >=3.2, else, red
    }//GEN-LAST:event_btnCalcMouseClicked

    
    //Calculate the weighted GPA for one class based on numCredits and Lettergrade values
    public double CalcGPA(String numCredits, String letterGrade) {
        double weightedValue;
        double dLetterGradeValue;
        double dNumCredits = Double.parseDouble(numCredits);
 
        //Convert the text numCredits to doubles
        //Switch Statement for letterGrade
        switch (letterGrade) {
            case "A":
                dLetterGradeValue = 4.0;
                break;
            case "A-":
                dLetterGradeValue = 3.7;
                break;
            case "B+":
                dLetterGradeValue = 3.4;
                break;
            case "B":
                dLetterGradeValue = 3.0;
                break;
            case "B-":
                dLetterGradeValue = 2.7;
                break;
            case "C+":
                dLetterGradeValue = 2.4;
                break;
            case "C":
                dLetterGradeValue = 2;
                break;
            case "C-":
                dLetterGradeValue = 1.7;
                break;
            case "D+":
                dLetterGradeValue = 1.4;
                break;
            case "D":
                dLetterGradeValue = 1;
                break;
            case "D-":
                dLetterGradeValue = .7;
                break;
            case "E":
                dLetterGradeValue = 0;
                break;
            default:
                dLetterGradeValue = -1;
                break;
        }

        //Calculate the weightedValue
        weightedValue = dLetterGradeValue * dNumCredits;

        return weightedValue;
    }

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cbACC200;
    private javax.swing.JComboBox<String> cbBUSM241;
    private javax.swing.JComboBox<String> cbFIN201;
    private javax.swing.JComboBox<String> cbIS110;
    private javax.swing.JComboBox<String> cbIS201;
    private javax.swing.JComboBox<String> cbIS303;
    private javax.swing.JLabel lbPrompt;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lblACC200;
    private javax.swing.JLabel lblBUSM241;
    private javax.swing.JLabel lblCourse;
    private javax.swing.JLabel lblCredits;
    private javax.swing.JLabel lblDisplayGPA;
    private javax.swing.JLabel lblFIN201;
    private javax.swing.JLabel lblGPA;
    private javax.swing.JLabel lblGrade;
    private javax.swing.JLabel lblIS110;
    private javax.swing.JLabel lblIS201;
    private javax.swing.JLabel lblIS303;
    private javax.swing.JLabel lblPromptGrade;
    private javax.swing.JPanel pnlBadGrade;
    private javax.swing.JPanel pnlGoodGrade;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlOkGrade;
    private javax.swing.JPanel pnlOutput;
    private javax.swing.JPanel pnlSideInfo;
    private javax.swing.JTextField taACC200Credit;
    private javax.swing.JTextField taBUSM241Credit;
    private javax.swing.JTextField taFIN201Credit;
    private javax.swing.JTextField taIS110Credit;
    private javax.swing.JTextField taIS201Credit;
    private javax.swing.JTextField taIS303Credit;
    private javax.swing.JTextField taNameField;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.util.Calendar;
import javax.swing.JOptionPane;
/**
 *
 * @author bikash
 */
public class IssueBookForm extends javax.swing.JFrame {

    /**
     * Creates new form IssueBookForm
     */
    public IssueBookForm() {
        initComponents();
        int year;
        Calendar cal = Calendar.getInstance();
        year = cal.get(Calendar.YEAR);
        String TodayYear;
        TodayYear = String.valueOf(year);
        IYear.setText(TodayYear);
        String TodayMonth = String.valueOf(cal.get(Calendar.MONTH)+1);
        IMonth.setText(TodayMonth);
        String TodayDate = String.valueOf(cal.get(Calendar.DATE));
        IDate.setText(TodayDate);
        
        Calendar addcal = null;
        addcal = cal;
        addcal.add(Calendar.DAY_OF_YEAR,15);

        RDate.setText(String.valueOf(addcal.get(Calendar.DATE)));
        RMonth.setText(String.valueOf(addcal.get(Calendar.MONTH)+1));
        RYear.setText(String.valueOf(addcal.get(Calendar.YEAR)));
        
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
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        UserID = new javax.swing.JTextField();
        BookID = new javax.swing.JTextField();
        IMonth = new javax.swing.JTextField();
        RMonth = new javax.swing.JTextField();
        IYear = new javax.swing.JTextField();
        IDate = new javax.swing.JTextField();
        RYear = new javax.swing.JTextField();
        RDate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(121, 22, 127));
        setForeground(new java.awt.Color(30, 51, 252));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel1.setText("Book ID");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel2.setText("User ID");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel3.setText("Issue Date");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel4.setText("Return Date");

        jButton1.setBackground(new java.awt.Color(147, 176, 233));
        jButton1.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jButton1.setText("Issue");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(147, 176, 233));
        jButton2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        UserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserIDActionPerformed(evt);
            }
        });

        BookID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookIDActionPerformed(evt);
            }
        });

        IMonth.setEditable(false);
        IMonth.setBackground(new java.awt.Color(193, 193, 193));
        IMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMonthActionPerformed(evt);
            }
        });

        IYear.setEditable(false);
        IYear.setBackground(new java.awt.Color(193, 193, 193));

        IDate.setEditable(false);
        IDate.setBackground(new java.awt.Color(193, 193, 193));
        IDate.setToolTipText("");
        IDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDateActionPerformed(evt);
            }
        });

        RYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RYearActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        jLabel5.setText("-");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        jLabel6.setText("-");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        jLabel7.setText("-");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        jLabel8.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 133, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BookID, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(RDate, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(IDate, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(IMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RYear, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IYear, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(UserID, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(98, 98, 98))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(BookID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(UserID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(IMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IYear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RDate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(RYear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int BookIDV;
        BookIDV = Integer.parseInt(BookID.getText());
        int UserIDV;
        UserIDV = Integer.parseInt(UserID.getText());
        
        String IFDate = IYear.getText() + "-"+IMonth.getText()+"-"+IDate.getText();
        String RFDate = RYear.getText() + "-"+RMonth.getText()+"-"+RDate.getText();
        System.out.println(IFDate);
        
        //Date IFDDate = cal.getDate();
        
     
        
        if(TransBookDao.BookValidate(BookID.getText()) && TransBookDao.UserValidate(UserID.getText()))
        {
          
            if(TransBookDao.Check(UserIDV)==0)
               JOptionPane.showMessageDialog(IssueBookForm.this, "User has already Issued Maximum No of Books","Issue Error!", JOptionPane.ERROR_MESSAGE); 
           else
            {
            if(TransBookDao.IssueBook(BookIDV, UserIDV, IFDate, RFDate)!=0)
            {
              
                JOptionPane.showMessageDialog(IssueBookForm.this, "The Book  is Issued!","Book Issued!", JOptionPane.ERROR_MESSAGE);
                BookID.setText("");
                UserID.setText("");
            }
            else
              JOptionPane.showMessageDialog(IssueBookForm.this, "Unable to Issue Book!","Issuing Book Error!", JOptionPane.ERROR_MESSAGE);
            }
            
            
        }
        else
        {    if(TransBookDao.UserValidate(UserID.getText()))
                    JOptionPane.showMessageDialog(IssueBookForm.this, "The Book  is NOT available in Library Database!","Issuing Book Error!", JOptionPane.ERROR_MESSAGE);
             else
                if(TransBookDao.BookValidate(BookID.getText()))
                    JOptionPane.showMessageDialog(IssueBookForm.this, "The User is NOT available in Library Database!","Issuing Book Error!", JOptionPane.ERROR_MESSAGE);
                 else
            JOptionPane.showMessageDialog(IssueBookForm.this, "The Book  and User are NOT available in Library Database!","Issuing Book Error!", JOptionPane.ERROR_MESSAGE);
       
        }
      //  if(IssueBookDao.)
   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        LibrarianSuccess.main(new String[]{});
    }//GEN-LAST:event_jButton2ActionPerformed

    private void UserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserIDActionPerformed

    private void IDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDateActionPerformed

    private void IMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IMonthActionPerformed

    private void RYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RYearActionPerformed

    private void BookIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookIDActionPerformed

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
            java.util.logging.Logger.getLogger(IssueBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBookForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BookID;
    private javax.swing.JTextField IDate;
    private javax.swing.JTextField IMonth;
    private javax.swing.JTextField IYear;
    private javax.swing.JTextField RDate;
    private javax.swing.JTextField RMonth;
    private javax.swing.JTextField RYear;
    private javax.swing.JTextField UserID;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
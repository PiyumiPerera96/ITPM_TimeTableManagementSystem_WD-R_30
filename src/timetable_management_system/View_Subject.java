
package timetable_management_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class View_Subject extends javax.swing.JFrame {
    
    Connection conn = null;
    PreparedStatement pst = null;
    
    //table
    ResultSet rs = null;


    
    public View_Subject() {
        initComponents();
        
        //center form
        this.setLocationRelativeTo(null);
        
        //DB connect
        conn = MyConnection.getConnection();
        
        //load table
        TableLoad();
    }
    
    public void TableLoad()
    {
       
       try {     
           String sql = "SELECT subject_code, subject_name, offered_year, offered_semester, no_of_lec_hours, no_of_tute_hours, no_of_lab_hours, no_of_evalu_hours FROM subject";
           pst = conn.prepareStatement(sql);
           rs = pst.executeQuery();
           
           jTable1.setModel(DbUtils.resultSetToTableModel(rs));
           
           } catch (Exception ex) {
           Logger.getLogger(Add_Subject.class.getName()).log(Level.SEVERE, null, ex);
           }
    }
    
    
   //set fields clear
    private void clearFields() {
        
        jTextField_subcode.setText(null);
        jTextField_subName.setText(null);
        jComboBox_offYear.setSelectedItem(null);
        jComboBox_offSem.setSelectedItem(null);
        jTextField_lecHours.setText(null);
        jTextField_tuteHours.setText(null);
        jTextField_labHours.setText(null);
        jTextField_evaluHours.setText(null);
       
    }
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel_logout = new javax.swing.JLabel();
        jLabel1_home = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2Minimize = new javax.swing.JLabel();
        jLabel1close = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_add = new javax.swing.JButton();
        jButton_update = new javax.swing.JButton();
        jButton_delete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox_offYear = new javax.swing.JComboBox<>();
        jTextField_subName = new javax.swing.JTextField();
        jTextField_subcode = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_lecHours = new javax.swing.JTextField();
        jTextField_tuteHours = new javax.swing.JTextField();
        jTextField_labHours = new javax.swing.JTextField();
        jTextField_evaluHours = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jComboBox_offSem = new javax.swing.JComboBox<>();
        jTextField_search = new javax.swing.JTextField();
        jButton_search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1150, 986));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(236, 236, 236));
        jPanel1.setMinimumSize(new java.awt.Dimension(1150, 50));
        jPanel1.setPreferredSize(new java.awt.Dimension(1150, 50));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel10.setText("Time Table Management System");

        jLabel_logout.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_logout.setText("Logout");
        jLabel_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_logoutMouseClicked(evt);
            }
        });

        jLabel1_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home2.jpg"))); // NOI18N
        jLabel1_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1_homeMouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.jpg"))); // NOI18N

        jLabel2Minimize.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2Minimize.setText("-");
        jLabel2Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MinimizeMouseClicked(evt);
            }
        });

        jLabel1close.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1close.setText("X");
        jLabel1close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1_home)
                .addGap(365, 365, 365)
                .addComponent(jLabel10)
                .addGap(177, 177, 177)
                .addComponent(jLabel_logout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2Minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel1close, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1_home)
            .addComponent(jLabel11)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel_logout))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1close)
                        .addComponent(jLabel2Minimize))))
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        jPanel2.setMinimumSize(new java.awt.Dimension(1150, 936));
        jPanel2.setPreferredSize(new java.awt.Dimension(1150, 936));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("View Subject Details");

        jTable1.setBackground(new java.awt.Color(218, 223, 225));
        jTable1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setFocusable(false);
        jTable1.setRowHeight(25);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton_add.setBackground(new java.awt.Color(1, 152, 117));
        jButton_add.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_add.setForeground(new java.awt.Color(255, 255, 255));
        jButton_add.setText("Add");
        jButton_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_addMouseClicked(evt);
            }
        });
        jButton_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addActionPerformed(evt);
            }
        });

        jButton_update.setBackground(new java.awt.Color(103, 128, 159));
        jButton_update.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_update.setForeground(new java.awt.Color(255, 255, 255));
        jButton_update.setText("Update");
        jButton_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_updateActionPerformed(evt);
            }
        });

        jButton_delete.setBackground(new java.awt.Color(207, 0, 15));
        jButton_delete.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_delete.setForeground(new java.awt.Color(255, 255, 255));
        jButton_delete.setText("Delete");
        jButton_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deleteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Subject Code :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Subject Name :");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Offered Year :");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Offered Semester :");

        jComboBox_offYear.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBox_offYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select year", "Year 1", "Year 2", "Year 3", "Year 4" }));

        jTextField_subName.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTextField_subcode.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Lecture Hours :");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tute Hours :");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Lab Hours :");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Evaluation Hours :");

        jTextField_lecHours.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTextField_tuteHours.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTextField_labHours.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTextField_evaluHours.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jComboBox_offSem.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBox_offSem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select semester", "1st", "2nd" }));

        jTextField_search.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jButton_search.setBackground(new java.awt.Color(232, 236, 241));
        jButton_search.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton_search.setText("search by Year");
        jButton_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jButton_add, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(jButton_update, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(jButton_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_subName)
                                    .addComponent(jComboBox_offYear, 0, 230, Short.MAX_VALUE)
                                    .addComponent(jTextField_subcode)
                                    .addComponent(jComboBox_offSem, javax.swing.GroupLayout.Alignment.TRAILING, 0, 230, Short.MAX_VALUE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(155, 155, 155)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(62, 62, 62)
                                                .addComponent(jTextField_lecHours))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(90, 90, 90)
                                                .addComponent(jTextField_tuteHours))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(37, 37, 37)
                                                .addComponent(jTextField_evaluHours))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(268, 268, 268)
                                        .addComponent(jTextField_labHours))))
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(441, 441, 441)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField_search, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)))
                        .addComponent(jButton_search, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addComponent(jTextField_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_search, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_subcode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_subName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox_offYear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox_offSem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jTextField_lecHours, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(34, 34, 34)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jTextField_tuteHours, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(40, 40, 40)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField_labHours, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(jTextField_evaluHours, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_add, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_update, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_logoutMouseClicked
        Admin_Login adlogin = new Admin_Login();
        adlogin.setVisible(true);
        adlogin.pack();
        adlogin.setLocationRelativeTo(null);
        adlogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel_logoutMouseClicked

    private void jButton_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_addMouseClicked
        Add_Subject adSub = new Add_Subject();
        adSub.setVisible(true);
        adSub.pack();
        adSub.setLocationRelativeTo(null);
        adSub.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton_addMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        //identify the selected row
        int row = jTable1.getSelectedRow();
        
        //get values from the row
        String code = jTable1.getValueAt(row, 0).toString();
        String name = jTable1.getValueAt(row, 1).toString();
        String year = jTable1.getValueAt(row, 2).toString();
        String sem = jTable1.getValueAt(row, 3).toString();
        String lecH = jTable1.getValueAt(row, 4).toString();
        String tuteH = jTable1.getValueAt(row, 5).toString();
        String labH = jTable1.getValueAt(row, 6).toString();
        String evH = jTable1.getValueAt(row, 7).toString();
        
        //assign values to fields
        jTextField_subcode.setText(code);
        jTextField_subName.setText(name);
        jComboBox_offYear.setSelectedItem(year);
        jComboBox_offSem.setSelectedItem(sem);
        jTextField_lecHours.setText(lecH);
        jTextField_tuteHours.setText(tuteH);
        jTextField_labHours.setText(labH);
        jTextField_evaluHours.setText(evH);
        
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_updateActionPerformed
       
        //show confirmation message
        int usm = JOptionPane.showConfirmDialog(null, "Do You Really want to Update?");
        
        //for yes button
        if (usm == 0) {
            
            String code = jTextField_subcode.getText();
            String name = jTextField_subName.getText();
            String year = jComboBox_offYear.getSelectedItem().toString();
            String sem = jComboBox_offSem.getSelectedItem().toString();
            String lecH = jTextField_lecHours.getText();
            String tuteH = jTextField_tuteHours.getText();
            String labH = jTextField_labHours.getText();
            String evH = jTextField_evaluHours.getText();
            
            //update query
            String upsql = "UPDATE subject SET subject_code = '"+ code +"', subject_name = '"+ name +"', offered_year = '"+ year +"', offered_semester = '"+ sem +"', no_of_lec_hours = '"+ lecH +"', no_of_tute_hours = '"+ tuteH +"' , no_of_lab_hours = '"+ labH +"', no_of_evalu_hours = '"+ evH +"' WHERE subject_code = '"+ code +"'";
            
            try {
            pst = conn.prepareStatement(upsql);
            pst.execute();
            
            //successfull message
           JOptionPane.showMessageDialog(null, "Updated Successfully");
           
           //clear fields method called
           clearFields();
            
            
             //load table
             TableLoad();
            }
            catch (SQLException e){
                
            }
            
            
        }
    }//GEN-LAST:event_jButton_updateActionPerformed

    private void jButton_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_addActionPerformed

    private void jButton_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deleteActionPerformed
        
        //show confirmation message
        int dsm = JOptionPane.showConfirmDialog(null, "Do You Really want to Delete?");
        
        //for yes button
        if (dsm == 0) {
            String code =jTextField_subcode.getText();
            
            //delete query
            String desql = "DELETE from subject WHERE subject_code = '"+ code +"' ";
            
             try {
            pst = conn.prepareStatement(desql);
            pst.execute();
            
            //successfull message
           JOptionPane.showMessageDialog(null, "Deleted Successfully");
           
           //clear fields method called
           clearFields();
            
             //load table
             TableLoad();
            }
            catch (SQLException e){
                
            }
        }
    }//GEN-LAST:event_jButton_deleteActionPerformed

    private void jButton_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_searchActionPerformed
        
         //get the value from textfield
        String year = jTextField_search.getText();
        
        //query
        String sql = "SELECT  offered_year, subject_name, subject_code, offered_semester, no_of_lec_hours, no_of_tute_hours, no_of_lab_hours, no_of_evalu_hours FROM subject "
                + "WHERE offered_year LIKE '%"+ year +"%' ";
                
        
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
           
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } 
        catch (Exception e) {
            Logger.getLogger(View_Lecturer.class.getName()).log(Level.SEVERE, null, e);
        }
        
        
    }//GEN-LAST:event_jButton_searchActionPerformed

    private void jLabel1_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1_homeMouseClicked
        //redirect to the home page
            Admin_Home adHome = new Admin_Home();
            adHome.setVisible(true);
            adHome.pack();
            adHome.setLocationRelativeTo(null);
            adHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
    }//GEN-LAST:event_jLabel1_homeMouseClicked

    private void jLabel2MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel2MinimizeMouseClicked

    private void jLabel1closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1closeMouseClicked

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Subject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_add;
    private javax.swing.JButton jButton_delete;
    private javax.swing.JButton jButton_search;
    private javax.swing.JButton jButton_update;
    private javax.swing.JComboBox<String> jComboBox_offSem;
    private javax.swing.JComboBox<String> jComboBox_offYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel1_home;
    private javax.swing.JLabel jLabel1close;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2Minimize;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_logout;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_evaluHours;
    private javax.swing.JTextField jTextField_labHours;
    private javax.swing.JTextField jTextField_lecHours;
    private javax.swing.JTextField jTextField_search;
    private javax.swing.JTextField jTextField_subName;
    private javax.swing.JTextField jTextField_subcode;
    private javax.swing.JTextField jTextField_tuteHours;
    // End of variables declaration//GEN-END:variables
}

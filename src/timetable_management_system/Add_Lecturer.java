package timetable_management_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Add_Lecturer extends javax.swing.JFrame {

   Connection conn = null;
   PreparedStatement pst = null;
    
    //constructor
    public Add_Lecturer() {
        initComponents();
        
    //center form
    this.setLocationRelativeTo(null);
        
    //DB connect
    conn = MyConnection.getConnection();
   
    }
    
    
    public boolean verifyData() {
        //if fields id,name and the rank are empty
        if(jTextField_lecID.getText().equals("") || jTextField_LecName.getText().equals("") || jTextField_rank.getText().equals("") ) {
            
             JOptionPane.showMessageDialog(null, "One or more fields are empty!!!");
             return false;
        }
        else {
            return true;
        }
    }

    
    //set fields clear
    private void clearFields() {
        
        jTextField_lecID.setText(null);
        jTextField_LecName.setText(null);
        jComboBox_faculty.setSelectedItem(null);
        jComboBox_department.setSelectedItem(null);
        jComboBox_center.setSelectedItem(null);
        jComboBox_building.setSelectedItem(null);
        jComboBox_level.setSelectedItem(null);
        jTextField_rank.setText(null);
       
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_lecID = new javax.swing.JTextField();
        jTextField_LecName = new javax.swing.JTextField();
        jComboBox_faculty = new javax.swing.JComboBox<>();
        jComboBox_department = new javax.swing.JComboBox<>();
        jComboBox_center = new javax.swing.JComboBox<>();
        jComboBox_building = new javax.swing.JComboBox<>();
        jComboBox_level = new javax.swing.JComboBox<>();
        jTextField_rank = new javax.swing.JTextField();
        jButton_save = new javax.swing.JButton();
        jButton_generate = new javax.swing.JButton();
        jButton_view = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(620, 950));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(236, 236, 236));
        jPanel1.setMinimumSize(new java.awt.Dimension(620, 50));
        jPanel1.setPreferredSize(new java.awt.Dimension(620, 50));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(84, 84, 84)
                .addComponent(jLabel_logout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(29, 29, 29)
                .addComponent(jLabel2Minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1close, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_logout)
                            .addComponent(jLabel10)))
                    .addComponent(jLabel1_home)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2Minimize)
                            .addComponent(jLabel1close))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        jPanel2.setMinimumSize(new java.awt.Dimension(620, 900));
        jPanel2.setPreferredSize(new java.awt.Dimension(620, 900));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Lecturer");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lecturer ID :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Lecturer Name :");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Faculty :");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Department :");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Center :");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Building :");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Level :");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Rank :");

        jTextField_lecID.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTextField_LecName.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jComboBox_faculty.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBox_faculty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select faculty", "Computing", "Engineering", "Business", "Humanities & Sciences", "Architecture" }));
        jComboBox_faculty.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_facultyItemStateChanged(evt);
            }
        });

        jComboBox_department.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBox_department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select department", "IT", "SE", "DS", "CSNE", "CS" }));

        jComboBox_center.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBox_center.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select center", "Malabe", "Metro", "Kandy", "Matara", "Kurunegala", "Jaffna" }));

        jComboBox_building.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBox_building.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select building", "Main", "New Building", "D-block", "Auditorium", "Mini-Auditorium" }));

        jComboBox_level.setEditable(true);
        jComboBox_level.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBox_level.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        jComboBox_level.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_levelActionPerformed(evt);
            }
        });

        jTextField_rank.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jButton_save.setBackground(new java.awt.Color(1, 152, 117));
        jButton_save.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_save.setForeground(new java.awt.Color(255, 255, 255));
        jButton_save.setText("SAVE");
        jButton_save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_saveActionPerformed(evt);
            }
        });

        jButton_generate.setBackground(new java.awt.Color(236, 236, 236));
        jButton_generate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_generate.setText("GENERATE RANK");
        jButton_generate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_generateActionPerformed(evt);
            }
        });

        jButton_view.setBackground(new java.awt.Color(207, 0, 15));
        jButton_view.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_view.setForeground(new java.awt.Color(255, 255, 255));
        jButton_view.setText("VIEW");
        jButton_view.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_viewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jButton_save, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jButton_view, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jButton_generate, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_rank, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox_level, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox_building, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox_center, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox_department, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox_faculty, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(62, 62, 62)
                        .addComponent(jTextField_LecName, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTextField_lecID, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(196, 196, 196))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_lecID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_LecName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_faculty, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_department, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_center, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_building, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_level, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_rank, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_save, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_generate, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_view, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
        this.dispose();//when the admin page is loading, add lecturer page is removed
    }//GEN-LAST:event_jLabel_logoutMouseClicked

    
    private void jComboBox_levelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_levelActionPerformed
       
    }//GEN-LAST:event_jComboBox_levelActionPerformed

    private void jButton_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_saveActionPerformed
        
        if(verifyData())
        {
            
        //set variables
        String id = jTextField_lecID.getText();
        String name = jTextField_LecName.getText();
        String fac = jComboBox_faculty.getSelectedItem().toString();
        String dep = jComboBox_department.getSelectedItem().toString();
        String cent = jComboBox_center.getSelectedItem().toString();
        String buildi = jComboBox_building.getSelectedItem().toString();
        String lev = jComboBox_level.getSelectedItem().toString();
        String rank = jTextField_rank.getText();
        
  
       try {
           //query
           String sq = "INSERT INTO lecturer (lec_id, lec_name, faculty, department, center, building, level, rank) VALUES ('"+ id +"', '"+ name +"', '"+ fac +"', '"+ dep +"', '"+ cent +"', '"+ buildi +"', '"+ lev +"', '"+ rank +"')";
           pst = conn.prepareStatement(sq);
           pst.execute();
           
           JOptionPane.showMessageDialog(null, "Inserted Successfully");
                
           //clear fields method called
           clearFields();
               
           
           } 
      catch (SQLException ex) {
           Logger.getLogger(Add_Lecturer.class.getName()).log(Level.SEVERE, null, ex);
           }
            
            
        }
        
     
    }//GEN-LAST:event_jButton_saveActionPerformed

    private void jComboBox_facultyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_facultyItemStateChanged
       
    }//GEN-LAST:event_jComboBox_facultyItemStateChanged

    private void jButton_generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_generateActionPerformed
        
        //generate rank
        String level = (String)jComboBox_level.getSelectedItem();
        char rank = level.charAt(0);
        jTextField_rank.setText(rank+"."+jTextField_lecID.getText());
        
        
    }//GEN-LAST:event_jButton_generateActionPerformed

    private void jButton_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_viewActionPerformed
       
       
            View_Lecturer vlec = new View_Lecturer();
            vlec.setVisible(true);
            vlec.pack();
            vlec.setLocationRelativeTo(null);
            vlec.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
            
    }//GEN-LAST:event_jButton_viewActionPerformed

    private void jLabel1_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1_homeMouseClicked
       
            Admin_Home aho = new Admin_Home();
            aho.setVisible(true);
            aho.pack();
            aho.setLocationRelativeTo(null);
            aho.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
                new Add_Lecturer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_generate;
    private javax.swing.JButton jButton_save;
    private javax.swing.JButton jButton_view;
    private javax.swing.JComboBox<String> jComboBox_building;
    private javax.swing.JComboBox<String> jComboBox_center;
    private javax.swing.JComboBox<String> jComboBox_department;
    private javax.swing.JComboBox<String> jComboBox_faculty;
    private javax.swing.JComboBox<String> jComboBox_level;
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
    private javax.swing.JTextField jTextField_LecName;
    private javax.swing.JTextField jTextField_lecID;
    private javax.swing.JTextField jTextField_rank;
    // End of variables declaration//GEN-END:variables
}

package timetable_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Add_Session extends javax.swing.JFrame {
    
   Connection conn = null;
   PreparedStatement pst = null;

    //constructor
    public Add_Session() {
     initComponents();
     getSubjectCombo();
     getLectureList();
     getGroupIDs();
     getTagsList();
   
    //center form
    this.setLocationRelativeTo(null);
        
    //DB connect
    conn = MyConnection.getConnection();
    }
    
    
    
    
    //get lecturer details
    private void getLectureList(){
        try { 
             Class.forName("com.mysql.jdbc.Driver");

             Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/itpmnew","root","");

             Statement statement = connection.createStatement();
             String query = "SELECT lec_name FROM lecturer";
             ResultSet rs = statement.executeQuery(query);

             while (rs.next())
             {                             
                jComboBox_lec1.addItem(rs.getString("lec_name"));
             }//end while
             connection.close();
             } catch (Exception e) {
                  e.printStackTrace();
             }
    }
    
    
    
    
    String subjectCode;
    //get Subject
    private void getSubjectCombo(){
        try { 
             Class.forName("com.mysql.jdbc.Driver");

             Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/itpmnew","root","");

             Statement statement = connection.createStatement();
             String query = "SELECT subject_code FROM subject";
             ResultSet rs = statement.executeQuery(query);

             while (rs.next())
             {                             
                jComboBox4_subCode.addItem(rs.getString("subject_code"));
             }//end while
             connection.close();
             } catch (Exception e) {
                  e.printStackTrace();
             }
    }
    
    
    
    String tag;
    //get Tags List
    private void getTagsList(){
        try { 
             Class.forName("com.mysql.jdbc.Driver");

             Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/itpmnew","root","");

             Statement statement = connection.createStatement();
             String query = "SELECT moType FROM tags";
             ResultSet rs = statement.executeQuery(query);

             while (rs.next())
             {                             
                jComboBox3_tag.addItem(rs.getString("moType"));
             }//end while
             connection.close();
             } catch (Exception e) {
                  e.printStackTrace();
             }
    }
    
    
    
    //get Group IDs
    private void getGroupIDs(){
        try { 
             Class.forName("com.mysql.jdbc.Driver");

             Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/itpmnew","root","");

             Statement statement = connection.createStatement();
             String query = "SELECT sMainGroupId FROM student";
             ResultSet rs = statement.executeQuery(query);

             while (rs.next())
             {                             
                jComboBox2_mainGroup.addItem(rs.getString("sMainGroupId"));
             }//end while
             connection.close();
             } catch (Exception e) {
                  e.printStackTrace();
             }
    }
    
  
    //validations
     public boolean verifyData() {
        //if fields lec1,subcode,subname,tag,grpID,stucount,duration are empty
        if(jComboBox_lec1.getSelectedItem().equals("") || jComboBox3_tag.getSelectedItem().equals("") || jComboBox4_subCode.getSelectedItem().equals("") || jTextField1_subName.getText().equals("") || jTextField1_stuCount.getText().equals("") || jTextField1_duration.getText().equals("") || jComboBox2_mainGroup.getSelectedItem().equals("") ) {
            
             JOptionPane.showMessageDialog(null, "One or more fields are empty!!!");
             return false;
        }
        else {
            return true;
        }
    }

    
    //set fields clear
    private void clearFields() {
        
        jComboBox_lec1.setSelectedItem(null);
        jComboBox2_lec2.setSelectedItem(null);
        
        jComboBox4_subCode.setSelectedItem(null);
        jTextField1_subName.setText(null);
        
        jTextField1_stuCount.setText(null);
        
        jComboBox3_tag.setSelectedItem(null);
        jTextField1_duration.setText(null);
        
        
        jComboBox2_mainGroup.setSelectedItem(null);
        jComboBox2_subGroup.setSelectedItem(null);
        jTextField1_fullGroupID.setText(null);
       
    }

    
   
    @SuppressWarnings("unchecked")   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_logout = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2Minimize = new javax.swing.JLabel();
        jLabel1close = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox_lec1 = new javax.swing.JComboBox<>();
        jComboBox2_lec2 = new javax.swing.JComboBox<>();
        jComboBox3_tag = new javax.swing.JComboBox<>();
        jComboBox4_subCode = new javax.swing.JComboBox<>();
        jTextField1_subName = new javax.swing.JTextField();
        jTextField1_stuCount = new javax.swing.JTextField();
        jTextField1_duration = new javax.swing.JTextField();
        jButton1_save = new javax.swing.JButton();
        jButton3_view = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton1_setSubNmae = new javax.swing.JButton();
        jComboBox2_mainGroup = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jComboBox2_subGroup = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jTextField1_fullGroupID = new javax.swing.JTextField();
        jButton1_setGroupID = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1215, 844));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1215, 844));

        jPanel1.setBackground(new java.awt.Color(236, 236, 236));
        jPanel1.setMinimumSize(new java.awt.Dimension(1215, 60));
        jPanel1.setPreferredSize(new java.awt.Dimension(1215, 60));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setText("Time Table Management System");

        jLabel_logout.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_logout.setText("Logout");
        jLabel_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_logoutMouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home2.jpg"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.jpg"))); // NOI18N

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
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(249, 249, 249)
                .addComponent(jLabel_logout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(28, 28, 28)
                .addComponent(jLabel2Minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1close, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel_logout)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2Minimize)
                            .addComponent(jLabel1close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Session");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select Lecturer 1 :");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Select Lecturer 2 :");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Select Tag :");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Subject Name :");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Select Subject Code :");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Student Count :");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Duration :");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Main Group:");

        jComboBox_lec1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBox_lec1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Lecturer" }));
        jComboBox_lec1.setPreferredSize(new java.awt.Dimension(64, 25));

        jComboBox2_lec2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBox2_lec2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Lecture for as assistant", "-", "Mr.Anuruddha", "Mr.Tharanga", "Miss.Devindi", "Miss.Anuththara" }));
        jComboBox2_lec2.setPreferredSize(new java.awt.Dimension(64, 25));

        jComboBox3_tag.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBox3_tag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Tag" }));
        jComboBox3_tag.setPreferredSize(new java.awt.Dimension(64, 25));

        jComboBox4_subCode.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBox4_subCode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Subject Code" }));
        jComboBox4_subCode.setPreferredSize(new java.awt.Dimension(64, 25));

        jTextField1_subName.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTextField1_stuCount.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTextField1_duration.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextField1_duration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_durationActionPerformed(evt);
            }
        });

        jButton1_save.setBackground(new java.awt.Color(1, 152, 117));
        jButton1_save.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1_save.setForeground(new java.awt.Color(255, 255, 255));
        jButton1_save.setText("SAVE");
        jButton1_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_saveActionPerformed(evt);
            }
        });

        jButton3_view.setBackground(new java.awt.Color(207, 0, 15));
        jButton3_view.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton3_view.setForeground(new java.awt.Color(255, 255, 255));
        jButton3_view.setText("VIEW");
        jButton3_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_viewActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Hrs");

        jButton1_setSubNmae.setBackground(new java.awt.Color(236, 236, 236));
        jButton1_setSubNmae.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1_setSubNmae.setText("click");
        jButton1_setSubNmae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_setSubNmaeActionPerformed(evt);
            }
        });

        jComboBox2_mainGroup.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBox2_mainGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Main Group" }));
        jComboBox2_mainGroup.setPreferredSize(new java.awt.Dimension(64, 25));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Sub Group:");

        jComboBox2_subGroup.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBox2_subGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Sub Group", "-", "1", "2" }));
        jComboBox2_subGroup.setPreferredSize(new java.awt.Dimension(64, 25));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Group ID :");

        jTextField1_fullGroupID.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jButton1_setGroupID.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1_setGroupID.setText("Click");
        jButton1_setGroupID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_setGroupIDActionPerformed(evt);
            }
        });

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(525, 525, 525))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jComboBox2_lec2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(70, 70, 70))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox_lec1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextField1_stuCount, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jComboBox4_subCode, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton1_setSubNmae))
                                            .addComponent(jTextField1_subName, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jTextField1_duration, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel13))
                                .addComponent(jTextField1_fullGroupID, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jComboBox2_subGroup, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1_setGroupID))
                                    .addComponent(jComboBox2_mainGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jComboBox3_tag, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(375, 375, 375)
                .addComponent(jButton1_save, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(227, 227, 227)
                .addComponent(jButton3_view, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBox_lec1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBox3_tag, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2_lec2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField1_duration, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel9))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jComboBox4_subCode, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1_setSubNmae, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jComboBox2_mainGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField1_subName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jComboBox2_subGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1_setGroupID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1_stuCount, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel16)
                            .addComponent(jTextField1_fullGroupID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3_view, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1_save, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1224, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jButton3_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_viewActionPerformed
       
            View_Session vsess = new View_Session();
            vsess.setVisible(true);
            vsess.pack();
            vsess.setLocationRelativeTo(null);
            vsess.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
    }//GEN-LAST:event_jButton3_viewActionPerformed

    private void jButton1_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_saveActionPerformed
        if(verifyData())
        {
            
        //set variables
        
        String lecname1 = jComboBox_lec1.getSelectedItem().toString();
        String lecname2 = jComboBox2_lec2.getSelectedItem().toString();
        
        String sCode = jComboBox4_subCode.getSelectedItem().toString();
        String sName = jTextField1_subName.getText();
        
        String count = jTextField1_stuCount.getText();
        
        String Tag = jComboBox3_tag.getSelectedItem().toString();
        String Duration = jTextField1_duration.getText();
        
        
        String mainG = jComboBox2_mainGroup.getSelectedItem().toString();
        String subG = jComboBox2_subGroup.getSelectedItem().toString();
        String fullGrID = jTextField1_fullGroupID.getText();
        
  
       try {
           //query
           String sq = "INSERT INTO session (lec1, lec2, sub_code, sub_name, stu_count, tag, duration, Maingroup, Subgroup, full_grpID) VALUES ('"+ lecname1 +"', '"+ lecname2 +"', '"+ sCode +"', '"+ sName +"', '"+ count +"', '"+ Tag +"', '"+ Duration +"', '"+ mainG +"', '"+ subG +"', '"+ fullGrID +"')";
           
           pst = conn.prepareStatement(sq);
           pst.execute();
           
           JOptionPane.showMessageDialog(null, "Session created Successfully");
                
           //clear fields method called
           clearFields();
               
           
           } 
      catch (SQLException ex) {
           Logger.getLogger(Add_Session.class.getName()).log(Level.SEVERE, null, ex);
           }
            
            
        }
    }//GEN-LAST:event_jButton1_saveActionPerformed

    private void jTextField1_durationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_durationActionPerformed
        
    }//GEN-LAST:event_jTextField1_durationActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        Admin_Home adHome = new Admin_Home();
            adHome.setVisible(true);
            adHome.pack();
            adHome.setLocationRelativeTo(null);
            adHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel2MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel2MinimizeMouseClicked

    private void jLabel1closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1closeMouseClicked

    private void jButton1_setSubNmaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_setSubNmaeActionPerformed
          subjectCode = (String)jComboBox4_subCode.getSelectedItem( ); 
        try { 
             Class.forName("com.mysql.jdbc.Driver");

             Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/itpmnew","root","");

             Statement statement = connection.createStatement();
             String query = "SELECT subject_name FROM subject WHERE subject_code='"+ subjectCode +"'";
             ResultSet rs = statement.executeQuery(query);

             while (rs.next())
             {                             
                jTextField1_subName.setText(rs.getString("subject_name"));
                 
             }//end while
             connection.close();
             } catch (Exception e) {
                  e.printStackTrace();
             }
    }//GEN-LAST:event_jButton1_setSubNmaeActionPerformed

    private void jButton1_setGroupIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_setGroupIDActionPerformed
       
        String mainG = (String) jComboBox2_mainGroup.getSelectedItem();
        String subG = (String) jComboBox2_subGroup.getSelectedItem();
        
        
        String FullGroupID = (mainG+ "." +subG);
        jTextField1_fullGroupID.setText(""+FullGroupID);
   
    }//GEN-LAST:event_jButton1_setGroupIDActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Session().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_save;
    private javax.swing.JButton jButton1_setGroupID;
    private javax.swing.JButton jButton1_setSubNmae;
    private javax.swing.JButton jButton3_view;
    private javax.swing.JComboBox<String> jComboBox2_lec2;
    private javax.swing.JComboBox<String> jComboBox2_mainGroup;
    private javax.swing.JComboBox<String> jComboBox2_subGroup;
    private javax.swing.JComboBox<String> jComboBox3_tag;
    private javax.swing.JComboBox<String> jComboBox4_subCode;
    private javax.swing.JComboBox<String> jComboBox_lec1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1_duration;
    private javax.swing.JTextField jTextField1_fullGroupID;
    private javax.swing.JTextField jTextField1_stuCount;
    private javax.swing.JTextField jTextField1_subName;
    // End of variables declaration//GEN-END:variables

    
}

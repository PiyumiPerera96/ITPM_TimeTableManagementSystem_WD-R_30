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
import net.proteanit.sql.DbUtils;


public class View_Session extends javax.swing.JFrame {
   
    Connection conn = null;
    PreparedStatement pst = null;
    
    //table
    ResultSet rs = null;

    
    public View_Session() {
        initComponents();
        getSubjectCombo();
        getLectureList();
        getGroupIDs();
        getTagsList();
     
        //center form
        this.setLocationRelativeTo(null);
        
        //DB connect
        conn = MyConnection.getConnection();
        
        //load table
        TableLoad();
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
                jComboBox1_lec1.addItem(rs.getString("lec_name"));
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
                jComboBox4_subcode.addItem(rs.getString("subject_code"));
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
                jComboBox1_MainGroup.addItem(rs.getString("sMainGroupId"));
             }//end while
             connection.close();
             } catch (Exception e) {
                  e.printStackTrace();
             }
    }
    
    
    
     public void TableLoad()
    {
       
       try {     
           String sql = "SELECT session_ID, lec1, lec2, sub_code, sub_name, stu_count, tag, duration, Maingroup, Subgroup, full_grpID FROM session";
           pst = conn.prepareStatement(sql);
           rs = pst.executeQuery();
           
           jTable1.setModel(DbUtils.resultSetToTableModel(rs));
           
           } catch (Exception ex) {
           Logger.getLogger(Add_Session.class.getName()).log(Level.SEVERE, null, ex);
           }
    }

    
    
    //set fields clear
    private void clearFields() {
        
        jTextField2_id.setText(null);
        
        jComboBox1_lec1.setSelectedItem(null);
        jComboBox2_lec2.setSelectedItem(null);
      
        jComboBox4_subcode.setSelectedItem(null);
        jTextField7_subname.setText(null);
        
        jTextField8_count.setText(null);
        
        jComboBox3_tag.setSelectedItem(null);
        jTextField9_duration.setText(null);
        
        jComboBox1_MainGroup.setSelectedItem(null);
        jComboBox1_SubGroup.setSelectedItem(null);
        jTextField12_fullgrpID.setText(null);
        
       
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1_home = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2_logout = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2Minimize = new javax.swing.JLabel();
        jLabel1close = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField1_search = new javax.swing.JTextField();
        jButton1_search = new javax.swing.JButton();
        jTextField2_id = new javax.swing.JTextField();
        jTextField7_subname = new javax.swing.JTextField();
        jTextField8_count = new javax.swing.JTextField();
        jTextField9_duration = new javax.swing.JTextField();
        jTextField12_fullgrpID = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jButton2_add = new javax.swing.JButton();
        jButton3_update = new javax.swing.JButton();
        jButton4_delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1_lec1 = new javax.swing.JComboBox<>();
        jComboBox2_lec2 = new javax.swing.JComboBox<>();
        jComboBox3_tag = new javax.swing.JComboBox<>();
        jComboBox4_subcode = new javax.swing.JComboBox<>();
        jButton1_generateSubName = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jComboBox1_MainGroup = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jComboBox1_SubGroup = new javax.swing.JComboBox<>();
        jButton1_generateGroupID = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1170, 1100));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1170, 1100));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(236, 236, 236));
        jPanel1.setMinimumSize(new java.awt.Dimension(1170, 60));
        jPanel1.setPreferredSize(new java.awt.Dimension(1170, 60));

        jLabel1_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home2.jpg"))); // NOI18N
        jLabel1_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1_homeMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setText("Time Table Management System");

        jLabel2_logout.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2_logout.setText("Logout");
        jLabel2_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2_logoutMouseClicked(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 345, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(241, 241, 241)
                .addComponent(jLabel2_logout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(28, 28, 28)
                .addComponent(jLabel2Minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1close, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1_home)
                    .addComponent(jLabel11))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2_logout))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2Minimize)
                        .addComponent(jLabel1close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1170, 60);

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        jPanel2.setMinimumSize(new java.awt.Dimension(1170, 1040));
        jPanel2.setPreferredSize(new java.awt.Dimension(1170, 1040));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("View Session Details");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Session ID :");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Lecturer 1 :");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Lecturer 2 :");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tag :");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Subject Code :");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Subject Name :");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Student Count :");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Duration :");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Full Group ID :");

        jButton1_search.setBackground(new java.awt.Color(232, 236, 241));
        jButton1_search.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton1_search.setText("Search by Lecturer");
        jButton1_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_searchActionPerformed(evt);
            }
        });

        jTextField2_id.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jTextField7_subname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jTextField8_count.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField8_count.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8_countActionPerformed(evt);
            }
        });

        jTextField9_duration.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jTextField12_fullgrpID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jButton2_add.setBackground(new java.awt.Color(1, 152, 117));
        jButton2_add.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2_add.setForeground(new java.awt.Color(255, 255, 255));
        jButton2_add.setText("ADD");
        jButton2_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_addActionPerformed(evt);
            }
        });

        jButton3_update.setBackground(new java.awt.Color(103, 128, 159));
        jButton3_update.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton3_update.setForeground(new java.awt.Color(255, 255, 255));
        jButton3_update.setText("UPDATE");
        jButton3_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_updateActionPerformed(evt);
            }
        });

        jButton4_delete.setBackground(new java.awt.Color(207, 0, 15));
        jButton4_delete.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton4_delete.setForeground(new java.awt.Color(255, 255, 255));
        jButton4_delete.setText("DELETE");
        jButton4_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_deleteActionPerformed(evt);
            }
        });

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jComboBox1_lec1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox1_lec1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select lecturer" }));

        jComboBox2_lec2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox2_lec2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select assistant lec", "-", "Miss.Devindi", "Miss.Kushnara", "Ms.Thruka", "Miss.Anuththara", "Mr.Anuraddha", " " }));

        jComboBox3_tag.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox3_tag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select Tag", "Lecture", "Tutorial", "Lab" }));

        jComboBox4_subcode.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox4_subcode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sub code" }));

        jButton1_generateSubName.setBackground(new java.awt.Color(236, 236, 236));
        jButton1_generateSubName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_generateSubNameActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Main Group:");

        jComboBox1_MainGroup.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox1_MainGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Main Group" }));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Sub Group:");

        jComboBox1_SubGroup.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox1_SubGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sub grp", "-", "1", "2" }));

        jButton1_generateGroupID.setBackground(new java.awt.Color(236, 236, 236));
        jButton1_generateGroupID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_generateGroupIDActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Hrs");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(435, 435, 435)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jButton2_add, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addComponent(jButton3_update, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(jButton4_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField2_id, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox4_subcode, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1_lec1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2_lec2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jButton1_generateSubName)
                                .addGap(58, 58, 58)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField7_subname, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jTextField1_search, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1_search, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField8_count, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBox3_tag, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField9_duration, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1_MainGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1_SubGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1_generateGroupID)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField12_fullgrpID)))
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1037, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1_search, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1_search))
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1_lec1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2_lec2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(jTextField7_subname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox4_subcode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(jTextField8_count, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jComboBox3_tag, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1_generateSubName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField12_fullgrpID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1_generateGroupID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(jTextField9_duration, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox1_MainGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15)
                                .addComponent(jLabel16)
                                .addComponent(jComboBox1_SubGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)))))
                .addGap(34, 34, 34)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2_add, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3_update, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 60, 1170, 1040);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2_logoutMouseClicked
        Admin_Login adlogin = new Admin_Login();
        adlogin.setVisible(true);
        adlogin.pack();
        adlogin.setLocationRelativeTo(null);
        adlogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel2_logoutMouseClicked

    
    
    private void jLabel1_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1_homeMouseClicked
       //redirect to the home page
            Admin_Home adHome = new Admin_Home();
            adHome.setVisible(true);
            adHome.pack();
            adHome.setLocationRelativeTo(null);
            adHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
    }//GEN-LAST:event_jLabel1_homeMouseClicked

    
    
    private void jButton2_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_addActionPerformed
        Add_Session adsess = new Add_Session();
        adsess.setVisible(true);
        adsess.pack();
        adsess.setLocationRelativeTo(null);
        adsess.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton2_addActionPerformed

    
    private void jButton3_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_updateActionPerformed
         //show confirmation message
        int usm = JOptionPane.showConfirmDialog(null, "Do You Really want to Update?");
        
        //for yes button
        if (usm == 0) {
            
            String id = jTextField2_id.getText();
            
            String lec_1 = jComboBox1_lec1.getSelectedItem().toString();
            String lec_2 = jComboBox2_lec2.getSelectedItem().toString();
            
            String code = jComboBox4_subcode.getSelectedItem().toString();
            String sName = jTextField7_subname.getText();
            
            String count = jTextField8_count.getText();
            
            String Tag = jComboBox3_tag.getSelectedItem().toString();
            String dur = jTextField9_duration.getText();
            
            String MainG = jComboBox1_MainGroup.getSelectedItem().toString();
            String SubG = jComboBox1_SubGroup.getSelectedItem().toString();
            String fullG = jTextField12_fullgrpID.getText();

            
            //update query
            String upsql = "UPDATE session SET lec1 = '"+ lec_1 +"', lec2 = '"+ lec_2 +"', sub_code = '"+ code +"', sub_name = '"+ sName +"', stu_count = '"+ count +"', tag = '"+ Tag +"', duration = '"+ dur +"', Maingroup = '"+ MainG +"', Subgroup = '"+ SubG +"', full_grpID = '"+ fullG +"' WHERE session_ID = '"+ id +"' ";
            
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
    }//GEN-LAST:event_jButton3_updateActionPerformed

    private void jButton4_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_deleteActionPerformed
       //show confirmation message
        int dsm = JOptionPane.showConfirmDialog(null, "Do You Really want to Delete?");
        
        //for yes button
        if (dsm == 0) {
            String sid =jTextField2_id.getText();
            
            //delete query
            String desql = "DELETE from session WHERE session_ID = '"+ sid +"' ";
            
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
    }//GEN-LAST:event_jButton4_deleteActionPerformed

    private void jButton1_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_searchActionPerformed
          //get the value from textfield
        String lec = jTextField1_search.getText();
        
        //query
        String sql = "SELECT lec1, lec2, tag, sub_name, duration, full_grpID "
                + "FROM session "
                + "WHERE lec1 LIKE '%"+ lec +"%' ";
                
        
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
           
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));    
            
        } 
        catch (Exception e) {
            Logger.getLogger(View_Session.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jButton1_searchActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         

        //identify the selected row
        int row = jTable1.getSelectedRow();
        
        //get values from the row
        String id = jTable1.getValueAt(row, 0).toString();
        
        String lec_1 = jTable1.getValueAt(row, 1).toString();
        String lec_2 = jTable1.getValueAt(row, 2).toString();
      
        String code = jTable1.getValueAt(row, 3).toString();
        String sName = jTable1.getValueAt(row, 4).toString();
        
        String count = jTable1.getValueAt(row, 5).toString();
        
        String Tag = jTable1.getValueAt(row, 6).toString();
        String dur = jTable1.getValueAt(row, 7).toString();
        
        String main = jTable1.getValueAt(row, 8).toString();
        String sub = jTable1.getValueAt(row, 9).toString();
        String fullG = jTable1.getValueAt(row, 10).toString();
        
        
        
        //assign values to fields
        jTextField2_id.setText(id);
        
        jComboBox1_lec1.setSelectedItem(lec_1);
        jComboBox2_lec2.setSelectedItem(lec_2);

        jComboBox4_subcode.setSelectedItem(code);
        jTextField7_subname.setText(sName);
        
        jTextField8_count.setText(count);
        
        jComboBox3_tag.setSelectedItem(Tag);
        jTextField9_duration.setText(dur);
        
        jComboBox1_MainGroup.setSelectedItem(main);
        jComboBox1_SubGroup.setSelectedItem(sub);
        jTextField12_fullgrpID.setText(fullG);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField8_countActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8_countActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8_countActionPerformed

    private void jLabel2MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel2MinimizeMouseClicked

    private void jLabel1closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1closeMouseClicked

    private void jButton1_generateSubNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_generateSubNameActionPerformed
        subjectCode = (String)jComboBox4_subcode.getSelectedItem( ); 
        try { 
             Class.forName("com.mysql.jdbc.Driver");

             Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/itpmnew","root","");

             Statement statement = connection.createStatement();
             String query = "SELECT subject_name FROM subject WHERE subject_code='"+ subjectCode +"'";
             ResultSet rs = statement.executeQuery(query);

             while (rs.next())
             {                             
                jTextField7_subname.setText(rs.getString("subject_name"));
                 
             }//end while
             connection.close();
             } catch (Exception e) {
                  e.printStackTrace();
             }
    }//GEN-LAST:event_jButton1_generateSubNameActionPerformed

    private void jButton1_generateGroupIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_generateGroupIDActionPerformed
         String mainG = (String) jComboBox1_MainGroup.getSelectedItem();
        String subG = (String) jComboBox1_SubGroup.getSelectedItem();
        
        
        String FullGroupID = (mainG+ "." +subG);
        jTextField12_fullgrpID.setText(""+FullGroupID);
    }//GEN-LAST:event_jButton1_generateGroupIDActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Session().setVisible(true);
            }
        });
    }
    
    
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_generateGroupID;
    private javax.swing.JButton jButton1_generateSubName;
    private javax.swing.JButton jButton1_search;
    private javax.swing.JButton jButton2_add;
    private javax.swing.JButton jButton3_update;
    private javax.swing.JButton jButton4_delete;
    private javax.swing.JComboBox<String> jComboBox1_MainGroup;
    private javax.swing.JComboBox<String> jComboBox1_SubGroup;
    private javax.swing.JComboBox<String> jComboBox1_lec1;
    private javax.swing.JComboBox<String> jComboBox2_lec2;
    private javax.swing.JComboBox<String> jComboBox3_tag;
    private javax.swing.JComboBox<String> jComboBox4_subcode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel1_home;
    private javax.swing.JLabel jLabel1close;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2Minimize;
    private javax.swing.JLabel jLabel2_logout;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField12_fullgrpID;
    private javax.swing.JTextField jTextField1_search;
    private javax.swing.JTextField jTextField2_id;
    private javax.swing.JTextField jTextField7_subname;
    private javax.swing.JTextField jTextField8_count;
    private javax.swing.JTextField jTextField9_duration;
    // End of variables declaration//GEN-END:variables
}

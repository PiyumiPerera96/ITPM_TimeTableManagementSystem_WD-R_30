
package timetable_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JFrame;

/**
 *
 * @author NISHADI
 */
public class Consecutive extends javax.swing.JFrame {

    
    public Consecutive() {
        initComponents();
        
         //center form
        this.setLocationRelativeTo(null);
    }

    
       public Connection getConnection(){
      Connection con;
        try{
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/itpmnew","root","");
            return con;
        }catch(Exception e){
            e.printStackTrace();
            return null;
            
        }
        
       }
       
       
    public ArrayList<Consecutives>  getConsecutivesList()

    {
        ArrayList<Consecutives> consecutivesList = new ArrayList<>();
        Connection connection = getConnection();
        String query = "SELECT * FROM `student_consecutive`";
        Statement st;
        ResultSet rs;
        
        try{
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Consecutives consecutives;
            while(rs.next()){
                consecutives = new Consecutives(rs.getInt("con_Stu_ID"),rs.getString("con_Stu_GroupID"),rs.getString("con_Stu_Code1"),rs.getString("con_Stu_Code2"),rs.getString("con_Stu_Code3"),rs.getString("con_Stu_Se1"),rs.getString("con_Stu_Se2"),rs.getString("con_Stu_Se3"));
                consecutivesList.add(consecutives );
                
            
              
            
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return consecutivesList;
    } 
    
    
    
       public ArrayList<ConsecutivesLec>  getConsecutivesLecList()

    {
        ArrayList<ConsecutivesLec> consecutivesLecList = new ArrayList<>();
        Connection connection = getConnection();
        String query = "SELECT * FROM `lecturers_consecutive`";
        Statement st;
        ResultSet rs;
        
        try{
            st = connection.createStatement();
            rs = st.executeQuery(query);
            ConsecutivesLec consecutivesLec;
            while(rs.next()){
               
                consecutivesLec = new ConsecutivesLec(rs.getInt("con_Lec_ID"),rs.getString("lecID"),rs.getString("subject1"),rs.getString("subject2"),rs.getString("subject3"),rs.getString("session1"),rs.getString("session2"),rs.getString("session3"));
                consecutivesLecList.add(consecutivesLec);
                
                
            }
               
        }catch(Exception e){
            e.printStackTrace();
        }
        return consecutivesLecList;
    
    }
    
    //Exequte The Sql Query
   public void executeSQlQuery(String query, String message){
        Connection con = getConnection();
        Statement st;
        try{
            st = con.createStatement();
            if((st.executeUpdate(query)) == 1)
            {
               
                JOptionPane.showMessageDialog(null, "Data"+message+" Succefully");
            }else{
                JOptionPane.showMessageDialog(null, "Data Not"+message);
            }
        
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton_getStudent = new javax.swing.JButton();
        jButton_viewStudent = new javax.swing.JButton();
        jComboBox_groupId = new javax.swing.JComboBox<>();
        jComboBox_Subject1 = new javax.swing.JComboBox<>();
        jComboBox_StdSubject2 = new javax.swing.JComboBox<>();
        jComboBox_stdSubject3 = new javax.swing.JComboBox<>();
        jComboBox_stdSe1 = new javax.swing.JComboBox<>();
        jComboBox_stdSe2 = new javax.swing.JComboBox<>();
        jComboBox_stdSe3 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jButton_addStudent1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton_leAdd = new javax.swing.JButton();
        jButton_leView = new javax.swing.JButton();
        jButton_getDataLec = new javax.swing.JButton();
        jComboBox_leSubject1 = new javax.swing.JComboBox<>();
        jComboBox_leSubject2 = new javax.swing.JComboBox<>();
        jComboBox_leSubject3 = new javax.swing.JComboBox<>();
        jComboBox_leSession1 = new javax.swing.JComboBox<>();
        jComboBox_leSession2 = new javax.swing.JComboBox<>();
        jComboBox_leSession3 = new javax.swing.JComboBox<>();
        jComboBox_LecturerID = new javax.swing.JComboBox<>();
        jButton_conBack = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel1_home = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel2_logout = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2Minimize = new javax.swing.JLabel();
        jLabel1close = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Consecutive Sessions");

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Goup ID:-");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Subject ID:-");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Session ID:-");

        jButton_getStudent.setBackground(new java.awt.Color(236, 236, 236));
        jButton_getStudent.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_getStudent.setText("GET DATA");
        jButton_getStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_getStudentActionPerformed(evt);
            }
        });

        jButton_viewStudent.setBackground(new java.awt.Color(207, 0, 15));
        jButton_viewStudent.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_viewStudent.setForeground(new java.awt.Color(255, 255, 255));
        jButton_viewStudent.setText("VIEW");
        jButton_viewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_viewStudentActionPerformed(evt);
            }
        });

        jComboBox_groupId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jComboBox_Subject1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jComboBox_StdSubject2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_StdSubject2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_StdSubject2ActionPerformed(evt);
            }
        });

        jComboBox_stdSubject3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jComboBox_stdSe1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jComboBox_stdSe2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jComboBox_stdSe3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Add Consecutive sessions for Students");

        jButton_addStudent1.setBackground(new java.awt.Color(1, 152, 117));
        jButton_addStudent1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_addStudent1.setForeground(new java.awt.Color(255, 255, 255));
        jButton_addStudent1.setText("ADD");
        jButton_addStudent1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addStudent1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(67, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_getStudent)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBox_stdSubject3, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox_StdSubject2, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox_Subject1, javax.swing.GroupLayout.Alignment.TRAILING, 0, 118, Short.MAX_VALUE))
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jComboBox_stdSe2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox_stdSe1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox_stdSe3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jComboBox_groupId, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 94, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton_addStudent1)
                                .addGap(53, 53, 53)
                                .addComponent(jButton_viewStudent)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel11)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox_groupId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_Subject1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_stdSe1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_StdSubject2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_stdSe2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_stdSubject3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_stdSe3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_getStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jButton_viewStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_addStudent1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel3.setBackground(new java.awt.Color(44, 62, 80));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Add Consecutive Sessions for Lecturers");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Lecturer ID:-");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Subject ID:-");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Session ID:-");

        jButton_leAdd.setBackground(new java.awt.Color(1, 152, 117));
        jButton_leAdd.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_leAdd.setForeground(new java.awt.Color(255, 255, 255));
        jButton_leAdd.setText("ADD");
        jButton_leAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_leAddActionPerformed(evt);
            }
        });

        jButton_leView.setBackground(new java.awt.Color(207, 0, 15));
        jButton_leView.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_leView.setForeground(new java.awt.Color(255, 255, 255));
        jButton_leView.setText("VIEW");
        jButton_leView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_leViewActionPerformed(evt);
            }
        });

        jButton_getDataLec.setBackground(new java.awt.Color(236, 236, 236));
        jButton_getDataLec.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_getDataLec.setText("GET DATA");
        jButton_getDataLec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_getDataLecActionPerformed(evt);
            }
        });

        jComboBox_leSubject1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_leSubject1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_leSubject1ActionPerformed(evt);
            }
        });

        jComboBox_leSubject2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jComboBox_leSubject3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jComboBox_leSession1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jComboBox_leSession2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jComboBox_leSession3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jComboBox_LecturerID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton_getDataLec)
                        .addGap(49, 49, 49)
                        .addComponent(jButton_leAdd)
                        .addGap(58, 58, 58)
                        .addComponent(jButton_leView)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(22, 22, 22))
                                            .addComponent(jComboBox_leSubject1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBox_leSubject2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBox_leSubject3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(77, 77, 77)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jComboBox_leSession1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jComboBox_leSession2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jComboBox_leSession3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel9)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(45, 45, 45)
                                        .addComponent(jComboBox_LecturerID, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(51, 51, 51)))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox_LecturerID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_leSession1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_leSubject1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_leSession2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_leSubject2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_leSession3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_leSubject3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_leAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_leView, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_getDataLec, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton_conBack.setBackground(new java.awt.Color(207, 0, 15));
        jButton_conBack.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_conBack.setForeground(new java.awt.Color(255, 255, 255));
        jButton_conBack.setText("BACK");
        jButton_conBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_conBackActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(263, 263, 263))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton_conBack, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButton_conBack, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(158, 158, 158))))
        );

        jPanel4.setBackground(new java.awt.Color(236, 236, 236));

        jLabel1_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home2.jpg"))); // NOI18N
        jLabel1_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1_homeMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setText("Time Table Management System");

        jLabel2_logout.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2_logout.setText("Logout");
        jLabel2_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2_logoutMouseClicked(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.jpg"))); // NOI18N

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1_home)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(187, 187, 187)
                .addComponent(jLabel2_logout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(28, 28, 28)
                .addComponent(jLabel2Minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1close, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1_home)
                    .addComponent(jLabel12))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2_logout)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2Minimize)
                                .addComponent(jLabel1close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(24, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_getStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_getStudentActionPerformed
        // TODO add your handling code here:
        //String query = "INSERT INTO `parallel`(`parYear`, `parSemester`, `parSubjectType`, `parSubject1`, `parSubject2`, `parSubject3`, `parSubject4`, `parCode1`, `parCode2`, `parCode3`, `parCode4`) VALUES ('"+jTextField_pYear.getText()+"','"+jTextField_pSemeter.getText()+"','"+jTextField_pTypeOfSubject.getText()+"','"+jTextField_pSubject1.getText()+"','"+jTextField_pSubject2.getText()+"','"+jTextField_pSubject3.getText()+"','"+jTextField_pSubject4.getText()+"','"+jTextField_pSubjectCode1.getText()+"','"+jTextField_pSubjectCode2.getText()+"','"+jTextField_pSubjectCode3.getText()+"','"+jTextField_pSubjectCode4.getText()+"')";
        
        
               try{
            Connection con = getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT distinct full_grpID FROM `session`");
            
            
            while(rs.next()){
                String con_Stu_GroupID = rs.getString("full_grpID");
                jComboBox_groupId.addItem(con_Stu_GroupID);
            }
           
            
        }catch(Exception e){
            
        } 
          
        try{
            Connection con = getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT distinct sub_code FROM `session`");
            
            
            while(rs.next()){
                String Subject = rs.getString("sub_code");
                jComboBox_Subject1.addItem(Subject);
                jComboBox_StdSubject2.addItem(Subject);
                jComboBox_stdSubject3.addItem(Subject);
                
            }
           
            
        }catch(Exception e){
            
        } 
             
        try{
            Connection con = getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT distinct session_ID FROM `session`");
            
            
            while(rs.next()){
                String se = rs.getString("session_ID");
                jComboBox_stdSe1.addItem(se);
                jComboBox_stdSe2.addItem(se);
                jComboBox_stdSe3.addItem(se);
                
            }
           
            
        }catch(Exception e){
            
        } 
        
       
    }//GEN-LAST:event_jButton_getStudentActionPerformed

    private void jButton_conBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_conBackActionPerformed
        // TODO add your handling code here:
        SessionT sess = new SessionT();
        sess.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_conBackActionPerformed

    private void jButton_leAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_leAddActionPerformed
        // TODO add your handling code here:
         String query = "INSERT INTO `lecturers_consecutive`(`lecID`, `subjectID1`, `subjectID2`, `subjectID3`, `session1`, `session2`, `session3`) VALUES ('"+jComboBox_LecturerID.getSelectedItem()+"','"+jComboBox_leSubject1.getSelectedItem()+"','"+jComboBox_leSubject2.getSelectedItem()+"','"+jComboBox_leSubject3.getSelectedItem()+"','"+jComboBox_leSession1.getSelectedItem()+"','"+jComboBox_leSession2.getSelectedItem()+"','"+jComboBox_leSession3.getSelectedItem()+"')";
          executeSQlQuery(query, " Inserted");
    }//GEN-LAST:event_jButton_leAddActionPerformed

    private void jButton_addStudent1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addStudent1ActionPerformed
        // TODO add your handling code here:
       String query = "INSERT INTO `student_consecutive`(`con_Stu_GroupID`, `con_Stu_Code1`, `con_Stu_Code2`, `con_Stu_Code3`, `con_Stu_Se1`, `con_Stu_Se2`, `con_Stu_Se3`) VALUES ('"+jComboBox_groupId.getSelectedItem()+"','"+jComboBox_Subject1.getSelectedItem()+"','"+jComboBox_StdSubject2.getSelectedItem()+"','"+jComboBox_stdSubject3.getSelectedItem()+"','"+jComboBox_stdSe1.getSelectedItem()+"','"+jComboBox_stdSe2.getSelectedItem()+"','"+jComboBox_stdSe3.getSelectedItem()+"')";
       
        
         // String query = "INSERT INTO `student_consecutive`(`con_Stu_GroupID`, `con_Stu_Code1`, `con_Stu_Code2`, `con_Stu_Code3`, `con_Stu_Se1`, `con_Stu_Se2`, `con_Stu_Se3`) VALUES ([value-1],[value-2],[value-3],[value-4],[value-5],[value-6],[value-7],[value-8])";
         executeSQlQuery(query, " Inserted");
    }//GEN-LAST:event_jButton_addStudent1ActionPerformed

    private void jButton_getDataLecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_getDataLecActionPerformed
        // TODO add your handling code here:
           
             try{
            Connection con = getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT distinct lec_id FROM `lecturer`");
            
            
            while(rs.next()){
                String lec = rs.getString("lec_id");
                jComboBox_LecturerID.addItem(lec);
                
            }
            }catch(Exception e){
            
        } 
            
      
          
        try{
            Connection con = getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT distinct sub_code FROM `session`");
            
            
            while(rs.next()){
                String code = rs.getString("sub_code");
                jComboBox_leSubject1.addItem(code);
                jComboBox_leSubject2.addItem(code);
                jComboBox_leSubject3.addItem(code);
                
            }
           
            
        }catch(Exception e){
            
        } 
    
        
         try{
            Connection con = getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT distinct session_ID FROM `session`");
            
            
            while(rs.next()){
                String session = rs.getString("session_ID");
                jComboBox_leSession1.addItem(session);
                jComboBox_leSession2.addItem(session);
                jComboBox_leSession3.addItem(session);
                
            }
           
            
        }catch(Exception e){
            
        } 
        
    }//GEN-LAST:event_jButton_getDataLecActionPerformed

    private void jComboBox_leSubject1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_leSubject1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_leSubject1ActionPerformed

    private void jComboBox_StdSubject2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_StdSubject2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_StdSubject2ActionPerformed

    private void jButton_viewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_viewStudentActionPerformed
        // TODO add your handling code here:
        
        ConsecutiveStudent con = new ConsecutiveStudent();
        con.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_viewStudentActionPerformed

    private void jButton_leViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_leViewActionPerformed
        // TODO add your handling code here:
        ConsecutiveLecturer con = new ConsecutiveLecturer();
        con.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_leViewActionPerformed

    private void jLabel1_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1_homeMouseClicked
        //redirect to the home page
        Admin_Home adHome = new Admin_Home();
        adHome.setVisible(true);
        adHome.pack();
        adHome.setLocationRelativeTo(null);
        adHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel1_homeMouseClicked

    private void jLabel2_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2_logoutMouseClicked
        Admin_Login adlogin = new Admin_Login();
        adlogin.setVisible(true);
        adlogin.pack();
        adlogin.setLocationRelativeTo(null);
        adlogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel2_logoutMouseClicked

    private void jLabel2MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel2MinimizeMouseClicked

    private void jLabel1closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1closeMouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consecutive().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_addStudent1;
    private javax.swing.JButton jButton_conBack;
    private javax.swing.JButton jButton_getDataLec;
    private javax.swing.JButton jButton_getStudent;
    private javax.swing.JButton jButton_leAdd;
    private javax.swing.JButton jButton_leView;
    private javax.swing.JButton jButton_viewStudent;
    private javax.swing.JComboBox<String> jComboBox_LecturerID;
    private javax.swing.JComboBox<String> jComboBox_StdSubject2;
    private javax.swing.JComboBox<String> jComboBox_Subject1;
    private javax.swing.JComboBox<String> jComboBox_groupId;
    private javax.swing.JComboBox<String> jComboBox_leSession1;
    private javax.swing.JComboBox<String> jComboBox_leSession2;
    private javax.swing.JComboBox<String> jComboBox_leSession3;
    private javax.swing.JComboBox<String> jComboBox_leSubject1;
    private javax.swing.JComboBox<String> jComboBox_leSubject2;
    private javax.swing.JComboBox<String> jComboBox_leSubject3;
    private javax.swing.JComboBox<String> jComboBox_stdSe1;
    private javax.swing.JComboBox<String> jComboBox_stdSe2;
    private javax.swing.JComboBox<String> jComboBox_stdSe3;
    private javax.swing.JComboBox<String> jComboBox_stdSubject3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}

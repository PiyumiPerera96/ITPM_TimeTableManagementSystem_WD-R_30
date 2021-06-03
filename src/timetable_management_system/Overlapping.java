
package timetable_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author NISHADI
 */
public class Overlapping extends javax.swing.JFrame {

   
    public Overlapping() {
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
    
          
    
    public ArrayList<Overlapes> getOverlapesList()
    {
        ArrayList<Overlapes> overlapesList = new ArrayList<>();
        Connection connection = getConnection();
        String query = "SELECT * FROM `overlape`";
        Statement st;
        ResultSet rs;
        
        try{
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Overlapes overlapes;
            while(rs.next()){
               // overlapes = new Overlapes(rs.getString("overYear"),rs.getString("over_Semester"),rs.getString("overSpecial"),rs.getString("overTag"),rs.getString("overCode1"),rs.getString("overCode2"),rs.getString("overCode3"),rs.getString("overCode4"));
               // overlapesList.add(overlapes);
                
                 overlapes = new Overlapes(rs.getInt("overID"),rs.getString("overYear"),rs.getString("over_Semester"),rs.getString("overSpecial"),rs.getString("overTag"),rs.getString("overCode1"),rs.getString("overCode2"),rs.getString("overCode3"),rs.getString("parCode4"),rs.getString("overSe1"),rs.getString("overSe2"),rs.getString("overSe3"),rs.getString("overSe4"));
                 overlapesList.add(overlapes);
                
                
            }
               
        }catch(Exception e){
            e.printStackTrace();
        }
        return overlapesList;
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1_home = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel_logout = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2Minimize = new javax.swing.JLabel();
        jLabel1close = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton_ovBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox_AcademicYear = new javax.swing.JComboBox<>();
        jComboBox_AcademicSemester = new javax.swing.JComboBox<>();
        jComboBox_Special = new javax.swing.JComboBox<>();
        jComboBox_Tag = new javax.swing.JComboBox<>();
        jComboBox_GID1 = new javax.swing.JComboBox<>();
        jComboBox_GID2 = new javax.swing.JComboBox<>();
        jComboBox_GID3 = new javax.swing.JComboBox<>();
        jComboBox_GID4 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox_Se1 = new javax.swing.JComboBox<>();
        jComboBox_Se2 = new javax.swing.JComboBox<>();
        jComboBox_Se3 = new javax.swing.JComboBox<>();
        jComboBox_Se4 = new javax.swing.JComboBox<>();
        jButton_OverlappingGetData = new javax.swing.JButton();
        jButton_OverlappingAdd1 = new javax.swing.JButton();
        jButton_OverlappingView = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(236, 236, 236));

        jLabel1_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home2.jpg"))); // NOI18N
        jLabel1_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1_homeMouseClicked(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1_home)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(87, 87, 87)
                .addComponent(jLabel_logout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(37, 37, 37)
                .addComponent(jLabel2Minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1close, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(jLabel_logout)
                            .addGap(13, 13, 13))
                        .addComponent(jLabel11)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1close)
                                .addComponent(jLabel2Minimize))
                            .addGap(14, 14, 14)))
                    .addComponent(jLabel1_home))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(42, 62, 80));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Non Overlapping Sessions");

        jButton_ovBack.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_ovBack.setText("BACK");
        jButton_ovBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ovBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Academic Year:-");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Academic Semester:-");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Specalization:-");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tag:-");

        jComboBox_AcademicYear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jComboBox_AcademicSemester.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jComboBox_Special.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jComboBox_Tag.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jComboBox_GID1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jComboBox_GID2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_GID2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_GID2ActionPerformed(evt);
            }
        });

        jComboBox_GID3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jComboBox_GID4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Group ID:-");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Session:-");

        jComboBox_Se1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jComboBox_Se2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jComboBox_Se3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jComboBox_Se4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jButton_OverlappingGetData.setBackground(new java.awt.Color(236, 236, 236));
        jButton_OverlappingGetData.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_OverlappingGetData.setText("GET DATA");
        jButton_OverlappingGetData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OverlappingGetDataActionPerformed(evt);
            }
        });

        jButton_OverlappingAdd1.setBackground(new java.awt.Color(1, 152, 117));
        jButton_OverlappingAdd1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_OverlappingAdd1.setForeground(new java.awt.Color(255, 255, 255));
        jButton_OverlappingAdd1.setText("ADD");
        jButton_OverlappingAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OverlappingAdd1ActionPerformed(evt);
            }
        });

        jButton_OverlappingView.setBackground(new java.awt.Color(207, 0, 15));
        jButton_OverlappingView.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_OverlappingView.setForeground(new java.awt.Color(255, 255, 255));
        jButton_OverlappingView.setText("VIEW");
        jButton_OverlappingView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OverlappingViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 163, Short.MAX_VALUE)
                .addComponent(jButton_OverlappingAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jButton_OverlappingGetData)
                .addGap(50, 50, 50)
                .addComponent(jButton_OverlappingView)
                .addGap(51, 51, 51)
                .addComponent(jButton_ovBack)
                .addGap(199, 199, 199))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_GID1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_GID2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_GID3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_GID4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(229, 229, 229)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jComboBox_Se1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jComboBox_Se2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox_Se3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox_Se4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_Tag, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBox_Special, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox_AcademicSemester, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox_AcademicYear, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_AcademicYear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_AcademicSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_Special, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_Tag, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox_GID1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jComboBox_GID2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jComboBox_GID3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox_GID4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox_Se1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox_Se2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jComboBox_Se3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox_Se4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_OverlappingView, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_OverlappingAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_OverlappingGetData, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_ovBack, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_OverlappingGetDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OverlappingGetDataActionPerformed
        // TODO add your handling code here:
        
         try{
            Connection con = getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT distinct sYear FROM `student`");
            
            
            while(rs.next()){
                String pYe = rs.getString("sYear");
                jComboBox_AcademicYear.addItem(pYe);
                
            }
           
            
        }catch(SQLException e){
            
        } 
        
        
        try{
            Connection con = getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT distinct sSemester FROM `student`");
            
            
            while(rs.next()){
                String pSem = rs.getString("sSemester");
                jComboBox_AcademicSemester.addItem(pSem);
                
            }
           
            
        }catch(Exception e){
            
        } 
        
        try{
            Connection con = getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT distinct sProgramme FROM `student`");
            
            
            while(rs.next()){
                String pProgramme = rs.getString("sProgramme");
                jComboBox_Special.addItem(pProgramme);
                
            }
           
            
        }catch(Exception e){
            
        } 
        
        try{
            Connection con = getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT distinct moType FROM `tags`");
            
            
            while(rs.next()){
                String pTag = rs.getString("moType");
                jComboBox_Tag.addItem(pTag);
                
            }
           
            
        }catch(Exception e){
            
        } 
        
         try{
            Connection con = getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT distinct sub_code FROM `session`");
            
           while(rs.next()){
                String pCode1 = rs.getString("sub_code");
                jComboBox_GID1.addItem(pCode1);
                jComboBox_GID2.addItem(pCode1);
                jComboBox_GID3.addItem(pCode1);
                jComboBox_GID4.addItem(pCode1);
            }
            
        }catch(Exception e){
            
        } 
      
         
    try{
            Connection con = getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT distinct session_ID FROM `session`");
            
           while(rs.next()){
                String sess = rs.getString("session_ID");
                jComboBox_Se1.addItem(sess);
                jComboBox_Se2.addItem(sess);
                jComboBox_Se3.addItem(sess);
                jComboBox_Se4.addItem(sess);
            }
            
        }catch(Exception e){
            
        }
          
    }//GEN-LAST:event_jButton_OverlappingGetDataActionPerformed

    private void jButton_ovBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ovBackActionPerformed
        // TODO add your handling code here:
        SessionT sess = new SessionT();
        sess.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_ovBackActionPerformed

    private void jComboBox_GID2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_GID2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_GID2ActionPerformed

    private void jButton_OverlappingAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OverlappingAdd1ActionPerformed
        // TODO add your handling code here:
      
     //String query = "INSERT INTO `overlape`(`overYear`, `over_Semester`, `overSpecial`, `overTag`, `overCode1`, `overCode2`, `overCode3`, `overCode4`, `overSe1`, `overSe2`, `overSe3, `overSe4`) VALUES ('"+jComboBox_AcademicYear.getSelectedItem()+"','"+jComboBox_AcademicSemester.getSelectedItem()+"','"+jComboBox_Special.getSelectedItem()+"','"+jComboBox_Tag.getSelectedItem()+"','"+jComboBox_Code1.getSelectedItem()+"','"+jComboBox_Code2.getSelectedItem()+"','"+jComboBox_Code3.getSelectedItem()+"','"+jComboBox_Code4.getSelectedItem()+"','"+jComboBox_Se1.getSelectedItem()+"','"+jComboBox_Se2.getSelectedItem()+"','"+jComboBox_Se3.getSelectedItem()+"','"+jComboBox_Se4.getSelectedItem()+"')";
     String query = "INSERT INTO `overlape`(`overYear`, `over_Semester`, `overSpecial`, `overTag`, `overCode1`, `overCode2`, `overCode3`, `overCode4`, `overSe1`, `overSe2`, `overSe3`, `overSe4`) VALUES ('"+jComboBox_AcademicYear.getSelectedItem()+"','"+jComboBox_AcademicSemester.getSelectedItem()+"','"+jComboBox_Special.getSelectedItem()+"','"+jComboBox_Tag.getSelectedItem()+"','"+jComboBox_GID1.getSelectedItem()+"','"+jComboBox_GID2.getSelectedItem()+"','"+jComboBox_GID3.getSelectedItem()+"','"+jComboBox_GID4.getSelectedItem()+"','"+jComboBox_Se1.getSelectedItem()+"','"+jComboBox_Se2.getSelectedItem()+"','"+jComboBox_Se3.getSelectedItem()+"','"+jComboBox_Se4.getSelectedItem()+"')";
     executeSQlQuery(query, " Inserted");
              
    }//GEN-LAST:event_jButton_OverlappingAdd1ActionPerformed

    private void jButton_OverlappingViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OverlappingViewActionPerformed

        // TODO add your handling code here:
        OverlapTable ove = new OverlapTable();
        ove.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_OverlappingViewActionPerformed

    private void jLabel1_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1_homeMouseClicked

        Admin_Home aho = new Admin_Home();
        aho.setVisible(true);
        aho.pack();
        aho.setLocationRelativeTo(null);
        aho.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel1_homeMouseClicked

    private void jLabel_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_logoutMouseClicked
        Admin_Login adlogin = new Admin_Login();
        adlogin.setVisible(true);
        adlogin.pack();
        adlogin.setLocationRelativeTo(null);
        adlogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();//when the admin page is loading, add lecturer page is removed
    }//GEN-LAST:event_jLabel_logoutMouseClicked

    private void jLabel2MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel2MinimizeMouseClicked

    private void jLabel1closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1closeMouseClicked

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Overlapping().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_OverlappingAdd1;
    private javax.swing.JButton jButton_OverlappingGetData;
    private javax.swing.JButton jButton_OverlappingView;
    private javax.swing.JButton jButton_ovBack;
    private javax.swing.JComboBox<String> jComboBox_AcademicSemester;
    private javax.swing.JComboBox<String> jComboBox_AcademicYear;
    private javax.swing.JComboBox<String> jComboBox_GID1;
    private javax.swing.JComboBox<String> jComboBox_GID2;
    private javax.swing.JComboBox<String> jComboBox_GID3;
    private javax.swing.JComboBox<String> jComboBox_GID4;
    private javax.swing.JComboBox<String> jComboBox_Se1;
    private javax.swing.JComboBox<String> jComboBox_Se2;
    private javax.swing.JComboBox<String> jComboBox_Se3;
    private javax.swing.JComboBox<String> jComboBox_Se4;
    private javax.swing.JComboBox<String> jComboBox_Special;
    private javax.swing.JComboBox<String> jComboBox_Tag;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel1_home;
    private javax.swing.JLabel jLabel1close;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2Minimize;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_logout;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}


package timetable_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author NISHADI
 */
public class ManageStudentsGroups extends javax.swing.JFrame {

    
    public ManageStudentsGroups() {
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
       
           public ArrayList<Students> getStudentsList()
    {
        ArrayList<Students> studentsList = new ArrayList<>();
        Connection connection = getConnection();
        String query = "SELECT * FROM `student`";
        Statement st;
        ResultSet rs;
        
        try{
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Students students;
            while(rs.next()){
                students= new Students(rs.getInt("sId"),rs.getString("sYear"),rs.getString("sSemester"),rs.getString("sProgramme"),rs.getString("sMaiGroupNumber"),rs.getString("sSubGroupNumber"),rs.getString("sMainGroupId"),rs.getString("sSubGroupId"));
                studentsList.add(students);
                
            }
               
        }catch(Exception e){
            e.printStackTrace();
        }
        return studentsList;
    } 
       
           
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
        jLabel9 = new javax.swing.JLabel();
        ManID = new javax.swing.JTextField();
        manYear = new javax.swing.JComboBox<>();
        manSemeseter = new javax.swing.JComboBox<>();
        ManProgramme = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonGenerateID = new javax.swing.JButton();
        ManUpdate = new javax.swing.JButton();
        ManDelete = new javax.swing.JButton();
        ManViewTable = new javax.swing.JButton();
        ManClear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ManMainGroupNumber = new javax.swing.JTextField();
        ManSubGroupNumber = new javax.swing.JTextField();
        GroupID = new javax.swing.JTextField();
        subGroupID = new javax.swing.JTextField();

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
                .addGap(31, 31, 31)
                .addComponent(jLabel_logout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel2Minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1close, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1close)
                            .addComponent(jLabel2Minimize))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel_logout)
                                        .addComponent(jLabel10))
                                    .addGap(13, 13, 13))
                                .addComponent(jLabel11))
                            .addComponent(jLabel1_home))
                        .addContainerGap())))
        );

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Student Groups Details");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ID");

        manYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Y1", "Y2", "Y3", "Y4", " " }));

        manSemeseter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S1", "S2" }));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Academic Year");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Acadamic Semester");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Programme");

        jButtonGenerateID.setBackground(new java.awt.Color(236, 236, 236));
        jButtonGenerateID.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonGenerateID.setText("Generate IDs");
        jButtonGenerateID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerateIDActionPerformed(evt);
            }
        });

        ManUpdate.setBackground(new java.awt.Color(103, 128, 159));
        ManUpdate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ManUpdate.setForeground(new java.awt.Color(255, 255, 255));
        ManUpdate.setText("UPDATE");
        ManUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManUpdateActionPerformed(evt);
            }
        });

        ManDelete.setBackground(new java.awt.Color(207, 0, 15));
        ManDelete.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ManDelete.setForeground(new java.awt.Color(255, 255, 255));
        ManDelete.setText("DELETE");
        ManDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManDeleteActionPerformed(evt);
            }
        });

        ManViewTable.setBackground(new java.awt.Color(242, 38, 19));
        ManViewTable.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ManViewTable.setForeground(new java.awt.Color(255, 255, 255));
        ManViewTable.setText("VIEW");
        ManViewTable.setActionCommand("VIEW");
        ManViewTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManViewTableActionPerformed(evt);
            }
        });

        ManClear.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ManClear.setText("CLEAR");
        ManClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManClearActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Main Group Number");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sub Group Number");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Main Group ID");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sub Group ID");

        GroupID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GroupIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(jButtonGenerateID))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ManSubGroupNumber)
                                    .addComponent(GroupID)
                                    .addComponent(subGroupID)
                                    .addComponent(ManMainGroupNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ManProgramme, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(manSemeseter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(manYear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(ManID, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 126, Short.MAX_VALUE)
                .addComponent(ManUpdate)
                .addGap(56, 56, 56)
                .addComponent(ManDelete)
                .addGap(42, 42, 42)
                .addComponent(ManViewTable)
                .addGap(43, 43, 43)
                .addComponent(ManClear)
                .addGap(93, 93, 93))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ManID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manYear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manSemeseter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ManProgramme, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ManMainGroupNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ManSubGroupNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GroupID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subGroupID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(44, 44, 44)
                .addComponent(jButtonGenerateID, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ManUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManViewTable, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManClear, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ManUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManUpdateActionPerformed
        // TODO add your handling code here:
        String id = ManID.getText();
        String year = (String) manYear.getSelectedItem();
        String semester = (String) manSemeseter.getSelectedItem();
        String programme = ManProgramme.getText();
        String mainGroupNumber = ManMainGroupNumber.getText();
        String subGroupNumber = ManSubGroupNumber.getText();
        String mainGroupId = GroupID.getText();
        String subGroupId = subGroupID.getText();
        
        try{
            
                String query = "UPDATE `student` SET `sYear`='"+manYear.getSelectedItem()+"',`sSemester`='"+manSemeseter.getSelectedItem()+"',`sProgramme`='"+ManProgramme.getText()+"',`sMaiGroupNumber`='"+ManMainGroupNumber.getText()+"',`sSubGroupNumber`='"+ManSubGroupNumber.getText()+"',`sMainGroupId`='"+GroupID.getText()+"',`sSubGroupId`='"+subGroupID.getText()+"' WHERE `sID`="+ManID.getText();
                  Connection con = getConnection();      
               //PreparedStatement pst = con.preparedStatement(query);
               //pst.execute();
                
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
       
       String query = "UPDATE `student` SET `sYear`='"+manYear.getSelectedItem()+"',`sSemester`='"+manSemeseter.getSelectedItem()+"',`sProgramme`='"+ManProgramme.getText()+"',`sMaiGroupNumber`='"+ManMainGroupNumber.getText()+"',`sSubGroupNumber`='"+ManSubGroupNumber.getText()+"',`sMainGroupId`='"+GroupID.getText()+"',`sSubGroupId`='"+subGroupID.getText()+"' WHERE `sID`="+ManID.getText();
         //String query ="UPDATE `moduletag` SET `name`='"+T2_ModuleName.getText()+"',`code`='"+T2_moduleCode.getText()+"',`type01`='"+T2_AddT01.getText()+"',`type01Code`='"+T2_T01Code.getText()+"',`type02`='"+T2_AddT2.getText()+"',`type02Code`='"+T2_T2Code.getText()+"',`type03`='"+T2_AddT3.getText()+"',`type03Code`='"+T2_T3Code.getText()+"' WHERE `indexId`="+T2Id.getText();
        executeSQlQuery(query, " Updated");
    }//GEN-LAST:event_ManUpdateActionPerformed

    private void ManDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManDeleteActionPerformed
        // TODO add your handling code here:
        String query ="DELETE FROM `student` WHERE `sID` = "+ManID.getText();
        executeSQlQuery(query, " Deleted");
        
        
        TableStudentGroups.AddRowToJTable(new Object[]{
                                                         ManID.getText(),
                                                         manYear.getSelectedItem(),
                                                         manSemeseter.getSelectedItem(),
                                                         ManProgramme.getText(),
                                                         ManMainGroupNumber.getText(),
                                                         ManSubGroupNumber.getText(),
                                                         GroupID.getText(),
                                                         subGroupID.getText(),
                               });
      
    }//GEN-LAST:event_ManDeleteActionPerformed

    private void ManViewTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManViewTableActionPerformed
        // TODO add your handling code here:
         TableStudentGroups studentTable = new TableStudentGroups();
        studentTable.setVisible(true);
        this.dispose();
        
        
        TableStudentGroups.AddRowToJTable(new Object[]{
                                                         ManID.getText(),
                                                         manYear.getSelectedItem(),
                                                         manSemeseter.getSelectedItem(),
                                                         ManProgramme.getText(),
                                                         ManMainGroupNumber.getText(),
                                                         ManSubGroupNumber.getText(),
                                                         GroupID.getText(),
                                                         subGroupID.getText(),
                               });
    }//GEN-LAST:event_ManViewTableActionPerformed

    private void GroupIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GroupIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GroupIDActionPerformed

    private void manYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manYearActionPerformed

    private void ManClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManClearActionPerformed
        // TODO add your handling code here:
        ManID.setText(null);
        ManProgramme.setText(null);
        ManMainGroupNumber.setText(null);
        ManSubGroupNumber.setText(null);
        GroupID.setText(null);
        subGroupID.setText(null);
    }//GEN-LAST:event_ManClearActionPerformed

    private void jButtonGenerateIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerateIDActionPerformed
        // TODO add your handling code here:
        String year = (String) manYear.getSelectedItem();
        String semester = (String) manSemeseter.getSelectedItem();
        String programme = ManProgramme.getText();
        String mainGroupNumber = ManMainGroupNumber.getText();
        String subGroupNumber = ManSubGroupNumber.getText();
        
        
        String mainGroupId = (((year +semester)+"."+programme)+"."+mainGroupNumber);
        GroupID.setText(""+mainGroupId);
        
        String subGroupId = ((((year +semester)+"."+programme)+"."+mainGroupNumber)+"."+subGroupNumber);
        subGroupID.setText(""+subGroupId);
    }//GEN-LAST:event_jButtonGenerateIDActionPerformed

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
            java.util.logging.Logger.getLogger(ManageStudentsGroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageStudentsGroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageStudentsGroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageStudentsGroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageStudentsGroups().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField GroupID;
    private javax.swing.JButton ManClear;
    private javax.swing.JButton ManDelete;
    public javax.swing.JTextField ManID;
    public javax.swing.JTextField ManMainGroupNumber;
    public javax.swing.JTextField ManProgramme;
    public javax.swing.JTextField ManSubGroupNumber;
    private javax.swing.JButton ManUpdate;
    private javax.swing.JButton ManViewTable;
    private javax.swing.JButton jButtonGenerateID;
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
    public javax.swing.JComboBox<String> manSemeseter;
    public javax.swing.JComboBox<String> manYear;
    public javax.swing.JTextField subGroupID;
    // End of variables declaration//GEN-END:variables

    private void setRowCount(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
